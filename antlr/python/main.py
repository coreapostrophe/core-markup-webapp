import sys
from antlr4 import *
from CoreMarkupLexer import CoreMarkupLexer
from CoreMarkupParser import CoreMarkupParser
from CoreMarkupListener import CoreMarkupListener

class KeyPrinter(CoreMarkupListener):

    def __init__(self):
        pass
    
    def enterHeader(self, ctx):
        """
            Fired when a header object is read
        """
        header_text = ctx.getText()
        header_level = self.get_depth(header_text, "#")
        # print(header, header_level)

    def enterEnum_question(self, ctx):
        """
            Fired when an enum question object is read
        """
        enum_question = ctx.ENUM_QUESTION().getText()

        # Get children
        detail_tokens = ctx.detail()
        detail_question_tokens = ctx.detail_question()
        detail_enum_question_tokens = ctx.detail_enum_question()

        for d in detail_tokens:
            detail_text = d.getText()
            level = self.get_depth(detail_text, "-")
            print(detail_text, level)
        
        for q in detail_question_tokens:
            detail_question_text = q.getText()
            level = self.get_depth(detail_question_text, "-")
            print(detail_question_text, level)

    # Average case: O(1), Worst case: O(n)
    def get_depth(self, text, delimiter):
        count = 0
        for t in text:
            if t == delimiter:
                count += 1
            else:
                return count
def main(argv):
    # Provide Sample.cmu file
    input_stream = FileStream(argv[1])
    lexer = CoreMarkupLexer(input_stream)
    stream = CommonTokenStream(lexer)
    parser = CoreMarkupParser(stream)
    tree = parser.cmu()

    # Invoke listeners
    printer = KeyPrinter()
    walker = ParseTreeWalker()
    walker.walk(printer, tree)
if __name__ == '__main__':
    main(sys.argv)