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
        self.questions = []

    # Enter a parse tree produced by CoreMarkupParser#header.
    def enterHeader(self, ctx:CoreMarkupParser.HeaderContext):
        header_tag = ctx.HEADER_TAG()
        label = ctx.label().getText().strip()
        self.headers.append(label)
    
    # Enter a parse tree produced by CoreMarkupParser#question.
    def enterQuestion(self, ctx:CoreMarkupParser.QuestionContext):
        label = ctx.label().getText().strip()
        enumerable = ctx.QUESTION_TAG().getText() == CoreMarkupConsumer.SYMBOL_ENUM_QUESTION
        question = { "concept": label, "enumerable": enumerable}

        self.questions.append(question)


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
    print(json.dumps(q, indent=4, sort_keys=True))

if __name__ == "__main__":
    main(sys.argv)