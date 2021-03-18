# Generated from CoreMarkupLexer.g4 by ANTLR 4.9.1
from antlr4 import *
from io import StringIO
from typing.io import TextIO
import sys



def serializedATN():
    with StringIO() as buf:
        buf.write("\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\b")
        buf.write("O\b\1\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7")
        buf.write("\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\3\2\3\2\3\3\3\3")
        buf.write("\3\4\3\4\3\5\3\5\3\6\6\6\"\n\6\r\6\16\6#\3\6\3\6\3\7\6")
        buf.write("\7)\n\7\r\7\16\7*\3\7\3\7\5\7/\n\7\3\7\3\7\3\b\3\b\5\b")
        buf.write("\65\n\b\3\b\3\b\3\t\6\t:\n\t\r\t\16\t;\3\t\3\t\3\n\5\n")
        buf.write("A\n\n\3\n\3\n\5\nE\n\n\3\n\3\n\3\13\6\13J\n\13\r\13\16")
        buf.write("\13K\3\13\3\13\2\2\f\4\2\6\2\b\2\n\2\f\3\16\4\20\5\22")
        buf.write("\6\24\7\26\b\4\2\3\3\4\2\f\f\17\17\2Q\2\f\3\2\2\2\2\16")
        buf.write("\3\2\2\2\2\20\3\2\2\2\2\22\3\2\2\2\2\24\3\2\2\2\3\26\3")
        buf.write("\2\2\2\4\30\3\2\2\2\6\32\3\2\2\2\b\34\3\2\2\2\n\36\3\2")
        buf.write("\2\2\f!\3\2\2\2\16(\3\2\2\2\20\64\3\2\2\2\229\3\2\2\2")
        buf.write("\24D\3\2\2\2\26I\3\2\2\2\30\31\7%\2\2\31\5\3\2\2\2\32")
        buf.write("\33\7,\2\2\33\7\3\2\2\2\34\35\7&\2\2\35\t\3\2\2\2\36\37")
        buf.write("\7/\2\2\37\13\3\2\2\2 \"\5\4\2\2! \3\2\2\2\"#\3\2\2\2")
        buf.write("#!\3\2\2\2#$\3\2\2\2$%\3\2\2\2%&\b\6\2\2&\r\3\2\2\2\'")
        buf.write(")\5\n\5\2(\'\3\2\2\2)*\3\2\2\2*(\3\2\2\2*+\3\2\2\2+.\3")
        buf.write("\2\2\2,/\5\6\3\2-/\5\b\4\2.,\3\2\2\2.-\3\2\2\2/\60\3\2")
        buf.write("\2\2\60\61\b\7\2\2\61\17\3\2\2\2\62\65\5\6\3\2\63\65\5")
        buf.write("\b\4\2\64\62\3\2\2\2\64\63\3\2\2\2\65\66\3\2\2\2\66\67")
        buf.write("\b\b\2\2\67\21\3\2\2\28:\5\n\5\298\3\2\2\2:;\3\2\2\2;")
        buf.write("9\3\2\2\2;<\3\2\2\2<=\3\2\2\2=>\b\t\2\2>\23\3\2\2\2?A")
        buf.write("\7\17\2\2@?\3\2\2\2@A\3\2\2\2AB\3\2\2\2BE\7\f\2\2CE\7")
        buf.write("\17\2\2D@\3\2\2\2DC\3\2\2\2EF\3\2\2\2FG\b\n\3\2G\25\3")
        buf.write("\2\2\2HJ\n\2\2\2IH\3\2\2\2JK\3\2\2\2KI\3\2\2\2KL\3\2\2")
        buf.write("\2LM\3\2\2\2MN\b\13\4\2N\27\3\2\2\2\f\2\3#*.\64;@DK\5")
        buf.write("\7\3\2\b\2\2\6\2\2")
        return buf.getvalue()


class CoreMarkupLexer(Lexer):

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    CONTENT = 1

    HEADER_TAG = 1
    QUESTION_DETAIL_TAG = 2
    QUESTION_TAG = 3
    DETAIL_TAG = 4
    NEWLINE = 5
    TEXT = 6

    channelNames = [ u"DEFAULT_TOKEN_CHANNEL", u"HIDDEN" ]

    modeNames = [ "DEFAULT_MODE", "CONTENT" ]

    literalNames = [ "<INVALID>",
 ]

    symbolicNames = [ "<INVALID>",
            "HEADER_TAG", "QUESTION_DETAIL_TAG", "QUESTION_TAG", "DETAIL_TAG", 
            "NEWLINE", "TEXT" ]

    ruleNames = [ "SYM_HEADER", "SYM_QUESTION", "SYM_ENUM_QUESTION", "SYM_DETAIL", 
                  "HEADER_TAG", "QUESTION_DETAIL_TAG", "QUESTION_TAG", "DETAIL_TAG", 
                  "NEWLINE", "TEXT" ]

    grammarFileName = "CoreMarkupLexer.g4"

    def __init__(self, input=None, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.9.1")
        self._interp = LexerATNSimulator(self, self.atn, self.decisionsToDFA, PredictionContextCache())
        self._actions = None
        self._predicates = None


