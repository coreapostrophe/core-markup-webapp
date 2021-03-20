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
		OPTION_TAG=1, HEADER_TAG=2, QUESTION_DETAIL_TAG=3, QUESTION_TAG=4, DETAIL_TAG=5, 
		NEWLINE=6, TEXT=7, KEY=8, VALUE=9;
	public static final int
		CONTENT=1, OPTION=2;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "CONTENT", "OPTION"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"SYM_HEADER", "SYM_QUESTION", "SYM_ENUM_QUESTION", "SYM_DETAIL", "SYM_OPTION", 
			"OPTION_TAG", "HEADER_TAG", "QUESTION_DETAIL_TAG", "QUESTION_TAG", "DETAIL_TAG", 
			"NEWLINE", "TEXT", "KEY", "VALUE"
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
			null, "OPTION_TAG", "HEADER_TAG", "QUESTION_DETAIL_TAG", "QUESTION_TAG", 
			"DETAIL_TAG", "NEWLINE", "TEXT", "KEY", "VALUE"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\13p\b\1\b\1\b\1\4"+
		"\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n"+
		"\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\3\3\3\3\4\3\4"+
		"\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\b\6\b\61\n\b\r\b\16\b\62\3\b\3\b\3"+
		"\t\6\t8\n\t\r\t\16\t9\3\t\3\t\5\t>\n\t\3\t\3\t\3\n\3\n\5\nD\n\n\3\n\3"+
		"\n\3\13\6\13I\n\13\r\13\16\13J\3\13\3\13\3\f\5\fP\n\f\3\f\3\f\5\fT\n\f"+
		"\3\f\3\f\3\r\6\rY\n\r\r\r\16\rZ\3\r\3\r\3\16\6\16`\n\16\r\16\16\16a\3"+
		"\17\3\17\3\17\3\17\7\17h\n\17\f\17\16\17k\13\17\3\17\3\17\3\17\3\17\2"+
		"\2\20\5\2\7\2\t\2\13\2\r\2\17\3\21\4\23\5\25\6\27\7\31\b\33\t\35\n\37"+
		"\13\5\2\3\4\5\4\2\f\f\17\17\4\2C\\c|\5\2\f\f\17\17$$\2s\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\3\33\3"+
		"\2\2\2\4\35\3\2\2\2\4\37\3\2\2\2\5!\3\2\2\2\7#\3\2\2\2\t%\3\2\2\2\13\'"+
		"\3\2\2\2\r)\3\2\2\2\17+\3\2\2\2\21\60\3\2\2\2\23\67\3\2\2\2\25C\3\2\2"+
		"\2\27H\3\2\2\2\31S\3\2\2\2\33X\3\2\2\2\35_\3\2\2\2\37c\3\2\2\2!\"\7%\2"+
		"\2\"\6\3\2\2\2#$\7,\2\2$\b\3\2\2\2%&\7&\2\2&\n\3\2\2\2\'(\7/\2\2(\f\3"+
		"\2\2\2)*\7=\2\2*\16\3\2\2\2+,\5\r\6\2,-\3\2\2\2-.\b\7\2\2.\20\3\2\2\2"+
		"/\61\5\5\2\2\60/\3\2\2\2\61\62\3\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63"+
		"\64\3\2\2\2\64\65\b\b\3\2\65\22\3\2\2\2\668\5\13\5\2\67\66\3\2\2\289\3"+
		"\2\2\29\67\3\2\2\29:\3\2\2\2:=\3\2\2\2;>\5\7\3\2<>\5\t\4\2=;\3\2\2\2="+
		"<\3\2\2\2>?\3\2\2\2?@\b\t\3\2@\24\3\2\2\2AD\5\7\3\2BD\5\t\4\2CA\3\2\2"+
		"\2CB\3\2\2\2DE\3\2\2\2EF\b\n\3\2F\26\3\2\2\2GI\5\13\5\2HG\3\2\2\2IJ\3"+
		"\2\2\2JH\3\2\2\2JK\3\2\2\2KL\3\2\2\2LM\b\13\3\2M\30\3\2\2\2NP\7\17\2\2"+
		"ON\3\2\2\2OP\3\2\2\2PQ\3\2\2\2QT\7\f\2\2RT\7\17\2\2SO\3\2\2\2SR\3\2\2"+
		"\2TU\3\2\2\2UV\b\f\4\2V\32\3\2\2\2WY\n\2\2\2XW\3\2\2\2YZ\3\2\2\2ZX\3\2"+
		"\2\2Z[\3\2\2\2[\\\3\2\2\2\\]\b\r\5\2]\34\3\2\2\2^`\t\3\2\2_^\3\2\2\2`"+
		"a\3\2\2\2a_\3\2\2\2ab\3\2\2\2b\36\3\2\2\2ci\7$\2\2de\7$\2\2eh\7$\2\2f"+
		"h\n\4\2\2gd\3\2\2\2gf\3\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3\2\2\2jl\3\2\2\2"+
		"ki\3\2\2\2lm\7$\2\2mn\3\2\2\2no\b\17\5\2o \3\2\2\2\20\2\3\4\629=CJOSZ"+
		"agi\6\7\4\2\7\3\2\b\2\2\6\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}