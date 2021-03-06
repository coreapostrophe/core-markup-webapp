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
		HEADER=1, QUESTION=2, QUESTION_NEST=3, DETAIL_NEST=4, DETAIL=5, NEWLINE=6;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"SYM_HEADER", "SYM_QUESTION", "SYM_ENUM_QUESTION", "SYM_DETAIL", "HEADER", 
			"QUESTION", "QUESTION_NEST", "DETAIL_NEST", "DETAIL", "NEWLINE"
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
			null, "HEADER", "QUESTION", "QUESTION_NEST", "DETAIL_NEST", "DETAIL", 
			"NEWLINE"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\bc\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\6\6!\n\6\r\6\16\6\"\3\6\7\6&\n"+
		"\6\f\6\16\6)\13\6\3\7\3\7\6\7-\n\7\r\7\16\7.\3\7\7\7\62\n\7\f\7\16\7\65"+
		"\13\7\3\b\6\b8\n\b\r\b\16\b9\3\b\3\b\6\b>\n\b\r\b\16\b?\3\b\7\bC\n\b\f"+
		"\b\16\bF\13\b\3\t\3\t\6\tJ\n\t\r\t\16\tK\3\t\7\tO\n\t\f\t\16\tR\13\t\3"+
		"\n\3\n\7\nV\n\n\f\n\16\nY\13\n\3\13\5\13\\\n\13\3\13\3\13\5\13`\n\13\3"+
		"\13\3\13\2\2\f\3\2\5\2\7\2\t\2\13\3\r\4\17\5\21\6\23\7\25\b\3\2\3\4\2"+
		"\f\f\17\17\2l\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\3\27\3\2\2\2\5\31\3\2\2\2\7\33\3\2\2\2\t\35\3\2"+
		"\2\2\13 \3\2\2\2\r,\3\2\2\2\17\67\3\2\2\2\21G\3\2\2\2\23S\3\2\2\2\25_"+
		"\3\2\2\2\27\30\7%\2\2\30\4\3\2\2\2\31\32\7,\2\2\32\6\3\2\2\2\33\34\7&"+
		"\2\2\34\b\3\2\2\2\35\36\7/\2\2\36\n\3\2\2\2\37!\5\3\2\2 \37\3\2\2\2!\""+
		"\3\2\2\2\" \3\2\2\2\"#\3\2\2\2#\'\3\2\2\2$&\n\2\2\2%$\3\2\2\2&)\3\2\2"+
		"\2\'%\3\2\2\2\'(\3\2\2\2(\f\3\2\2\2)\'\3\2\2\2*-\5\5\3\2+-\5\7\4\2,*\3"+
		"\2\2\2,+\3\2\2\2-.\3\2\2\2.,\3\2\2\2./\3\2\2\2/\63\3\2\2\2\60\62\n\2\2"+
		"\2\61\60\3\2\2\2\62\65\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64\16\3\2\2"+
		"\2\65\63\3\2\2\2\668\5\t\5\2\67\66\3\2\2\289\3\2\2\29\67\3\2\2\29:\3\2"+
		"\2\2:=\3\2\2\2;>\5\5\3\2<>\5\7\4\2=;\3\2\2\2=<\3\2\2\2>?\3\2\2\2?=\3\2"+
		"\2\2?@\3\2\2\2@D\3\2\2\2AC\n\2\2\2BA\3\2\2\2CF\3\2\2\2DB\3\2\2\2DE\3\2"+
		"\2\2E\20\3\2\2\2FD\3\2\2\2GI\5\t\5\2HJ\5\t\5\2IH\3\2\2\2JK\3\2\2\2KI\3"+
		"\2\2\2KL\3\2\2\2LP\3\2\2\2MO\n\2\2\2NM\3\2\2\2OR\3\2\2\2PN\3\2\2\2PQ\3"+
		"\2\2\2Q\22\3\2\2\2RP\3\2\2\2SW\5\t\5\2TV\n\2\2\2UT\3\2\2\2VY\3\2\2\2W"+
		"U\3\2\2\2WX\3\2\2\2X\24\3\2\2\2YW\3\2\2\2Z\\\7\17\2\2[Z\3\2\2\2[\\\3\2"+
		"\2\2\\]\3\2\2\2]`\7\f\2\2^`\7\17\2\2_[\3\2\2\2_^\3\2\2\2`a\3\2\2\2ab\b"+
		"\13\2\2b\26\3\2\2\2\21\2\"\',.\639=?DKPW[_\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}