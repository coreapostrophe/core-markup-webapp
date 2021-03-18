// Generated from CoreMarkupParser.g4 by ANTLR 4.9.1
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
		HEADER_TAG=1, QUESTION_DETAIL_TAG=2, QUESTION_TAG=3, DETAIL_TAG=4, NEWLINE=5, 
		TEXT=6;
	public static final int
		RULE_cmu = 0, RULE_label = 1, RULE_header = 2, RULE_question = 3, RULE_question_detail = 4, 
		RULE_detail = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"cmu", "label", "header", "question", "question_detail", "detail"
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
			"NEWLINE", "TEXT"
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
	public String getGrammarFileName() { return "CoreMarkupParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    final int STARTING_LEVEL = 1;
	    int level = STARTING_LEVEL;
	    int headerLevel = STARTING_LEVEL;

	    public int len(Token token) {
	        return token != null ? token.getText().length() : this.STARTING_LEVEL;
	    }

	    public void reset() {
	        this.level = this.STARTING_LEVEL;
	    }

	    public boolean bounds(Token token, int offset) {
	        int length = len(token) + offset;
	        return length >= this.STARTING_LEVEL && length <= this.level;
	    }

	    public boolean headerBounds(Token token) {
	        int length = len(token);
	        return length >= this.STARTING_LEVEL && length <= this.headerLevel;
	    }

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
			if ( listener instanceof CoreMarkupParserListener ) ((CoreMarkupParserListener)listener).enterCmu(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreMarkupParserListener ) ((CoreMarkupParserListener)listener).exitCmu(this);
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

	public static class LabelContext extends ParserRuleContext {
		public List<TerminalNode> TEXT() { return getTokens(CoreMarkupParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(CoreMarkupParser.TEXT, i);
		}
		public LabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoreMarkupParserListener ) ((CoreMarkupParserListener)listener).enterLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreMarkupParserListener ) ((CoreMarkupParserListener)listener).exitLabel(this);
		}
	}

	public final LabelContext label() throws RecognitionException {
		LabelContext _localctx = new LabelContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_label);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(20);
				match(TEXT);
				}
				}
				setState(23); 
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

	public static class HeaderContext extends ParserRuleContext {
		public Token h;
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public TerminalNode HEADER_TAG() { return getToken(CoreMarkupParser.HEADER_TAG, 0); }
		public HeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoreMarkupParserListener ) ((CoreMarkupParserListener)listener).enterHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreMarkupParserListener ) ((CoreMarkupParserListener)listener).exitHeader(this);
		}
	}

	public final HeaderContext header() throws RecognitionException {
		HeaderContext _localctx = new HeaderContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_header);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			((HeaderContext)_localctx).h = match(HEADER_TAG);
			setState(26);
			if (!(headerBounds(((HeaderContext)_localctx).h))) throw new FailedPredicateException(this, "headerBounds($h)");
			headerLevel++;
			setState(28);
			label();
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
		public Token t;
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public TerminalNode QUESTION_TAG() { return getToken(CoreMarkupParser.QUESTION_TAG, 0); }
		public List<Question_detailContext> question_detail() {
			return getRuleContexts(Question_detailContext.class);
		}
		public Question_detailContext question_detail(int i) {
			return getRuleContext(Question_detailContext.class,i);
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
			if ( listener instanceof CoreMarkupParserListener ) ((CoreMarkupParserListener)listener).enterQuestion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreMarkupParserListener ) ((CoreMarkupParserListener)listener).exitQuestion(this);
		}
	}

	public final QuestionContext question() throws RecognitionException {
		QuestionContext _localctx = new QuestionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_question);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			reset();
			setState(31);
			((QuestionContext)_localctx).t = match(QUESTION_TAG);
			setState(32);
			label();
			setState(35); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(35);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case QUESTION_DETAIL_TAG:
					{
					setState(33);
					question_detail();
					}
					break;
				case DETAIL_TAG:
					{
					setState(34);
					detail();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(37); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==QUESTION_DETAIL_TAG || _la==DETAIL_TAG );
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

	public static class Question_detailContext extends ParserRuleContext {
		public Token qd;
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public TerminalNode QUESTION_DETAIL_TAG() { return getToken(CoreMarkupParser.QUESTION_DETAIL_TAG, 0); }
		public List<Question_detailContext> question_detail() {
			return getRuleContexts(Question_detailContext.class);
		}
		public Question_detailContext question_detail(int i) {
			return getRuleContext(Question_detailContext.class,i);
		}
		public List<DetailContext> detail() {
			return getRuleContexts(DetailContext.class);
		}
		public DetailContext detail(int i) {
			return getRuleContext(DetailContext.class,i);
		}
		public Question_detailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_question_detail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoreMarkupParserListener ) ((CoreMarkupParserListener)listener).enterQuestion_detail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreMarkupParserListener ) ((CoreMarkupParserListener)listener).exitQuestion_detail(this);
		}
	}

	public final Question_detailContext question_detail() throws RecognitionException {
		Question_detailContext _localctx = new Question_detailContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_question_detail);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			((Question_detailContext)_localctx).qd = match(QUESTION_DETAIL_TAG);
			setState(40);
			if (!(bounds(((Question_detailContext)_localctx).qd, -1))) throw new FailedPredicateException(this, "bounds($qd, -1)");
			setState(41);
			label();
			level = len(((Question_detailContext)_localctx).qd);
			setState(45); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(45);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case QUESTION_DETAIL_TAG:
						{
						setState(43);
						question_detail();
						}
						break;
					case DETAIL_TAG:
						{
						setState(44);
						detail();
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
				setState(47); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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

	public static class DetailContext extends ParserRuleContext {
		public Token d;
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public TerminalNode DETAIL_TAG() { return getToken(CoreMarkupParser.DETAIL_TAG, 0); }
		public DetailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_detail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoreMarkupParserListener ) ((CoreMarkupParserListener)listener).enterDetail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreMarkupParserListener ) ((CoreMarkupParserListener)listener).exitDetail(this);
		}
	}

	public final DetailContext detail() throws RecognitionException {
		DetailContext _localctx = new DetailContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_detail);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			((DetailContext)_localctx).d = match(DETAIL_TAG);
			setState(50);
			if (!(bounds(((DetailContext)_localctx).d, 0))) throw new FailedPredicateException(this, "bounds($d, 0)");
			setState(51);
			label();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return header_sempred((HeaderContext)_localctx, predIndex);
		case 4:
			return question_detail_sempred((Question_detailContext)_localctx, predIndex);
		case 5:
			return detail_sempred((DetailContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean header_sempred(HeaderContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return headerBounds(((HeaderContext)_localctx).h);
		}
		return true;
	}
	private boolean question_detail_sempred(Question_detailContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return bounds(((Question_detailContext)_localctx).qd, -1);
		}
		return true;
	}
	private boolean detail_sempred(DetailContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return bounds(((DetailContext)_localctx).d, 0);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\b8\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\6\2\21\n\2\r\2\16\2\22\3\2"+
		"\3\2\3\3\6\3\30\n\3\r\3\16\3\31\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3"+
		"\5\6\5&\n\5\r\5\16\5\'\3\6\3\6\3\6\3\6\3\6\3\6\6\6\60\n\6\r\6\16\6\61"+
		"\3\7\3\7\3\7\3\7\3\7\2\2\b\2\4\6\b\n\f\2\2\28\2\20\3\2\2\2\4\27\3\2\2"+
		"\2\6\33\3\2\2\2\b \3\2\2\2\n)\3\2\2\2\f\63\3\2\2\2\16\21\5\6\4\2\17\21"+
		"\5\b\5\2\20\16\3\2\2\2\20\17\3\2\2\2\21\22\3\2\2\2\22\20\3\2\2\2\22\23"+
		"\3\2\2\2\23\24\3\2\2\2\24\25\7\2\2\3\25\3\3\2\2\2\26\30\7\b\2\2\27\26"+
		"\3\2\2\2\30\31\3\2\2\2\31\27\3\2\2\2\31\32\3\2\2\2\32\5\3\2\2\2\33\34"+
		"\7\3\2\2\34\35\6\4\2\3\35\36\b\4\1\2\36\37\5\4\3\2\37\7\3\2\2\2 !\b\5"+
		"\1\2!\"\7\5\2\2\"%\5\4\3\2#&\5\n\6\2$&\5\f\7\2%#\3\2\2\2%$\3\2\2\2&\'"+
		"\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2(\t\3\2\2\2)*\7\4\2\2*+\6\6\3\3+,\5\4\3"+
		"\2,/\b\6\1\2-\60\5\n\6\2.\60\5\f\7\2/-\3\2\2\2/.\3\2\2\2\60\61\3\2\2\2"+
		"\61/\3\2\2\2\61\62\3\2\2\2\62\13\3\2\2\2\63\64\7\6\2\2\64\65\6\7\4\3\65"+
		"\66\5\4\3\2\66\r\3\2\2\2\t\20\22\31%\'/\61";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}