import sys
import json
from antlr4 import *
from CoreMarkupLexer import CoreMarkupLexer
from CoreMarkupParser import CoreMarkupParser
from CoreMarkupParserListener import CoreMarkupParserListener


class CoreMarkupConsumer(CoreMarkupParserListener):

    # Symbol constants
    SYMBOL_HEADER = "#"
    SYMBOL_DETAIL = "-"
    SYMBOL_QUESTION = "*"
    SYMBOL_ENUM_QUESTION = "$"

    def __init__(self):
        self.headers = []
        self.current_root_index = -1
        self.indices = {} # Indices lookup table
        self.questions = []

    # Enter a parse tree produced by CoreMarkupParser#header.
    def enterHeader(self, ctx: CoreMarkupParser.HeaderContext):
        header_tag = ctx.HEADER_TAG().getText()
        curr_header_level = len(header_tag)
        label = ctx.label().getText().strip()

        if len(self.headers) > 0:
            last_header_level = self.headers[-1]["level"]  # stack peek
            if curr_header_level == last_header_level:
                self.headers.pop()
            elif curr_header_level < last_header_level:
                # slice from 0 to curr_header_level - 1
                self.headers = self.headers[:curr_header_level - 1]

        self.headers.append({"level": curr_header_level, "label": label})

    # Enter a parse tree produced by CoreMarkupParser#question.
    def enterQuestion(self, ctx: CoreMarkupParser.QuestionContext):
        label = ctx.label().getText().strip()
        enumerable = self.is_enumerable(ctx.QUESTION_TAG().getText())

        details = [{"label": d.label().getText().strip(), "order": d.start.line} for d in ctx.detail()]
        headers = [h["label"] for h in self.headers]

        question = {
            "root": True,
            "headers": headers,
            "concept": label,
            "enumerable": enumerable,
            "details": details
        }

        # Append to questions array and become the current root
        self.questions.append(question)
        self.current_root_index = len(self.questions) - 1
        self.indices[1] = self.current_root_index

    def exitQuestion(self, ctx: CoreMarkupParser.QuestionContext):
        # Clear indices
        self.indices = {}

    # Enter a parse tree produced by CoreMarkupParser#question_detail.
    def enterQuestion_detail(self, ctx:CoreMarkupParser.Question_detailContext):
        line_number = ctx.start.line
        label = ctx.label().getText().strip()
        qd_tag_text = ctx.QUESTION_DETAIL_TAG().getText()
        level = len(qd_tag_text)

        enumerable = self.is_enumerable(qd_tag_text[-1])
        nested_details = [{"label": d.label().getText().strip(), "order": d.start.line} for d in ctx.nested_detail()]

        # Construct question detail
        question_detail = {
            "root": False,
            "concept": label,
            "enumerable": enumerable,
            "details": nested_details,
            "parent": self.indices[1]
        }

        # Append child QD to the array and update indices lookup table
        self.questions.append(question_detail)
        current_index = len(self.questions) - 1
        self.indices[level] = current_index

        prev = self.get_prev_question(level)
        prev["details"].append({"next": current_index, "order": line_number})

    def get_prev_question(self, current_level):
        index = self.indices[current_level - 1]
        return self.questions[index]
    
    def get_current_root_question(self):
        return self.questions[self.current_root_index]

    def is_enumerable(self, tag):
        return tag == CoreMarkupConsumer.SYMBOL_ENUM_QUESTION

def main(argv):
    # Provide Sample.cmu file
    input_stream = FileStream(argv[1])
    lexer = CoreMarkupLexer(input_stream)
    stream = CommonTokenStream(lexer)
    parser = CoreMarkupParser(stream)
    tree = parser.cmu()

    # Invoke listeners
    consumer = CoreMarkupConsumer()
    walker = ParseTreeWalker()
    walker.walk(consumer, tree)
    q = consumer.questions
    print(json.dumps(q, indent=2, sort_keys=True))


if __name__ == "__main__":
    main(sys.argv)