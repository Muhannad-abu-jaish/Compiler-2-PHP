// Generated from C:/Users/muhannad/IdeaProjects/Compiler-2-2-\PARSERCONTROLLER.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PARSERCONTROLLER extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SPACE=1, UN=2, UT=3, UR=4, CURLYOPEN=5, CURLYCLOSE=6, SUM=7, DIVID=8, 
		MULTIPLY=9, MINUS=10, OPENTEXT=11, CLOSETEXT=12, SUMS=13, MINUSS=14, SUM_EQUAL=15, 
		MINUS_EQUAL=16, DIVID_EQUAL=17, MULTIPLY_EQUAL=18, OR=19, AND=20, EQUALEQUAL=21, 
		NOT=22, IF=23, ELSE=24, DOUBLE_QUOTE=25, SIZES=26, COMMA=27, ON_CLICK=28, 
		WIDTH=29, CONTENT=30, COLOR=31, COMMENT=32, BACKGROUND=33, TAG_OPEN=34, 
		COLORS=35, DOT=36, GET_DATA=37, PRINT=38, TAG_CLOSE=39, CONTROLLER=40, 
		EQUAL=41, SINGLE_QUOTE=42, NUMBER=43, SEMICOLON=44, CHARS=45;
	public static final int
		RULE_program = 0, RULE_code_attribute = 1, RULE_if_statment = 2, RULE_logical_sympol = 3, 
		RULE_operation_if = 4, RULE_else_statment = 5, RULE_comment = 6, RULE_on_click = 7, 
		RULE_click_attribute = 8, RULE_text = 9, RULE_text_attribute = 10, RULE_content = 11, 
		RULE_color = 12, RULE_button = 13, RULE_button_attribute = 14, RULE_width = 15, 
		RULE_background = 16, RULE_print = 17, RULE_printattribute = 18, RULE_getdata = 19, 
		RULE_print_text = 20, RULE_variables = 21, RULE_variable_number = 22, 
		RULE_fast_math = 23, RULE_adding_one = 24, RULE_minus_one = 25, RULE_number_attribute = 26, 
		RULE_variable_text = 27, RULE_variable_get = 28, RULE_textinput = 29;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "code_attribute", "if_statment", "logical_sympol", "operation_if", 
			"else_statment", "comment", "on_click", "click_attribute", "text", "text_attribute", 
			"content", "color", "button", "button_attribute", "width", "background", 
			"print", "printattribute", "getdata", "print_text", "variables", "variable_number", 
			"fast_math", "adding_one", "minus_one", "number_attribute", "variable_text", 
			"variable_get", "textinput"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "' '", "'\\n'", "'\\t'", "'\\r'", "'{'", "'}'", "'+'", "'/'", "'*'", 
			"'-'", "'('", "')'", "'++'", "'--'", "'+='", "'-='", "'/='", "'*='", 
			"'||'", "'&&'", "'=='", "'!'", "'if'", "'else'", "'\"'", null, "','", 
			"'onClick'", "'Width'", "'Content'", "'Color'", "'//'", "'Background'", 
			"'<'", null, "'.'", "'getData'", "'print'", "'>'", "'controller'", "'='", 
			"'''", null, "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SPACE", "UN", "UT", "UR", "CURLYOPEN", "CURLYCLOSE", "SUM", "DIVID", 
			"MULTIPLY", "MINUS", "OPENTEXT", "CLOSETEXT", "SUMS", "MINUSS", "SUM_EQUAL", 
			"MINUS_EQUAL", "DIVID_EQUAL", "MULTIPLY_EQUAL", "OR", "AND", "EQUALEQUAL", 
			"NOT", "IF", "ELSE", "DOUBLE_QUOTE", "SIZES", "COMMA", "ON_CLICK", "WIDTH", 
			"CONTENT", "COLOR", "COMMENT", "BACKGROUND", "TAG_OPEN", "COLORS", "DOT", 
			"GET_DATA", "PRINT", "TAG_CLOSE", "CONTROLLER", "EQUAL", "SINGLE_QUOTE", 
			"NUMBER", "SEMICOLON", "CHARS"
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
	public String getGrammarFileName() { return "PARSERCONTROLLER.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PARSERCONTROLLER(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode TAG_OPEN() { return getToken(PARSERCONTROLLER.TAG_OPEN, 0); }
		public TerminalNode CONTROLLER() { return getToken(PARSERCONTROLLER.CONTROLLER, 0); }
		public TerminalNode TAG_CLOSE() { return getToken(PARSERCONTROLLER.TAG_CLOSE, 0); }
		public List<Code_attributeContext> code_attribute() {
			return getRuleContexts(Code_attributeContext.class);
		}
		public Code_attributeContext code_attribute(int i) {
			return getRuleContext(Code_attributeContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERCONTROLLERListener ) ((PARSERCONTROLLERListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERCONTROLLERListener ) ((PARSERCONTROLLERListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERCONTROLLERVisitor ) return ((PARSERCONTROLLERVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(TAG_OPEN);
			setState(61);
			match(CONTROLLER);
			setState(62);
			match(TAG_CLOSE);
			setState(64); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(63);
				code_attribute();
				}
				}
				setState(66); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << ELSE) | (1L << COMMENT) | (1L << PRINT) | (1L << CHARS))) != 0) );
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

	public static class Code_attributeContext extends ParserRuleContext {
		public VariablesContext variables() {
			return getRuleContext(VariablesContext.class,0);
		}
		public On_clickContext on_click() {
			return getRuleContext(On_clickContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public If_statmentContext if_statment() {
			return getRuleContext(If_statmentContext.class,0);
		}
		public Else_statmentContext else_statment() {
			return getRuleContext(Else_statmentContext.class,0);
		}
		public Code_attributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERCONTROLLERListener ) ((PARSERCONTROLLERListener)listener).enterCode_attribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERCONTROLLERListener ) ((PARSERCONTROLLERListener)listener).exitCode_attribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERCONTROLLERVisitor ) return ((PARSERCONTROLLERVisitor<? extends T>)visitor).visitCode_attribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Code_attributeContext code_attribute() throws RecognitionException {
		Code_attributeContext _localctx = new Code_attributeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_code_attribute);
		try {
			setState(74);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				variables();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(69);
				on_click();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(70);
				print();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(71);
				comment();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(72);
				if_statment();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(73);
				else_statment();
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

	public static class If_statmentContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(PARSERCONTROLLER.IF, 0); }
		public TerminalNode OPENTEXT() { return getToken(PARSERCONTROLLER.OPENTEXT, 0); }
		public List<TerminalNode> CHARS() { return getTokens(PARSERCONTROLLER.CHARS); }
		public TerminalNode CHARS(int i) {
			return getToken(PARSERCONTROLLER.CHARS, i);
		}
		public List<Operation_ifContext> operation_if() {
			return getRuleContexts(Operation_ifContext.class);
		}
		public Operation_ifContext operation_if(int i) {
			return getRuleContext(Operation_ifContext.class,i);
		}
		public TerminalNode CLOSETEXT() { return getToken(PARSERCONTROLLER.CLOSETEXT, 0); }
		public TerminalNode CURLYOPEN() { return getToken(PARSERCONTROLLER.CURLYOPEN, 0); }
		public TerminalNode CURLYCLOSE() { return getToken(PARSERCONTROLLER.CURLYCLOSE, 0); }
		public TerminalNode ELSE() { return getToken(PARSERCONTROLLER.ELSE, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(PARSERCONTROLLER.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(PARSERCONTROLLER.NUMBER, i);
		}
		public List<Logical_sympolContext> logical_sympol() {
			return getRuleContexts(Logical_sympolContext.class);
		}
		public Logical_sympolContext logical_sympol(int i) {
			return getRuleContext(Logical_sympolContext.class,i);
		}
		public List<Code_attributeContext> code_attribute() {
			return getRuleContexts(Code_attributeContext.class);
		}
		public Code_attributeContext code_attribute(int i) {
			return getRuleContext(Code_attributeContext.class,i);
		}
		public List<TerminalNode> SINGLE_QUOTE() { return getTokens(PARSERCONTROLLER.SINGLE_QUOTE); }
		public TerminalNode SINGLE_QUOTE(int i) {
			return getToken(PARSERCONTROLLER.SINGLE_QUOTE, i);
		}
		public If_statmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERCONTROLLERListener ) ((PARSERCONTROLLERListener)listener).enterIf_statment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERCONTROLLERListener ) ((PARSERCONTROLLERListener)listener).exitIf_statment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERCONTROLLERVisitor ) return ((PARSERCONTROLLERVisitor<? extends T>)visitor).visitIf_statment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statmentContext if_statment() throws RecognitionException {
		If_statmentContext _localctx = new If_statmentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_if_statment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(76);
				match(ELSE);
				}
			}

			setState(79);
			match(IF);
			setState(80);
			match(OPENTEXT);
			setState(81);
			match(CHARS);
			setState(82);
			operation_if();
			setState(87);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
			case CHARS:
				{
				setState(83);
				_la = _input.LA(1);
				if ( !(_la==NUMBER || _la==CHARS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case SINGLE_QUOTE:
				{
				{
				setState(84);
				match(SINGLE_QUOTE);
				setState(85);
				match(CHARS);
				setState(86);
				match(SINGLE_QUOTE);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR || _la==AND) {
				{
				{
				setState(89);
				logical_sympol();
				setState(93);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NUMBER:
					{
					setState(90);
					match(NUMBER);
					}
					break;
				case CHARS:
					{
					setState(91);
					match(CHARS);
					}
					break;
				case EQUALEQUAL:
				case NOT:
				case TAG_OPEN:
				case TAG_CLOSE:
					{
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(95);
				operation_if();
				setState(100);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NUMBER:
				case CHARS:
					{
					setState(96);
					_la = _input.LA(1);
					if ( !(_la==NUMBER || _la==CHARS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				case SINGLE_QUOTE:
					{
					{
					setState(97);
					match(SINGLE_QUOTE);
					setState(98);
					match(CHARS);
					setState(99);
					match(SINGLE_QUOTE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(107);
			match(CLOSETEXT);
			setState(108);
			match(CURLYOPEN);
			setState(110); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(109);
				code_attribute();
				}
				}
				setState(112); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << ELSE) | (1L << COMMENT) | (1L << PRINT) | (1L << CHARS))) != 0) );
			setState(114);
			match(CURLYCLOSE);
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

	public static class Logical_sympolContext extends ParserRuleContext {
		public TerminalNode OR() { return getToken(PARSERCONTROLLER.OR, 0); }
		public TerminalNode AND() { return getToken(PARSERCONTROLLER.AND, 0); }
		public Logical_sympolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_sympol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERCONTROLLERListener ) ((PARSERCONTROLLERListener)listener).enterLogical_sympol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERCONTROLLERListener ) ((PARSERCONTROLLERListener)listener).exitLogical_sympol(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERCONTROLLERVisitor ) return ((PARSERCONTROLLERVisitor<? extends T>)visitor).visitLogical_sympol(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logical_sympolContext logical_sympol() throws RecognitionException {
		Logical_sympolContext _localctx = new Logical_sympolContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_logical_sympol);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			_la = _input.LA(1);
			if ( !(_la==OR || _la==AND) ) {
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

	public static class Operation_ifContext extends ParserRuleContext {
		public TerminalNode EQUALEQUAL() { return getToken(PARSERCONTROLLER.EQUALEQUAL, 0); }
		public TerminalNode TAG_CLOSE() { return getToken(PARSERCONTROLLER.TAG_CLOSE, 0); }
		public TerminalNode TAG_OPEN() { return getToken(PARSERCONTROLLER.TAG_OPEN, 0); }
		public TerminalNode EQUAL() { return getToken(PARSERCONTROLLER.EQUAL, 0); }
		public TerminalNode NOT() { return getToken(PARSERCONTROLLER.NOT, 0); }
		public Operation_ifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERCONTROLLERListener ) ((PARSERCONTROLLERListener)listener).enterOperation_if(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERCONTROLLERListener ) ((PARSERCONTROLLERListener)listener).exitOperation_if(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERCONTROLLERVisitor ) return ((PARSERCONTROLLERVisitor<? extends T>)visitor).visitOperation_if(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operation_ifContext operation_if() throws RecognitionException {
		Operation_ifContext _localctx = new Operation_ifContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_operation_if);
		try {
			setState(127);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(118);
				match(EQUALEQUAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
				match(TAG_CLOSE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(120);
				match(TAG_OPEN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(121);
				match(TAG_CLOSE);
				setState(122);
				match(EQUAL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(123);
				match(TAG_OPEN);
				setState(124);
				match(EQUAL);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(125);
				match(NOT);
				setState(126);
				match(EQUAL);
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

	public static class Else_statmentContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(PARSERCONTROLLER.ELSE, 0); }
		public TerminalNode CURLYOPEN() { return getToken(PARSERCONTROLLER.CURLYOPEN, 0); }
		public TerminalNode CURLYCLOSE() { return getToken(PARSERCONTROLLER.CURLYCLOSE, 0); }
		public List<Code_attributeContext> code_attribute() {
			return getRuleContexts(Code_attributeContext.class);
		}
		public Code_attributeContext code_attribute(int i) {
			return getRuleContext(Code_attributeContext.class,i);
		}
		public Else_statmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_statment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERCONTROLLERListener ) ((PARSERCONTROLLERListener)listener).enterElse_statment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERCONTROLLERListener ) ((PARSERCONTROLLERListener)listener).exitElse_statment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERCONTROLLERVisitor ) return ((PARSERCONTROLLERVisitor<? extends T>)visitor).visitElse_statment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_statmentContext else_statment() throws RecognitionException {
		Else_statmentContext _localctx = new Else_statmentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_else_statment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(ELSE);
			setState(130);
			match(CURLYOPEN);
			setState(132); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(131);
				code_attribute();
				}
				}
				setState(134); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << ELSE) | (1L << COMMENT) | (1L << PRINT) | (1L << CHARS))) != 0) );
			setState(136);
			match(CURLYCLOSE);
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

	public static class CommentContext extends ParserRuleContext {
		public TerminalNode COMMENT() { return getToken(PARSERCONTROLLER.COMMENT, 0); }
		public TerminalNode CHARS() { return getToken(PARSERCONTROLLER.CHARS, 0); }
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERCONTROLLERListener ) ((PARSERCONTROLLERListener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERCONTROLLERListener ) ((PARSERCONTROLLERListener)listener).exitComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERCONTROLLERVisitor ) return ((PARSERCONTROLLERVisitor<? extends T>)visitor).visitComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_comment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(COMMENT);
			setState(139);
			match(CHARS);
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

	public static class On_clickContext extends ParserRuleContext {
		public TerminalNode CHARS() { return getToken(PARSERCONTROLLER.CHARS, 0); }
		public TerminalNode DOT() { return getToken(PARSERCONTROLLER.DOT, 0); }
		public TerminalNode ON_CLICK() { return getToken(PARSERCONTROLLER.ON_CLICK, 0); }
		public TerminalNode OPENTEXT() { return getToken(PARSERCONTROLLER.OPENTEXT, 0); }
		public TerminalNode CLOSETEXT() { return getToken(PARSERCONTROLLER.CLOSETEXT, 0); }
		public TerminalNode CURLYOPEN() { return getToken(PARSERCONTROLLER.CURLYOPEN, 0); }
		public List<Click_attributeContext> click_attribute() {
			return getRuleContexts(Click_attributeContext.class);
		}
		public Click_attributeContext click_attribute(int i) {
			return getRuleContext(Click_attributeContext.class,i);
		}
		public TerminalNode CURLYCLOSE() { return getToken(PARSERCONTROLLER.CURLYCLOSE, 0); }
		public TerminalNode SEMICOLON() { return getToken(PARSERCONTROLLER.SEMICOLON, 0); }
		public List<TerminalNode> COMMA() { return getTokens(PARSERCONTROLLER.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PARSERCONTROLLER.COMMA, i);
		}
		public On_clickContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_on_click; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERCONTROLLERListener ) ((PARSERCONTROLLERListener)listener).enterOn_click(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERCONTROLLERListener ) ((PARSERCONTROLLERListener)listener).exitOn_click(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERCONTROLLERVisitor ) return ((PARSERCONTROLLERVisitor<? extends T>)visitor).visitOn_click(this);
			else return visitor.visitChildren(this);
		}
	}

	public final On_clickContext on_click() throws RecognitionException {
		On_clickContext _localctx = new On_clickContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_on_click);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(CHARS);
			setState(142);
			match(DOT);
			setState(143);
			match(ON_CLICK);
			setState(144);
			match(OPENTEXT);
			setState(145);
			match(CLOSETEXT);
			setState(146);
			match(CURLYOPEN);
			setState(152);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(147);
					click_attribute();
					setState(148);
					match(COMMA);
					}
					} 
				}
				setState(154);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			setState(155);
			click_attribute();
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(156);
				match(COMMA);
				}
			}

			setState(159);
			match(CURLYCLOSE);
			setState(160);
			match(SEMICOLON);
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

	public static class Click_attributeContext extends ParserRuleContext {
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public ButtonContext button() {
			return getRuleContext(ButtonContext.class,0);
		}
		public Click_attributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_click_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERCONTROLLERListener ) ((PARSERCONTROLLERListener)listener).enterClick_attribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERCONTROLLERListener ) ((PARSERCONTROLLERListener)listener).exitClick_attribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERCONTROLLERVisitor ) return ((PARSERCONTROLLERVisitor<? extends T>)visitor).visitClick_attribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Click_attributeContext click_attribute() throws RecognitionException {
		Click_attributeContext _localctx = new Click_attributeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_click_attribute);
		try {
			setState(164);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				text();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
				button();
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

	public static class TextContext extends ParserRuleContext {
		public TerminalNode CHARS() { return getToken(PARSERCONTROLLER.CHARS, 0); }
		public TerminalNode DOT() { return getToken(PARSERCONTROLLER.DOT, 0); }
		public Text_attributeContext text_attribute() {
			return getRuleContext(Text_attributeContext.class,0);
		}
		public TextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERCONTROLLERListener ) ((PARSERCONTROLLERListener)listener).enterText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERCONTROLLERListener ) ((PARSERCONTROLLERListener)listener).exitText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERCONTROLLERVisitor ) return ((PARSERCONTROLLERVisitor<? extends T>)visitor).visitText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextContext text() throws RecognitionException {
		TextContext _localctx = new TextContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_text);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(CHARS);
			setState(167);
			match(DOT);
			setState(168);
			text_attribute();
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

	public static class Text_attributeContext extends ParserRuleContext {
		public ColorContext color() {
			return getRuleContext(ColorContext.class,0);
		}
		public ContentContext content() {
			return getRuleContext(ContentContext.class,0);
		}
		public Text_attributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERCONTROLLERListener ) ((PARSERCONTROLLERListener)listener).enterText_attribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERCONTROLLERListener ) ((PARSERCONTROLLERListener)listener).exitText_attribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERCONTROLLERVisitor ) return ((PARSERCONTROLLERVisitor<? extends T>)visitor).visitText_attribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Text_attributeContext text_attribute() throws RecognitionException {
		Text_attributeContext _localctx = new Text_attributeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_text_attribute);
		try {
			setState(172);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COLOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				color();
				}
				break;
			case CONTENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(171);
				content();
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

	public static class ContentContext extends ParserRuleContext {
		public TerminalNode CONTENT() { return getToken(PARSERCONTROLLER.CONTENT, 0); }
		public TerminalNode EQUAL() { return getToken(PARSERCONTROLLER.EQUAL, 0); }
		public List<TerminalNode> SINGLE_QUOTE() { return getTokens(PARSERCONTROLLER.SINGLE_QUOTE); }
		public TerminalNode SINGLE_QUOTE(int i) {
			return getToken(PARSERCONTROLLER.SINGLE_QUOTE, i);
		}
		public TerminalNode CHARS() { return getToken(PARSERCONTROLLER.CHARS, 0); }
		public ContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_content; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERCONTROLLERListener ) ((PARSERCONTROLLERListener)listener).enterContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERCONTROLLERListener ) ((PARSERCONTROLLERListener)listener).exitContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERCONTROLLERVisitor ) return ((PARSERCONTROLLERVisitor<? extends T>)visitor).visitContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContentContext content() throws RecognitionException {
		ContentContext _localctx = new ContentContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_content);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(CONTENT);
			setState(175);
			match(EQUAL);
			setState(176);
			match(SINGLE_QUOTE);
			setState(177);
			match(CHARS);
			setState(178);
			match(SINGLE_QUOTE);
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

	public static class ColorContext extends ParserRuleContext {
		public TerminalNode COLOR() { return getToken(PARSERCONTROLLER.COLOR, 0); }
		public TerminalNode EQUAL() { return getToken(PARSERCONTROLLER.EQUAL, 0); }
		public List<TerminalNode> SINGLE_QUOTE() { return getTokens(PARSERCONTROLLER.SINGLE_QUOTE); }
		public TerminalNode SINGLE_QUOTE(int i) {
			return getToken(PARSERCONTROLLER.SINGLE_QUOTE, i);
		}
		public TerminalNode COLORS() { return getToken(PARSERCONTROLLER.COLORS, 0); }
		public ColorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_color; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERCONTROLLERListener ) ((PARSERCONTROLLERListener)listener).enterColor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERCONTROLLERListener ) ((PARSERCONTROLLERListener)listener).exitColor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERCONTROLLERVisitor ) return ((PARSERCONTROLLERVisitor<? extends T>)visitor).visitColor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColorContext color() throws RecognitionException {
		ColorContext _localctx = new ColorContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_color);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(COLOR);
			setState(181);
			match(EQUAL);
			setState(182);
			match(SINGLE_QUOTE);
			setState(183);
			match(COLORS);
			setState(184);
			match(SINGLE_QUOTE);
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

	public static class ButtonContext extends ParserRuleContext {
		public TerminalNode CHARS() { return getToken(PARSERCONTROLLER.CHARS, 0); }
		public TerminalNode DOT() { return getToken(PARSERCONTROLLER.DOT, 0); }
		public Button_attributeContext button_attribute() {
			return getRuleContext(Button_attributeContext.class,0);
		}
		public ButtonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_button; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERCONTROLLERListener ) ((PARSERCONTROLLERListener)listener).enterButton(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERCONTROLLERListener ) ((PARSERCONTROLLERListener)listener).exitButton(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERCONTROLLERVisitor ) return ((PARSERCONTROLLERVisitor<? extends T>)visitor).visitButton(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ButtonContext button() throws RecognitionException {
		ButtonContext _localctx = new ButtonContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_button);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(CHARS);
			setState(187);
			match(DOT);
			setState(188);
			button_attribute();
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

	public static class Button_attributeContext extends ParserRuleContext {
		public WidthContext width() {
			return getRuleContext(WidthContext.class,0);
		}
		public BackgroundContext background() {
			return getRuleContext(BackgroundContext.class,0);
		}
		public Button_attributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_button_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERCONTROLLERListener ) ((PARSERCONTROLLERListener)listener).enterButton_attribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERCONTROLLERListener ) ((PARSERCONTROLLERListener)listener).exitButton_attribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERCONTROLLERVisitor ) return ((PARSERCONTROLLERVisitor<? extends T>)visitor).visitButton_attribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Button_attributeContext button_attribute() throws RecognitionException {
		Button_attributeContext _localctx = new Button_attributeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_button_attribute);
		try {
			setState(192);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WIDTH:
				enterOuterAlt(_localctx, 1);
				{
				setState(190);
				width();
				}
				break;
			case BACKGROUND:
				enterOuterAlt(_localctx, 2);
				{
				setState(191);
				background();
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

	public static class WidthContext extends ParserRuleContext {
		public TerminalNode WIDTH() { return getToken(PARSERCONTROLLER.WIDTH, 0); }
		public TerminalNode EQUAL() { return getToken(PARSERCONTROLLER.EQUAL, 0); }
		public List<TerminalNode> SINGLE_QUOTE() { return getTokens(PARSERCONTROLLER.SINGLE_QUOTE); }
		public TerminalNode SINGLE_QUOTE(int i) {
			return getToken(PARSERCONTROLLER.SINGLE_QUOTE, i);
		}
		public TerminalNode SIZES() { return getToken(PARSERCONTROLLER.SIZES, 0); }
		public WidthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_width; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERCONTROLLERListener ) ((PARSERCONTROLLERListener)listener).enterWidth(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERCONTROLLERListener ) ((PARSERCONTROLLERListener)listener).exitWidth(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERCONTROLLERVisitor ) return ((PARSERCONTROLLERVisitor<? extends T>)visitor).visitWidth(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WidthContext width() throws RecognitionException {
		WidthContext _localctx = new WidthContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_width);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(WIDTH);
			setState(195);
			match(EQUAL);
			setState(196);
			match(SINGLE_QUOTE);
			setState(197);
			match(SIZES);
			setState(198);
			match(SINGLE_QUOTE);
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

	public static class BackgroundContext extends ParserRuleContext {
		public TerminalNode BACKGROUND() { return getToken(PARSERCONTROLLER.BACKGROUND, 0); }
		public TerminalNode EQUAL() { return getToken(PARSERCONTROLLER.EQUAL, 0); }
		public List<TerminalNode> SINGLE_QUOTE() { return getTokens(PARSERCONTROLLER.SINGLE_QUOTE); }
		public TerminalNode SINGLE_QUOTE(int i) {
			return getToken(PARSERCONTROLLER.SINGLE_QUOTE, i);
		}
		public TerminalNode COLORS() { return getToken(PARSERCONTROLLER.COLORS, 0); }
		public BackgroundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_background; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERCONTROLLERListener ) ((PARSERCONTROLLERListener)listener).enterBackground(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERCONTROLLERListener ) ((PARSERCONTROLLERListener)listener).exitBackground(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERCONTROLLERVisitor ) return ((PARSERCONTROLLERVisitor<? extends T>)visitor).visitBackground(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BackgroundContext background() throws RecognitionException {
		BackgroundContext _localctx = new BackgroundContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_background);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(BACKGROUND);
			setState(201);
			match(EQUAL);
			setState(202);
			match(SINGLE_QUOTE);
			setState(203);
			match(COLORS);
			setState(204);
			match(SINGLE_QUOTE);
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

	public static class PrintContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(PARSERCONTROLLER.PRINT, 0); }
		public TerminalNode OPENTEXT() { return getToken(PARSERCONTROLLER.OPENTEXT, 0); }
		public PrintattributeContext printattribute() {
			return getRuleContext(PrintattributeContext.class,0);
		}
		public TerminalNode CLOSETEXT() { return getToken(PARSERCONTROLLER.CLOSETEXT, 0); }
		public TerminalNode SEMICOLON() { return getToken(PARSERCONTROLLER.SEMICOLON, 0); }
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERCONTROLLERListener ) ((PARSERCONTROLLERListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERCONTROLLERListener ) ((PARSERCONTROLLERListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERCONTROLLERVisitor ) return ((PARSERCONTROLLERVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(PRINT);
			setState(207);
			match(OPENTEXT);
			setState(208);
			printattribute();
			setState(209);
			match(CLOSETEXT);
			setState(210);
			match(SEMICOLON);
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

	public static class PrintattributeContext extends ParserRuleContext {
		public GetdataContext getdata() {
			return getRuleContext(GetdataContext.class,0);
		}
		public Print_textContext print_text() {
			return getRuleContext(Print_textContext.class,0);
		}
		public TerminalNode CHARS() { return getToken(PARSERCONTROLLER.CHARS, 0); }
		public PrintattributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printattribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERCONTROLLERListener ) ((PARSERCONTROLLERListener)listener).enterPrintattribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERCONTROLLERListener ) ((PARSERCONTROLLERListener)listener).exitPrintattribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERCONTROLLERVisitor ) return ((PARSERCONTROLLERVisitor<? extends T>)visitor).visitPrintattribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintattributeContext printattribute() throws RecognitionException {
		PrintattributeContext _localctx = new PrintattributeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_printattribute);
		try {
			setState(215);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GET_DATA:
				enterOuterAlt(_localctx, 1);
				{
				setState(212);
				getdata();
				}
				break;
			case DOUBLE_QUOTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(213);
				print_text();
				}
				break;
			case CHARS:
				enterOuterAlt(_localctx, 3);
				{
				setState(214);
				match(CHARS);
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

	public static class GetdataContext extends ParserRuleContext {
		public TerminalNode GET_DATA() { return getToken(PARSERCONTROLLER.GET_DATA, 0); }
		public TerminalNode OPENTEXT() { return getToken(PARSERCONTROLLER.OPENTEXT, 0); }
		public TerminalNode CHARS() { return getToken(PARSERCONTROLLER.CHARS, 0); }
		public TerminalNode CLOSETEXT() { return getToken(PARSERCONTROLLER.CLOSETEXT, 0); }
		public GetdataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getdata; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERCONTROLLERListener ) ((PARSERCONTROLLERListener)listener).enterGetdata(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERCONTROLLERListener ) ((PARSERCONTROLLERListener)listener).exitGetdata(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERCONTROLLERVisitor ) return ((PARSERCONTROLLERVisitor<? extends T>)visitor).visitGetdata(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GetdataContext getdata() throws RecognitionException {
		GetdataContext _localctx = new GetdataContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_getdata);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(GET_DATA);
			setState(218);
			match(OPENTEXT);
			setState(219);
			match(CHARS);
			setState(220);
			match(CLOSETEXT);
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

	public static class Print_textContext extends ParserRuleContext {
		public List<TerminalNode> DOUBLE_QUOTE() { return getTokens(PARSERCONTROLLER.DOUBLE_QUOTE); }
		public TerminalNode DOUBLE_QUOTE(int i) {
			return getToken(PARSERCONTROLLER.DOUBLE_QUOTE, i);
		}
		public TerminalNode CHARS() { return getToken(PARSERCONTROLLER.CHARS, 0); }
		public Print_textContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_text; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERCONTROLLERListener ) ((PARSERCONTROLLERListener)listener).enterPrint_text(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERCONTROLLERListener ) ((PARSERCONTROLLERListener)listener).exitPrint_text(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERCONTROLLERVisitor ) return ((PARSERCONTROLLERVisitor<? extends T>)visitor).visitPrint_text(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Print_textContext print_text() throws RecognitionException {
		Print_textContext _localctx = new Print_textContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_print_text);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(DOUBLE_QUOTE);
			setState(223);
			match(CHARS);
			setState(224);
			match(DOUBLE_QUOTE);
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

	public static class VariablesContext extends ParserRuleContext {
		public Variable_numberContext variable_number() {
			return getRuleContext(Variable_numberContext.class,0);
		}
		public Variable_textContext variable_text() {
			return getRuleContext(Variable_textContext.class,0);
		}
		public Variable_getContext variable_get() {
			return getRuleContext(Variable_getContext.class,0);
		}
		public TextinputContext textinput() {
			return getRuleContext(TextinputContext.class,0);
		}
		public VariablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERCONTROLLERListener ) ((PARSERCONTROLLERListener)listener).enterVariables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERCONTROLLERListener ) ((PARSERCONTROLLERListener)listener).exitVariables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERCONTROLLERVisitor ) return ((PARSERCONTROLLERVisitor<? extends T>)visitor).visitVariables(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariablesContext variables() throws RecognitionException {
		VariablesContext _localctx = new VariablesContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_variables);
		try {
			setState(230);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(226);
				variable_number();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(227);
				variable_text();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(228);
				variable_get();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(229);
				textinput();
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

	public static class Variable_numberContext extends ParserRuleContext {
		public List<TerminalNode> CHARS() { return getTokens(PARSERCONTROLLER.CHARS); }
		public TerminalNode CHARS(int i) {
			return getToken(PARSERCONTROLLER.CHARS, i);
		}
		public TerminalNode EQUAL() { return getToken(PARSERCONTROLLER.EQUAL, 0); }
		public TerminalNode SEMICOLON() { return getToken(PARSERCONTROLLER.SEMICOLON, 0); }
		public List<Number_attributeContext> number_attribute() {
			return getRuleContexts(Number_attributeContext.class);
		}
		public Number_attributeContext number_attribute(int i) {
			return getRuleContext(Number_attributeContext.class,i);
		}
		public Adding_oneContext adding_one() {
			return getRuleContext(Adding_oneContext.class,0);
		}
		public Minus_oneContext minus_one() {
			return getRuleContext(Minus_oneContext.class,0);
		}
		public Fast_mathContext fast_math() {
			return getRuleContext(Fast_mathContext.class,0);
		}
		public Variable_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERCONTROLLERListener ) ((PARSERCONTROLLERListener)listener).enterVariable_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERCONTROLLERListener ) ((PARSERCONTROLLERListener)listener).exitVariable_number(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERCONTROLLERVisitor ) return ((PARSERCONTROLLERVisitor<? extends T>)visitor).visitVariable_number(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_numberContext variable_number() throws RecognitionException {
		Variable_numberContext _localctx = new Variable_numberContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_variable_number);
		int _la;
		try {
			setState(247);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(232);
				match(CHARS);
				setState(233);
				match(EQUAL);
				setState(234);
				match(CHARS);
				setState(240);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUM) | (1L << DIVID) | (1L << MULTIPLY) | (1L << MINUS))) != 0)) {
					{
					{
					setState(235);
					number_attribute();
					setState(236);
					match(CHARS);
					}
					}
					setState(242);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(243);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(244);
				adding_one();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(245);
				minus_one();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(246);
				fast_math();
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

	public static class Fast_mathContext extends ParserRuleContext {
		public TerminalNode CHARS() { return getToken(PARSERCONTROLLER.CHARS, 0); }
		public TerminalNode NUMBER() { return getToken(PARSERCONTROLLER.NUMBER, 0); }
		public TerminalNode SEMICOLON() { return getToken(PARSERCONTROLLER.SEMICOLON, 0); }
		public TerminalNode SUM_EQUAL() { return getToken(PARSERCONTROLLER.SUM_EQUAL, 0); }
		public TerminalNode MINUS_EQUAL() { return getToken(PARSERCONTROLLER.MINUS_EQUAL, 0); }
		public TerminalNode DIVID_EQUAL() { return getToken(PARSERCONTROLLER.DIVID_EQUAL, 0); }
		public TerminalNode MULTIPLY_EQUAL() { return getToken(PARSERCONTROLLER.MULTIPLY_EQUAL, 0); }
		public Fast_mathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fast_math; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERCONTROLLERListener ) ((PARSERCONTROLLERListener)listener).enterFast_math(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERCONTROLLERListener ) ((PARSERCONTROLLERListener)listener).exitFast_math(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERCONTROLLERVisitor ) return ((PARSERCONTROLLERVisitor<? extends T>)visitor).visitFast_math(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fast_mathContext fast_math() throws RecognitionException {
		Fast_mathContext _localctx = new Fast_mathContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_fast_math);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(CHARS);
			setState(250);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUM_EQUAL) | (1L << MINUS_EQUAL) | (1L << DIVID_EQUAL) | (1L << MULTIPLY_EQUAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(251);
			match(NUMBER);
			setState(252);
			match(SEMICOLON);
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

	public static class Adding_oneContext extends ParserRuleContext {
		public TerminalNode CHARS() { return getToken(PARSERCONTROLLER.CHARS, 0); }
		public TerminalNode SUMS() { return getToken(PARSERCONTROLLER.SUMS, 0); }
		public TerminalNode SEMICOLON() { return getToken(PARSERCONTROLLER.SEMICOLON, 0); }
		public Adding_oneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_adding_one; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERCONTROLLERListener ) ((PARSERCONTROLLERListener)listener).enterAdding_one(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERCONTROLLERListener ) ((PARSERCONTROLLERListener)listener).exitAdding_one(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERCONTROLLERVisitor ) return ((PARSERCONTROLLERVisitor<? extends T>)visitor).visitAdding_one(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Adding_oneContext adding_one() throws RecognitionException {
		Adding_oneContext _localctx = new Adding_oneContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_adding_one);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			match(CHARS);
			setState(255);
			match(SUMS);
			setState(256);
			match(SEMICOLON);
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

	public static class Minus_oneContext extends ParserRuleContext {
		public TerminalNode CHARS() { return getToken(PARSERCONTROLLER.CHARS, 0); }
		public TerminalNode MINUSS() { return getToken(PARSERCONTROLLER.MINUSS, 0); }
		public TerminalNode SEMICOLON() { return getToken(PARSERCONTROLLER.SEMICOLON, 0); }
		public Minus_oneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_minus_one; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERCONTROLLERListener ) ((PARSERCONTROLLERListener)listener).enterMinus_one(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERCONTROLLERListener ) ((PARSERCONTROLLERListener)listener).exitMinus_one(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERCONTROLLERVisitor ) return ((PARSERCONTROLLERVisitor<? extends T>)visitor).visitMinus_one(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Minus_oneContext minus_one() throws RecognitionException {
		Minus_oneContext _localctx = new Minus_oneContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_minus_one);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			match(CHARS);
			setState(259);
			match(MINUSS);
			setState(260);
			match(SEMICOLON);
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

	public static class Number_attributeContext extends ParserRuleContext {
		public TerminalNode SUM() { return getToken(PARSERCONTROLLER.SUM, 0); }
		public TerminalNode DIVID() { return getToken(PARSERCONTROLLER.DIVID, 0); }
		public TerminalNode MULTIPLY() { return getToken(PARSERCONTROLLER.MULTIPLY, 0); }
		public TerminalNode MINUS() { return getToken(PARSERCONTROLLER.MINUS, 0); }
		public Number_attributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERCONTROLLERListener ) ((PARSERCONTROLLERListener)listener).enterNumber_attribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERCONTROLLERListener ) ((PARSERCONTROLLERListener)listener).exitNumber_attribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERCONTROLLERVisitor ) return ((PARSERCONTROLLERVisitor<? extends T>)visitor).visitNumber_attribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Number_attributeContext number_attribute() throws RecognitionException {
		Number_attributeContext _localctx = new Number_attributeContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_number_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUM) | (1L << DIVID) | (1L << MULTIPLY) | (1L << MINUS))) != 0)) ) {
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

	public static class Variable_textContext extends ParserRuleContext {
		public List<TerminalNode> CHARS() { return getTokens(PARSERCONTROLLER.CHARS); }
		public TerminalNode CHARS(int i) {
			return getToken(PARSERCONTROLLER.CHARS, i);
		}
		public TerminalNode EQUAL() { return getToken(PARSERCONTROLLER.EQUAL, 0); }
		public List<TerminalNode> SINGLE_QUOTE() { return getTokens(PARSERCONTROLLER.SINGLE_QUOTE); }
		public TerminalNode SINGLE_QUOTE(int i) {
			return getToken(PARSERCONTROLLER.SINGLE_QUOTE, i);
		}
		public TerminalNode SEMICOLON() { return getToken(PARSERCONTROLLER.SEMICOLON, 0); }
		public List<TerminalNode> SUM() { return getTokens(PARSERCONTROLLER.SUM); }
		public TerminalNode SUM(int i) {
			return getToken(PARSERCONTROLLER.SUM, i);
		}
		public TerminalNode DOT() { return getToken(PARSERCONTROLLER.DOT, 0); }
		public TerminalNode CONTENT() { return getToken(PARSERCONTROLLER.CONTENT, 0); }
		public Variable_textContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_text; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERCONTROLLERListener ) ((PARSERCONTROLLERListener)listener).enterVariable_text(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERCONTROLLERListener ) ((PARSERCONTROLLERListener)listener).exitVariable_text(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERCONTROLLERVisitor ) return ((PARSERCONTROLLERVisitor<? extends T>)visitor).visitVariable_text(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_textContext variable_text() throws RecognitionException {
		Variable_textContext _localctx = new Variable_textContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_variable_text);
		int _la;
		try {
			setState(285);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(264);
				match(CHARS);
				setState(265);
				match(EQUAL);
				setState(266);
				match(SINGLE_QUOTE);
				setState(267);
				match(CHARS);
				setState(268);
				match(SINGLE_QUOTE);
				setState(275);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SUM) {
					{
					{
					setState(269);
					match(SUM);
					setState(270);
					match(SINGLE_QUOTE);
					setState(271);
					match(CHARS);
					setState(272);
					match(SINGLE_QUOTE);
					}
					}
					setState(277);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(278);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(279);
				match(CHARS);
				setState(280);
				match(EQUAL);
				setState(281);
				match(CHARS);
				setState(282);
				match(DOT);
				setState(283);
				match(CONTENT);
				setState(284);
				match(SEMICOLON);
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

	public static class Variable_getContext extends ParserRuleContext {
		public TerminalNode CHARS() { return getToken(PARSERCONTROLLER.CHARS, 0); }
		public TerminalNode EQUAL() { return getToken(PARSERCONTROLLER.EQUAL, 0); }
		public GetdataContext getdata() {
			return getRuleContext(GetdataContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(PARSERCONTROLLER.SEMICOLON, 0); }
		public Variable_getContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_get; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERCONTROLLERListener ) ((PARSERCONTROLLERListener)listener).enterVariable_get(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERCONTROLLERListener ) ((PARSERCONTROLLERListener)listener).exitVariable_get(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERCONTROLLERVisitor ) return ((PARSERCONTROLLERVisitor<? extends T>)visitor).visitVariable_get(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_getContext variable_get() throws RecognitionException {
		Variable_getContext _localctx = new Variable_getContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_variable_get);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			match(CHARS);
			setState(288);
			match(EQUAL);
			setState(289);
			getdata();
			setState(290);
			match(SEMICOLON);
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

	public static class TextinputContext extends ParserRuleContext {
		public List<TerminalNode> CHARS() { return getTokens(PARSERCONTROLLER.CHARS); }
		public TerminalNode CHARS(int i) {
			return getToken(PARSERCONTROLLER.CHARS, i);
		}
		public TerminalNode EQUAL() { return getToken(PARSERCONTROLLER.EQUAL, 0); }
		public TerminalNode DOT() { return getToken(PARSERCONTROLLER.DOT, 0); }
		public TerminalNode CONTENT() { return getToken(PARSERCONTROLLER.CONTENT, 0); }
		public TerminalNode SEMICOLON() { return getToken(PARSERCONTROLLER.SEMICOLON, 0); }
		public TextinputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textinput; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERCONTROLLERListener ) ((PARSERCONTROLLERListener)listener).enterTextinput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERCONTROLLERListener ) ((PARSERCONTROLLERListener)listener).exitTextinput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERCONTROLLERVisitor ) return ((PARSERCONTROLLERVisitor<? extends T>)visitor).visitTextinput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextinputContext textinput() throws RecognitionException {
		TextinputContext _localctx = new TextinputContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_textinput);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			match(CHARS);
			setState(293);
			match(EQUAL);
			setState(294);
			match(CHARS);
			setState(295);
			match(DOT);
			setState(296);
			match(CONTENT);
			setState(297);
			match(SEMICOLON);
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
		"\u0004\u0001-\u012c\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0004\u0000A\b\u0000\u000b\u0000\f\u0000B\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u0001K\b\u0001\u0001\u0002\u0003\u0002N\b\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002X\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002^\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002e\b\u0002\u0005\u0002g\b\u0002\n\u0002\f\u0002"+
		"j\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0004\u0002o\b\u0002\u000b"+
		"\u0002\f\u0002p\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u0080\b\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0004\u0005\u0085\b\u0005\u000b\u0005\f\u0005\u0086"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0005\u0007\u0097\b\u0007\n\u0007\f\u0007\u009a"+
		"\t\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u009e\b\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0003\b\u00a5\b\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\n\u0001\n\u0003\n\u00ad\b\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0003\u000e\u00c1\b\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0003\u0012\u00d8\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u00e7\b\u0015\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0005"+
		"\u0016\u00ef\b\u0016\n\u0016\f\u0016\u00f2\t\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0003\u0016\u00f8\b\u0016\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a"+
		"\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0005\u001b\u0112\b\u001b"+
		"\n\u001b\f\u001b\u0115\t\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u011e\b\u001b\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0000\u0000\u001e\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:\u0000\u0004\u0002"+
		"\u0000++--\u0001\u0000\u0013\u0014\u0001\u0000\u000f\u0012\u0001\u0000"+
		"\u0007\n\u0130\u0000<\u0001\u0000\u0000\u0000\u0002J\u0001\u0000\u0000"+
		"\u0000\u0004M\u0001\u0000\u0000\u0000\u0006t\u0001\u0000\u0000\u0000\b"+
		"\u007f\u0001\u0000\u0000\u0000\n\u0081\u0001\u0000\u0000\u0000\f\u008a"+
		"\u0001\u0000\u0000\u0000\u000e\u008d\u0001\u0000\u0000\u0000\u0010\u00a4"+
		"\u0001\u0000\u0000\u0000\u0012\u00a6\u0001\u0000\u0000\u0000\u0014\u00ac"+
		"\u0001\u0000\u0000\u0000\u0016\u00ae\u0001\u0000\u0000\u0000\u0018\u00b4"+
		"\u0001\u0000\u0000\u0000\u001a\u00ba\u0001\u0000\u0000\u0000\u001c\u00c0"+
		"\u0001\u0000\u0000\u0000\u001e\u00c2\u0001\u0000\u0000\u0000 \u00c8\u0001"+
		"\u0000\u0000\u0000\"\u00ce\u0001\u0000\u0000\u0000$\u00d7\u0001\u0000"+
		"\u0000\u0000&\u00d9\u0001\u0000\u0000\u0000(\u00de\u0001\u0000\u0000\u0000"+
		"*\u00e6\u0001\u0000\u0000\u0000,\u00f7\u0001\u0000\u0000\u0000.\u00f9"+
		"\u0001\u0000\u0000\u00000\u00fe\u0001\u0000\u0000\u00002\u0102\u0001\u0000"+
		"\u0000\u00004\u0106\u0001\u0000\u0000\u00006\u011d\u0001\u0000\u0000\u0000"+
		"8\u011f\u0001\u0000\u0000\u0000:\u0124\u0001\u0000\u0000\u0000<=\u0005"+
		"\"\u0000\u0000=>\u0005(\u0000\u0000>@\u0005\'\u0000\u0000?A\u0003\u0002"+
		"\u0001\u0000@?\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000B@\u0001"+
		"\u0000\u0000\u0000BC\u0001\u0000\u0000\u0000C\u0001\u0001\u0000\u0000"+
		"\u0000DK\u0003*\u0015\u0000EK\u0003\u000e\u0007\u0000FK\u0003\"\u0011"+
		"\u0000GK\u0003\f\u0006\u0000HK\u0003\u0004\u0002\u0000IK\u0003\n\u0005"+
		"\u0000JD\u0001\u0000\u0000\u0000JE\u0001\u0000\u0000\u0000JF\u0001\u0000"+
		"\u0000\u0000JG\u0001\u0000\u0000\u0000JH\u0001\u0000\u0000\u0000JI\u0001"+
		"\u0000\u0000\u0000K\u0003\u0001\u0000\u0000\u0000LN\u0005\u0018\u0000"+
		"\u0000ML\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000NO\u0001\u0000"+
		"\u0000\u0000OP\u0005\u0017\u0000\u0000PQ\u0005\u000b\u0000\u0000QR\u0005"+
		"-\u0000\u0000RW\u0003\b\u0004\u0000SX\u0007\u0000\u0000\u0000TU\u0005"+
		"*\u0000\u0000UV\u0005-\u0000\u0000VX\u0005*\u0000\u0000WS\u0001\u0000"+
		"\u0000\u0000WT\u0001\u0000\u0000\u0000Xh\u0001\u0000\u0000\u0000Y]\u0003"+
		"\u0006\u0003\u0000Z^\u0005+\u0000\u0000[^\u0005-\u0000\u0000\\^\u0001"+
		"\u0000\u0000\u0000]Z\u0001\u0000\u0000\u0000][\u0001\u0000\u0000\u0000"+
		"]\\\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000_d\u0003\b\u0004"+
		"\u0000`e\u0007\u0000\u0000\u0000ab\u0005*\u0000\u0000bc\u0005-\u0000\u0000"+
		"ce\u0005*\u0000\u0000d`\u0001\u0000\u0000\u0000da\u0001\u0000\u0000\u0000"+
		"eg\u0001\u0000\u0000\u0000fY\u0001\u0000\u0000\u0000gj\u0001\u0000\u0000"+
		"\u0000hf\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000ik\u0001\u0000"+
		"\u0000\u0000jh\u0001\u0000\u0000\u0000kl\u0005\f\u0000\u0000ln\u0005\u0005"+
		"\u0000\u0000mo\u0003\u0002\u0001\u0000nm\u0001\u0000\u0000\u0000op\u0001"+
		"\u0000\u0000\u0000pn\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000"+
		"qr\u0001\u0000\u0000\u0000rs\u0005\u0006\u0000\u0000s\u0005\u0001\u0000"+
		"\u0000\u0000tu\u0007\u0001\u0000\u0000u\u0007\u0001\u0000\u0000\u0000"+
		"v\u0080\u0005\u0015\u0000\u0000w\u0080\u0005\'\u0000\u0000x\u0080\u0005"+
		"\"\u0000\u0000yz\u0005\'\u0000\u0000z\u0080\u0005)\u0000\u0000{|\u0005"+
		"\"\u0000\u0000|\u0080\u0005)\u0000\u0000}~\u0005\u0016\u0000\u0000~\u0080"+
		"\u0005)\u0000\u0000\u007fv\u0001\u0000\u0000\u0000\u007fw\u0001\u0000"+
		"\u0000\u0000\u007fx\u0001\u0000\u0000\u0000\u007fy\u0001\u0000\u0000\u0000"+
		"\u007f{\u0001\u0000\u0000\u0000\u007f}\u0001\u0000\u0000\u0000\u0080\t"+
		"\u0001\u0000\u0000\u0000\u0081\u0082\u0005\u0018\u0000\u0000\u0082\u0084"+
		"\u0005\u0005\u0000\u0000\u0083\u0085\u0003\u0002\u0001\u0000\u0084\u0083"+
		"\u0001\u0000\u0000\u0000\u0085\u0086\u0001\u0000\u0000\u0000\u0086\u0084"+
		"\u0001\u0000\u0000\u0000\u0086\u0087\u0001\u0000\u0000\u0000\u0087\u0088"+
		"\u0001\u0000\u0000\u0000\u0088\u0089\u0005\u0006\u0000\u0000\u0089\u000b"+
		"\u0001\u0000\u0000\u0000\u008a\u008b\u0005 \u0000\u0000\u008b\u008c\u0005"+
		"-\u0000\u0000\u008c\r\u0001\u0000\u0000\u0000\u008d\u008e\u0005-\u0000"+
		"\u0000\u008e\u008f\u0005$\u0000\u0000\u008f\u0090\u0005\u001c\u0000\u0000"+
		"\u0090\u0091\u0005\u000b\u0000\u0000\u0091\u0092\u0005\f\u0000\u0000\u0092"+
		"\u0098\u0005\u0005\u0000\u0000\u0093\u0094\u0003\u0010\b\u0000\u0094\u0095"+
		"\u0005\u001b\u0000\u0000\u0095\u0097\u0001\u0000\u0000\u0000\u0096\u0093"+
		"\u0001\u0000\u0000\u0000\u0097\u009a\u0001\u0000\u0000\u0000\u0098\u0096"+
		"\u0001\u0000\u0000\u0000\u0098\u0099\u0001\u0000\u0000\u0000\u0099\u009b"+
		"\u0001\u0000\u0000\u0000\u009a\u0098\u0001\u0000\u0000\u0000\u009b\u009d"+
		"\u0003\u0010\b\u0000\u009c\u009e\u0005\u001b\u0000\u0000\u009d\u009c\u0001"+
		"\u0000\u0000\u0000\u009d\u009e\u0001\u0000\u0000\u0000\u009e\u009f\u0001"+
		"\u0000\u0000\u0000\u009f\u00a0\u0005\u0006\u0000\u0000\u00a0\u00a1\u0005"+
		",\u0000\u0000\u00a1\u000f\u0001\u0000\u0000\u0000\u00a2\u00a5\u0003\u0012"+
		"\t\u0000\u00a3\u00a5\u0003\u001a\r\u0000\u00a4\u00a2\u0001\u0000\u0000"+
		"\u0000\u00a4\u00a3\u0001\u0000\u0000\u0000\u00a5\u0011\u0001\u0000\u0000"+
		"\u0000\u00a6\u00a7\u0005-\u0000\u0000\u00a7\u00a8\u0005$\u0000\u0000\u00a8"+
		"\u00a9\u0003\u0014\n\u0000\u00a9\u0013\u0001\u0000\u0000\u0000\u00aa\u00ad"+
		"\u0003\u0018\f\u0000\u00ab\u00ad\u0003\u0016\u000b\u0000\u00ac\u00aa\u0001"+
		"\u0000\u0000\u0000\u00ac\u00ab\u0001\u0000\u0000\u0000\u00ad\u0015\u0001"+
		"\u0000\u0000\u0000\u00ae\u00af\u0005\u001e\u0000\u0000\u00af\u00b0\u0005"+
		")\u0000\u0000\u00b0\u00b1\u0005*\u0000\u0000\u00b1\u00b2\u0005-\u0000"+
		"\u0000\u00b2\u00b3\u0005*\u0000\u0000\u00b3\u0017\u0001\u0000\u0000\u0000"+
		"\u00b4\u00b5\u0005\u001f\u0000\u0000\u00b5\u00b6\u0005)\u0000\u0000\u00b6"+
		"\u00b7\u0005*\u0000\u0000\u00b7\u00b8\u0005#\u0000\u0000\u00b8\u00b9\u0005"+
		"*\u0000\u0000\u00b9\u0019\u0001\u0000\u0000\u0000\u00ba\u00bb\u0005-\u0000"+
		"\u0000\u00bb\u00bc\u0005$\u0000\u0000\u00bc\u00bd\u0003\u001c\u000e\u0000"+
		"\u00bd\u001b\u0001\u0000\u0000\u0000\u00be\u00c1\u0003\u001e\u000f\u0000"+
		"\u00bf\u00c1\u0003 \u0010\u0000\u00c0\u00be\u0001\u0000\u0000\u0000\u00c0"+
		"\u00bf\u0001\u0000\u0000\u0000\u00c1\u001d\u0001\u0000\u0000\u0000\u00c2"+
		"\u00c3\u0005\u001d\u0000\u0000\u00c3\u00c4\u0005)\u0000\u0000\u00c4\u00c5"+
		"\u0005*\u0000\u0000\u00c5\u00c6\u0005\u001a\u0000\u0000\u00c6\u00c7\u0005"+
		"*\u0000\u0000\u00c7\u001f\u0001\u0000\u0000\u0000\u00c8\u00c9\u0005!\u0000"+
		"\u0000\u00c9\u00ca\u0005)\u0000\u0000\u00ca\u00cb\u0005*\u0000\u0000\u00cb"+
		"\u00cc\u0005#\u0000\u0000\u00cc\u00cd\u0005*\u0000\u0000\u00cd!\u0001"+
		"\u0000\u0000\u0000\u00ce\u00cf\u0005&\u0000\u0000\u00cf\u00d0\u0005\u000b"+
		"\u0000\u0000\u00d0\u00d1\u0003$\u0012\u0000\u00d1\u00d2\u0005\f\u0000"+
		"\u0000\u00d2\u00d3\u0005,\u0000\u0000\u00d3#\u0001\u0000\u0000\u0000\u00d4"+
		"\u00d8\u0003&\u0013\u0000\u00d5\u00d8\u0003(\u0014\u0000\u00d6\u00d8\u0005"+
		"-\u0000\u0000\u00d7\u00d4\u0001\u0000\u0000\u0000\u00d7\u00d5\u0001\u0000"+
		"\u0000\u0000\u00d7\u00d6\u0001\u0000\u0000\u0000\u00d8%\u0001\u0000\u0000"+
		"\u0000\u00d9\u00da\u0005%\u0000\u0000\u00da\u00db\u0005\u000b\u0000\u0000"+
		"\u00db\u00dc\u0005-\u0000\u0000\u00dc\u00dd\u0005\f\u0000\u0000\u00dd"+
		"\'\u0001\u0000\u0000\u0000\u00de\u00df\u0005\u0019\u0000\u0000\u00df\u00e0"+
		"\u0005-\u0000\u0000\u00e0\u00e1\u0005\u0019\u0000\u0000\u00e1)\u0001\u0000"+
		"\u0000\u0000\u00e2\u00e7\u0003,\u0016\u0000\u00e3\u00e7\u00036\u001b\u0000"+
		"\u00e4\u00e7\u00038\u001c\u0000\u00e5\u00e7\u0003:\u001d\u0000\u00e6\u00e2"+
		"\u0001\u0000\u0000\u0000\u00e6\u00e3\u0001\u0000\u0000\u0000\u00e6\u00e4"+
		"\u0001\u0000\u0000\u0000\u00e6\u00e5\u0001\u0000\u0000\u0000\u00e7+\u0001"+
		"\u0000\u0000\u0000\u00e8\u00e9\u0005-\u0000\u0000\u00e9\u00ea\u0005)\u0000"+
		"\u0000\u00ea\u00f0\u0005-\u0000\u0000\u00eb\u00ec\u00034\u001a\u0000\u00ec"+
		"\u00ed\u0005-\u0000\u0000\u00ed\u00ef\u0001\u0000\u0000\u0000\u00ee\u00eb"+
		"\u0001\u0000\u0000\u0000\u00ef\u00f2\u0001\u0000\u0000\u0000\u00f0\u00ee"+
		"\u0001\u0000\u0000\u0000\u00f0\u00f1\u0001\u0000\u0000\u0000\u00f1\u00f3"+
		"\u0001\u0000\u0000\u0000\u00f2\u00f0\u0001\u0000\u0000\u0000\u00f3\u00f8"+
		"\u0005,\u0000\u0000\u00f4\u00f8\u00030\u0018\u0000\u00f5\u00f8\u00032"+
		"\u0019\u0000\u00f6\u00f8\u0003.\u0017\u0000\u00f7\u00e8\u0001\u0000\u0000"+
		"\u0000\u00f7\u00f4\u0001\u0000\u0000\u0000\u00f7\u00f5\u0001\u0000\u0000"+
		"\u0000\u00f7\u00f6\u0001\u0000\u0000\u0000\u00f8-\u0001\u0000\u0000\u0000"+
		"\u00f9\u00fa\u0005-\u0000\u0000\u00fa\u00fb\u0007\u0002\u0000\u0000\u00fb"+
		"\u00fc\u0005+\u0000\u0000\u00fc\u00fd\u0005,\u0000\u0000\u00fd/\u0001"+
		"\u0000\u0000\u0000\u00fe\u00ff\u0005-\u0000\u0000\u00ff\u0100\u0005\r"+
		"\u0000\u0000\u0100\u0101\u0005,\u0000\u0000\u01011\u0001\u0000\u0000\u0000"+
		"\u0102\u0103\u0005-\u0000\u0000\u0103\u0104\u0005\u000e\u0000\u0000\u0104"+
		"\u0105\u0005,\u0000\u0000\u01053\u0001\u0000\u0000\u0000\u0106\u0107\u0007"+
		"\u0003\u0000\u0000\u01075\u0001\u0000\u0000\u0000\u0108\u0109\u0005-\u0000"+
		"\u0000\u0109\u010a\u0005)\u0000\u0000\u010a\u010b\u0005*\u0000\u0000\u010b"+
		"\u010c\u0005-\u0000\u0000\u010c\u0113\u0005*\u0000\u0000\u010d\u010e\u0005"+
		"\u0007\u0000\u0000\u010e\u010f\u0005*\u0000\u0000\u010f\u0110\u0005-\u0000"+
		"\u0000\u0110\u0112\u0005*\u0000\u0000\u0111\u010d\u0001\u0000\u0000\u0000"+
		"\u0112\u0115\u0001\u0000\u0000\u0000\u0113\u0111\u0001\u0000\u0000\u0000"+
		"\u0113\u0114\u0001\u0000\u0000\u0000\u0114\u0116\u0001\u0000\u0000\u0000"+
		"\u0115\u0113\u0001\u0000\u0000\u0000\u0116\u011e\u0005,\u0000\u0000\u0117"+
		"\u0118\u0005-\u0000\u0000\u0118\u0119\u0005)\u0000\u0000\u0119\u011a\u0005"+
		"-\u0000\u0000\u011a\u011b\u0005$\u0000\u0000\u011b\u011c\u0005\u001e\u0000"+
		"\u0000\u011c\u011e\u0005,\u0000\u0000\u011d\u0108\u0001\u0000\u0000\u0000"+
		"\u011d\u0117\u0001\u0000\u0000\u0000\u011e7\u0001\u0000\u0000\u0000\u011f"+
		"\u0120\u0005-\u0000\u0000\u0120\u0121\u0005)\u0000\u0000\u0121\u0122\u0003"+
		"&\u0013\u0000\u0122\u0123\u0005,\u0000\u0000\u01239\u0001\u0000\u0000"+
		"\u0000\u0124\u0125\u0005-\u0000\u0000\u0125\u0126\u0005)\u0000\u0000\u0126"+
		"\u0127\u0005-\u0000\u0000\u0127\u0128\u0005$\u0000\u0000\u0128\u0129\u0005"+
		"\u001e\u0000\u0000\u0129\u012a\u0005,\u0000\u0000\u012a;\u0001\u0000\u0000"+
		"\u0000\u0015BJMW]dhp\u007f\u0086\u0098\u009d\u00a4\u00ac\u00c0\u00d7\u00e6"+
		"\u00f0\u00f7\u0113\u011d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}