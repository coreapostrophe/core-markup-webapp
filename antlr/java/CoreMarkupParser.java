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
		HEADER=1, QUESTION=2, QUESTION_NEST=3, DETAIL_NEST=4, DETAIL=5, NEWLINE=6, 
		INDENT=7, DEDENT=8;
	public static final int
		RULE_cmu = 0, RULE_question = 1, RULE_nested_question = 2;
	private static String[] makeRuleNames() {
		return new String[] {
			"cmu", "question", "nested_question"
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
			"NEWLINE", "INDENT", "DEDENT"
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
		public List<TerminalNode> HEADER() { return getTokens(CoreMarkupParser.HEADER); }
		public TerminalNode HEADER(int i) {
			return getToken(CoreMarkupParser.HEADER, i);
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
			setState(8); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(8);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case QUESTION:
					{
					setState(6);
					question();
					}
					break;
				case HEADER:
					{
					setState(7);
					match(HEADER);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(10); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==HEADER || _la==QUESTION );
			setState(12);
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
		enterRule(_localctx, 2, RULE_question);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			match(QUESTION);
			setState(17); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(17);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case QUESTION_NEST:
					{
					setState(15);
					nested_question();
					}
					break;
				case DETAIL:
					{
					setState(16);
					match(DETAIL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(19); 
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
		enterRule(_localctx, 4, RULE_nested_question);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			match(QUESTION_NEST);
			setState(24); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(24);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case QUESTION_NEST:
						{
						setState(22);
						nested_question();
						}
						break;
					case DETAIL_NEST:
						{
						setState(23);
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
				setState(26); 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\n\37\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\3\2\3\2\6\2\13\n\2\r\2\16\2\f\3\2\3\2\3\3\3\3\3\3\6\3\24"+
		"\n\3\r\3\16\3\25\3\4\3\4\3\4\6\4\33\n\4\r\4\16\4\34\3\4\2\2\5\2\4\6\2"+
		"\2\2!\2\n\3\2\2\2\4\20\3\2\2\2\6\27\3\2\2\2\b\13\5\4\3\2\t\13\7\3\2\2"+
		"\n\b\3\2\2\2\n\t\3\2\2\2\13\f\3\2\2\2\f\n\3\2\2\2\f\r\3\2\2\2\r\16\3\2"+
		"\2\2\16\17\7\2\2\3\17\3\3\2\2\2\20\23\7\4\2\2\21\24\5\6\4\2\22\24\7\7"+
		"\2\2\23\21\3\2\2\2\23\22\3\2\2\2\24\25\3\2\2\2\25\23\3\2\2\2\25\26\3\2"+
		"\2\2\26\5\3\2\2\2\27\32\7\5\2\2\30\33\5\6\4\2\31\33\7\6\2\2\32\30\3\2"+
		"\2\2\32\31\3\2\2\2\33\34\3\2\2\2\34\32\3\2\2\2\34\35\3\2\2\2\35\7\3\2"+
		"\2\2\b\n\f\23\25\32\34";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}