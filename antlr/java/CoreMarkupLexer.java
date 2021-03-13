// Generated from CoreMarkupLexer.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CoreMarkupLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		HEADER_TAG=1, QUESTION_DETAIL_TAG=2, QUESTION_TAG=3, DETAIL_TAG=4, NESTED_DETAIL_TAG=5, 
		NEWLINE=6, TEXT=7;
	public static final int
		CONTENT=1;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "CONTENT"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"SYM_HEADER", "SYM_QUESTION", "SYM_ENUM_QUESTION", "SYM_DETAIL", "HEADER_TAG", 
			"QUESTION_DETAIL_TAG", "QUESTION_TAG", "DETAIL_TAG", "NESTED_DETAIL_TAG", 
			"NEWLINE", "TEXT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "HEADER_TAG", "QUESTION_DETAIL_TAG", "QUESTION_TAG", "DETAIL_TAG", 
			"NESTED_DETAIL_TAG", "NEWLINE", "TEXT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public CoreMarkupLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CoreMarkupLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\tV\b\1\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\6\6$\n\6\r\6\16\6%\3"+
		"\6\3\6\3\7\6\7+\n\7\r\7\16\7,\3\7\3\7\5\7\61\n\7\3\7\3\7\3\b\3\b\5\b\67"+
		"\n\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\6\nA\n\n\r\n\16\nB\3\n\3\n\3\13\5"+
		"\13H\n\13\3\13\3\13\5\13L\n\13\3\13\3\13\3\f\6\fQ\n\f\r\f\16\fR\3\f\3"+
		"\f\2\2\r\4\2\6\2\b\2\n\2\f\3\16\4\20\5\22\6\24\7\26\b\30\t\4\2\3\3\4\2"+
		"\f\f\17\17\2X\2\f\3\2\2\2\2\16\3\2\2\2\2\20\3\2\2\2\2\22\3\2\2\2\2\24"+
		"\3\2\2\2\2\26\3\2\2\2\3\30\3\2\2\2\4\32\3\2\2\2\6\34\3\2\2\2\b\36\3\2"+
		"\2\2\n \3\2\2\2\f#\3\2\2\2\16*\3\2\2\2\20\66\3\2\2\2\22:\3\2\2\2\24>\3"+
		"\2\2\2\26K\3\2\2\2\30P\3\2\2\2\32\33\7%\2\2\33\5\3\2\2\2\34\35\7,\2\2"+
		"\35\7\3\2\2\2\36\37\7&\2\2\37\t\3\2\2\2 !\7/\2\2!\13\3\2\2\2\"$\5\4\2"+
		"\2#\"\3\2\2\2$%\3\2\2\2%#\3\2\2\2%&\3\2\2\2&\'\3\2\2\2\'(\b\6\2\2(\r\3"+
		"\2\2\2)+\5\n\5\2*)\3\2\2\2+,\3\2\2\2,*\3\2\2\2,-\3\2\2\2-\60\3\2\2\2."+
		"\61\5\6\3\2/\61\5\b\4\2\60.\3\2\2\2\60/\3\2\2\2\61\62\3\2\2\2\62\63\b"+
		"\7\2\2\63\17\3\2\2\2\64\67\5\6\3\2\65\67\5\b\4\2\66\64\3\2\2\2\66\65\3"+
		"\2\2\2\678\3\2\2\289\b\b\2\29\21\3\2\2\2:;\5\n\5\2;<\3\2\2\2<=\b\t\2\2"+
		"=\23\3\2\2\2>@\5\n\5\2?A\5\n\5\2@?\3\2\2\2AB\3\2\2\2B@\3\2\2\2BC\3\2\2"+
		"\2CD\3\2\2\2DE\b\n\2\2E\25\3\2\2\2FH\7\17\2\2GF\3\2\2\2GH\3\2\2\2HI\3"+
		"\2\2\2IL\7\f\2\2JL\7\17\2\2KG\3\2\2\2KJ\3\2\2\2LM\3\2\2\2MN\b\13\3\2N"+
		"\27\3\2\2\2OQ\n\2\2\2PO\3\2\2\2QR\3\2\2\2RP\3\2\2\2RS\3\2\2\2ST\3\2\2"+
		"\2TU\b\f\4\2U\31\3\2\2\2\f\2\3%,\60\66BGKR\5\7\3\2\b\2\2\6\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}