# Generated from CoreMarkup.g4 by ANTLR 4.9.1
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .CoreMarkupParser import CoreMarkupParser
else:
    from CoreMarkupParser import CoreMarkupParser

# This class defines a complete listener for a parse tree produced by CoreMarkupParser.
class CoreMarkupListener(ParseTreeListener):

    # Enter a parse tree produced by CoreMarkupParser#cmu.
    def enterCmu(self, ctx:CoreMarkupParser.CmuContext):
        pass

    # Exit a parse tree produced by CoreMarkupParser#cmu.
    def exitCmu(self, ctx:CoreMarkupParser.CmuContext):
        pass


    # Enter a parse tree produced by CoreMarkupParser#header.
    def enterHeader(self, ctx:CoreMarkupParser.HeaderContext):
        pass

    # Exit a parse tree produced by CoreMarkupParser#header.
    def exitHeader(self, ctx:CoreMarkupParser.HeaderContext):
        pass


    # Enter a parse tree produced by CoreMarkupParser#question.
    def enterQuestion(self, ctx:CoreMarkupParser.QuestionContext):
        pass

    # Exit a parse tree produced by CoreMarkupParser#question.
    def exitQuestion(self, ctx:CoreMarkupParser.QuestionContext):
        pass


    # Enter a parse tree produced by CoreMarkupParser#nested_question.
    def enterNested_question(self, ctx:CoreMarkupParser.Nested_questionContext):
        pass

    # Exit a parse tree produced by CoreMarkupParser#nested_question.
    def exitNested_question(self, ctx:CoreMarkupParser.Nested_questionContext):
        pass



del CoreMarkupParser