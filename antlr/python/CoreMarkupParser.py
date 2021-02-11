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
        buf.write("\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\t")
        buf.write("9\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b")
        buf.write("\t\b\3\2\3\2\3\2\6\2\24\n\2\r\2\16\2\25\3\2\3\2\3\3\3")
        buf.write("\3\3\4\3\4\3\5\3\5\6\5 \n\5\r\5\16\5!\3\6\3\6\3\6\3\6")
        buf.write("\6\6(\n\6\r\6\16\6)\3\7\3\7\6\7.\n\7\r\7\16\7/\3\b\3\b")
        buf.write("\7\b\64\n\b\f\b\16\b\67\13\b\3\b\2\2\t\2\4\6\b\n\f\16")
        buf.write("\2\2\2:\2\23\3\2\2\2\4\31\3\2\2\2\6\33\3\2\2\2\b\35\3")
        buf.write("\2\2\2\n#\3\2\2\2\f+\3\2\2\2\16\61\3\2\2\2\20\24\5\4\3")
        buf.write("\2\21\24\5\b\5\2\22\24\5\n\6\2\23\20\3\2\2\2\23\21\3\2")
        buf.write("\2\2\23\22\3\2\2\2\24\25\3\2\2\2\25\23\3\2\2\2\25\26\3")
        buf.write("\2\2\2\26\27\3\2\2\2\27\30\7\2\2\3\30\3\3\2\2\2\31\32")
        buf.write("\7\3\2\2\32\5\3\2\2\2\33\34\7\b\2\2\34\7\3\2\2\2\35\37")
        buf.write("\7\4\2\2\36 \5\6\4\2\37\36\3\2\2\2 !\3\2\2\2!\37\3\2\2")
        buf.write("\2!\"\3\2\2\2\"\t\3\2\2\2#\'\7\5\2\2$(\5\6\4\2%(\5\f\7")
        buf.write("\2&(\5\16\b\2\'$\3\2\2\2\'%\3\2\2\2\'&\3\2\2\2()\3\2\2")
        buf.write("\2)\'\3\2\2\2)*\3\2\2\2*\13\3\2\2\2+-\7\6\2\2,.\5\6\4")
        buf.write("\2-,\3\2\2\2./\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\r\3\2")
        buf.write("\2\2\61\65\7\7\2\2\62\64\5\6\4\2\63\62\3\2\2\2\64\67\3")
        buf.write("\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66\17\3\2\2\2\67\65")
        buf.write("\3\2\2\2\t\23\25!\')/\65")
        return buf.getvalue()


class CoreMarkupParser ( Parser ):

    grammarFileName = "CoreMarkup.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [  ]

    symbolicNames = [ "<INVALID>", "HEADER", "QUESTION", "ENUM_QUESTION", 
                      "DETAIL_QUESTION", "DETAIL_ENUM_QUESTION", "DETAIL", 
                      "NEWLINE" ]

    RULE_cmu = 0
    RULE_header = 1
    RULE_detail = 2
    RULE_question = 3
    RULE_enum_question = 4
    RULE_detail_question = 5
    RULE_detail_enum_question = 6

    ruleNames =  [ "cmu", "header", "detail", "question", "enum_question", 
                   "detail_question", "detail_enum_question" ]

    EOF = Token.EOF
    HEADER=1
    QUESTION=2
    ENUM_QUESTION=3
    DETAIL_QUESTION=4
    DETAIL_ENUM_QUESTION=5
    DETAIL=6
    NEWLINE=7

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


        def enum_question(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(CoreMarkupParser.Enum_questionContext)
            else:
                return self.getTypedRuleContext(CoreMarkupParser.Enum_questionContext,i)


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
            self.state = 17 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 17
                self._errHandler.sync(self)
                token = self._input.LA(1)
                if token in [CoreMarkupParser.HEADER]:
                    self.state = 14
                    self.header()
                    pass
                elif token in [CoreMarkupParser.QUESTION]:
                    self.state = 15
                    self.question()
                    pass
                elif token in [CoreMarkupParser.ENUM_QUESTION]:
                    self.state = 16
                    self.enum_question()
                    pass
                else:
                    raise NoViableAltException(self)

                self.state = 19 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not ((((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << CoreMarkupParser.HEADER) | (1 << CoreMarkupParser.QUESTION) | (1 << CoreMarkupParser.ENUM_QUESTION))) != 0)):
                    break

            self.state = 21
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
            self.state = 23
            self.match(CoreMarkupParser.HEADER)
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

        def DETAIL(self):
            return self.getToken(CoreMarkupParser.DETAIL, 0)

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
        self.enterRule(localctx, 4, self.RULE_detail)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 25
            self.match(CoreMarkupParser.DETAIL)
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
            self.state = 27
            self.match(CoreMarkupParser.QUESTION)
            self.state = 29 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 28
                self.detail()
                self.state = 31 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not (_la==CoreMarkupParser.DETAIL):
                    break

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Enum_questionContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ENUM_QUESTION(self):
            return self.getToken(CoreMarkupParser.ENUM_QUESTION, 0)

        def detail(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(CoreMarkupParser.DetailContext)
            else:
                return self.getTypedRuleContext(CoreMarkupParser.DetailContext,i)


        def detail_question(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(CoreMarkupParser.Detail_questionContext)
            else:
                return self.getTypedRuleContext(CoreMarkupParser.Detail_questionContext,i)


        def detail_enum_question(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(CoreMarkupParser.Detail_enum_questionContext)
            else:
                return self.getTypedRuleContext(CoreMarkupParser.Detail_enum_questionContext,i)


        def getRuleIndex(self):
            return CoreMarkupParser.RULE_enum_question

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterEnum_question" ):
                listener.enterEnum_question(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitEnum_question" ):
                listener.exitEnum_question(self)




    def enum_question(self):

        localctx = CoreMarkupParser.Enum_questionContext(self, self._ctx, self.state)
        self.enterRule(localctx, 8, self.RULE_enum_question)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 33
            self.match(CoreMarkupParser.ENUM_QUESTION)
            self.state = 37 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 37
                self._errHandler.sync(self)
                token = self._input.LA(1)
                if token in [CoreMarkupParser.DETAIL]:
                    self.state = 34
                    self.detail()
                    pass
                elif token in [CoreMarkupParser.DETAIL_QUESTION]:
                    self.state = 35
                    self.detail_question()
                    pass
                elif token in [CoreMarkupParser.DETAIL_ENUM_QUESTION]:
                    self.state = 36
                    self.detail_enum_question()
                    pass
                else:
                    raise NoViableAltException(self)

                self.state = 39 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not ((((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << CoreMarkupParser.DETAIL_QUESTION) | (1 << CoreMarkupParser.DETAIL_ENUM_QUESTION) | (1 << CoreMarkupParser.DETAIL))) != 0)):
                    break

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Detail_questionContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def DETAIL_QUESTION(self):
            return self.getToken(CoreMarkupParser.DETAIL_QUESTION, 0)

        def detail(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(CoreMarkupParser.DetailContext)
            else:
                return self.getTypedRuleContext(CoreMarkupParser.DetailContext,i)


        def getRuleIndex(self):
            return CoreMarkupParser.RULE_detail_question

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterDetail_question" ):
                listener.enterDetail_question(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitDetail_question" ):
                listener.exitDetail_question(self)




    def detail_question(self):

        localctx = CoreMarkupParser.Detail_questionContext(self, self._ctx, self.state)
        self.enterRule(localctx, 10, self.RULE_detail_question)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 41
            self.match(CoreMarkupParser.DETAIL_QUESTION)
            self.state = 43 
            self._errHandler.sync(self)
            _alt = 1
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt == 1:
                    self.state = 42
                    self.detail()

                else:
                    raise NoViableAltException(self)
                self.state = 45 
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,5,self._ctx)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Detail_enum_questionContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def DETAIL_ENUM_QUESTION(self):
            return self.getToken(CoreMarkupParser.DETAIL_ENUM_QUESTION, 0)

        def detail(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(CoreMarkupParser.DetailContext)
            else:
                return self.getTypedRuleContext(CoreMarkupParser.DetailContext,i)


        def getRuleIndex(self):
            return CoreMarkupParser.RULE_detail_enum_question

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterDetail_enum_question" ):
                listener.enterDetail_enum_question(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitDetail_enum_question" ):
                listener.exitDetail_enum_question(self)




    def detail_enum_question(self):

        localctx = CoreMarkupParser.Detail_enum_questionContext(self, self._ctx, self.state)
        self.enterRule(localctx, 12, self.RULE_detail_enum_question)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 47
            self.match(CoreMarkupParser.DETAIL_ENUM_QUESTION)
            self.state = 51
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,6,self._ctx)
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1:
                    self.state = 48
                    self.detail() 
                self.state = 53
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,6,self._ctx)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





