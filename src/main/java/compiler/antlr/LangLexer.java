// Generated from antlr/Lang.g4 by ANTLR 4.13.2
package compiler.antlr;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class LangLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "WS", "LINE_COMMENT", "MULTILINE_COMMENT", "ABSTRACT", "DATA", 
			"IF", "ELSE", "ITERATE", "READ", "PRINT", "RETURN", "NEW", "TRUE", "FALSE", 
			"NULL", "AND_OP", "EQ_OP", "NEQ_OP", "LE_OP", "PLUS_OP", "MINUS_OP", 
			"MULT_OP", "DIV_OP", "MOD_OP", "LBRACE", "RBRACE", "LBRACK", "RBRACK", 
			"LPAREN", "RPAREN", "SEMI", "COMMA", "RANGLE", "COLON", "DCOLON", "DOT", 
			"ASSIGN", "INT_TYPE", "CHAR_TYPE", "BOOL_TYPE", "FLOAT_TYPE", "ID", "TYID", 
			"INT", "FLOAT", "CHAR", "ESC_SEQ"
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


	public LangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Lang.g4"; }

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
		"\u0004\u0000/\u0139\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007"+
		"&\u0002\'\u0007\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007"+
		"+\u0002,\u0007,\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0004\u0001e\b\u0001\u000b\u0001\f\u0001f\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005"+
		"\u0002o\b\u0002\n\u0002\f\u0002r\t\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003z\b\u0003\n\u0003"+
		"\f\u0003}\t\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r"+
		"\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001"+
		"\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001"+
		"\u0017\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u001a\u0001"+
		"\u001a\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001d\u0001"+
		"\u001d\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001"+
		"!\u0001!\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0001$\u0001$\u0001%\u0001"+
		"%\u0001&\u0001&\u0001&\u0001&\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'"+
		"\u0001(\u0001(\u0001(\u0001(\u0001(\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0001*\u0001*\u0005*\u010e\b*\n*\f*\u0111\t*\u0001+\u0001+\u0005"+
		"+\u0115\b+\n+\f+\u0118\t+\u0001,\u0004,\u011b\b,\u000b,\f,\u011c\u0001"+
		"-\u0005-\u0120\b-\n-\f-\u0123\t-\u0001-\u0001-\u0004-\u0127\b-\u000b-"+
		"\f-\u0128\u0001.\u0001.\u0001.\u0003.\u012e\b.\u0001.\u0001.\u0001/\u0001"+
		"/\u0001/\u0001/\u0001/\u0001/\u0003/\u0138\b/\u0001{\u00000\u0001\u0001"+
		"\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f"+
		"\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f"+
		"\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/\u0018"+
		"1\u00193\u001a5\u001b7\u001c9\u001d;\u001e=\u001f? A!C\"E#G$I%K&M\'O("+
		"Q)S*U+W,Y-[.]/_\u0000\u0001\u0000\b\u0003\u0000\t\n\r\r  \u0002\u0000"+
		"\n\n\r\r\u0001\u0000az\u0004\u000009AZ__az\u0001\u0000AZ\u0001\u00000"+
		"9\u0004\u0000\n\n\r\r\'\'\\\\\u0006\u0000\'\'\\\\bbnnrrtt\u0141\u0000"+
		"\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000"+
		"\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000"+
		"\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r"+
		"\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001"+
		"\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000"+
		"\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000"+
		"\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/"+
		"\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u00003\u0001\u0000"+
		"\u0000\u0000\u00005\u0001\u0000\u0000\u0000\u00007\u0001\u0000\u0000\u0000"+
		"\u00009\u0001\u0000\u0000\u0000\u0000;\u0001\u0000\u0000\u0000\u0000="+
		"\u0001\u0000\u0000\u0000\u0000?\u0001\u0000\u0000\u0000\u0000A\u0001\u0000"+
		"\u0000\u0000\u0000C\u0001\u0000\u0000\u0000\u0000E\u0001\u0000\u0000\u0000"+
		"\u0000G\u0001\u0000\u0000\u0000\u0000I\u0001\u0000\u0000\u0000\u0000K"+
		"\u0001\u0000\u0000\u0000\u0000M\u0001\u0000\u0000\u0000\u0000O\u0001\u0000"+
		"\u0000\u0000\u0000Q\u0001\u0000\u0000\u0000\u0000S\u0001\u0000\u0000\u0000"+
		"\u0000U\u0001\u0000\u0000\u0000\u0000W\u0001\u0000\u0000\u0000\u0000Y"+
		"\u0001\u0000\u0000\u0000\u0000[\u0001\u0000\u0000\u0000\u0000]\u0001\u0000"+
		"\u0000\u0000\u0001a\u0001\u0000\u0000\u0000\u0003d\u0001\u0000\u0000\u0000"+
		"\u0005j\u0001\u0000\u0000\u0000\u0007u\u0001\u0000\u0000\u0000\t\u0083"+
		"\u0001\u0000\u0000\u0000\u000b\u008c\u0001\u0000\u0000\u0000\r\u0091\u0001"+
		"\u0000\u0000\u0000\u000f\u0094\u0001\u0000\u0000\u0000\u0011\u0099\u0001"+
		"\u0000\u0000\u0000\u0013\u00a1\u0001\u0000\u0000\u0000\u0015\u00a6\u0001"+
		"\u0000\u0000\u0000\u0017\u00ac\u0001\u0000\u0000\u0000\u0019\u00b3\u0001"+
		"\u0000\u0000\u0000\u001b\u00b7\u0001\u0000\u0000\u0000\u001d\u00bc\u0001"+
		"\u0000\u0000\u0000\u001f\u00c2\u0001\u0000\u0000\u0000!\u00c7\u0001\u0000"+
		"\u0000\u0000#\u00ca\u0001\u0000\u0000\u0000%\u00cd\u0001\u0000\u0000\u0000"+
		"\'\u00d0\u0001\u0000\u0000\u0000)\u00d2\u0001\u0000\u0000\u0000+\u00d4"+
		"\u0001\u0000\u0000\u0000-\u00d6\u0001\u0000\u0000\u0000/\u00d8\u0001\u0000"+
		"\u0000\u00001\u00da\u0001\u0000\u0000\u00003\u00dc\u0001\u0000\u0000\u0000"+
		"5\u00de\u0001\u0000\u0000\u00007\u00e0\u0001\u0000\u0000\u00009\u00e2"+
		"\u0001\u0000\u0000\u0000;\u00e4\u0001\u0000\u0000\u0000=\u00e6\u0001\u0000"+
		"\u0000\u0000?\u00e8\u0001\u0000\u0000\u0000A\u00ea\u0001\u0000\u0000\u0000"+
		"C\u00ec\u0001\u0000\u0000\u0000E\u00ee\u0001\u0000\u0000\u0000G\u00f0"+
		"\u0001\u0000\u0000\u0000I\u00f3\u0001\u0000\u0000\u0000K\u00f5\u0001\u0000"+
		"\u0000\u0000M\u00f7\u0001\u0000\u0000\u0000O\u00fb\u0001\u0000\u0000\u0000"+
		"Q\u0100\u0001\u0000\u0000\u0000S\u0105\u0001\u0000\u0000\u0000U\u010b"+
		"\u0001\u0000\u0000\u0000W\u0112\u0001\u0000\u0000\u0000Y\u011a\u0001\u0000"+
		"\u0000\u0000[\u0121\u0001\u0000\u0000\u0000]\u012a\u0001\u0000\u0000\u0000"+
		"_\u0137\u0001\u0000\u0000\u0000ab\u0005!\u0000\u0000b\u0002\u0001\u0000"+
		"\u0000\u0000ce\u0007\u0000\u0000\u0000dc\u0001\u0000\u0000\u0000ef\u0001"+
		"\u0000\u0000\u0000fd\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000"+
		"gh\u0001\u0000\u0000\u0000hi\u0006\u0001\u0000\u0000i\u0004\u0001\u0000"+
		"\u0000\u0000jk\u0005-\u0000\u0000kl\u0005-\u0000\u0000lp\u0001\u0000\u0000"+
		"\u0000mo\b\u0001\u0000\u0000nm\u0001\u0000\u0000\u0000or\u0001\u0000\u0000"+
		"\u0000pn\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000qs\u0001\u0000"+
		"\u0000\u0000rp\u0001\u0000\u0000\u0000st\u0006\u0002\u0000\u0000t\u0006"+
		"\u0001\u0000\u0000\u0000uv\u0005{\u0000\u0000vw\u0005-\u0000\u0000w{\u0001"+
		"\u0000\u0000\u0000xz\t\u0000\u0000\u0000yx\u0001\u0000\u0000\u0000z}\u0001"+
		"\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000{y\u0001\u0000\u0000\u0000"+
		"|~\u0001\u0000\u0000\u0000}{\u0001\u0000\u0000\u0000~\u007f\u0005-\u0000"+
		"\u0000\u007f\u0080\u0005}\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000"+
		"\u0081\u0082\u0006\u0003\u0000\u0000\u0082\b\u0001\u0000\u0000\u0000\u0083"+
		"\u0084\u0005a\u0000\u0000\u0084\u0085\u0005b\u0000\u0000\u0085\u0086\u0005"+
		"s\u0000\u0000\u0086\u0087\u0005t\u0000\u0000\u0087\u0088\u0005r\u0000"+
		"\u0000\u0088\u0089\u0005a\u0000\u0000\u0089\u008a\u0005c\u0000\u0000\u008a"+
		"\u008b\u0005t\u0000\u0000\u008b\n\u0001\u0000\u0000\u0000\u008c\u008d"+
		"\u0005d\u0000\u0000\u008d\u008e\u0005a\u0000\u0000\u008e\u008f\u0005t"+
		"\u0000\u0000\u008f\u0090\u0005a\u0000\u0000\u0090\f\u0001\u0000\u0000"+
		"\u0000\u0091\u0092\u0005i\u0000\u0000\u0092\u0093\u0005f\u0000\u0000\u0093"+
		"\u000e\u0001\u0000\u0000\u0000\u0094\u0095\u0005e\u0000\u0000\u0095\u0096"+
		"\u0005l\u0000\u0000\u0096\u0097\u0005s\u0000\u0000\u0097\u0098\u0005e"+
		"\u0000\u0000\u0098\u0010\u0001\u0000\u0000\u0000\u0099\u009a\u0005i\u0000"+
		"\u0000\u009a\u009b\u0005t\u0000\u0000\u009b\u009c\u0005e\u0000\u0000\u009c"+
		"\u009d\u0005r\u0000\u0000\u009d\u009e\u0005a\u0000\u0000\u009e\u009f\u0005"+
		"t\u0000\u0000\u009f\u00a0\u0005e\u0000\u0000\u00a0\u0012\u0001\u0000\u0000"+
		"\u0000\u00a1\u00a2\u0005r\u0000\u0000\u00a2\u00a3\u0005e\u0000\u0000\u00a3"+
		"\u00a4\u0005a\u0000\u0000\u00a4\u00a5\u0005d\u0000\u0000\u00a5\u0014\u0001"+
		"\u0000\u0000\u0000\u00a6\u00a7\u0005p\u0000\u0000\u00a7\u00a8\u0005r\u0000"+
		"\u0000\u00a8\u00a9\u0005i\u0000\u0000\u00a9\u00aa\u0005n\u0000\u0000\u00aa"+
		"\u00ab\u0005t\u0000\u0000\u00ab\u0016\u0001\u0000\u0000\u0000\u00ac\u00ad"+
		"\u0005r\u0000\u0000\u00ad\u00ae\u0005e\u0000\u0000\u00ae\u00af\u0005t"+
		"\u0000\u0000\u00af\u00b0\u0005u\u0000\u0000\u00b0\u00b1\u0005r\u0000\u0000"+
		"\u00b1\u00b2\u0005n\u0000\u0000\u00b2\u0018\u0001\u0000\u0000\u0000\u00b3"+
		"\u00b4\u0005n\u0000\u0000\u00b4\u00b5\u0005e\u0000\u0000\u00b5\u00b6\u0005"+
		"w\u0000\u0000\u00b6\u001a\u0001\u0000\u0000\u0000\u00b7\u00b8\u0005t\u0000"+
		"\u0000\u00b8\u00b9\u0005r\u0000\u0000\u00b9\u00ba\u0005u\u0000\u0000\u00ba"+
		"\u00bb\u0005e\u0000\u0000\u00bb\u001c\u0001\u0000\u0000\u0000\u00bc\u00bd"+
		"\u0005f\u0000\u0000\u00bd\u00be\u0005a\u0000\u0000\u00be\u00bf\u0005l"+
		"\u0000\u0000\u00bf\u00c0\u0005s\u0000\u0000\u00c0\u00c1\u0005e\u0000\u0000"+
		"\u00c1\u001e\u0001\u0000\u0000\u0000\u00c2\u00c3\u0005n\u0000\u0000\u00c3"+
		"\u00c4\u0005u\u0000\u0000\u00c4\u00c5\u0005l\u0000\u0000\u00c5\u00c6\u0005"+
		"l\u0000\u0000\u00c6 \u0001\u0000\u0000\u0000\u00c7\u00c8\u0005&\u0000"+
		"\u0000\u00c8\u00c9\u0005&\u0000\u0000\u00c9\"\u0001\u0000\u0000\u0000"+
		"\u00ca\u00cb\u0005=\u0000\u0000\u00cb\u00cc\u0005=\u0000\u0000\u00cc$"+
		"\u0001\u0000\u0000\u0000\u00cd\u00ce\u0005!\u0000\u0000\u00ce\u00cf\u0005"+
		"=\u0000\u0000\u00cf&\u0001\u0000\u0000\u0000\u00d0\u00d1\u0005<\u0000"+
		"\u0000\u00d1(\u0001\u0000\u0000\u0000\u00d2\u00d3\u0005+\u0000\u0000\u00d3"+
		"*\u0001\u0000\u0000\u0000\u00d4\u00d5\u0005-\u0000\u0000\u00d5,\u0001"+
		"\u0000\u0000\u0000\u00d6\u00d7\u0005*\u0000\u0000\u00d7.\u0001\u0000\u0000"+
		"\u0000\u00d8\u00d9\u0005/\u0000\u0000\u00d90\u0001\u0000\u0000\u0000\u00da"+
		"\u00db\u0005%\u0000\u0000\u00db2\u0001\u0000\u0000\u0000\u00dc\u00dd\u0005"+
		"{\u0000\u0000\u00dd4\u0001\u0000\u0000\u0000\u00de\u00df\u0005}\u0000"+
		"\u0000\u00df6\u0001\u0000\u0000\u0000\u00e0\u00e1\u0005[\u0000\u0000\u00e1"+
		"8\u0001\u0000\u0000\u0000\u00e2\u00e3\u0005]\u0000\u0000\u00e3:\u0001"+
		"\u0000\u0000\u0000\u00e4\u00e5\u0005(\u0000\u0000\u00e5<\u0001\u0000\u0000"+
		"\u0000\u00e6\u00e7\u0005)\u0000\u0000\u00e7>\u0001\u0000\u0000\u0000\u00e8"+
		"\u00e9\u0005;\u0000\u0000\u00e9@\u0001\u0000\u0000\u0000\u00ea\u00eb\u0005"+
		",\u0000\u0000\u00ebB\u0001\u0000\u0000\u0000\u00ec\u00ed\u0005>\u0000"+
		"\u0000\u00edD\u0001\u0000\u0000\u0000\u00ee\u00ef\u0005:\u0000\u0000\u00ef"+
		"F\u0001\u0000\u0000\u0000\u00f0\u00f1\u0005:\u0000\u0000\u00f1\u00f2\u0005"+
		":\u0000\u0000\u00f2H\u0001\u0000\u0000\u0000\u00f3\u00f4\u0005.\u0000"+
		"\u0000\u00f4J\u0001\u0000\u0000\u0000\u00f5\u00f6\u0005=\u0000\u0000\u00f6"+
		"L\u0001\u0000\u0000\u0000\u00f7\u00f8\u0005I\u0000\u0000\u00f8\u00f9\u0005"+
		"n\u0000\u0000\u00f9\u00fa\u0005t\u0000\u0000\u00faN\u0001\u0000\u0000"+
		"\u0000\u00fb\u00fc\u0005C\u0000\u0000\u00fc\u00fd\u0005h\u0000\u0000\u00fd"+
		"\u00fe\u0005a\u0000\u0000\u00fe\u00ff\u0005r\u0000\u0000\u00ffP\u0001"+
		"\u0000\u0000\u0000\u0100\u0101\u0005B\u0000\u0000\u0101\u0102\u0005o\u0000"+
		"\u0000\u0102\u0103\u0005o\u0000\u0000\u0103\u0104\u0005l\u0000\u0000\u0104"+
		"R\u0001\u0000\u0000\u0000\u0105\u0106\u0005F\u0000\u0000\u0106\u0107\u0005"+
		"l\u0000\u0000\u0107\u0108\u0005o\u0000\u0000\u0108\u0109\u0005a\u0000"+
		"\u0000\u0109\u010a\u0005t\u0000\u0000\u010aT\u0001\u0000\u0000\u0000\u010b"+
		"\u010f\u0007\u0002\u0000\u0000\u010c\u010e\u0007\u0003\u0000\u0000\u010d"+
		"\u010c\u0001\u0000\u0000\u0000\u010e\u0111\u0001\u0000\u0000\u0000\u010f"+
		"\u010d\u0001\u0000\u0000\u0000\u010f\u0110\u0001\u0000\u0000\u0000\u0110"+
		"V\u0001\u0000\u0000\u0000\u0111\u010f\u0001\u0000\u0000\u0000\u0112\u0116"+
		"\u0007\u0004\u0000\u0000\u0113\u0115\u0007\u0003\u0000\u0000\u0114\u0113"+
		"\u0001\u0000\u0000\u0000\u0115\u0118\u0001\u0000\u0000\u0000\u0116\u0114"+
		"\u0001\u0000\u0000\u0000\u0116\u0117\u0001\u0000\u0000\u0000\u0117X\u0001"+
		"\u0000\u0000\u0000\u0118\u0116\u0001\u0000\u0000\u0000\u0119\u011b\u0007"+
		"\u0005\u0000\u0000\u011a\u0119\u0001\u0000\u0000\u0000\u011b\u011c\u0001"+
		"\u0000\u0000\u0000\u011c\u011a\u0001\u0000\u0000\u0000\u011c\u011d\u0001"+
		"\u0000\u0000\u0000\u011dZ\u0001\u0000\u0000\u0000\u011e\u0120\u0007\u0005"+
		"\u0000\u0000\u011f\u011e\u0001\u0000\u0000\u0000\u0120\u0123\u0001\u0000"+
		"\u0000\u0000\u0121\u011f\u0001\u0000\u0000\u0000\u0121\u0122\u0001\u0000"+
		"\u0000\u0000\u0122\u0124\u0001\u0000\u0000\u0000\u0123\u0121\u0001\u0000"+
		"\u0000\u0000\u0124\u0126\u0005.\u0000\u0000\u0125\u0127\u0007\u0005\u0000"+
		"\u0000\u0126\u0125\u0001\u0000\u0000\u0000\u0127\u0128\u0001\u0000\u0000"+
		"\u0000\u0128\u0126\u0001\u0000\u0000\u0000\u0128\u0129\u0001\u0000\u0000"+
		"\u0000\u0129\\\u0001\u0000\u0000\u0000\u012a\u012d\u0005\'\u0000\u0000"+
		"\u012b\u012e\u0003_/\u0000\u012c\u012e\b\u0006\u0000\u0000\u012d\u012b"+
		"\u0001\u0000\u0000\u0000\u012d\u012c\u0001\u0000\u0000\u0000\u012e\u012f"+
		"\u0001\u0000\u0000\u0000\u012f\u0130\u0005\'\u0000\u0000\u0130^\u0001"+
		"\u0000\u0000\u0000\u0131\u0132\u0005\\\u0000\u0000\u0132\u0138\u0007\u0007"+
		"\u0000\u0000\u0133\u0134\u0005\\\u0000\u0000\u0134\u0135\u0007\u0005\u0000"+
		"\u0000\u0135\u0136\u0007\u0005\u0000\u0000\u0136\u0138\u0007\u0005\u0000"+
		"\u0000\u0137\u0131\u0001\u0000\u0000\u0000\u0137\u0133\u0001\u0000\u0000"+
		"\u0000\u0138`\u0001\u0000\u0000\u0000\u000b\u0000fp{\u010f\u0116\u011c"+
		"\u0121\u0128\u012d\u0137\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}