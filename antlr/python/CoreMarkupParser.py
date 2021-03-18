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
        buf.write("\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\b")
        buf.write("8\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2")
        buf.write("\3\2\6\2\21\n\2\r\2\16\2\22\3\2\3\2\3\3\6\3\30\n\3\r\3")
        buf.write("\16\3\31\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\6\5&")
        buf.write("\n\5\r\5\16\5\'\3\6\3\6\3\6\3\6\3\6\3\6\6\6\60\n\6\r\6")
        buf.write("\16\6\61\3\7\3\7\3\7\3\7\3\7\2\2\b\2\4\6\b\n\f\2\2\28")
        buf.write("\2\20\3\2\2\2\4\27\3\2\2\2\6\33\3\2\2\2\b \3\2\2\2\n)")
        buf.write("\3\2\2\2\f\63\3\2\2\2\16\21\5\6\4\2\17\21\5\b\5\2\20\16")
        buf.write("\3\2\2\2\20\17\3\2\2\2\21\22\3\2\2\2\22\20\3\2\2\2\22")
        buf.write("\23\3\2\2\2\23\24\3\2\2\2\24\25\7\2\2\3\25\3\3\2\2\2\26")
        buf.write("\30\7\b\2\2\27\26\3\2\2\2\30\31\3\2\2\2\31\27\3\2\2\2")
        buf.write("\31\32\3\2\2\2\32\5\3\2\2\2\33\34\7\3\2\2\34\35\6\4\2")
        buf.write("\3\35\36\b\4\1\2\36\37\5\4\3\2\37\7\3\2\2\2 !\b\5\1\2")
        buf.write("!\"\7\5\2\2\"%\5\4\3\2#&\5\n\6\2$&\5\f\7\2%#\3\2\2\2%")
        buf.write("$\3\2\2\2&\'\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2(\t\3\2\2\2")
        buf.write(")*\7\4\2\2*+\6\6\3\3+,\5\4\3\2,/\b\6\1\2-\60\5\n\6\2.")
        buf.write("\60\5\f\7\2/-\3\2\2\2/.\3\2\2\2\60\61\3\2\2\2\61/\3\2")
        buf.write("\2\2\61\62\3\2\2\2\62\13\3\2\2\2\63\64\7\6\2\2\64\65\6")
        buf.write("\7\4\3\65\66\5\4\3\2\66\r\3\2\2\2\t\20\22\31%\'/\61")
        return buf.getvalue()


class CoreMarkupParser ( Parser ):

    grammarFileName = "CoreMarkupParser.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [  ]

    symbolicNames = [ "<INVALID>", "HEADER_TAG", "QUESTION_DETAIL_TAG", 
                      "QUESTION_TAG", "DETAIL_TAG", "NEWLINE", "TEXT" ]

    RULE_cmu = 0
    RULE_label = 1
    RULE_header = 2
    RULE_question = 3
    RULE_question_detail = 4
    RULE_detail = 5

    ruleNames =  [ "cmu", "label", "header", "question", "question_detail", 
                   "detail" ]

    EOF = Token.EOF
    HEADER_TAG=1
    QUESTION_DETAIL_TAG=2
    QUESTION_TAG=3
    DETAIL_TAG=4
    NEWLINE=5
    TEXT=6

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.9.1")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    STARTING_LEVEL = 1
    level = STARTING_LEVEL
    header_level = STARTING_LEVEL

    def get_length(self, token):
        if token.text is not None:
            return len(token.text)
        else:
            return CoreMarkupParser.STARTING_LEVEL

    def reset(self):
        CoreMarkupParser.level = CoreMarkupParser.STARTING_LEVEL

    def bounds(self, token, offset):
        length = self.get_length(token) + offset
        return length >= CoreMarkupParser.STARTING_LEVEL and length <= CoreMarkupParser.level

    def header_bounds(self, token):
        length = self.get_length(token)
        return length >= CoreMarkupParser.STARTING_LEVEL and length <= CoreMarkupParser.header_level



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
            self.state = 14 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 14
                self._errHandler.sync(self)
                token = self._input.LA(1)
                if token in [CoreMarkupParser.HEADER_TAG]:
                    self.state = 12
                    self.header()
                    pass
                elif token in [CoreMarkupParser.QUESTION_TAG]:
                    self.state = 13
                    self.question()
                    pass
                else:
                    raise NoViableAltException(self)

                self.state = 16 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not (_la==CoreMarkupParser.HEADER_TAG or _la==CoreMarkupParser.QUESTION_TAG):
                    break

            self.state = 18
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
            self.state = 21 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 20
                self.match(CoreMarkupParser.TEXT)
                self.state = 23 
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
            self.h = None # Token

        def label(self):
            return self.getTypedRuleContext(CoreMarkupParser.LabelContext,0)


        def HEADER_TAG(self):
            return self.getToken(CoreMarkupParser.HEADER_TAG, 0)

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
            self.state = 25
            localctx.h = self.match(CoreMarkupParser.HEADER_TAG)
            self.state = 26
            if not self.header_bounds(localctx.h):
                from antlr4.error.Errors import FailedPredicateException
                raise FailedPredicateException(self, "self.header_bounds($h)")
            CoreMarkupParser.header_level += 1
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
            self.t = None # Token

        def label(self):
            return self.getTypedRuleContext(CoreMarkupParser.LabelContext,0)


        def QUESTION_TAG(self):
            return self.getToken(CoreMarkupParser.QUESTION_TAG, 0)

        def question_detail(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(CoreMarkupParser.Question_detailContext)
            else:
                return self.getTypedRuleContext(CoreMarkupParser.Question_detailContext,i)


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
            self.reset()
            self.state = 31
            localctx.t = self.match(CoreMarkupParser.QUESTION_TAG)
            self.state = 32
            self.label()
            self.state = 35 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 35
                self._errHandler.sync(self)
                token = self._input.LA(1)
                if token in [CoreMarkupParser.QUESTION_DETAIL_TAG]:
                    self.state = 33
                    self.question_detail()
                    pass
                elif token in [CoreMarkupParser.DETAIL_TAG]:
                    self.state = 34
                    self.detail()
                    pass
                else:
                    raise NoViableAltException(self)

                self.state = 37 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not (_la==CoreMarkupParser.QUESTION_DETAIL_TAG or _la==CoreMarkupParser.DETAIL_TAG):
                    break

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Question_detailContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser
            self.qd = None # Token

        def label(self):
            return self.getTypedRuleContext(CoreMarkupParser.LabelContext,0)


        def QUESTION_DETAIL_TAG(self):
            return self.getToken(CoreMarkupParser.QUESTION_DETAIL_TAG, 0)

        def question_detail(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(CoreMarkupParser.Question_detailContext)
            else:
                return self.getTypedRuleContext(CoreMarkupParser.Question_detailContext,i)


        def detail(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(CoreMarkupParser.DetailContext)
            else:
                return self.getTypedRuleContext(CoreMarkupParser.DetailContext,i)


        def getRuleIndex(self):
            return CoreMarkupParser.RULE_question_detail

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterQuestion_detail" ):
                listener.enterQuestion_detail(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitQuestion_detail" ):
                listener.exitQuestion_detail(self)




    def question_detail(self):

        localctx = CoreMarkupParser.Question_detailContext(self, self._ctx, self.state)
        self.enterRule(localctx, 8, self.RULE_question_detail)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 39
            localctx.qd = self.match(CoreMarkupParser.QUESTION_DETAIL_TAG)
            self.state = 40
            if not self.bounds(localctx.qd, -1):
                from antlr4.error.Errors import FailedPredicateException
                raise FailedPredicateException(self, "self.bounds($qd, -1)")
            self.state = 41
            self.label()
            CoreMarkupParser.level = self.get_length(localctx.qd)
            self.state = 45 
            self._errHandler.sync(self)
            _alt = 1
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt == 1:
                    self.state = 45
                    self._errHandler.sync(self)
                    token = self._input.LA(1)
                    if token in [CoreMarkupParser.QUESTION_DETAIL_TAG]:
                        self.state = 43
                        self.question_detail()
                        pass
                    elif token in [CoreMarkupParser.DETAIL_TAG]:
                        self.state = 44
                        self.detail()
                        pass
                    else:
                        raise NoViableAltException(self)


                else:
                    raise NoViableAltException(self)
                self.state = 47 
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,6,self._ctx)

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
            self.d = None # Token

        def label(self):
            return self.getTypedRuleContext(CoreMarkupParser.LabelContext,0)


        def DETAIL_TAG(self):
            return self.getToken(CoreMarkupParser.DETAIL_TAG, 0)

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
            self.state = 49
            localctx.d = self.match(CoreMarkupParser.DETAIL_TAG)
            self.state = 50
            if not self.bounds(localctx.d, 0):
                from antlr4.error.Errors import FailedPredicateException
                raise FailedPredicateException(self, "self.bounds($d, 0)")
            self.state = 51
            self.label()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx



    def sempred(self, localctx:RuleContext, ruleIndex:int, predIndex:int):
        if self._predicates == None:
            self._predicates = dict()
        self._predicates[2] = self.header_sempred
        self._predicates[4] = self.question_detail_sempred
        self._predicates[5] = self.detail_sempred
        pred = self._predicates.get(ruleIndex, None)
        if pred is None:
            raise Exception("No predicate with index:" + str(ruleIndex))
        else:
            return pred(localctx, predIndex)

    def header_sempred(self, localctx:HeaderContext, predIndex:int):
            if predIndex == 0:
                return self.header_bounds(localctx.h)
         

    def question_detail_sempred(self, localctx:Question_detailContext, predIndex:int):
            if predIndex == 1:
                return self.bounds(localctx.qd, -1)
         

    def detail_sempred(self, localctx:DetailContext, predIndex:int):
            if predIndex == 2:
                return self.bounds(localctx.d, 0)
         




