# Generated from CoreMarkup.g4 by ANTLR 4.9.1
from antlr4 import *
from io import StringIO
from typing.io import TextIO
import sys



def serializedATN():
    with StringIO() as buf:
        buf.write("\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\b")
        buf.write("U\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7")
        buf.write("\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\3\2\3\2\3\3")
        buf.write("\3\3\3\4\3\4\3\5\3\5\3\6\7\6#\n\6\f\6\16\6&\13\6\3\7\6")
        buf.write("\7)\n\7\r\7\16\7*\3\7\3\7\3\b\3\b\6\b\61\n\b\r\b\16\b")
        buf.write("\62\3\b\3\b\3\t\6\t8\n\t\r\t\16\t9\3\t\3\t\5\t>\n\t\3")
        buf.write("\t\3\t\3\n\3\n\6\nD\n\n\r\n\16\nE\3\n\3\n\3\13\3\13\3")
        buf.write("\13\3\f\5\fN\n\f\3\f\3\f\5\fR\n\f\3\f\3\f\2\2\r\3\2\5")
        buf.write("\2\7\2\t\2\13\2\r\3\17\4\21\5\23\6\25\7\27\b\3\2\3\4\2")
        buf.write("\f\f\17\17\2X\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2")
        buf.write("\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\3\31\3\2\2\2\5\33")
        buf.write("\3\2\2\2\7\35\3\2\2\2\t\37\3\2\2\2\13$\3\2\2\2\r(\3\2")
        buf.write("\2\2\17\60\3\2\2\2\21\67\3\2\2\2\23A\3\2\2\2\25I\3\2\2")
        buf.write("\2\27Q\3\2\2\2\31\32\7%\2\2\32\4\3\2\2\2\33\34\7,\2\2")
        buf.write("\34\6\3\2\2\2\35\36\7&\2\2\36\b\3\2\2\2\37 \7/\2\2 \n")
        buf.write("\3\2\2\2!#\n\2\2\2\"!\3\2\2\2#&\3\2\2\2$\"\3\2\2\2$%\3")
        buf.write("\2\2\2%\f\3\2\2\2&$\3\2\2\2\')\5\3\2\2(\'\3\2\2\2)*\3")
        buf.write("\2\2\2*(\3\2\2\2*+\3\2\2\2+,\3\2\2\2,-\5\13\6\2-\16\3")
        buf.write("\2\2\2.\61\5\5\3\2/\61\5\7\4\2\60.\3\2\2\2\60/\3\2\2\2")
        buf.write("\61\62\3\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63\64\3\2\2")
        buf.write("\2\64\65\5\13\6\2\65\20\3\2\2\2\668\5\t\5\2\67\66\3\2")
        buf.write("\2\289\3\2\2\29\67\3\2\2\29:\3\2\2\2:=\3\2\2\2;>\5\5\3")
        buf.write("\2<>\5\7\4\2=;\3\2\2\2=<\3\2\2\2>?\3\2\2\2?@\5\13\6\2")
        buf.write("@\22\3\2\2\2AC\5\t\5\2BD\5\t\5\2CB\3\2\2\2DE\3\2\2\2E")
        buf.write("C\3\2\2\2EF\3\2\2\2FG\3\2\2\2GH\5\13\6\2H\24\3\2\2\2I")
        buf.write("J\5\t\5\2JK\5\13\6\2K\26\3\2\2\2LN\7\17\2\2ML\3\2\2\2")
        buf.write("MN\3\2\2\2NO\3\2\2\2OR\7\f\2\2PR\7\17\2\2QM\3\2\2\2QP")
        buf.write("\3\2\2\2RS\3\2\2\2ST\b\f\2\2T\30\3\2\2\2\f\2$*\60\629")
        buf.write("=EMQ\3\b\2\2")
        return buf.getvalue()


class CoreMarkupLexer(Lexer):

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    HEADER = 1
    QUESTION = 2
    QUESTION_NEST = 3
    DETAIL_NEST = 4
    DETAIL = 5
    NEWLINE = 6

    channelNames = [ u"DEFAULT_TOKEN_CHANNEL", u"HIDDEN" ]

    modeNames = [ "DEFAULT_MODE" ]

    literalNames = [ "<INVALID>",
 ]

    symbolicNames = [ "<INVALID>",
            "HEADER", "QUESTION", "QUESTION_NEST", "DETAIL_NEST", "DETAIL", 
            "NEWLINE" ]

    ruleNames = [ "SYM_HEADER", "SYM_QUESTION", "SYM_ENUM_QUESTION", "SYM_DETAIL", 
                  "TEXT", "HEADER", "QUESTION", "QUESTION_NEST", "DETAIL_NEST", 
                  "DETAIL", "NEWLINE" ]

    grammarFileName = "CoreMarkup.g4"

    def __init__(self, input=None, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.9.1")
        self._interp = LexerATNSimulator(self, self.atn, self.decisionsToDFA, PredictionContextCache())
        self._actions = None
        self._predicates = None


