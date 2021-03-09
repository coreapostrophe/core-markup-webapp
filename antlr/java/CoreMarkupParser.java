// Generated from CoreMarkup.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CoreMarkupParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		HEADER_TAG=1, NESTED_QUESTION_TAG=2, QUESTION_TAG=3, NESTED_DETAIL_TAG=4, 
		DETAIL_TAG=5, TEXT=6, NEWLINE=7;
	public static final int
		RULE_cmu = 0, RULE_header = 1, RULE_question = 2, RULE_nested_question = 3, 
		RULE_detail = 4, RULE_nested_detail = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"cmu", "header", "question", "nested_question", "detail", "nested_detail"
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

	@Override
	public String getGrammarFileName() { return "CoreMarkup.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CoreMarkupParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class CmuContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(CoreMarkupParser.EOF, 0); }
		public List<HeaderContext> header() {
			return getRuleContexts(HeaderContext.class);
		}
		public HeaderContext header(int i) {
			return getRuleContext(HeaderContext.class,i);
		}
		public List<QuestionContext> question() {
			return getRuleContexts(QuestionContext.class);
		}
		public QuestionContext question(int i) {
			return getRuleContext(QuestionContext.class,i);
		}
		public CmuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmu; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoreMarkupListener ) ((CoreMarkupListener)listener).enterCmu(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreMarkupListener ) ((CoreMarkupListener)listener).exitCmu(this);
		}
	}

	public final CmuContext cmu() throws RecognitionException {
		CmuContext _localctx = new CmuContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_cmu);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(14);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case HEADER_TAG:
					{
					setState(12);
					header();
					}
					break;
				case QUESTION_TAG:
					{
					setState(13);
					question();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(16); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==HEADER_TAG || _la==QUESTION_TAG );
			setState(18);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HeaderContext extends ParserRuleContext {
		public TerminalNode HEADER_TAG() { return getToken(CoreMarkupParser.HEADER_TAG, 0); }
		public List<TerminalNode> TEXT() { return getTokens(CoreMarkupParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(CoreMarkupParser.TEXT, i);
		}
		public HeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoreMarkupListener ) ((CoreMarkupListener)listener).enterHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreMarkupListener ) ((CoreMarkupListener)listener).exitHeader(this);
		}
	}

	public final HeaderContext header() throws RecognitionException {
		HeaderContext _localctx = new HeaderContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_header);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			match(HEADER_TAG);
			setState(22); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(21);
				match(TEXT);
				}
				}
				setState(24); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TEXT );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QuestionContext extends ParserRuleContext {
		public TerminalNode QUESTION_TAG() { return getToken(CoreMarkupParser.QUESTION_TAG, 0); }
		public List<TerminalNode> TEXT() { return getTokens(CoreMarkupParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(CoreMarkupParser.TEXT, i);
		}
		public List<Nested_questionContext> nested_question() {
			return getRuleContexts(Nested_questionContext.class);
		}
		public Nested_questionContext nested_question(int i) {
			return getRuleContext(Nested_questionContext.class,i);
		}
		public List<DetailContext> detail() {
			return getRuleContexts(DetailContext.class);
		}
		public DetailContext detail(int i) {
			return getRuleContext(DetailContext.class,i);
		}
		public QuestionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_question; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoreMarkupListener ) ((CoreMarkupListener)listener).enterQuestion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreMarkupListener ) ((CoreMarkupListener)listener).exitQuestion(this);
		}
	}

	public final QuestionContext question() throws RecognitionException {
		QuestionContext _localctx = new QuestionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_question);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			match(QUESTION_TAG);
			setState(28); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(27);
				match(TEXT);
				}
				}
				setState(30); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TEXT );
			setState(34); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(34);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NESTED_QUESTION_TAG:
					{
					setState(32);
					nested_question();
					}
					break;
				case DETAIL_TAG:
					{
					setState(33);
					detail();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(36); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NESTED_QUESTION_TAG || _la==DETAIL_TAG );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Nested_questionContext extends ParserRuleContext {
		public TerminalNode NESTED_QUESTION_TAG() { return getToken(CoreMarkupParser.NESTED_QUESTION_TAG, 0); }
		public List<TerminalNode> TEXT() { return getTokens(CoreMarkupParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(CoreMarkupParser.TEXT, i);
		}
		public List<Nested_detailContext> nested_detail() {
			return getRuleContexts(Nested_detailContext.class);
		}
		public Nested_detailContext nested_detail(int i) {
			return getRuleContext(Nested_detailContext.class,i);
		}
		public Nested_questionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nested_question; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoreMarkupListener ) ((CoreMarkupListener)listener).enterNested_question(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreMarkupListener ) ((CoreMarkupListener)listener).exitNested_question(this);
		}
	}

	public final Nested_questionContext nested_question() throws RecognitionException {
		Nested_questionContext _localctx = new Nested_questionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_nested_question);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(NESTED_QUESTION_TAG);
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TEXT) {
				{
				{
				setState(39);
				match(TEXT);
				}
				}
				setState(44);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NESTED_DETAIL_TAG) {
				{
				{
				setState(45);
				nested_detail();
				}
				}
				setState(50);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DetailContext extends ParserRuleContext {
		public TerminalNode DETAIL_TAG() { return getToken(CoreMarkupParser.DETAIL_TAG, 0); }
		public List<TerminalNode> TEXT() { return getTokens(CoreMarkupParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(CoreMarkupParser.TEXT, i);
		}
		public DetailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_detail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoreMarkupListener ) ((CoreMarkupListener)listener).enterDetail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreMarkupListener ) ((CoreMarkupListener)listener).exitDetail(this);
		}
	}

	public final DetailContext detail() throws RecognitionException {
		DetailContext _localctx = new DetailContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_detail);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(DETAIL_TAG);
			setState(53); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(52);
				match(TEXT);
				}
				}
				setState(55); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TEXT );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Nested_detailContext extends ParserRuleContext {
		public TerminalNode NESTED_DETAIL_TAG() { return getToken(CoreMarkupParser.NESTED_DETAIL_TAG, 0); }
		public List<TerminalNode> TEXT() { return getTokens(CoreMarkupParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(CoreMarkupParser.TEXT, i);
		}
		public Nested_detailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nested_detail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoreMarkupListener ) ((CoreMarkupListener)listener).enterNested_detail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreMarkupListener ) ((CoreMarkupListener)listener).exitNested_detail(this);
		}
	}

	public final Nested_detailContext nested_detail() throws RecognitionException {
		Nested_detailContext _localctx = new Nested_detailContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_nested_detail);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(NESTED_DETAIL_TAG);
			setState(59); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(58);
				match(TEXT);
				}
				}
				setState(61); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TEXT );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\tB\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\6\2\21\n\2\r\2\16\2\22\3\2"+
		"\3\2\3\3\3\3\6\3\31\n\3\r\3\16\3\32\3\4\3\4\6\4\37\n\4\r\4\16\4 \3\4\3"+
		"\4\6\4%\n\4\r\4\16\4&\3\5\3\5\7\5+\n\5\f\5\16\5.\13\5\3\5\7\5\61\n\5\f"+
		"\5\16\5\64\13\5\3\6\3\6\6\68\n\6\r\6\16\69\3\7\3\7\6\7>\n\7\r\7\16\7?"+
		"\3\7\2\2\b\2\4\6\b\n\f\2\2\2E\2\20\3\2\2\2\4\26\3\2\2\2\6\34\3\2\2\2\b"+
		"(\3\2\2\2\n\65\3\2\2\2\f;\3\2\2\2\16\21\5\4\3\2\17\21\5\6\4\2\20\16\3"+
		"\2\2\2\20\17\3\2\2\2\21\22\3\2\2\2\22\20\3\2\2\2\22\23\3\2\2\2\23\24\3"+
		"\2\2\2\24\25\7\2\2\3\25\3\3\2\2\2\26\30\7\3\2\2\27\31\7\b\2\2\30\27\3"+
		"\2\2\2\31\32\3\2\2\2\32\30\3\2\2\2\32\33\3\2\2\2\33\5\3\2\2\2\34\36\7"+
		"\5\2\2\35\37\7\b\2\2\36\35\3\2\2\2\37 \3\2\2\2 \36\3\2\2\2 !\3\2\2\2!"+
		"$\3\2\2\2\"%\5\b\5\2#%\5\n\6\2$\"\3\2\2\2$#\3\2\2\2%&\3\2\2\2&$\3\2\2"+
		"\2&\'\3\2\2\2\'\7\3\2\2\2(,\7\4\2\2)+\7\b\2\2*)\3\2\2\2+.\3\2\2\2,*\3"+
		"\2\2\2,-\3\2\2\2-\62\3\2\2\2.,\3\2\2\2/\61\5\f\7\2\60/\3\2\2\2\61\64\3"+
		"\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63\t\3\2\2\2\64\62\3\2\2\2\65\67\7"+
		"\7\2\2\668\7\b\2\2\67\66\3\2\2\289\3\2\2\29\67\3\2\2\29:\3\2\2\2:\13\3"+
		"\2\2\2;=\7\6\2\2<>\7\b\2\2=<\3\2\2\2>?\3\2\2\2?=\3\2\2\2?@\3\2\2\2@\r"+
		"\3\2\2\2\f\20\22\32 $&,\629?";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}