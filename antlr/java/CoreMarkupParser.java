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
		HEADER=1, QUESTION=2, QUESTION_NEST=3, DETAIL_NEST=4, DETAIL=5, NEWLINE=6;
	public static final int
		RULE_cmu = 0, RULE_header = 1, RULE_question = 2, RULE_nested_question = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"cmu", "header", "question", "nested_question"
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
		public List<QuestionContext> question() {
			return getRuleContexts(QuestionContext.class);
		}
		public QuestionContext question(int i) {
			return getRuleContext(QuestionContext.class,i);
		}
		public List<HeaderContext> header() {
			return getRuleContexts(HeaderContext.class);
		}
		public HeaderContext header(int i) {
			return getRuleContext(HeaderContext.class,i);
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
			setState(10); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(10);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case QUESTION:
					{
					setState(8);
					question();
					}
					break;
				case HEADER:
					{
					setState(9);
					header();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(12); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==HEADER || _la==QUESTION );
			setState(14);
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
		public TerminalNode HEADER() { return getToken(CoreMarkupParser.HEADER, 0); }
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			match(HEADER);
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
		public TerminalNode QUESTION() { return getToken(CoreMarkupParser.QUESTION, 0); }
		public List<Nested_questionContext> nested_question() {
			return getRuleContexts(Nested_questionContext.class);
		}
		public Nested_questionContext nested_question(int i) {
			return getRuleContext(Nested_questionContext.class,i);
		}
		public List<TerminalNode> DETAIL() { return getTokens(CoreMarkupParser.DETAIL); }
		public TerminalNode DETAIL(int i) {
			return getToken(CoreMarkupParser.DETAIL, i);
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
			setState(18);
			match(QUESTION);
			setState(21); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(21);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case QUESTION_NEST:
					{
					setState(19);
					nested_question();
					}
					break;
				case DETAIL:
					{
					setState(20);
					match(DETAIL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(23); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==QUESTION_NEST || _la==DETAIL );
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
		public TerminalNode QUESTION_NEST() { return getToken(CoreMarkupParser.QUESTION_NEST, 0); }
		public List<Nested_questionContext> nested_question() {
			return getRuleContexts(Nested_questionContext.class);
		}
		public Nested_questionContext nested_question(int i) {
			return getRuleContext(Nested_questionContext.class,i);
		}
		public List<TerminalNode> DETAIL_NEST() { return getTokens(CoreMarkupParser.DETAIL_NEST); }
		public TerminalNode DETAIL_NEST(int i) {
			return getToken(CoreMarkupParser.DETAIL_NEST, i);
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			match(QUESTION_NEST);
			setState(28); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(28);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case QUESTION_NEST:
						{
						setState(26);
						nested_question();
						}
						break;
					case DETAIL_NEST:
						{
						setState(27);
						match(DETAIL_NEST);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(30); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\b#\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\3\2\3\2\6\2\r\n\2\r\2\16\2\16\3\2\3\2\3\3\3\3\3\4\3"+
		"\4\3\4\6\4\30\n\4\r\4\16\4\31\3\5\3\5\3\5\6\5\37\n\5\r\5\16\5 \3\5\2\2"+
		"\6\2\4\6\b\2\2\2$\2\f\3\2\2\2\4\22\3\2\2\2\6\24\3\2\2\2\b\33\3\2\2\2\n"+
		"\r\5\6\4\2\13\r\5\4\3\2\f\n\3\2\2\2\f\13\3\2\2\2\r\16\3\2\2\2\16\f\3\2"+
		"\2\2\16\17\3\2\2\2\17\20\3\2\2\2\20\21\7\2\2\3\21\3\3\2\2\2\22\23\7\3"+
		"\2\2\23\5\3\2\2\2\24\27\7\4\2\2\25\30\5\b\5\2\26\30\7\7\2\2\27\25\3\2"+
		"\2\2\27\26\3\2\2\2\30\31\3\2\2\2\31\27\3\2\2\2\31\32\3\2\2\2\32\7\3\2"+
		"\2\2\33\36\7\5\2\2\34\37\5\b\5\2\35\37\7\6\2\2\36\34\3\2\2\2\36\35\3\2"+
		"\2\2\37 \3\2\2\2 \36\3\2\2\2 !\3\2\2\2!\t\3\2\2\2\b\f\16\27\31\36 ";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}