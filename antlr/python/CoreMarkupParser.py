# Generated from CoreMarkup.g4 by ANTLR 4.9.1
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
        buf.write("\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\b")
        buf.write("#\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\3\2\3\2\6\2\r\n\2\r")
        buf.write("\2\16\2\16\3\2\3\2\3\3\3\3\3\4\3\4\3\4\6\4\30\n\4\r\4")
        buf.write("\16\4\31\3\5\3\5\3\5\6\5\37\n\5\r\5\16\5 \3\5\2\2\6\2")
        buf.write("\4\6\b\2\2\2$\2\f\3\2\2\2\4\22\3\2\2\2\6\24\3\2\2\2\b")
        buf.write("\33\3\2\2\2\n\r\5\6\4\2\13\r\5\4\3\2\f\n\3\2\2\2\f\13")
        buf.write("\3\2\2\2\r\16\3\2\2\2\16\f\3\2\2\2\16\17\3\2\2\2\17\20")
        buf.write("\3\2\2\2\20\21\7\2\2\3\21\3\3\2\2\2\22\23\7\3\2\2\23\5")
        buf.write("\3\2\2\2\24\27\7\4\2\2\25\30\5\b\5\2\26\30\7\7\2\2\27")
        buf.write("\25\3\2\2\2\27\26\3\2\2\2\30\31\3\2\2\2\31\27\3\2\2\2")
        buf.write("\31\32\3\2\2\2\32\7\3\2\2\2\33\36\7\5\2\2\34\37\5\b\5")
        buf.write("\2\35\37\7\6\2\2\36\34\3\2\2\2\36\35\3\2\2\2\37 \3\2\2")
        buf.write("\2 \36\3\2\2\2 !\3\2\2\2!\t\3\2\2\2\b\f\16\27\31\36 ")
        return buf.getvalue()


class CoreMarkupParser ( Parser ):

    grammarFileName = "CoreMarkup.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [  ]

    symbolicNames = [ "<INVALID>", "HEADER", "QUESTION", "QUESTION_NEST", 
                      "DETAIL_NEST", "DETAIL", "NEWLINE" ]

    RULE_cmu = 0
    RULE_header = 1
    RULE_question = 2
    RULE_nested_question = 3

    ruleNames =  [ "cmu", "header", "question", "nested_question" ]

    EOF = Token.EOF
    HEADER=1
    QUESTION=2
    QUESTION_NEST=3
    DETAIL_NEST=4
    DETAIL=5
    NEWLINE=6

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

        def question(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(CoreMarkupParser.QuestionContext)
            else:
                return self.getTypedRuleContext(CoreMarkupParser.QuestionContext,i)


        def header(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(CoreMarkupParser.HeaderContext)
            else:
                return self.getTypedRuleContext(CoreMarkupParser.HeaderContext,i)


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
            self.state = 10 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 10
                self._errHandler.sync(self)
                token = self._input.LA(1)
                if token in [CoreMarkupParser.QUESTION]:
                    self.state = 8
                    self.question()
                    pass
                elif token in [CoreMarkupParser.HEADER]:
                    self.state = 9
                    self.header()
                    pass
                else:
                    raise NoViableAltException(self)

                self.state = 12 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not (_la==CoreMarkupParser.HEADER or _la==CoreMarkupParser.QUESTION):
                    break

            self.state = 14
            self.match(CoreMarkupParser.EOF)
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

        def HEADER(self):
            return self.getToken(CoreMarkupParser.HEADER, 0)

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
        self.enterRule(localctx, 2, self.RULE_header)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 16
            self.match(CoreMarkupParser.HEADER)
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

        def QUESTION(self):
            return self.getToken(CoreMarkupParser.QUESTION, 0)

        def nested_question(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(CoreMarkupParser.Nested_questionContext)
            else:
                return self.getTypedRuleContext(CoreMarkupParser.Nested_questionContext,i)


        def DETAIL(self, i:int=None):
            if i is None:
                return self.getTokens(CoreMarkupParser.DETAIL)
            else:
                return self.getToken(CoreMarkupParser.DETAIL, i)

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
        self.enterRule(localctx, 4, self.RULE_question)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 18
            self.match(CoreMarkupParser.QUESTION)
            self.state = 21 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 21
                self._errHandler.sync(self)
                token = self._input.LA(1)
                if token in [CoreMarkupParser.QUESTION_NEST]:
                    self.state = 19
                    self.nested_question()
                    pass
                elif token in [CoreMarkupParser.DETAIL]:
                    self.state = 20
                    self.match(CoreMarkupParser.DETAIL)
                    pass
                else:
                    raise NoViableAltException(self)

                self.state = 23 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not (_la==CoreMarkupParser.QUESTION_NEST or _la==CoreMarkupParser.DETAIL):
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

        def QUESTION_NEST(self):
            return self.getToken(CoreMarkupParser.QUESTION_NEST, 0)

        def nested_question(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(CoreMarkupParser.Nested_questionContext)
            else:
                return self.getTypedRuleContext(CoreMarkupParser.Nested_questionContext,i)


        def DETAIL_NEST(self, i:int=None):
            if i is None:
                return self.getTokens(CoreMarkupParser.DETAIL_NEST)
            else:
                return self.getToken(CoreMarkupParser.DETAIL_NEST, i)

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
        self.enterRule(localctx, 6, self.RULE_nested_question)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 25
            self.match(CoreMarkupParser.QUESTION_NEST)
            self.state = 28 
            self._errHandler.sync(self)
            _alt = 1
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt == 1:
                    self.state = 28
                    self._errHandler.sync(self)
                    token = self._input.LA(1)
                    if token in [CoreMarkupParser.QUESTION_NEST]:
                        self.state = 26
                        self.nested_question()
                        pass
                    elif token in [CoreMarkupParser.DETAIL_NEST]:
                        self.state = 27
                        self.match(CoreMarkupParser.DETAIL_NEST)
                        pass
                    else:
                        raise NoViableAltException(self)


                else:
                    raise NoViableAltException(self)
                self.state = 30 
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,5,self._ctx)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





