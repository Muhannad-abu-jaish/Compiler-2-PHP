// Generated from D:/Compiler-PHP\LEXERCONTROLLER.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LEXERCONTROLLER extends Lexer {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SPACE=1, UN=2, UT=3, UR=4, CURLYOPEN=5, CURLYCLOSE=6, SUM=7, DIVID=8, 
		MULTIPLY=9, MINUS=10, OPENTEXT=11, CLOSETEXT=12, SUMS=13, MINUSS=14, DOUBLE_QUOTE=15, 
		SIZES=16, COMMA=17, ON_CLICK=18, WIDTH=19, CONTENT=20, COLOR=21, COMMENT=22, 
		BACKGROUND=23, TAG_OPEN=24, COLORS=25, DOT=26, GET_DATA=27, PRINT=28, 
		TAG_CLOSE=29, CONTROLLER=30, EQUAL=31, SINGLE_QUOTE=32, NUMBER=33, SEMICOLON=34, 
		CHARS=35;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"SPACE", "UN", "UT", "UR", "CURLYOPEN", "CURLYCLOSE", "SUM", "DIVID", 
			"MULTIPLY", "MINUS", "OPENTEXT", "CLOSETEXT", "SUMS", "MINUSS", "DOUBLE_QUOTE", 
			"SIZES", "COMMA", "ON_CLICK", "WIDTH", "CONTENT", "COLOR", "COMMENT", 
			"BACKGROUND", "TAG_OPEN", "COLORS", "DOT", "GET_DATA", "PRINT", "TAG_CLOSE", 
			"CONTROLLER", "EQUAL", "SINGLE_QUOTE", "NUMBER", "SEMICOLON", "CHARS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "' '", "'\\n'", "'\\t'", "'\\r'", "'{'", "'}'", "'+'", "'/'", "'*'", 
			"'-'", "'('", "')'", "'++'", "'--'", "'\"'", null, "','", "'onClick'", 
			"'Width'", "'Content'", "'Color'", "'//'", "'Background'", "'<'", null, 
			"'.'", "'getData'", "'print'", "'>'", "'controller'", "'='", "'''", null, 
			"';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SPACE", "UN", "UT", "UR", "CURLYOPEN", "CURLYCLOSE", "SUM", "DIVID", 
			"MULTIPLY", "MINUS", "OPENTEXT", "CLOSETEXT", "SUMS", "MINUSS", "DOUBLE_QUOTE", 
			"SIZES", "COMMA", "ON_CLICK", "WIDTH", "CONTENT", "COLOR", "COMMENT", 
			"BACKGROUND", "TAG_OPEN", "COLORS", "DOT", "GET_DATA", "PRINT", "TAG_CLOSE", 
			"CONTROLLER", "EQUAL", "SINGLE_QUOTE", "NUMBER", "SEMICOLON", "CHARS"
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


	public LEXERCONTROLLER(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LEXERCONTROLLER.g4"; }

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
		"\u0004\u0000#\u010b\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
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
		"!\u0002\"\u0007\"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0004\u000fq\b\u000f\u000b\u000f\f\u000f"+
		"r\u0001\u000f\u0001\u000f\u0001\u000f\u0004\u000fx\b\u000f\u000b\u000f"+
		"\f\u000fy\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0004\u000f"+
		"\u0080\b\u000f\u000b\u000f\f\u000f\u0081\u0001\u000f\u0001\u000f\u0003"+
		"\u000f\u0086\b\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u00dd\b\u0018\u0001\u0019\u0001"+
		"\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001"+
		"\u001f\u0001\u001f\u0001 \u0004 \u0101\b \u000b \f \u0102\u0001!\u0001"+
		"!\u0001\"\u0004\"\u0108\b\"\u000b\"\f\"\u0109\u0000\u0000#\u0001\u0001"+
		"\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f"+
		"\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f"+
		"\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/\u0018"+
		"1\u00193\u001a5\u001b7\u001c9\u001d;\u001e=\u001f? A!C\"E#\u0001\u0000"+
		"\u0002\u0001\u000009\u0004\u000019AZ__az\u0118\u0000\u0001\u0001\u0000"+
		"\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000"+
		"\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000"+
		"\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000"+
		"\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000"+
		"\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000"+
		"\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000"+
		"\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000"+
		"\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000"+
		"#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001"+
		"\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000"+
		"\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u0000"+
		"1\u0001\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00005\u0001"+
		"\u0000\u0000\u0000\u00007\u0001\u0000\u0000\u0000\u00009\u0001\u0000\u0000"+
		"\u0000\u0000;\u0001\u0000\u0000\u0000\u0000=\u0001\u0000\u0000\u0000\u0000"+
		"?\u0001\u0000\u0000\u0000\u0000A\u0001\u0000\u0000\u0000\u0000C\u0001"+
		"\u0000\u0000\u0000\u0000E\u0001\u0000\u0000\u0000\u0001G\u0001\u0000\u0000"+
		"\u0000\u0003K\u0001\u0000\u0000\u0000\u0005O\u0001\u0000\u0000\u0000\u0007"+
		"S\u0001\u0000\u0000\u0000\tW\u0001\u0000\u0000\u0000\u000bY\u0001\u0000"+
		"\u0000\u0000\r[\u0001\u0000\u0000\u0000\u000f]\u0001\u0000\u0000\u0000"+
		"\u0011_\u0001\u0000\u0000\u0000\u0013a\u0001\u0000\u0000\u0000\u0015c"+
		"\u0001\u0000\u0000\u0000\u0017e\u0001\u0000\u0000\u0000\u0019g\u0001\u0000"+
		"\u0000\u0000\u001bj\u0001\u0000\u0000\u0000\u001dm\u0001\u0000\u0000\u0000"+
		"\u001f\u0085\u0001\u0000\u0000\u0000!\u0087\u0001\u0000\u0000\u0000#\u0089"+
		"\u0001\u0000\u0000\u0000%\u0091\u0001\u0000\u0000\u0000\'\u0097\u0001"+
		"\u0000\u0000\u0000)\u009f\u0001\u0000\u0000\u0000+\u00a5\u0001\u0000\u0000"+
		"\u0000-\u00a8\u0001\u0000\u0000\u0000/\u00b3\u0001\u0000\u0000\u00001"+
		"\u00dc\u0001\u0000\u0000\u00003\u00de\u0001\u0000\u0000\u00005\u00e0\u0001"+
		"\u0000\u0000\u00007\u00e8\u0001\u0000\u0000\u00009\u00ee\u0001\u0000\u0000"+
		"\u0000;\u00f0\u0001\u0000\u0000\u0000=\u00fb\u0001\u0000\u0000\u0000?"+
		"\u00fd\u0001\u0000\u0000\u0000A\u0100\u0001\u0000\u0000\u0000C\u0104\u0001"+
		"\u0000\u0000\u0000E\u0107\u0001\u0000\u0000\u0000GH\u0005 \u0000\u0000"+
		"HI\u0001\u0000\u0000\u0000IJ\u0006\u0000\u0000\u0000J\u0002\u0001\u0000"+
		"\u0000\u0000KL\u0005\n\u0000\u0000LM\u0001\u0000\u0000\u0000MN\u0006\u0001"+
		"\u0000\u0000N\u0004\u0001\u0000\u0000\u0000OP\u0005\t\u0000\u0000PQ\u0001"+
		"\u0000\u0000\u0000QR\u0006\u0002\u0000\u0000R\u0006\u0001\u0000\u0000"+
		"\u0000ST\u0005\r\u0000\u0000TU\u0001\u0000\u0000\u0000UV\u0006\u0003\u0000"+
		"\u0000V\b\u0001\u0000\u0000\u0000WX\u0005{\u0000\u0000X\n\u0001\u0000"+
		"\u0000\u0000YZ\u0005}\u0000\u0000Z\f\u0001\u0000\u0000\u0000[\\\u0005"+
		"+\u0000\u0000\\\u000e\u0001\u0000\u0000\u0000]^\u0005/\u0000\u0000^\u0010"+
		"\u0001\u0000\u0000\u0000_`\u0005*\u0000\u0000`\u0012\u0001\u0000\u0000"+
		"\u0000ab\u0005-\u0000\u0000b\u0014\u0001\u0000\u0000\u0000cd\u0005(\u0000"+
		"\u0000d\u0016\u0001\u0000\u0000\u0000ef\u0005)\u0000\u0000f\u0018\u0001"+
		"\u0000\u0000\u0000gh\u0005+\u0000\u0000hi\u0005+\u0000\u0000i\u001a\u0001"+
		"\u0000\u0000\u0000jk\u0005-\u0000\u0000kl\u0005-\u0000\u0000l\u001c\u0001"+
		"\u0000\u0000\u0000mn\u0005\"\u0000\u0000n\u001e\u0001\u0000\u0000\u0000"+
		"oq\u0007\u0000\u0000\u0000po\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000"+
		"\u0000rp\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000st\u0001\u0000"+
		"\u0000\u0000tu\u0005p\u0000\u0000u\u0086\u0005x\u0000\u0000vx\u0007\u0000"+
		"\u0000\u0000wv\u0001\u0000\u0000\u0000xy\u0001\u0000\u0000\u0000yw\u0001"+
		"\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000\u0000"+
		"{|\u0005r\u0000\u0000|}\u0005e\u0000\u0000}\u0086\u0005m\u0000\u0000~"+
		"\u0080\u0007\u0000\u0000\u0000\u007f~\u0001\u0000\u0000\u0000\u0080\u0081"+
		"\u0001\u0000\u0000\u0000\u0081\u007f\u0001\u0000\u0000\u0000\u0081\u0082"+
		"\u0001\u0000\u0000\u0000\u0082\u0083\u0001\u0000\u0000\u0000\u0083\u0084"+
		"\u0005d\u0000\u0000\u0084\u0086\u0005p\u0000\u0000\u0085p\u0001\u0000"+
		"\u0000\u0000\u0085w\u0001\u0000\u0000\u0000\u0085\u007f\u0001\u0000\u0000"+
		"\u0000\u0086 \u0001\u0000\u0000\u0000\u0087\u0088\u0005,\u0000\u0000\u0088"+
		"\"\u0001\u0000\u0000\u0000\u0089\u008a\u0005o\u0000\u0000\u008a\u008b"+
		"\u0005n\u0000\u0000\u008b\u008c\u0005C\u0000\u0000\u008c\u008d\u0005l"+
		"\u0000\u0000\u008d\u008e\u0005i\u0000\u0000\u008e\u008f\u0005c\u0000\u0000"+
		"\u008f\u0090\u0005k\u0000\u0000\u0090$\u0001\u0000\u0000\u0000\u0091\u0092"+
		"\u0005W\u0000\u0000\u0092\u0093\u0005i\u0000\u0000\u0093\u0094\u0005d"+
		"\u0000\u0000\u0094\u0095\u0005t\u0000\u0000\u0095\u0096\u0005h\u0000\u0000"+
		"\u0096&\u0001\u0000\u0000\u0000\u0097\u0098\u0005C\u0000\u0000\u0098\u0099"+
		"\u0005o\u0000\u0000\u0099\u009a\u0005n\u0000\u0000\u009a\u009b\u0005t"+
		"\u0000\u0000\u009b\u009c\u0005e\u0000\u0000\u009c\u009d\u0005n\u0000\u0000"+
		"\u009d\u009e\u0005t\u0000\u0000\u009e(\u0001\u0000\u0000\u0000\u009f\u00a0"+
		"\u0005C\u0000\u0000\u00a0\u00a1\u0005o\u0000\u0000\u00a1\u00a2\u0005l"+
		"\u0000\u0000\u00a2\u00a3\u0005o\u0000\u0000\u00a3\u00a4\u0005r\u0000\u0000"+
		"\u00a4*\u0001\u0000\u0000\u0000\u00a5\u00a6\u0005/\u0000\u0000\u00a6\u00a7"+
		"\u0005/\u0000\u0000\u00a7,\u0001\u0000\u0000\u0000\u00a8\u00a9\u0005B"+
		"\u0000\u0000\u00a9\u00aa\u0005a\u0000\u0000\u00aa\u00ab\u0005c\u0000\u0000"+
		"\u00ab\u00ac\u0005k\u0000\u0000\u00ac\u00ad\u0005g\u0000\u0000\u00ad\u00ae"+
		"\u0005r\u0000\u0000\u00ae\u00af\u0005o\u0000\u0000\u00af\u00b0\u0005u"+
		"\u0000\u0000\u00b0\u00b1\u0005n\u0000\u0000\u00b1\u00b2\u0005d\u0000\u0000"+
		"\u00b2.\u0001\u0000\u0000\u0000\u00b3\u00b4\u0005<\u0000\u0000\u00b40"+
		"\u0001\u0000\u0000\u0000\u00b5\u00b6\u0005B\u0000\u0000\u00b6\u00b7\u0005"+
		"l\u0000\u0000\u00b7\u00b8\u0005u\u0000\u0000\u00b8\u00dd\u0005e\u0000"+
		"\u0000\u00b9\u00ba\u0005R\u0000\u0000\u00ba\u00bb\u0005e\u0000\u0000\u00bb"+
		"\u00dd\u0005d\u0000\u0000\u00bc\u00bd\u0005P\u0000\u0000\u00bd\u00be\u0005"+
		"u\u0000\u0000\u00be\u00bf\u0005r\u0000\u0000\u00bf\u00c0\u0005p\u0000"+
		"\u0000\u00c0\u00c1\u0005l\u0000\u0000\u00c1\u00dd\u0005e\u0000\u0000\u00c2"+
		"\u00c3\u0005Y\u0000\u0000\u00c3\u00c4\u0005e\u0000\u0000\u00c4\u00c5\u0005"+
		"l\u0000\u0000\u00c5\u00c6\u0005l\u0000\u0000\u00c6\u00c7\u0005o\u0000"+
		"\u0000\u00c7\u00dd\u0005w\u0000\u0000\u00c8\u00c9\u0005G\u0000\u0000\u00c9"+
		"\u00ca\u0005r\u0000\u0000\u00ca\u00cb\u0005e\u0000\u0000\u00cb\u00cc\u0005"+
		"e\u0000\u0000\u00cc\u00dd\u0005n\u0000\u0000\u00cd\u00ce\u0005W\u0000"+
		"\u0000\u00ce\u00cf\u0005h\u0000\u0000\u00cf\u00d0\u0005i\u0000\u0000\u00d0"+
		"\u00d1\u0005t\u0000\u0000\u00d1\u00dd\u0005e\u0000\u0000\u00d2\u00d3\u0005"+
		"B\u0000\u0000\u00d3\u00d4\u0005l\u0000\u0000\u00d4\u00d5\u0005a\u0000"+
		"\u0000\u00d5\u00d6\u0005c\u0000\u0000\u00d6\u00dd\u0005k\u0000\u0000\u00d7"+
		"\u00d8\u0005B\u0000\u0000\u00d8\u00d9\u0005r\u0000\u0000\u00d9\u00da\u0005"+
		"o\u0000\u0000\u00da\u00db\u0005w\u0000\u0000\u00db\u00dd\u0005n\u0000"+
		"\u0000\u00dc\u00b5\u0001\u0000\u0000\u0000\u00dc\u00b9\u0001\u0000\u0000"+
		"\u0000\u00dc\u00bc\u0001\u0000\u0000\u0000\u00dc\u00c2\u0001\u0000\u0000"+
		"\u0000\u00dc\u00c8\u0001\u0000\u0000\u0000\u00dc\u00cd\u0001\u0000\u0000"+
		"\u0000\u00dc\u00d2\u0001\u0000\u0000\u0000\u00dc\u00d7\u0001\u0000\u0000"+
		"\u0000\u00dd2\u0001\u0000\u0000\u0000\u00de\u00df\u0005.\u0000\u0000\u00df"+
		"4\u0001\u0000\u0000\u0000\u00e0\u00e1\u0005g\u0000\u0000\u00e1\u00e2\u0005"+
		"e\u0000\u0000\u00e2\u00e3\u0005t\u0000\u0000\u00e3\u00e4\u0005D\u0000"+
		"\u0000\u00e4\u00e5\u0005a\u0000\u0000\u00e5\u00e6\u0005t\u0000\u0000\u00e6"+
		"\u00e7\u0005a\u0000\u0000\u00e76\u0001\u0000\u0000\u0000\u00e8\u00e9\u0005"+
		"p\u0000\u0000\u00e9\u00ea\u0005r\u0000\u0000\u00ea\u00eb\u0005i\u0000"+
		"\u0000\u00eb\u00ec\u0005n\u0000\u0000\u00ec\u00ed\u0005t\u0000\u0000\u00ed"+
		"8\u0001\u0000\u0000\u0000\u00ee\u00ef\u0005>\u0000\u0000\u00ef:\u0001"+
		"\u0000\u0000\u0000\u00f0\u00f1\u0005c\u0000\u0000\u00f1\u00f2\u0005o\u0000"+
		"\u0000\u00f2\u00f3\u0005n\u0000\u0000\u00f3\u00f4\u0005t\u0000\u0000\u00f4"+
		"\u00f5\u0005r\u0000\u0000\u00f5\u00f6\u0005o\u0000\u0000\u00f6\u00f7\u0005"+
		"l\u0000\u0000\u00f7\u00f8\u0005l\u0000\u0000\u00f8\u00f9\u0005e\u0000"+
		"\u0000\u00f9\u00fa\u0005r\u0000\u0000\u00fa<\u0001\u0000\u0000\u0000\u00fb"+
		"\u00fc\u0005=\u0000\u0000\u00fc>\u0001\u0000\u0000\u0000\u00fd\u00fe\u0005"+
		"\'\u0000\u0000\u00fe@\u0001\u0000\u0000\u0000\u00ff\u0101\u0007\u0000"+
		"\u0000\u0000\u0100\u00ff\u0001\u0000\u0000\u0000\u0101\u0102\u0001\u0000"+
		"\u0000\u0000\u0102\u0100\u0001\u0000\u0000\u0000\u0102\u0103\u0001\u0000"+
		"\u0000\u0000\u0103B\u0001\u0000\u0000\u0000\u0104\u0105\u0005;\u0000\u0000"+
		"\u0105D\u0001\u0000\u0000\u0000\u0106\u0108\u0007\u0001\u0000\u0000\u0107"+
		"\u0106\u0001\u0000\u0000\u0000\u0108\u0109\u0001\u0000\u0000\u0000\u0109"+
		"\u0107\u0001\u0000\u0000\u0000\u0109\u010a\u0001\u0000\u0000\u0000\u010a"+
		"F\u0001\u0000\u0000\u0000\t\u0000ry\u0081\u0085\u00dc\u0102\u0107\u0109"+
		"\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}