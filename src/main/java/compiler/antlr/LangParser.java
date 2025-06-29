// Generated from antlr/Lang.g4 by ANTLR 4.13.2
package compiler.antlr;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class LangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, WS=2, LINE_COMMENT=3, MULTILINE_COMMENT=4, ABSTRACT=5, DATA=6, 
		IF=7, ELSE=8, ITERATE=9, READ=10, PRINT=11, RETURN=12, NEW=13, TRUE=14, 
		FALSE=15, NULL=16, AND_OP=17, EQ_OP=18, NEQ_OP=19, LE_OP=20, PLUS_OP=21, 
		MINUS_OP=22, MULT_OP=23, DIV_OP=24, MOD_OP=25, LBRACE=26, RBRACE=27, LBRACK=28, 
		RBRACK=29, LPAREN=30, RPAREN=31, SEMI=32, COMMA=33, RANGLE=34, COLON=35, 
		DCOLON=36, DOT=37, ASSIGN=38, INT_TYPE=39, CHAR_TYPE=40, BOOL_TYPE=41, 
		FLOAT_TYPE=42, ID=43, TYID=44, INT=45, FLOAT=46, CHAR=47;
	public static final int
		RULE_prog = 0, RULE_def = 1, RULE_data = 2, RULE_decl = 3, RULE_fun = 4, 
		RULE_params = 5, RULE_type = 6, RULE_btype = 7, RULE_block = 8, RULE_cmd = 9, 
		RULE_itcond = 10, RULE_exp = 11, RULE_op = 12, RULE_lvalue = 13, RULE_exps = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "def", "data", "decl", "fun", "params", "type", "btype", "block", 
			"cmd", "itcond", "exp", "op", "lvalue", "exps"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'!'", null, null, null, "'abstract'", "'data'", "'if'", "'else'", 
			"'iterate'", "'read'", "'print'", "'return'", "'new'", "'true'", "'false'", 
			"'null'", "'&&'", "'=='", "'!='", "'<'", "'+'", "'-'", "'*'", "'/'", 
			"'%'", "'{'", "'}'", "'['", "']'", "'('", "')'", "';'", "','", "'>'", 
			"':'", "'::'", "'.'", "'='", "'Int'", "'Char'", "'Bool'", "'Float'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "WS", "LINE_COMMENT", "MULTILINE_COMMENT", "ABSTRACT", "DATA", 
			"IF", "ELSE", "ITERATE", "READ", "PRINT", "RETURN", "NEW", "TRUE", "FALSE", 
			"NULL", "AND_OP", "EQ_OP", "NEQ_OP", "LE_OP", "PLUS_OP", "MINUS_OP", 
			"MULT_OP", "DIV_OP", "MOD_OP", "LBRACE", "RBRACE", "LBRACK", "RBRACK", 
			"LPAREN", "RPAREN", "SEMI", "COMMA", "RANGLE", "COLON", "DCOLON", "DOT", 
			"ASSIGN", "INT_TYPE", "CHAR_TYPE", "BOOL_TYPE", "FLOAT_TYPE", "ID", "TYID", 
			"INT", "FLOAT", "CHAR"
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
	public String getGrammarFileName() { return "Lang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public List<DefContext> def() {
			return getRuleContexts(DefContext.class);
		}
		public DefContext def(int i) {
			return getRuleContext(DefContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8796093022304L) != 0)) {
				{
				{
				setState(30);
				def();
				}
				}
				setState(35);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DefContext extends ParserRuleContext {
		public DataContext data() {
			return getRuleContext(DataContext.class,0);
		}
		public FunContext fun() {
			return getRuleContext(FunContext.class,0);
		}
		public DefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefContext def() throws RecognitionException {
		DefContext _localctx = new DefContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_def);
		try {
			setState(38);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABSTRACT:
			case DATA:
				enterOuterAlt(_localctx, 1);
				{
				setState(36);
				data();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(37);
				fun();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DataContext extends ParserRuleContext {
		public TerminalNode ABSTRACT() { return getToken(LangParser.ABSTRACT, 0); }
		public TerminalNode DATA() { return getToken(LangParser.DATA, 0); }
		public TerminalNode TYID() { return getToken(LangParser.TYID, 0); }
		public TerminalNode LBRACE() { return getToken(LangParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(LangParser.RBRACE, 0); }
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public List<FunContext> fun() {
			return getRuleContexts(FunContext.class);
		}
		public FunContext fun(int i) {
			return getRuleContext(FunContext.class,i);
		}
		public DataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitData(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataContext data() throws RecognitionException {
		DataContext _localctx = new DataContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_data);
		int _la;
		try {
			setState(62);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABSTRACT:
				enterOuterAlt(_localctx, 1);
				{
				setState(40);
				match(ABSTRACT);
				setState(41);
				match(DATA);
				setState(42);
				match(TYID);
				setState(43);
				match(LBRACE);
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					setState(46);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						setState(44);
						decl();
						}
						break;
					case 2:
						{
						setState(45);
						fun();
						}
						break;
					}
					}
					setState(50);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(51);
				match(RBRACE);
				}
				break;
			case DATA:
				enterOuterAlt(_localctx, 2);
				{
				setState(52);
				match(DATA);
				setState(53);
				match(TYID);
				setState(54);
				match(LBRACE);
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(55);
					decl();
					}
					}
					setState(60);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(61);
				match(RBRACE);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LangParser.ID, 0); }
		public TerminalNode DCOLON() { return getToken(LangParser.DCOLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(LangParser.SEMI, 0); }
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(ID);
			setState(65);
			match(DCOLON);
			setState(66);
			type(0);
			setState(67);
			match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LangParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(LangParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(LangParser.RPAREN, 0); }
		public CmdContext cmd() {
			return getRuleContext(CmdContext.class,0);
		}
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public TerminalNode COLON() { return getToken(LangParser.COLON, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(LangParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LangParser.COMMA, i);
		}
		public FunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fun; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitFun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunContext fun() throws RecognitionException {
		FunContext _localctx = new FunContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_fun);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(ID);
			setState(70);
			match(LPAREN);
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(71);
				params();
				}
			}

			setState(74);
			match(RPAREN);
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(75);
				match(COLON);
				setState(76);
				type(0);
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(77);
					match(COMMA);
					setState(78);
					type(0);
					}
					}
					setState(83);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(86);
			cmd();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParamsContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(LangParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(LangParser.ID, i);
		}
		public List<TerminalNode> DCOLON() { return getTokens(LangParser.DCOLON); }
		public TerminalNode DCOLON(int i) {
			return getToken(LangParser.DCOLON, i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(LangParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LangParser.COMMA, i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(ID);
			setState(89);
			match(DCOLON);
			setState(90);
			type(0);
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(91);
				match(COMMA);
				setState(92);
				match(ID);
				setState(93);
				match(DCOLON);
				setState(94);
				type(0);
				}
				}
				setState(99);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public BtypeContext btype() {
			return getRuleContext(BtypeContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode LBRACK() { return getToken(LangParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(LangParser.RBRACK, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		return type(0);
	}

	private TypeContext type(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeContext _localctx = new TypeContext(_ctx, _parentState);
		TypeContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_type, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(101);
			btype();
			}
			_ctx.stop = _input.LT(-1);
			setState(108);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_type);
					setState(103);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(104);
					match(LBRACK);
					setState(105);
					match(RBRACK);
					}
					} 
				}
				setState(110);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BtypeContext extends ParserRuleContext {
		public TerminalNode INT_TYPE() { return getToken(LangParser.INT_TYPE, 0); }
		public TerminalNode CHAR_TYPE() { return getToken(LangParser.CHAR_TYPE, 0); }
		public TerminalNode BOOL_TYPE() { return getToken(LangParser.BOOL_TYPE, 0); }
		public TerminalNode FLOAT_TYPE() { return getToken(LangParser.FLOAT_TYPE, 0); }
		public TerminalNode TYID() { return getToken(LangParser.TYID, 0); }
		public BtypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_btype; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitBtype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BtypeContext btype() throws RecognitionException {
		BtypeContext _localctx = new BtypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_btype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 25838523252736L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(LangParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(LangParser.RBRACE, 0); }
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(LBRACE);
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8796160138880L) != 0)) {
				{
				{
				setState(114);
				cmd();
				}
				}
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(120);
			match(RBRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CmdContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode IF() { return getToken(LangParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(LangParser.LPAREN, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(LangParser.RPAREN, 0); }
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(LangParser.ELSE, 0); }
		public TerminalNode ITERATE() { return getToken(LangParser.ITERATE, 0); }
		public ItcondContext itcond() {
			return getRuleContext(ItcondContext.class,0);
		}
		public TerminalNode READ() { return getToken(LangParser.READ, 0); }
		public List<LvalueContext> lvalue() {
			return getRuleContexts(LvalueContext.class);
		}
		public LvalueContext lvalue(int i) {
			return getRuleContext(LvalueContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(LangParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(LangParser.SEMI, i);
		}
		public TerminalNode PRINT() { return getToken(LangParser.PRINT, 0); }
		public TerminalNode RETURN() { return getToken(LangParser.RETURN, 0); }
		public TerminalNode ASSIGN() { return getToken(LangParser.ASSIGN, 0); }
		public TerminalNode ID() { return getToken(LangParser.ID, 0); }
		public ExpsContext exps() {
			return getRuleContext(ExpsContext.class,0);
		}
		public TerminalNode LE_OP() { return getToken(LangParser.LE_OP, 0); }
		public TerminalNode RANGLE() { return getToken(LangParser.RANGLE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(LangParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LangParser.COMMA, i);
		}
		public CmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitCmd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdContext cmd() throws RecognitionException {
		CmdContext _localctx = new CmdContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_cmd);
		int _la;
		try {
			int _alt;
			setState(187);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(122);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(123);
				match(IF);
				setState(124);
				match(LPAREN);
				setState(125);
				exp(0);
				setState(126);
				match(RPAREN);
				setState(127);
				cmd();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(129);
				match(IF);
				setState(130);
				match(LPAREN);
				setState(131);
				exp(0);
				setState(132);
				match(RPAREN);
				setState(133);
				cmd();
				setState(134);
				match(ELSE);
				setState(135);
				cmd();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(137);
				match(ITERATE);
				setState(138);
				match(LPAREN);
				setState(139);
				itcond();
				setState(140);
				match(RPAREN);
				setState(141);
				cmd();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(143);
				match(READ);
				setState(144);
				lvalue(0);
				setState(145);
				match(SEMI);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(147);
				match(PRINT);
				setState(148);
				exp(0);
				setState(149);
				match(SEMI);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(151);
				match(RETURN);
				setState(152);
				exp(0);
				setState(157);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(153);
						match(SEMI);
						setState(154);
						exp(0);
						}
						} 
					}
					setState(159);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				}
				setState(160);
				match(SEMI);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(162);
				lvalue(0);
				setState(163);
				match(ASSIGN);
				setState(164);
				exp(0);
				setState(165);
				match(SEMI);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(167);
				match(ID);
				setState(168);
				match(LPAREN);
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 255087775703042L) != 0)) {
					{
					setState(169);
					exps();
					}
				}

				setState(172);
				match(RPAREN);
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LE_OP) {
					{
					setState(173);
					match(LE_OP);
					setState(174);
					lvalue(0);
					setState(179);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(175);
						match(COMMA);
						setState(176);
						lvalue(0);
						}
						}
						setState(181);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(182);
					match(RANGLE);
					}
				}

				setState(186);
				match(SEMI);
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class ItcondContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LangParser.ID, 0); }
		public TerminalNode COLON() { return getToken(LangParser.COLON, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ItcondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_itcond; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitItcond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ItcondContext itcond() throws RecognitionException {
		ItcondContext _localctx = new ItcondContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_itcond);
		try {
			setState(193);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(189);
				match(ID);
				setState(190);
				match(COLON);
				setState(191);
				exp(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(192);
				exp(0);
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(LangParser.LPAREN, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(LangParser.RPAREN, 0); }
		public TerminalNode ID() { return getToken(LangParser.ID, 0); }
		public ExpsContext exps() {
			return getRuleContext(ExpsContext.class,0);
		}
		public TerminalNode LBRACK() { return getToken(LangParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(LangParser.RBRACK, 0); }
		public TerminalNode NEW() { return getToken(LangParser.NEW, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode MINUS_OP() { return getToken(LangParser.MINUS_OP, 0); }
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode TRUE() { return getToken(LangParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(LangParser.FALSE, 0); }
		public TerminalNode NULL() { return getToken(LangParser.NULL, 0); }
		public TerminalNode INT() { return getToken(LangParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(LangParser.FLOAT, 0); }
		public TerminalNode CHAR() { return getToken(LangParser.CHAR, 0); }
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_exp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(196);
				match(LPAREN);
				setState(197);
				exp(0);
				setState(198);
				match(RPAREN);
				}
				break;
			case 2:
				{
				setState(200);
				match(ID);
				setState(201);
				match(LPAREN);
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 255087775703042L) != 0)) {
					{
					setState(202);
					exps();
					}
				}

				setState(205);
				match(RPAREN);
				setState(210);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(206);
					match(LBRACK);
					setState(207);
					exp(0);
					setState(208);
					match(RBRACK);
					}
					break;
				}
				}
				break;
			case 3:
				{
				setState(212);
				match(NEW);
				setState(213);
				type(0);
				setState(218);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(214);
					match(LBRACK);
					setState(215);
					exp(0);
					setState(216);
					match(RBRACK);
					}
					break;
				}
				}
				break;
			case 4:
				{
				setState(220);
				match(T__0);
				setState(221);
				exp(10);
				}
				break;
			case 5:
				{
				setState(222);
				match(MINUS_OP);
				setState(223);
				exp(9);
				}
				break;
			case 6:
				{
				setState(224);
				lvalue(0);
				}
				break;
			case 7:
				{
				setState(225);
				match(TRUE);
				}
				break;
			case 8:
				{
				setState(226);
				match(FALSE);
				}
				break;
			case 9:
				{
				setState(227);
				match(NULL);
				}
				break;
			case 10:
				{
				setState(228);
				match(INT);
				}
				break;
			case 11:
				{
				setState(229);
				match(FLOAT);
				}
				break;
			case 12:
				{
				setState(230);
				match(CHAR);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(239);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exp);
					setState(233);
					if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
					setState(234);
					op();
					setState(235);
					exp(8);
					}
					} 
				}
				setState(241);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OpContext extends ParserRuleContext {
		public TerminalNode AND_OP() { return getToken(LangParser.AND_OP, 0); }
		public TerminalNode LE_OP() { return getToken(LangParser.LE_OP, 0); }
		public TerminalNode EQ_OP() { return getToken(LangParser.EQ_OP, 0); }
		public TerminalNode NEQ_OP() { return getToken(LangParser.NEQ_OP, 0); }
		public TerminalNode PLUS_OP() { return getToken(LangParser.PLUS_OP, 0); }
		public TerminalNode MINUS_OP() { return getToken(LangParser.MINUS_OP, 0); }
		public TerminalNode MULT_OP() { return getToken(LangParser.MULT_OP, 0); }
		public TerminalNode DIV_OP() { return getToken(LangParser.DIV_OP, 0); }
		public TerminalNode MOD_OP() { return getToken(LangParser.MOD_OP, 0); }
		public OpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpContext op() throws RecognitionException {
		OpContext _localctx = new OpContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 66977792L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class LvalueContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LangParser.ID, 0); }
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode LBRACK() { return getToken(LangParser.LBRACK, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(LangParser.RBRACK, 0); }
		public TerminalNode DOT() { return getToken(LangParser.DOT, 0); }
		public LvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lvalue; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitLvalue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LvalueContext lvalue() throws RecognitionException {
		return lvalue(0);
	}

	private LvalueContext lvalue(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LvalueContext _localctx = new LvalueContext(_ctx, _parentState);
		LvalueContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_lvalue, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(245);
			match(ID);
			}
			_ctx.stop = _input.LT(-1);
			setState(257);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(255);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
					case 1:
						{
						_localctx = new LvalueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_lvalue);
						setState(247);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(248);
						match(LBRACK);
						setState(249);
						exp(0);
						setState(250);
						match(RBRACK);
						}
						break;
					case 2:
						{
						_localctx = new LvalueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_lvalue);
						setState(252);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(253);
						match(DOT);
						setState(254);
						match(ID);
						}
						break;
					}
					} 
				}
				setState(259);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpsContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(LangParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LangParser.COMMA, i);
		}
		public ExpsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exps; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitExps(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpsContext exps() throws RecognitionException {
		ExpsContext _localctx = new ExpsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_exps);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			exp(0);
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(261);
				match(COMMA);
				setState(262);
				exp(0);
				}
				}
				setState(267);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 6:
			return type_sempred((TypeContext)_localctx, predIndex);
		case 11:
			return exp_sempred((ExpContext)_localctx, predIndex);
		case 13:
			return lvalue_sempred((LvalueContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean type_sempred(TypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 7);
		}
		return true;
	}
	private boolean lvalue_sempred(LvalueContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001/\u010d\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001\u0000\u0005\u0000"+
		" \b\u0000\n\u0000\f\u0000#\t\u0000\u0001\u0001\u0001\u0001\u0003\u0001"+
		"\'\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0005\u0002/\b\u0002\n\u0002\f\u00022\t\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u00029\b\u0002"+
		"\n\u0002\f\u0002<\t\u0002\u0001\u0002\u0003\u0002?\b\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0003\u0004I\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0005\u0004P\b\u0004\n\u0004\f\u0004S\t\u0004"+
		"\u0003\u0004U\b\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005"+
		"`\b\u0005\n\u0005\f\u0005c\t\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006k\b\u0006\n\u0006\f\u0006"+
		"n\t\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0005\bt\b\b\n\b\f\b"+
		"w\t\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0005\t\u009c\b\t\n\t\f\t\u009f\t\t\u0001\t\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u00ab\b\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u00b2\b\t\n\t\f\t\u00b5\t\t"+
		"\u0001\t\u0001\t\u0003\t\u00b9\b\t\u0001\t\u0003\t\u00bc\b\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0003\n\u00c2\b\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b"+
		"\u00cc\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0003\u000b\u00d3\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0003\u000b\u00db\b\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00e8\b\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u00ee\b\u000b\n\u000b"+
		"\f\u000b\u00f1\t\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u0100"+
		"\b\r\n\r\f\r\u0103\t\r\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e"+
		"\u0108\b\u000e\n\u000e\f\u000e\u010b\t\u000e\u0001\u000e\u0000\u0003\f"+
		"\u0016\u001a\u000f\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0018\u001a\u001c\u0000\u0002\u0002\u0000\'*,,\u0001\u0000\u0011"+
		"\u0019\u0128\u0000!\u0001\u0000\u0000\u0000\u0002&\u0001\u0000\u0000\u0000"+
		"\u0004>\u0001\u0000\u0000\u0000\u0006@\u0001\u0000\u0000\u0000\bE\u0001"+
		"\u0000\u0000\u0000\nX\u0001\u0000\u0000\u0000\fd\u0001\u0000\u0000\u0000"+
		"\u000eo\u0001\u0000\u0000\u0000\u0010q\u0001\u0000\u0000\u0000\u0012\u00bb"+
		"\u0001\u0000\u0000\u0000\u0014\u00c1\u0001\u0000\u0000\u0000\u0016\u00e7"+
		"\u0001\u0000\u0000\u0000\u0018\u00f2\u0001\u0000\u0000\u0000\u001a\u00f4"+
		"\u0001\u0000\u0000\u0000\u001c\u0104\u0001\u0000\u0000\u0000\u001e \u0003"+
		"\u0002\u0001\u0000\u001f\u001e\u0001\u0000\u0000\u0000 #\u0001\u0000\u0000"+
		"\u0000!\u001f\u0001\u0000\u0000\u0000!\"\u0001\u0000\u0000\u0000\"\u0001"+
		"\u0001\u0000\u0000\u0000#!\u0001\u0000\u0000\u0000$\'\u0003\u0004\u0002"+
		"\u0000%\'\u0003\b\u0004\u0000&$\u0001\u0000\u0000\u0000&%\u0001\u0000"+
		"\u0000\u0000\'\u0003\u0001\u0000\u0000\u0000()\u0005\u0005\u0000\u0000"+
		")*\u0005\u0006\u0000\u0000*+\u0005,\u0000\u0000+0\u0005\u001a\u0000\u0000"+
		",/\u0003\u0006\u0003\u0000-/\u0003\b\u0004\u0000.,\u0001\u0000\u0000\u0000"+
		".-\u0001\u0000\u0000\u0000/2\u0001\u0000\u0000\u00000.\u0001\u0000\u0000"+
		"\u000001\u0001\u0000\u0000\u000013\u0001\u0000\u0000\u000020\u0001\u0000"+
		"\u0000\u00003?\u0005\u001b\u0000\u000045\u0005\u0006\u0000\u000056\u0005"+
		",\u0000\u00006:\u0005\u001a\u0000\u000079\u0003\u0006\u0003\u000087\u0001"+
		"\u0000\u0000\u00009<\u0001\u0000\u0000\u0000:8\u0001\u0000\u0000\u0000"+
		":;\u0001\u0000\u0000\u0000;=\u0001\u0000\u0000\u0000<:\u0001\u0000\u0000"+
		"\u0000=?\u0005\u001b\u0000\u0000>(\u0001\u0000\u0000\u0000>4\u0001\u0000"+
		"\u0000\u0000?\u0005\u0001\u0000\u0000\u0000@A\u0005+\u0000\u0000AB\u0005"+
		"$\u0000\u0000BC\u0003\f\u0006\u0000CD\u0005 \u0000\u0000D\u0007\u0001"+
		"\u0000\u0000\u0000EF\u0005+\u0000\u0000FH\u0005\u001e\u0000\u0000GI\u0003"+
		"\n\u0005\u0000HG\u0001\u0000\u0000\u0000HI\u0001\u0000\u0000\u0000IJ\u0001"+
		"\u0000\u0000\u0000JT\u0005\u001f\u0000\u0000KL\u0005#\u0000\u0000LQ\u0003"+
		"\f\u0006\u0000MN\u0005!\u0000\u0000NP\u0003\f\u0006\u0000OM\u0001\u0000"+
		"\u0000\u0000PS\u0001\u0000\u0000\u0000QO\u0001\u0000\u0000\u0000QR\u0001"+
		"\u0000\u0000\u0000RU\u0001\u0000\u0000\u0000SQ\u0001\u0000\u0000\u0000"+
		"TK\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000"+
		"\u0000VW\u0003\u0012\t\u0000W\t\u0001\u0000\u0000\u0000XY\u0005+\u0000"+
		"\u0000YZ\u0005$\u0000\u0000Za\u0003\f\u0006\u0000[\\\u0005!\u0000\u0000"+
		"\\]\u0005+\u0000\u0000]^\u0005$\u0000\u0000^`\u0003\f\u0006\u0000_[\u0001"+
		"\u0000\u0000\u0000`c\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000"+
		"ab\u0001\u0000\u0000\u0000b\u000b\u0001\u0000\u0000\u0000ca\u0001\u0000"+
		"\u0000\u0000de\u0006\u0006\uffff\uffff\u0000ef\u0003\u000e\u0007\u0000"+
		"fl\u0001\u0000\u0000\u0000gh\n\u0002\u0000\u0000hi\u0005\u001c\u0000\u0000"+
		"ik\u0005\u001d\u0000\u0000jg\u0001\u0000\u0000\u0000kn\u0001\u0000\u0000"+
		"\u0000lj\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000m\r\u0001\u0000"+
		"\u0000\u0000nl\u0001\u0000\u0000\u0000op\u0007\u0000\u0000\u0000p\u000f"+
		"\u0001\u0000\u0000\u0000qu\u0005\u001a\u0000\u0000rt\u0003\u0012\t\u0000"+
		"sr\u0001\u0000\u0000\u0000tw\u0001\u0000\u0000\u0000us\u0001\u0000\u0000"+
		"\u0000uv\u0001\u0000\u0000\u0000vx\u0001\u0000\u0000\u0000wu\u0001\u0000"+
		"\u0000\u0000xy\u0005\u001b\u0000\u0000y\u0011\u0001\u0000\u0000\u0000"+
		"z\u00bc\u0003\u0010\b\u0000{|\u0005\u0007\u0000\u0000|}\u0005\u001e\u0000"+
		"\u0000}~\u0003\u0016\u000b\u0000~\u007f\u0005\u001f\u0000\u0000\u007f"+
		"\u0080\u0003\u0012\t\u0000\u0080\u00bc\u0001\u0000\u0000\u0000\u0081\u0082"+
		"\u0005\u0007\u0000\u0000\u0082\u0083\u0005\u001e\u0000\u0000\u0083\u0084"+
		"\u0003\u0016\u000b\u0000\u0084\u0085\u0005\u001f\u0000\u0000\u0085\u0086"+
		"\u0003\u0012\t\u0000\u0086\u0087\u0005\b\u0000\u0000\u0087\u0088\u0003"+
		"\u0012\t\u0000\u0088\u00bc\u0001\u0000\u0000\u0000\u0089\u008a\u0005\t"+
		"\u0000\u0000\u008a\u008b\u0005\u001e\u0000\u0000\u008b\u008c\u0003\u0014"+
		"\n\u0000\u008c\u008d\u0005\u001f\u0000\u0000\u008d\u008e\u0003\u0012\t"+
		"\u0000\u008e\u00bc\u0001\u0000\u0000\u0000\u008f\u0090\u0005\n\u0000\u0000"+
		"\u0090\u0091\u0003\u001a\r\u0000\u0091\u0092\u0005 \u0000\u0000\u0092"+
		"\u00bc\u0001\u0000\u0000\u0000\u0093\u0094\u0005\u000b\u0000\u0000\u0094"+
		"\u0095\u0003\u0016\u000b\u0000\u0095\u0096\u0005 \u0000\u0000\u0096\u00bc"+
		"\u0001\u0000\u0000\u0000\u0097\u0098\u0005\f\u0000\u0000\u0098\u009d\u0003"+
		"\u0016\u000b\u0000\u0099\u009a\u0005 \u0000\u0000\u009a\u009c\u0003\u0016"+
		"\u000b\u0000\u009b\u0099\u0001\u0000\u0000\u0000\u009c\u009f\u0001\u0000"+
		"\u0000\u0000\u009d\u009b\u0001\u0000\u0000\u0000\u009d\u009e\u0001\u0000"+
		"\u0000\u0000\u009e\u00a0\u0001\u0000\u0000\u0000\u009f\u009d\u0001\u0000"+
		"\u0000\u0000\u00a0\u00a1\u0005 \u0000\u0000\u00a1\u00bc\u0001\u0000\u0000"+
		"\u0000\u00a2\u00a3\u0003\u001a\r\u0000\u00a3\u00a4\u0005&\u0000\u0000"+
		"\u00a4\u00a5\u0003\u0016\u000b\u0000\u00a5\u00a6\u0005 \u0000\u0000\u00a6"+
		"\u00bc\u0001\u0000\u0000\u0000\u00a7\u00a8\u0005+\u0000\u0000\u00a8\u00aa"+
		"\u0005\u001e\u0000\u0000\u00a9\u00ab\u0003\u001c\u000e\u0000\u00aa\u00a9"+
		"\u0001\u0000\u0000\u0000\u00aa\u00ab\u0001\u0000\u0000\u0000\u00ab\u00ac"+
		"\u0001\u0000\u0000\u0000\u00ac\u00b8\u0005\u001f\u0000\u0000\u00ad\u00ae"+
		"\u0005\u0014\u0000\u0000\u00ae\u00b3\u0003\u001a\r\u0000\u00af\u00b0\u0005"+
		"!\u0000\u0000\u00b0\u00b2\u0003\u001a\r\u0000\u00b1\u00af\u0001\u0000"+
		"\u0000\u0000\u00b2\u00b5\u0001\u0000\u0000\u0000\u00b3\u00b1\u0001\u0000"+
		"\u0000\u0000\u00b3\u00b4\u0001\u0000\u0000\u0000\u00b4\u00b6\u0001\u0000"+
		"\u0000\u0000\u00b5\u00b3\u0001\u0000\u0000\u0000\u00b6\u00b7\u0005\"\u0000"+
		"\u0000\u00b7\u00b9\u0001\u0000\u0000\u0000\u00b8\u00ad\u0001\u0000\u0000"+
		"\u0000\u00b8\u00b9\u0001\u0000\u0000\u0000\u00b9\u00ba\u0001\u0000\u0000"+
		"\u0000\u00ba\u00bc\u0005 \u0000\u0000\u00bbz\u0001\u0000\u0000\u0000\u00bb"+
		"{\u0001\u0000\u0000\u0000\u00bb\u0081\u0001\u0000\u0000\u0000\u00bb\u0089"+
		"\u0001\u0000\u0000\u0000\u00bb\u008f\u0001\u0000\u0000\u0000\u00bb\u0093"+
		"\u0001\u0000\u0000\u0000\u00bb\u0097\u0001\u0000\u0000\u0000\u00bb\u00a2"+
		"\u0001\u0000\u0000\u0000\u00bb\u00a7\u0001\u0000\u0000\u0000\u00bc\u0013"+
		"\u0001\u0000\u0000\u0000\u00bd\u00be\u0005+\u0000\u0000\u00be\u00bf\u0005"+
		"#\u0000\u0000\u00bf\u00c2\u0003\u0016\u000b\u0000\u00c0\u00c2\u0003\u0016"+
		"\u000b\u0000\u00c1\u00bd\u0001\u0000\u0000\u0000\u00c1\u00c0\u0001\u0000"+
		"\u0000\u0000\u00c2\u0015\u0001\u0000\u0000\u0000\u00c3\u00c4\u0006\u000b"+
		"\uffff\uffff\u0000\u00c4\u00c5\u0005\u001e\u0000\u0000\u00c5\u00c6\u0003"+
		"\u0016\u000b\u0000\u00c6\u00c7\u0005\u001f\u0000\u0000\u00c7\u00e8\u0001"+
		"\u0000\u0000\u0000\u00c8\u00c9\u0005+\u0000\u0000\u00c9\u00cb\u0005\u001e"+
		"\u0000\u0000\u00ca\u00cc\u0003\u001c\u000e\u0000\u00cb\u00ca\u0001\u0000"+
		"\u0000\u0000\u00cb\u00cc\u0001\u0000\u0000\u0000\u00cc\u00cd\u0001\u0000"+
		"\u0000\u0000\u00cd\u00d2\u0005\u001f\u0000\u0000\u00ce\u00cf\u0005\u001c"+
		"\u0000\u0000\u00cf\u00d0\u0003\u0016\u000b\u0000\u00d0\u00d1\u0005\u001d"+
		"\u0000\u0000\u00d1\u00d3\u0001\u0000\u0000\u0000\u00d2\u00ce\u0001\u0000"+
		"\u0000\u0000\u00d2\u00d3\u0001\u0000\u0000\u0000\u00d3\u00e8\u0001\u0000"+
		"\u0000\u0000\u00d4\u00d5\u0005\r\u0000\u0000\u00d5\u00da\u0003\f\u0006"+
		"\u0000\u00d6\u00d7\u0005\u001c\u0000\u0000\u00d7\u00d8\u0003\u0016\u000b"+
		"\u0000\u00d8\u00d9\u0005\u001d\u0000\u0000\u00d9\u00db\u0001\u0000\u0000"+
		"\u0000\u00da\u00d6\u0001\u0000\u0000\u0000\u00da\u00db\u0001\u0000\u0000"+
		"\u0000\u00db\u00e8\u0001\u0000\u0000\u0000\u00dc\u00dd\u0005\u0001\u0000"+
		"\u0000\u00dd\u00e8\u0003\u0016\u000b\n\u00de\u00df\u0005\u0016\u0000\u0000"+
		"\u00df\u00e8\u0003\u0016\u000b\t\u00e0\u00e8\u0003\u001a\r\u0000\u00e1"+
		"\u00e8\u0005\u000e\u0000\u0000\u00e2\u00e8\u0005\u000f\u0000\u0000\u00e3"+
		"\u00e8\u0005\u0010\u0000\u0000\u00e4\u00e8\u0005-\u0000\u0000\u00e5\u00e8"+
		"\u0005.\u0000\u0000\u00e6\u00e8\u0005/\u0000\u0000\u00e7\u00c3\u0001\u0000"+
		"\u0000\u0000\u00e7\u00c8\u0001\u0000\u0000\u0000\u00e7\u00d4\u0001\u0000"+
		"\u0000\u0000\u00e7\u00dc\u0001\u0000\u0000\u0000\u00e7\u00de\u0001\u0000"+
		"\u0000\u0000\u00e7\u00e0\u0001\u0000\u0000\u0000\u00e7\u00e1\u0001\u0000"+
		"\u0000\u0000\u00e7\u00e2\u0001\u0000\u0000\u0000\u00e7\u00e3\u0001\u0000"+
		"\u0000\u0000\u00e7\u00e4\u0001\u0000\u0000\u0000\u00e7\u00e5\u0001\u0000"+
		"\u0000\u0000\u00e7\u00e6\u0001\u0000\u0000\u0000\u00e8\u00ef\u0001\u0000"+
		"\u0000\u0000\u00e9\u00ea\n\u0007\u0000\u0000\u00ea\u00eb\u0003\u0018\f"+
		"\u0000\u00eb\u00ec\u0003\u0016\u000b\b\u00ec\u00ee\u0001\u0000\u0000\u0000"+
		"\u00ed\u00e9\u0001\u0000\u0000\u0000\u00ee\u00f1\u0001\u0000\u0000\u0000"+
		"\u00ef\u00ed\u0001\u0000\u0000\u0000\u00ef\u00f0\u0001\u0000\u0000\u0000"+
		"\u00f0\u0017\u0001\u0000\u0000\u0000\u00f1\u00ef\u0001\u0000\u0000\u0000"+
		"\u00f2\u00f3\u0007\u0001\u0000\u0000\u00f3\u0019\u0001\u0000\u0000\u0000"+
		"\u00f4\u00f5\u0006\r\uffff\uffff\u0000\u00f5\u00f6\u0005+\u0000\u0000"+
		"\u00f6\u0101\u0001\u0000\u0000\u0000\u00f7\u00f8\n\u0002\u0000\u0000\u00f8"+
		"\u00f9\u0005\u001c\u0000\u0000\u00f9\u00fa\u0003\u0016\u000b\u0000\u00fa"+
		"\u00fb\u0005\u001d\u0000\u0000\u00fb\u0100\u0001\u0000\u0000\u0000\u00fc"+
		"\u00fd\n\u0001\u0000\u0000\u00fd\u00fe\u0005%\u0000\u0000\u00fe\u0100"+
		"\u0005+\u0000\u0000\u00ff\u00f7\u0001\u0000\u0000\u0000\u00ff\u00fc\u0001"+
		"\u0000\u0000\u0000\u0100\u0103\u0001\u0000\u0000\u0000\u0101\u00ff\u0001"+
		"\u0000\u0000\u0000\u0101\u0102\u0001\u0000\u0000\u0000\u0102\u001b\u0001"+
		"\u0000\u0000\u0000\u0103\u0101\u0001\u0000\u0000\u0000\u0104\u0109\u0003"+
		"\u0016\u000b\u0000\u0105\u0106\u0005!\u0000\u0000\u0106\u0108\u0003\u0016"+
		"\u000b\u0000\u0107\u0105\u0001\u0000\u0000\u0000\u0108\u010b\u0001\u0000"+
		"\u0000\u0000\u0109\u0107\u0001\u0000\u0000\u0000\u0109\u010a\u0001\u0000"+
		"\u0000\u0000\u010a\u001d\u0001\u0000\u0000\u0000\u010b\u0109\u0001\u0000"+
		"\u0000\u0000\u001a!&.0:>HQTalu\u009d\u00aa\u00b3\u00b8\u00bb\u00c1\u00cb"+
		"\u00d2\u00da\u00e7\u00ef\u00ff\u0101\u0109";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}