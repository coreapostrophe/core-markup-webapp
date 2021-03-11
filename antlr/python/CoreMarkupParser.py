# Generated from CoreMarkupParser.g4 by ANTLR 4.9.1
# encoding: utf-8
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
	from typing import TextIO
else:
	from typing.io import TextIO


def serializedATN():
    with StringIO() as buf:
        buf.write("\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\t")
        buf.write("9\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b")
        buf.write("\t\b\3\2\3\2\6\2\23\n\2\r\2\16\2\24\3\2\3\2\3\3\6\3\32")
        buf.write("\n\3\r\3\16\3\33\3\4\3\4\3\4\3\5\3\5\3\5\3\5\6\5%\n\5")
        buf.write("\r\5\16\5&\3\6\3\6\5\6+\n\6\3\6\7\6.\n\6\f\6\16\6\61\13")
        buf.write("\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\2\2\t\2\4\6\b\n\f\16\2")
        buf.write("\2\28\2\22\3\2\2\2\4\31\3\2\2\2\6\35\3\2\2\2\b \3\2\2")
        buf.write("\2\n(\3\2\2\2\f\62\3\2\2\2\16\65\3\2\2\2\20\23\5\6\4\2")
        buf.write("\21\23\5\b\5\2\22\20\3\2\2\2\22\21\3\2\2\2\23\24\3\2\2")
        buf.write("\2\24\22\3\2\2\2\24\25\3\2\2\2\25\26\3\2\2\2\26\27\7\2")
        buf.write("\2\3\27\3\3\2\2\2\30\32\7\t\2\2\31\30\3\2\2\2\32\33\3")
        buf.write("\2\2\2\33\31\3\2\2\2\33\34\3\2\2\2\34\5\3\2\2\2\35\36")
        buf.write("\7\3\2\2\36\37\5\4\3\2\37\7\3\2\2\2 !\7\5\2\2!$\5\4\3")
        buf.write("\2\"%\5\n\6\2#%\5\f\7\2$\"\3\2\2\2$#\3\2\2\2%&\3\2\2\2")
        buf.write("&$\3\2\2\2&\'\3\2\2\2\'\t\3\2\2\2(*\7\4\2\2)+\5\4\3\2")
        buf.write("*)\3\2\2\2*+\3\2\2\2+/\3\2\2\2,.\5\16\b\2-,\3\2\2\2.\61")
        buf.write("\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\13\3\2\2\2\61/\3\2\2")
        buf.write("\2\62\63\7\7\2\2\63\64\5\4\3\2\64\r\3\2\2\2\65\66\7\6")
        buf.write("\2\2\66\67\5\4\3\2\67\17\3\2\2\2\t\22\24\33$&*/")
        return buf.getvalue()


class CoreMarkupParser ( Parser ):

    grammarFileName = "CoreMarkupParser.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [  ]

    symbolicNames = [ "<INVALID>", "HEADER_TAG", "NESTED_QUESTION_TAG", 
                      "QUESTION_TAG", "NESTED_DETAIL_TAG", "DETAIL_TAG", 
                      "NEWLINE", "TEXT" ]

    RULE_cmu = 0
    RULE_label = 1
    RULE_header = 2
    RULE_question = 3
    RULE_nested_question = 4
    RULE_detail = 5
    RULE_nested_detail = 6

    ruleNames =  [ "cmu", "label", "header", "question", "nested_question", 
                   "detail", "nested_detail" ]

    EOF = Token.EOF
    HEADER_TAG=1
    NESTED_QUESTION_TAG=2
    QUESTION_TAG=3
    NESTED_DETAIL_TAG=4
    DETAIL_TAG=5
    NEWLINE=6
    TEXT=7

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.9.1")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class CmuContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def EOF(self):
            return self.getToken(CoreMarkupParser.EOF, 0)

        def header(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(CoreMarkupParser.HeaderContext)
            else:
                return self.getTypedRuleContext(CoreMarkupParser.HeaderContext,i)


        def question(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(CoreMarkupParser.QuestionContext)
            else:
                return self.getTypedRuleContext(CoreMarkupParser.QuestionContext,i)


        def getRuleIndex(self):
            return CoreMarkupParser.RULE_cmu

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterCmu" ):
                listener.enterCmu(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitCmu" ):
                listener.exitCmu(self)




    def cmu(self):

        localctx = CoreMarkupParser.CmuContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_cmu)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 16 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 16
                self._errHandler.sync(self)
                token = self._input.LA(1)
                if token in [CoreMarkupParser.HEADER_TAG]:
                    self.state = 14
                    self.header()
                    pass
                elif token in [CoreMarkupParser.QUESTION_TAG]:
                    self.state = 15
                    self.question()
                    pass
                else:
                    raise NoViableAltException(self)

                self.state = 18 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not (_la==CoreMarkupParser.HEADER_TAG or _la==CoreMarkupParser.QUESTION_TAG):
                    break

            self.state = 20
            self.match(CoreMarkupParser.EOF)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class LabelContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def TEXT(self, i:int=None):
            if i is None:
                return self.getTokens(CoreMarkupParser.TEXT)
            else:
                return self.getToken(CoreMarkupParser.TEXT, i)

        def getRuleIndex(self):
            return CoreMarkupParser.RULE_label

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterLabel" ):
                listener.enterLabel(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitLabel" ):
                listener.exitLabel(self)




    def label(self):

        localctx = CoreMarkupParser.LabelContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_label)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 23 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 22
                self.match(CoreMarkupParser.TEXT)
                self.state = 25 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not (_la==CoreMarkupParser.TEXT):
                    break

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class HeaderContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def HEADER_TAG(self):
            return self.getToken(CoreMarkupParser.HEADER_TAG, 0)

        def label(self):
            return self.getTypedRuleContext(CoreMarkupParser.LabelContext,0)


        def getRuleIndex(self):
            return CoreMarkupParser.RULE_header

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterHeader" ):
                listener.enterHeader(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitHeader" ):
                listener.exitHeader(self)




    def header(self):

        localctx = CoreMarkupParser.HeaderContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_header)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 27
            self.match(CoreMarkupParser.HEADER_TAG)
            self.state = 28
            self.label()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class QuestionContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def QUESTION_TAG(self):
            return self.getToken(CoreMarkupParser.QUESTION_TAG, 0)

        def label(self):
            return self.getTypedRuleContext(CoreMarkupParser.LabelContext,0)


        def nested_question(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(CoreMarkupParser.Nested_questionContext)
            else:
                return self.getTypedRuleContext(CoreMarkupParser.Nested_questionContext,i)


        def detail(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(CoreMarkupParser.DetailContext)
            else:
                return self.getTypedRuleContext(CoreMarkupParser.DetailContext,i)


        def getRuleIndex(self):
            return CoreMarkupParser.RULE_question

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterQuestion" ):
                listener.enterQuestion(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitQuestion" ):
                listener.exitQuestion(self)




    def question(self):

        localctx = CoreMarkupParser.QuestionContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_question)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 30
            self.match(CoreMarkupParser.QUESTION_TAG)
            self.state = 31
            self.label()
            self.state = 34 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 34
                self._errHandler.sync(self)
                token = self._input.LA(1)
                if token in [CoreMarkupParser.NESTED_QUESTION_TAG]:
                    self.state = 32
                    self.nested_question()
                    pass
                elif token in [CoreMarkupParser.DETAIL_TAG]:
                    self.state = 33
                    self.detail()
                    pass
                else:
                    raise NoViableAltException(self)

                self.state = 36 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not (_la==CoreMarkupParser.NESTED_QUESTION_TAG or _la==CoreMarkupParser.DETAIL_TAG):
                    break

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Nested_questionContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def NESTED_QUESTION_TAG(self):
            return self.getToken(CoreMarkupParser.NESTED_QUESTION_TAG, 0)

        def label(self):
            return self.getTypedRuleContext(CoreMarkupParser.LabelContext,0)


        def nested_detail(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(CoreMarkupParser.Nested_detailContext)
            else:
                return self.getTypedRuleContext(CoreMarkupParser.Nested_detailContext,i)


        def getRuleIndex(self):
            return CoreMarkupParser.RULE_nested_question

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterNested_question" ):
                listener.enterNested_question(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitNested_question" ):
                listener.exitNested_question(self)




    def nested_question(self):

        localctx = CoreMarkupParser.Nested_questionContext(self, self._ctx, self.state)
        self.enterRule(localctx, 8, self.RULE_nested_question)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 38
            self.match(CoreMarkupParser.NESTED_QUESTION_TAG)
            self.state = 40
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==CoreMarkupParser.TEXT:
                self.state = 39
                self.label()


            self.state = 45
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==CoreMarkupParser.NESTED_DETAIL_TAG:
                self.state = 42
                self.nested_detail()
                self.state = 47
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class DetailContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def DETAIL_TAG(self):
            return self.getToken(CoreMarkupParser.DETAIL_TAG, 0)

        def label(self):
            return self.getTypedRuleContext(CoreMarkupParser.LabelContext,0)


        def getRuleIndex(self):
            return CoreMarkupParser.RULE_detail

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterDetail" ):
                listener.enterDetail(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitDetail" ):
                listener.exitDetail(self)




    def detail(self):

        localctx = CoreMarkupParser.DetailContext(self, self._ctx, self.state)
        self.enterRule(localctx, 10, self.RULE_detail)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 48
            self.match(CoreMarkupParser.DETAIL_TAG)
            self.state = 49
            self.label()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Nested_detailContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def NESTED_DETAIL_TAG(self):
            return self.getToken(CoreMarkupParser.NESTED_DETAIL_TAG, 0)

        def label(self):
            return self.getTypedRuleContext(CoreMarkupParser.LabelContext,0)


        def getRuleIndex(self):
            return CoreMarkupParser.RULE_nested_detail

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterNested_detail" ):
                listener.enterNested_detail(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitNested_detail" ):
                listener.exitNested_detail(self)




    def nested_detail(self):

        localctx = CoreMarkupParser.Nested_detailContext(self, self._ctx, self.state)
        self.enterRule(localctx, 12, self.RULE_nested_detail)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 51
            self.match(CoreMarkupParser.NESTED_DETAIL_TAG)
            self.state = 52
            self.label()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





