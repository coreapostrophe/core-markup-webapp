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

    # Enter a parse tree produced by CoreMarkupParser#header.
    def enterHeader(self, ctx:CoreMarkupParser.HeaderContext):
        header_tag = ctx.HEADER_TAG()
        label = ctx.label().getText()
        print(header_tag, label)

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


if __name__ == "__main__":
    main(sys.argv)