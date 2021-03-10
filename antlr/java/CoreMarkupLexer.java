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
		HEADER_TAG=1, NESTED_QUESTION_TAG=2, QUESTION_TAG=3, NESTED_DETAIL_TAG=4, 
		DETAIL_TAG=5, NEWLINE=6, TEXT=7;
	public static final int
		TEST=1;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "TEST"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"SYM_HEADER", "SYM_QUESTION", "SYM_ENUM_QUESTION", "SYM_DETAIL", "LETTER", 
			"DIGIT", "SYMBOL", "WS", "HEADER_TAG", "NESTED_QUESTION_TAG", "QUESTION_TAG", 
			"NESTED_DETAIL_TAG", "DETAIL_TAG", "NEWLINE", "TEXT"
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
			"DETAIL_TAG", "NEWLINE", "TEXT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\t\u0085\b\1\b\1\4"+
		"\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n"+
		"\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\6\n\64\n\n\r\n"+
		"\16\n\65\3\n\6\n9\n\n\r\n\16\n:\3\n\3\n\3\13\6\13@\n\13\r\13\16\13A\3"+
		"\13\3\13\5\13F\n\13\3\13\6\13I\n\13\r\13\16\13J\3\13\3\13\3\f\3\f\5\f"+
		"Q\n\f\3\f\6\fT\n\f\r\f\16\fU\3\f\3\f\3\r\3\r\6\r\\\n\r\r\r\16\r]\3\r\6"+
		"\ra\n\r\r\r\16\rb\3\r\3\r\3\16\6\16h\n\16\r\16\16\16i\3\16\6\16m\n\16"+
		"\r\16\16\16n\3\16\3\16\3\17\5\17t\n\17\3\17\3\17\5\17x\n\17\3\17\3\17"+
		"\3\20\3\20\3\20\3\20\6\20\u0080\n\20\r\20\16\20\u0081\3\20\3\20\2\2\21"+
		"\4\2\6\2\b\2\n\2\f\2\16\2\20\2\22\2\24\3\26\4\30\5\32\6\34\7\36\b \t\4"+
		"\2\3\6\4\2C\\c|\3\2\62;\t\2##%(*,/\60BB``bb\4\2\13\13\"\"\2\u008c\2\24"+
		"\3\2\2\2\2\26\3\2\2\2\2\30\3\2\2\2\2\32\3\2\2\2\2\34\3\2\2\2\2\36\3\2"+
		"\2\2\3 \3\2\2\2\4\"\3\2\2\2\6$\3\2\2\2\b&\3\2\2\2\n(\3\2\2\2\f*\3\2\2"+
		"\2\16,\3\2\2\2\20.\3\2\2\2\22\60\3\2\2\2\24\63\3\2\2\2\26?\3\2\2\2\30"+
		"P\3\2\2\2\32Y\3\2\2\2\34g\3\2\2\2\36w\3\2\2\2 \177\3\2\2\2\"#\7%\2\2#"+
		"\5\3\2\2\2$%\7,\2\2%\7\3\2\2\2&\'\7&\2\2\'\t\3\2\2\2()\7/\2\2)\13\3\2"+
		"\2\2*+\t\2\2\2+\r\3\2\2\2,-\t\3\2\2-\17\3\2\2\2./\t\4\2\2/\21\3\2\2\2"+
		"\60\61\t\5\2\2\61\23\3\2\2\2\62\64\5\4\2\2\63\62\3\2\2\2\64\65\3\2\2\2"+
		"\65\63\3\2\2\2\65\66\3\2\2\2\668\3\2\2\2\679\5\22\t\28\67\3\2\2\29:\3"+
		"\2\2\2:8\3\2\2\2:;\3\2\2\2;<\3\2\2\2<=\b\n\2\2=\25\3\2\2\2>@\5\n\5\2?"+
		">\3\2\2\2@A\3\2\2\2A?\3\2\2\2AB\3\2\2\2BE\3\2\2\2CF\5\6\3\2DF\5\b\4\2"+
		"EC\3\2\2\2ED\3\2\2\2FH\3\2\2\2GI\5\22\t\2HG\3\2\2\2IJ\3\2\2\2JH\3\2\2"+
		"\2JK\3\2\2\2KL\3\2\2\2LM\b\13\2\2M\27\3\2\2\2NQ\5\6\3\2OQ\5\b\4\2PN\3"+
		"\2\2\2PO\3\2\2\2QS\3\2\2\2RT\5\22\t\2SR\3\2\2\2TU\3\2\2\2US\3\2\2\2UV"+
		"\3\2\2\2VW\3\2\2\2WX\b\f\2\2X\31\3\2\2\2Y[\5\n\5\2Z\\\5\n\5\2[Z\3\2\2"+
		"\2\\]\3\2\2\2][\3\2\2\2]^\3\2\2\2^`\3\2\2\2_a\5\22\t\2`_\3\2\2\2ab\3\2"+
		"\2\2b`\3\2\2\2bc\3\2\2\2cd\3\2\2\2de\b\r\2\2e\33\3\2\2\2fh\5\n\5\2gf\3"+
		"\2\2\2hi\3\2\2\2ig\3\2\2\2ij\3\2\2\2jl\3\2\2\2km\5\22\t\2lk\3\2\2\2mn"+
		"\3\2\2\2nl\3\2\2\2no\3\2\2\2op\3\2\2\2pq\b\16\2\2q\35\3\2\2\2rt\7\17\2"+
		"\2sr\3\2\2\2st\3\2\2\2tu\3\2\2\2ux\7\f\2\2vx\7\17\2\2ws\3\2\2\2wv\3\2"+
		"\2\2xy\3\2\2\2yz\b\17\3\2z\37\3\2\2\2{\u0080\5\f\6\2|\u0080\5\16\7\2}"+
		"\u0080\5\20\b\2~\u0080\5\22\t\2\177{\3\2\2\2\177|\3\2\2\2\177}\3\2\2\2"+
		"\177~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2"+
		"\2\u0082\u0083\3\2\2\2\u0083\u0084\b\20\4\2\u0084!\3\2\2\2\23\2\3\65:"+
		"AEJPU]binsw\177\u0081\5\7\3\2\b\2\2\6\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}