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


    # Enter a parse tree produced by CoreMarkupParser#detail.
    def enterDetail(self, ctx:CoreMarkupParser.DetailContext):
        pass

    # Exit a parse tree produced by CoreMarkupParser#detail.
    def exitDetail(self, ctx:CoreMarkupParser.DetailContext):
        pass


    # Enter a parse tree produced by CoreMarkupParser#question.
    def enterQuestion(self, ctx:CoreMarkupParser.QuestionContext):
        pass

    # Exit a parse tree produced by CoreMarkupParser#question.
    def exitQuestion(self, ctx:CoreMarkupParser.QuestionContext):
        pass


    # Enter a parse tree produced by CoreMarkupParser#enum_question.
    def enterEnum_question(self, ctx:CoreMarkupParser.Enum_questionContext):
        pass

    # Exit a parse tree produced by CoreMarkupParser#enum_question.
    def exitEnum_question(self, ctx:CoreMarkupParser.Enum_questionContext):
        pass


    # Enter a parse tree produced by CoreMarkupParser#detail_question.
    def enterDetail_question(self, ctx:CoreMarkupParser.Detail_questionContext):
        pass

    # Exit a parse tree produced by CoreMarkupParser#detail_question.
    def exitDetail_question(self, ctx:CoreMarkupParser.Detail_questionContext):
        pass


    # Enter a parse tree produced by CoreMarkupParser#detail_enum_question.
    def enterDetail_enum_question(self, ctx:CoreMarkupParser.Detail_enum_questionContext):
        pass

    # Exit a parse tree produced by CoreMarkupParser#detail_enum_question.
    def exitDetail_enum_question(self, ctx:CoreMarkupParser.Detail_enum_questionContext):
        pass



del CoreMarkupParser