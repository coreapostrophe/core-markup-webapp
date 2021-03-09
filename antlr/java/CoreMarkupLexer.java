// Generated from CoreMarkup.g4 by ANTLR 4.9.1
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
		HEADER_TAG=1, NESTED_QUESTION_TAG=2, QUESTION_TAG=3, NESTED_DETAIL_TAG=4, 
		DETAIL_TAG=5, TEXT=6, NEWLINE=7;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"SYM_HEADER", "SYM_QUESTION", "SYM_ENUM_QUESTION", "SYM_DETAIL", "SYM_COLON", 
			"LOWERCASE", "UPPERCASE", "DIGIT", "SYMBOL", "WS", "HEADER_TAG", "NESTED_QUESTION_TAG", 
			"QUESTION_TAG", "NESTED_DETAIL_TAG", "DETAIL_TAG", "TEXT", "NEWLINE"
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
			null, "HEADER_TAG", "NESTED_QUESTION_TAG", "QUESTION_TAG", "NESTED_DETAIL_TAG", 
			"DETAIL_TAG", "TEXT", "NEWLINE"
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
	public String getGrammarFileName() { return "CoreMarkup.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\tr\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3"+
		"\n\3\13\3\13\3\f\6\f;\n\f\r\f\16\f<\3\f\3\f\3\r\6\rB\n\r\r\r\16\rC\3\r"+
		"\3\r\5\rH\n\r\3\r\3\r\3\16\3\16\5\16N\n\16\3\16\3\16\3\17\3\17\6\17T\n"+
		"\17\r\17\16\17U\3\17\3\17\3\20\6\20[\n\20\r\20\16\20\\\3\20\3\20\3\21"+
		"\3\21\3\21\3\21\3\21\6\21f\n\21\r\21\16\21g\3\22\5\22k\n\22\3\22\3\22"+
		"\5\22o\n\22\3\22\3\22\2\2\23\3\2\5\2\7\2\t\2\13\2\r\2\17\2\21\2\23\2\25"+
		"\2\27\3\31\4\33\5\35\6\37\7!\b#\t\3\2\7\3\2c|\3\2C\\\3\2\62;\b\2##%(*"+
		",BB``bb\4\2\13\13\"\"\2t\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3"+
		"\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\3%\3\2\2\2\5\'\3\2\2\2\7)\3"+
		"\2\2\2\t+\3\2\2\2\13-\3\2\2\2\r/\3\2\2\2\17\61\3\2\2\2\21\63\3\2\2\2\23"+
		"\65\3\2\2\2\25\67\3\2\2\2\27:\3\2\2\2\31A\3\2\2\2\33M\3\2\2\2\35Q\3\2"+
		"\2\2\37Z\3\2\2\2!e\3\2\2\2#n\3\2\2\2%&\7%\2\2&\4\3\2\2\2\'(\7,\2\2(\6"+
		"\3\2\2\2)*\7&\2\2*\b\3\2\2\2+,\7/\2\2,\n\3\2\2\2-.\7<\2\2.\f\3\2\2\2/"+
		"\60\t\2\2\2\60\16\3\2\2\2\61\62\t\3\2\2\62\20\3\2\2\2\63\64\t\4\2\2\64"+
		"\22\3\2\2\2\65\66\t\5\2\2\66\24\3\2\2\2\678\t\6\2\28\26\3\2\2\29;\5\3"+
		"\2\2:9\3\2\2\2;<\3\2\2\2<:\3\2\2\2<=\3\2\2\2=>\3\2\2\2>?\5\13\6\2?\30"+
		"\3\2\2\2@B\5\t\5\2A@\3\2\2\2BC\3\2\2\2CA\3\2\2\2CD\3\2\2\2DG\3\2\2\2E"+
		"H\5\5\3\2FH\5\7\4\2GE\3\2\2\2GF\3\2\2\2HI\3\2\2\2IJ\5\13\6\2J\32\3\2\2"+
		"\2KN\5\5\3\2LN\5\7\4\2MK\3\2\2\2ML\3\2\2\2NO\3\2\2\2OP\5\13\6\2P\34\3"+
		"\2\2\2QS\5\t\5\2RT\5\t\5\2SR\3\2\2\2TU\3\2\2\2US\3\2\2\2UV\3\2\2\2VW\3"+
		"\2\2\2WX\5\13\6\2X\36\3\2\2\2Y[\5\t\5\2ZY\3\2\2\2[\\\3\2\2\2\\Z\3\2\2"+
		"\2\\]\3\2\2\2]^\3\2\2\2^_\5\13\6\2_ \3\2\2\2`f\5\r\7\2af\5\17\b\2bf\5"+
		"\21\t\2cf\5\23\n\2df\5\25\13\2e`\3\2\2\2ea\3\2\2\2eb\3\2\2\2ec\3\2\2\2"+
		"ed\3\2\2\2fg\3\2\2\2ge\3\2\2\2gh\3\2\2\2h\"\3\2\2\2ik\7\17\2\2ji\3\2\2"+
		"\2jk\3\2\2\2kl\3\2\2\2lo\7\f\2\2mo\7\17\2\2nj\3\2\2\2nm\3\2\2\2op\3\2"+
		"\2\2pq\b\22\2\2q$\3\2\2\2\r\2<CGMU\\egjn\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}