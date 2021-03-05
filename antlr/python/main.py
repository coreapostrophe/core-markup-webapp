import sys
import json
from antlr4 import *
from CoreMarkupLexer import CoreMarkupLexer
from CoreMarkupParser import CoreMarkupParser
from CoreMarkupListener import CoreMarkupListener


class CoreMarkupConsumer(CoreMarkupListener):

    # Symbol constants
    SYMBOL_HEADER = "#"
    SYMBOL_DETAIL = "-"
    SYMBOL_QUESTION = "*"
    SYMBOL_ENUM_QUESTION = "$"

    def __init__(self):
        self.entries = []

    def push(self, data_type, value, level):
        self.entries.append({"type": data_type, "value": value, "level": level})

    def enterHeader(self, ctx):
        """
        Fired when a header object is read
        """
        header_text = ctx.getText()
        header_level = self.get_depth(header_text, CoreMarkupConsumer.SYMBOL_HEADER)
        self.push("header", self.clean_text(header_text, header_level), header_level)

    def enterQuestion(self, ctx):
        """
        Fired when a question object is read
        """
        question_text = ctx.QUESTION().getText()
        detail_tokens = ctx.detail()
        details = []

        for detail in detail_tokens:
            detail_text = detail.getText()
            detail_level = self.get_depth(detail_text, CoreMarkupConsumer.SYMBOL_DETAIL)
            details.append({"type": "detail", "value": self.clean_text(detail_text, detail_level), "level": detail_level})

        self.entries.append({"type": "question", "value": self.clean_text(question_text, 1), "children": details})


    def enterEnum_question(self, ctx):
        """
        Fired when an enum question object is read
        """
        enum_question_text = ctx.ENUM_QUESTION().getText()

        # Get children
        detail_tokens = ctx.detail()
        detail_question_tokens = ctx.detail_question()
        detail_enum_question_tokens = ctx.detail_enum_question()

        for detail in detail_tokens:
            detail_text = detail.getText()
            level = self.get_depth(detail_text, CoreMarkupConsumer.SYMBOL_DETAIL)
            # print(detail_text, level)

        for detail_question in detail_question_tokens:
            detail_question_text = detail_question.DETAIL_QUESTION().getText()
            detail_tokens = detail_question.detail()
            level = self.get_depth(
                detail_question_text, CoreMarkupConsumer.SYMBOL_DETAIL
            )

            # print(detail_question_text, level)
            # print([d.getText() for d in detail_tokens])

        for detail_enum_question in detail_enum_question_tokens:
            detail_enum_question_text = detail_enum_question.DETAIL_ENUM_QUESTION().getText()
            level = self.get_depth(detail_enum_question_text, CoreMarkupConsumer.SYMBOL_DETAIL)
            # print(detail_enum_question_text, level)

    def clean_text(self, text, level):
        return text[level:].strip()

    def get_depth(self, text, delimiter):
        """
        Counts the occurence of a delimiter in a string.
        Average case: O(1), Worst case: O(n)
        """
        count = 0
        for t in text:
            if t == delimiter:
                count += 1
            else:
                break
        return count


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

    # Print entries
    e = consumer.entries
    print(json.dumps(e))

if __name__ == "__main__":
    main(sys.argv)