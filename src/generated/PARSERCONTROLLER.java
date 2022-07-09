package generated;// Generated from D:/Compiler-PHP\PARSERCONTROLLER.g4 by ANTLR 4.10.1
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
		MULTIPLY=9, MINUS=10, OPENTEXT=11, CLOSETEXT=12, SUMS=13, MINUSS=14, OR=15, 
		FOR=16, AND=17, SUM_EQUAL=18, MINUS_EQUAL=19, EQUALEQUAL=20, DIVID_EQUAL=21, 
		MULTIPLY_EQUAL=22, NOT_EQUAL=23, IF=24, ELSE=25, Array=26, DOUBLE_QUOTE=27, 
		SIZES=28, COMMA=29, ON_CLICK=30, WIDTH=31, CONTENT=32, COLOR=33, TEXT_HINT=34, 
		COMMENT=35, BACKGROUND=36, TAG_OPEN=37, TAG_OPEN_EQUAL=38, COLORS=39, 
		DOT=40, GET_DATA=41, PRINT=42, TAG_CLOSE=43, TAG_CLOSE_EQUAL=44, CONTROLLER=45, 
		EQUAL=46, SINGLE_QUOTE=47, SEMICOLON=48, CHARS=49;
	public static final int
		RULE_program = 0, RULE_code_attribute = 1, RULE_for_statement = 2, RULE_if_statment = 3, 
		RULE_logical_sympol = 4, RULE_operation_if = 5, RULE_else_statment = 6, 
		RULE_comment = 7, RULE_on_click = 8, RULE_click_attribute = 9, RULE_text = 10, 
		RULE_text_attribute = 11, RULE_content = 12, RULE_color = 13, RULE_button = 14, 
		RULE_button_attribute = 15, RULE_width = 16, RULE_background = 17, RULE_print = 18, 
		RULE_printattribute = 19, RULE_getdata = 20, RULE_print_text = 21, RULE_variables = 22, 
		RULE_array = 23, RULE_for_statement_variable_number = 24, RULE_variable_number = 25, 
		RULE_fast_math = 26, RULE_for_statement_adding_one = 27, RULE_for_statement_minuss_one = 28, 
		RULE_for_statement_fast_math = 29, RULE_adding_one = 30, RULE_minus_one = 31, 
		RULE_number_attribute = 32, RULE_variable_text = 33, RULE_variable_get = 34, 
		RULE_textinput = 35, RULE_textinput_attribute = 36;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "code_attribute", "for_statement", "if_statment", "logical_sympol", 
			"operation_if", "else_statment", "comment", "on_click", "click_attribute", 
			"text", "text_attribute", "content", "color", "button", "button_attribute", 
			"width", "background", "print", "printattribute", "getdata", "print_text", 
			"variables", "array", "for_statement_variable_number", "variable_number", 
			"fast_math", "for_statement_adding_one", "for_statement_minuss_one", 
			"for_statement_fast_math", "adding_one", "minus_one", "number_attribute", 
			"variable_text", "variable_get", "textinput", "textinput_attribute"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "' '", "'\\n'", "'\\t'", "'\\r'", "'{'", "'}'", "'+'", "'/'", "'*'", 
			"'-'", "'('", "')'", "'++'", "'--'", "'||'", "'for'", "'&&'", "'+='", 
			"'-='", "'=='", "'/='", "'*='", "'!='", "'if'", "'else'", "'array'", 
			"'\"'", null, "','", "'onClick'", "'Width'", "'Content'", "'Color'", 
			"'TextHint'", "'//'", "'Background'", "'<'", "'<='", null, "'.'", "'getData'", 
			"'print'", "'>'", "'>='", "'controller'", "'='", "'''", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SPACE", "UN", "UT", "UR", "CURLYOPEN", "CURLYCLOSE", "SUM", "DIVID", 
			"MULTIPLY", "MINUS", "OPENTEXT", "CLOSETEXT", "SUMS", "MINUSS", "OR", 
			"FOR", "AND", "SUM_EQUAL", "MINUS_EQUAL", "EQUALEQUAL", "DIVID_EQUAL", 
			"MULTIPLY_EQUAL", "NOT_EQUAL", "IF", "ELSE", "Array", "DOUBLE_QUOTE", 
			"SIZES", "COMMA", "ON_CLICK", "WIDTH", "CONTENT", "COLOR", "TEXT_HINT", 
			"COMMENT", "BACKGROUND", "TAG_OPEN", "TAG_OPEN_EQUAL", "COLORS", "DOT", 
			"GET_DATA", "PRINT", "TAG_CLOSE", "TAG_CLOSE_EQUAL", "CONTROLLER", "EQUAL", 
			"SINGLE_QUOTE", "SEMICOLON", "CHARS"
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
			if ( listener instanceof PARSERCONTROLLERListener) ((PARSERCONTROLLERListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERCONTROLLERListener) ((PARSERCONTROLLERListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERCONTROLLERVisitor) return ((PARSERCONTROLLERVisitor<? extends T>)visitor).visitProgram(this);
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
			setState(74);
			match(TAG_OPEN);
			setState(75);
			match(CONTROLLER);
			setState(76);
			match(TAG_CLOSE);
			setState(78); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(77);
				code_attribute();
				}
				}
				setState(80); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << IF) | (1L << ELSE) | (1L << COMMENT) | (1L << PRINT) | (1L << CHARS))) != 0) );
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
		public For_statementContext for_statement() {
			return getRuleContext(For_statementContext.class,0);
		}
		public Code_attributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERCONTROLLERListener) ((PARSERCONTROLLERListener)listener).enterCode_attribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERCONTROLLERListener) ((PARSERCONTROLLERListener)listener).exitCode_attribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERCONTROLLERVisitor) return ((PARSERCONTROLLERVisitor<? extends T>)visitor).visitCode_attribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Code_attributeContext code_attribute() throws RecognitionException {
		Code_attributeContext _localctx = new Code_attributeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_code_attribute);
		try {
			setState(89);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				variables();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(83);
				on_click();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(84);
				print();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(85);
				comment();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(86);
				if_statment();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(87);
				else_statment();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(88);
				for_statement();
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

	public static class For_statementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(PARSERCONTROLLER.FOR, 0); }
		public TerminalNode OPENTEXT() { return getToken(PARSERCONTROLLER.OPENTEXT, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(PARSERCONTROLLER.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(PARSERCONTROLLER.SEMICOLON, i);
		}
		public TerminalNode CLOSETEXT() { return getToken(PARSERCONTROLLER.CLOSETEXT, 0); }
		public TerminalNode CURLYOPEN() { return getToken(PARSERCONTROLLER.CURLYOPEN, 0); }
		public TerminalNode CURLYCLOSE() { return getToken(PARSERCONTROLLER.CURLYCLOSE, 0); }
		public List<TerminalNode> CHARS() { return getTokens(PARSERCONTROLLER.CHARS); }
		public TerminalNode CHARS(int i) {
			return getToken(PARSERCONTROLLER.CHARS, i);
		}
		public Operation_ifContext operation_if() {
			return getRuleContext(Operation_ifContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(PARSERCONTROLLER.EQUAL, 0); }
		public For_statement_variable_numberContext for_statement_variable_number() {
			return getRuleContext(For_statement_variable_numberContext.class,0);
		}
		public List<Code_attributeContext> code_attribute() {
			return getRuleContexts(Code_attributeContext.class);
		}
		public Code_attributeContext code_attribute(int i) {
			return getRuleContext(Code_attributeContext.class,i);
		}
		public For_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERCONTROLLERListener) ((PARSERCONTROLLERListener)listener).enterFor_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERCONTROLLERListener) ((PARSERCONTROLLERListener)listener).exitFor_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERCONTROLLERVisitor) return ((PARSERCONTROLLERVisitor<? extends T>)visitor).visitFor_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_statementContext for_statement() throws RecognitionException {
		For_statementContext _localctx = new For_statementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_for_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(FOR);
			setState(92);
			match(OPENTEXT);
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CHARS) {
				{
				setState(93);
				match(CHARS);
				setState(94);
				match(EQUAL);
				setState(95);
				match(CHARS);
				}
			}

			setState(98);
			match(SEMICOLON);
			{
			setState(99);
			match(CHARS);
			setState(100);
			operation_if();
			setState(101);
			match(CHARS);
			}
			setState(103);
			match(SEMICOLON);
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CHARS) {
				{
				setState(104);
				for_statement_variable_number();
				}
			}

			setState(107);
			match(CLOSETEXT);
			setState(108);
			match(CURLYOPEN);
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << IF) | (1L << ELSE) | (1L << COMMENT) | (1L << PRINT) | (1L << CHARS))) != 0)) {
				{
				{
				setState(109);
				code_attribute();
				}
				}
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(115);
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

	public static class If_statmentContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(PARSERCONTROLLER.IF, 0); }
		public TerminalNode OPENTEXT() { return getToken(PARSERCONTROLLER.OPENTEXT, 0); }
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
		public List<TerminalNode> CHARS() { return getTokens(PARSERCONTROLLER.CHARS); }
		public TerminalNode CHARS(int i) {
			return getToken(PARSERCONTROLLER.CHARS, i);
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
			if ( listener instanceof PARSERCONTROLLERListener) ((PARSERCONTROLLERListener)listener).enterIf_statment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERCONTROLLERListener) ((PARSERCONTROLLERListener)listener).exitIf_statment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERCONTROLLERVisitor) return ((PARSERCONTROLLERVisitor<? extends T>)visitor).visitIf_statment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statmentContext if_statment() throws RecognitionException {
		If_statmentContext _localctx = new If_statmentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_if_statment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(117);
				match(ELSE);
				}
			}

			setState(120);
			match(IF);
			setState(121);
			match(OPENTEXT);
			setState(126);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHARS:
				{
				{
				setState(122);
				match(CHARS);
				}
				}
				break;
			case SINGLE_QUOTE:
				{
				{
				setState(123);
				match(SINGLE_QUOTE);
				setState(124);
				match(CHARS);
				setState(125);
				match(SINGLE_QUOTE);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(128);
			operation_if();
			setState(133);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHARS:
				{
				{
				setState(129);
				match(CHARS);
				}
				}
				break;
			case SINGLE_QUOTE:
				{
				{
				setState(130);
				match(SINGLE_QUOTE);
				setState(131);
				match(CHARS);
				setState(132);
				match(SINGLE_QUOTE);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR || _la==AND) {
				{
				{
				setState(135);
				logical_sympol();
				setState(138);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CHARS:
					{
					setState(136);
					match(CHARS);
					}
					break;
				case EQUALEQUAL:
				case NOT_EQUAL:
				case TAG_OPEN:
				case TAG_OPEN_EQUAL:
				case TAG_CLOSE:
				case TAG_CLOSE_EQUAL:
					{
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(140);
				operation_if();
				setState(145);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CHARS:
					{
					{
					setState(141);
					match(CHARS);
					}
					}
					break;
				case SINGLE_QUOTE:
					{
					{
					setState(142);
					match(SINGLE_QUOTE);
					setState(143);
					match(CHARS);
					setState(144);
					match(SINGLE_QUOTE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(152);
			match(CLOSETEXT);
			setState(153);
			match(CURLYOPEN);
			setState(155); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(154);
				code_attribute();
				}
				}
				setState(157); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << IF) | (1L << ELSE) | (1L << COMMENT) | (1L << PRINT) | (1L << CHARS))) != 0) );
			setState(159);
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
			if ( listener instanceof PARSERCONTROLLERListener) ((PARSERCONTROLLERListener)listener).enterLogical_sympol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERCONTROLLERListener) ((PARSERCONTROLLERListener)listener).exitLogical_sympol(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERCONTROLLERVisitor) return ((PARSERCONTROLLERVisitor<? extends T>)visitor).visitLogical_sympol(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logical_sympolContext logical_sympol() throws RecognitionException {
		Logical_sympolContext _localctx = new Logical_sympolContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_logical_sympol);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
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
		public TerminalNode TAG_CLOSE_EQUAL() { return getToken(PARSERCONTROLLER.TAG_CLOSE_EQUAL, 0); }
		public TerminalNode TAG_OPEN_EQUAL() { return getToken(PARSERCONTROLLER.TAG_OPEN_EQUAL, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(PARSERCONTROLLER.NOT_EQUAL, 0); }
		public Operation_ifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERCONTROLLERListener) ((PARSERCONTROLLERListener)listener).enterOperation_if(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERCONTROLLERListener) ((PARSERCONTROLLERListener)listener).exitOperation_if(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERCONTROLLERVisitor) return ((PARSERCONTROLLERVisitor<? extends T>)visitor).visitOperation_if(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operation_ifContext operation_if() throws RecognitionException {
		Operation_ifContext _localctx = new Operation_ifContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_operation_if);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUALEQUAL) | (1L << NOT_EQUAL) | (1L << TAG_OPEN) | (1L << TAG_OPEN_EQUAL) | (1L << TAG_CLOSE) | (1L << TAG_CLOSE_EQUAL))) != 0)) ) {
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
			if ( listener instanceof PARSERCONTROLLERListener) ((PARSERCONTROLLERListener)listener).enterElse_statment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERCONTROLLERListener) ((PARSERCONTROLLERListener)listener).exitElse_statment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERCONTROLLERVisitor) return ((PARSERCONTROLLERVisitor<? extends T>)visitor).visitElse_statment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_statmentContext else_statment() throws RecognitionException {
		Else_statmentContext _localctx = new Else_statmentContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_else_statment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(ELSE);
			setState(166);
			match(CURLYOPEN);
			setState(168); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(167);
				code_attribute();
				}
				}
				setState(170); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << IF) | (1L << ELSE) | (1L << COMMENT) | (1L << PRINT) | (1L << CHARS))) != 0) );
			setState(172);
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
			if ( listener instanceof PARSERCONTROLLERListener) ((PARSERCONTROLLERListener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERCONTROLLERListener) ((PARSERCONTROLLERListener)listener).exitComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERCONTROLLERVisitor) return ((PARSERCONTROLLERVisitor<? extends T>)visitor).visitComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_comment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(COMMENT);
			setState(175);
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
			if ( listener instanceof PARSERCONTROLLERListener) ((PARSERCONTROLLERListener)listener).enterOn_click(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERCONTROLLERListener) ((PARSERCONTROLLERListener)listener).exitOn_click(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERCONTROLLERVisitor) return ((PARSERCONTROLLERVisitor<? extends T>)visitor).visitOn_click(this);
			else return visitor.visitChildren(this);
		}
	}

	public final On_clickContext on_click() throws RecognitionException {
		On_clickContext _localctx = new On_clickContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_on_click);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(CHARS);
			setState(178);
			match(DOT);
			setState(179);
			match(ON_CLICK);
			setState(180);
			match(OPENTEXT);
			setState(181);
			match(CLOSETEXT);
			setState(182);
			match(CURLYOPEN);
			setState(188);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(183);
					click_attribute();
					setState(184);
					match(COMMA);
					}
					} 
				}
				setState(190);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			setState(191);
			click_attribute();
			setState(192);
			match(CURLYCLOSE);
			setState(193);
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
			if ( listener instanceof PARSERCONTROLLERListener) ((PARSERCONTROLLERListener)listener).enterClick_attribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERCONTROLLERListener) ((PARSERCONTROLLERListener)listener).exitClick_attribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERCONTROLLERVisitor) return ((PARSERCONTROLLERVisitor<? extends T>)visitor).visitClick_attribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Click_attributeContext click_attribute() throws RecognitionException {
		Click_attributeContext _localctx = new Click_attributeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_click_attribute);
		try {
			setState(197);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(195);
				text();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(196);
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
			if ( listener instanceof PARSERCONTROLLERListener) ((PARSERCONTROLLERListener)listener).enterText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERCONTROLLERListener) ((PARSERCONTROLLERListener)listener).exitText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERCONTROLLERVisitor) return ((PARSERCONTROLLERVisitor<? extends T>)visitor).visitText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextContext text() throws RecognitionException {
		TextContext _localctx = new TextContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_text);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(CHARS);
			setState(200);
			match(DOT);
			setState(201);
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
			if ( listener instanceof PARSERCONTROLLERListener) ((PARSERCONTROLLERListener)listener).enterText_attribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERCONTROLLERListener) ((PARSERCONTROLLERListener)listener).exitText_attribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERCONTROLLERVisitor) return ((PARSERCONTROLLERVisitor<? extends T>)visitor).visitText_attribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Text_attributeContext text_attribute() throws RecognitionException {
		Text_attributeContext _localctx = new Text_attributeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_text_attribute);
		try {
			setState(205);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COLOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(203);
				color();
				}
				break;
			case CONTENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(204);
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
		public TerminalNode CHARS() { return getToken(PARSERCONTROLLER.CHARS, 0); }
		public List<TerminalNode> SINGLE_QUOTE() { return getTokens(PARSERCONTROLLER.SINGLE_QUOTE); }
		public TerminalNode SINGLE_QUOTE(int i) {
			return getToken(PARSERCONTROLLER.SINGLE_QUOTE, i);
		}
		public ContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_content; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERCONTROLLERListener) ((PARSERCONTROLLERListener)listener).enterContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERCONTROLLERListener) ((PARSERCONTROLLERListener)listener).exitContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERCONTROLLERVisitor) return ((PARSERCONTROLLERVisitor<? extends T>)visitor).visitContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContentContext content() throws RecognitionException {
		ContentContext _localctx = new ContentContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_content);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(CONTENT);
			setState(208);
			match(EQUAL);
			setState(213);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SINGLE_QUOTE:
				{
				{
				setState(209);
				match(SINGLE_QUOTE);
				setState(210);
				match(CHARS);
				setState(211);
				match(SINGLE_QUOTE);
				}
				}
				break;
			case CHARS:
				{
				setState(212);
				match(CHARS);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ColorContext extends ParserRuleContext {
		public TerminalNode COLOR() { return getToken(PARSERCONTROLLER.COLOR, 0); }
		public TerminalNode EQUAL() { return getToken(PARSERCONTROLLER.EQUAL, 0); }
		public TerminalNode CHARS() { return getToken(PARSERCONTROLLER.CHARS, 0); }
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
			if ( listener instanceof PARSERCONTROLLERListener) ((PARSERCONTROLLERListener)listener).enterColor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERCONTROLLERListener) ((PARSERCONTROLLERListener)listener).exitColor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERCONTROLLERVisitor) return ((PARSERCONTROLLERVisitor<? extends T>)visitor).visitColor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColorContext color() throws RecognitionException {
		ColorContext _localctx = new ColorContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_color);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(COLOR);
			setState(216);
			match(EQUAL);
			setState(221);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SINGLE_QUOTE:
				{
				{
				setState(217);
				match(SINGLE_QUOTE);
				setState(218);
				match(COLORS);
				setState(219);
				match(SINGLE_QUOTE);
				}
				}
				break;
			case CHARS:
				{
				setState(220);
				match(CHARS);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
			if ( listener instanceof PARSERCONTROLLERListener) ((PARSERCONTROLLERListener)listener).enterButton(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERCONTROLLERListener) ((PARSERCONTROLLERListener)listener).exitButton(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERCONTROLLERVisitor) return ((PARSERCONTROLLERVisitor<? extends T>)visitor).visitButton(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ButtonContext button() throws RecognitionException {
		ButtonContext _localctx = new ButtonContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_button);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			match(CHARS);
			setState(224);
			match(DOT);
			setState(225);
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
			if ( listener instanceof PARSERCONTROLLERListener) ((PARSERCONTROLLERListener)listener).enterButton_attribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERCONTROLLERListener) ((PARSERCONTROLLERListener)listener).exitButton_attribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERCONTROLLERVisitor) return ((PARSERCONTROLLERVisitor<? extends T>)visitor).visitButton_attribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Button_attributeContext button_attribute() throws RecognitionException {
		Button_attributeContext _localctx = new Button_attributeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_button_attribute);
		try {
			setState(229);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WIDTH:
				enterOuterAlt(_localctx, 1);
				{
				setState(227);
				width();
				}
				break;
			case BACKGROUND:
				enterOuterAlt(_localctx, 2);
				{
				setState(228);
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
		public TerminalNode CHARS() { return getToken(PARSERCONTROLLER.CHARS, 0); }
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
			if ( listener instanceof PARSERCONTROLLERListener) ((PARSERCONTROLLERListener)listener).enterWidth(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERCONTROLLERListener) ((PARSERCONTROLLERListener)listener).exitWidth(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERCONTROLLERVisitor) return ((PARSERCONTROLLERVisitor<? extends T>)visitor).visitWidth(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WidthContext width() throws RecognitionException {
		WidthContext _localctx = new WidthContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_width);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			match(WIDTH);
			setState(232);
			match(EQUAL);
			setState(237);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SINGLE_QUOTE:
				{
				{
				setState(233);
				match(SINGLE_QUOTE);
				setState(234);
				match(SIZES);
				setState(235);
				match(SINGLE_QUOTE);
				}
				}
				break;
			case CHARS:
				{
				setState(236);
				match(CHARS);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class BackgroundContext extends ParserRuleContext {
		public TerminalNode BACKGROUND() { return getToken(PARSERCONTROLLER.BACKGROUND, 0); }
		public TerminalNode EQUAL() { return getToken(PARSERCONTROLLER.EQUAL, 0); }
		public TerminalNode CHARS() { return getToken(PARSERCONTROLLER.CHARS, 0); }
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
			if ( listener instanceof PARSERCONTROLLERListener) ((PARSERCONTROLLERListener)listener).enterBackground(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERCONTROLLERListener) ((PARSERCONTROLLERListener)listener).exitBackground(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERCONTROLLERVisitor) return ((PARSERCONTROLLERVisitor<? extends T>)visitor).visitBackground(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BackgroundContext background() throws RecognitionException {
		BackgroundContext _localctx = new BackgroundContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_background);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(BACKGROUND);
			setState(240);
			match(EQUAL);
			setState(245);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SINGLE_QUOTE:
				{
				{
				setState(241);
				match(SINGLE_QUOTE);
				setState(242);
				match(COLORS);
				setState(243);
				match(SINGLE_QUOTE);
				}
				}
				break;
			case CHARS:
				{
				setState(244);
				match(CHARS);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class PrintContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(PARSERCONTROLLER.PRINT, 0); }
		public TerminalNode OPENTEXT() { return getToken(PARSERCONTROLLER.OPENTEXT, 0); }
		public List<PrintattributeContext> printattribute() {
			return getRuleContexts(PrintattributeContext.class);
		}
		public PrintattributeContext printattribute(int i) {
			return getRuleContext(PrintattributeContext.class,i);
		}
		public TerminalNode CLOSETEXT() { return getToken(PARSERCONTROLLER.CLOSETEXT, 0); }
		public TerminalNode SEMICOLON() { return getToken(PARSERCONTROLLER.SEMICOLON, 0); }
		public List<TerminalNode> SUM() { return getTokens(PARSERCONTROLLER.SUM); }
		public TerminalNode SUM(int i) {
			return getToken(PARSERCONTROLLER.SUM, i);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERCONTROLLERListener) ((PARSERCONTROLLERListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERCONTROLLERListener) ((PARSERCONTROLLERListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERCONTROLLERVisitor) return ((PARSERCONTROLLERVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_print);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			match(PRINT);
			setState(248);
			match(OPENTEXT);
			setState(254);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(249);
					printattribute();
					setState(250);
					match(SUM);
					}
					} 
				}
				setState(256);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			setState(257);
			printattribute();
			setState(258);
			match(CLOSETEXT);
			setState(259);
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
			if ( listener instanceof PARSERCONTROLLERListener) ((PARSERCONTROLLERListener)listener).enterPrintattribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERCONTROLLERListener) ((PARSERCONTROLLERListener)listener).exitPrintattribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERCONTROLLERVisitor) return ((PARSERCONTROLLERVisitor<? extends T>)visitor).visitPrintattribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintattributeContext printattribute() throws RecognitionException {
		PrintattributeContext _localctx = new PrintattributeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_printattribute);
		try {
			setState(264);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GET_DATA:
				enterOuterAlt(_localctx, 1);
				{
				setState(261);
				getdata();
				}
				break;
			case DOUBLE_QUOTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(262);
				print_text();
				}
				break;
			case CHARS:
				enterOuterAlt(_localctx, 3);
				{
				setState(263);
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
		public TerminalNode CLOSETEXT() { return getToken(PARSERCONTROLLER.CLOSETEXT, 0); }
		public TerminalNode CHARS() { return getToken(PARSERCONTROLLER.CHARS, 0); }
		public List<TerminalNode> SINGLE_QUOTE() { return getTokens(PARSERCONTROLLER.SINGLE_QUOTE); }
		public TerminalNode SINGLE_QUOTE(int i) {
			return getToken(PARSERCONTROLLER.SINGLE_QUOTE, i);
		}
		public GetdataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getdata; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERCONTROLLERListener) ((PARSERCONTROLLERListener)listener).enterGetdata(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERCONTROLLERListener) ((PARSERCONTROLLERListener)listener).exitGetdata(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERCONTROLLERVisitor) return ((PARSERCONTROLLERVisitor<? extends T>)visitor).visitGetdata(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GetdataContext getdata() throws RecognitionException {
		GetdataContext _localctx = new GetdataContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_getdata);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			match(GET_DATA);
			setState(267);
			match(OPENTEXT);
			setState(272);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SINGLE_QUOTE:
				{
				{
				setState(268);
				match(SINGLE_QUOTE);
				setState(269);
				match(CHARS);
				setState(270);
				match(SINGLE_QUOTE);
				}
				}
				break;
			case CHARS:
				{
				setState(271);
				match(CHARS);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(274);
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
			if ( listener instanceof PARSERCONTROLLERListener) ((PARSERCONTROLLERListener)listener).enterPrint_text(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERCONTROLLERListener) ((PARSERCONTROLLERListener)listener).exitPrint_text(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERCONTROLLERVisitor) return ((PARSERCONTROLLERVisitor<? extends T>)visitor).visitPrint_text(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Print_textContext print_text() throws RecognitionException {
		Print_textContext _localctx = new Print_textContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_print_text);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			match(DOUBLE_QUOTE);
			setState(278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CHARS) {
				{
				setState(277);
				match(CHARS);
				}
			}

			setState(280);
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
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public VariablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERCONTROLLERListener) ((PARSERCONTROLLERListener)listener).enterVariables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERCONTROLLERListener) ((PARSERCONTROLLERListener)listener).exitVariables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERCONTROLLERVisitor) return ((PARSERCONTROLLERVisitor<? extends T>)visitor).visitVariables(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariablesContext variables() throws RecognitionException {
		VariablesContext _localctx = new VariablesContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_variables);
		try {
			setState(287);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(282);
				variable_number();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(283);
				variable_text();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(284);
				variable_get();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(285);
				textinput();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(286);
				array();
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

	public static class ArrayContext extends ParserRuleContext {
		public List<TerminalNode> CHARS() { return getTokens(PARSERCONTROLLER.CHARS); }
		public TerminalNode CHARS(int i) {
			return getToken(PARSERCONTROLLER.CHARS, i);
		}
		public TerminalNode EQUAL() { return getToken(PARSERCONTROLLER.EQUAL, 0); }
		public TerminalNode Array() { return getToken(PARSERCONTROLLER.Array, 0); }
		public TerminalNode OPENTEXT() { return getToken(PARSERCONTROLLER.OPENTEXT, 0); }
		public List<TerminalNode> DOUBLE_QUOTE() { return getTokens(PARSERCONTROLLER.DOUBLE_QUOTE); }
		public TerminalNode DOUBLE_QUOTE(int i) {
			return getToken(PARSERCONTROLLER.DOUBLE_QUOTE, i);
		}
		public TerminalNode CLOSETEXT() { return getToken(PARSERCONTROLLER.CLOSETEXT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(PARSERCONTROLLER.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PARSERCONTROLLER.COMMA, i);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERCONTROLLERListener) ((PARSERCONTROLLERListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERCONTROLLERListener) ((PARSERCONTROLLERListener)listener).exitArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERCONTROLLERVisitor) return ((PARSERCONTROLLERVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_array);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			match(CHARS);
			setState(290);
			match(EQUAL);
			setState(291);
			match(Array);
			setState(292);
			match(OPENTEXT);
			setState(299);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(293);
					match(DOUBLE_QUOTE);
					setState(294);
					match(CHARS);
					setState(295);
					match(DOUBLE_QUOTE);
					setState(296);
					match(COMMA);
					}
					} 
				}
				setState(301);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			}
			setState(302);
			match(DOUBLE_QUOTE);
			setState(303);
			match(CHARS);
			setState(304);
			match(DOUBLE_QUOTE);
			setState(305);
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

	public static class For_statement_variable_numberContext extends ParserRuleContext {
		public List<TerminalNode> CHARS() { return getTokens(PARSERCONTROLLER.CHARS); }
		public TerminalNode CHARS(int i) {
			return getToken(PARSERCONTROLLER.CHARS, i);
		}
		public TerminalNode EQUAL() { return getToken(PARSERCONTROLLER.EQUAL, 0); }
		public List<Number_attributeContext> number_attribute() {
			return getRuleContexts(Number_attributeContext.class);
		}
		public Number_attributeContext number_attribute(int i) {
			return getRuleContext(Number_attributeContext.class,i);
		}
		public For_statement_adding_oneContext for_statement_adding_one() {
			return getRuleContext(For_statement_adding_oneContext.class,0);
		}
		public For_statement_minuss_oneContext for_statement_minuss_one() {
			return getRuleContext(For_statement_minuss_oneContext.class,0);
		}
		public For_statement_fast_mathContext for_statement_fast_math() {
			return getRuleContext(For_statement_fast_mathContext.class,0);
		}
		public For_statement_variable_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_statement_variable_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERCONTROLLERListener) ((PARSERCONTROLLERListener)listener).enterFor_statement_variable_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERCONTROLLERListener) ((PARSERCONTROLLERListener)listener).exitFor_statement_variable_number(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERCONTROLLERVisitor) return ((PARSERCONTROLLERVisitor<? extends T>)visitor).visitFor_statement_variable_number(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_statement_variable_numberContext for_statement_variable_number() throws RecognitionException {
		For_statement_variable_numberContext _localctx = new For_statement_variable_numberContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_for_statement_variable_number);
		int _la;
		try {
			setState(323);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(307);
				match(CHARS);
				setState(308);
				match(EQUAL);
				setState(318);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
				case 1:
					{
					setState(309);
					match(CHARS);
					}
					break;
				case 2:
					{
					setState(310);
					match(CHARS);
					setState(314); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(311);
						number_attribute();
						setState(312);
						match(CHARS);
						}
						}
						setState(316); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUM) | (1L << DIVID) | (1L << MULTIPLY) | (1L << MINUS))) != 0) );
					}
					break;
				}
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(320);
				for_statement_adding_one();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(321);
				for_statement_minuss_one();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(322);
				for_statement_fast_math();
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
			if ( listener instanceof PARSERCONTROLLERListener) ((PARSERCONTROLLERListener)listener).enterVariable_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERCONTROLLERListener) ((PARSERCONTROLLERListener)listener).exitVariable_number(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERCONTROLLERVisitor) return ((PARSERCONTROLLERVisitor<? extends T>)visitor).visitVariable_number(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_numberContext variable_number() throws RecognitionException {
		Variable_numberContext _localctx = new Variable_numberContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_variable_number);
		int _la;
		try {
			setState(340);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(325);
				match(CHARS);
				setState(326);
				match(EQUAL);
				setState(327);
				match(CHARS);
				setState(333);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUM) | (1L << DIVID) | (1L << MULTIPLY) | (1L << MINUS))) != 0)) {
					{
					{
					setState(328);
					number_attribute();
					setState(329);
					match(CHARS);
					}
					}
					setState(335);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(336);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(337);
				adding_one();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(338);
				minus_one();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(339);
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
		public List<TerminalNode> CHARS() { return getTokens(PARSERCONTROLLER.CHARS); }
		public TerminalNode CHARS(int i) {
			return getToken(PARSERCONTROLLER.CHARS, i);
		}
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
			if ( listener instanceof PARSERCONTROLLERListener) ((PARSERCONTROLLERListener)listener).enterFast_math(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERCONTROLLERListener) ((PARSERCONTROLLERListener)listener).exitFast_math(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERCONTROLLERVisitor) return ((PARSERCONTROLLERVisitor<? extends T>)visitor).visitFast_math(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fast_mathContext fast_math() throws RecognitionException {
		Fast_mathContext _localctx = new Fast_mathContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_fast_math);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			match(CHARS);
			setState(343);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUM_EQUAL) | (1L << MINUS_EQUAL) | (1L << DIVID_EQUAL) | (1L << MULTIPLY_EQUAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			{
			setState(344);
			match(CHARS);
			}
			setState(345);
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

	public static class For_statement_adding_oneContext extends ParserRuleContext {
		public TerminalNode CHARS() { return getToken(PARSERCONTROLLER.CHARS, 0); }
		public TerminalNode SUMS() { return getToken(PARSERCONTROLLER.SUMS, 0); }
		public For_statement_adding_oneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_statement_adding_one; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERCONTROLLERListener) ((PARSERCONTROLLERListener)listener).enterFor_statement_adding_one(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERCONTROLLERListener) ((PARSERCONTROLLERListener)listener).exitFor_statement_adding_one(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERCONTROLLERVisitor) return ((PARSERCONTROLLERVisitor<? extends T>)visitor).visitFor_statement_adding_one(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_statement_adding_oneContext for_statement_adding_one() throws RecognitionException {
		For_statement_adding_oneContext _localctx = new For_statement_adding_oneContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_for_statement_adding_one);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			match(CHARS);
			setState(348);
			match(SUMS);
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

	public static class For_statement_minuss_oneContext extends ParserRuleContext {
		public TerminalNode CHARS() { return getToken(PARSERCONTROLLER.CHARS, 0); }
		public TerminalNode MINUSS() { return getToken(PARSERCONTROLLER.MINUSS, 0); }
		public For_statement_minuss_oneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_statement_minuss_one; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERCONTROLLERListener) ((PARSERCONTROLLERListener)listener).enterFor_statement_minuss_one(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERCONTROLLERListener) ((PARSERCONTROLLERListener)listener).exitFor_statement_minuss_one(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERCONTROLLERVisitor) return ((PARSERCONTROLLERVisitor<? extends T>)visitor).visitFor_statement_minuss_one(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_statement_minuss_oneContext for_statement_minuss_one() throws RecognitionException {
		For_statement_minuss_oneContext _localctx = new For_statement_minuss_oneContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_for_statement_minuss_one);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			match(CHARS);
			setState(351);
			match(MINUSS);
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

	public static class For_statement_fast_mathContext extends ParserRuleContext {
		public List<TerminalNode> CHARS() { return getTokens(PARSERCONTROLLER.CHARS); }
		public TerminalNode CHARS(int i) {
			return getToken(PARSERCONTROLLER.CHARS, i);
		}
		public TerminalNode SUM_EQUAL() { return getToken(PARSERCONTROLLER.SUM_EQUAL, 0); }
		public TerminalNode MINUS_EQUAL() { return getToken(PARSERCONTROLLER.MINUS_EQUAL, 0); }
		public TerminalNode DIVID_EQUAL() { return getToken(PARSERCONTROLLER.DIVID_EQUAL, 0); }
		public TerminalNode MULTIPLY_EQUAL() { return getToken(PARSERCONTROLLER.MULTIPLY_EQUAL, 0); }
		public For_statement_fast_mathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_statement_fast_math; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERCONTROLLERListener) ((PARSERCONTROLLERListener)listener).enterFor_statement_fast_math(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERCONTROLLERListener) ((PARSERCONTROLLERListener)listener).exitFor_statement_fast_math(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERCONTROLLERVisitor) return ((PARSERCONTROLLERVisitor<? extends T>)visitor).visitFor_statement_fast_math(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_statement_fast_mathContext for_statement_fast_math() throws RecognitionException {
		For_statement_fast_mathContext _localctx = new For_statement_fast_mathContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_for_statement_fast_math);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			match(CHARS);
			setState(354);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUM_EQUAL) | (1L << MINUS_EQUAL) | (1L << DIVID_EQUAL) | (1L << MULTIPLY_EQUAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			{
			setState(355);
			match(CHARS);
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
			if ( listener instanceof PARSERCONTROLLERListener) ((PARSERCONTROLLERListener)listener).enterAdding_one(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERCONTROLLERListener) ((PARSERCONTROLLERListener)listener).exitAdding_one(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERCONTROLLERVisitor) return ((PARSERCONTROLLERVisitor<? extends T>)visitor).visitAdding_one(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Adding_oneContext adding_one() throws RecognitionException {
		Adding_oneContext _localctx = new Adding_oneContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_adding_one);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			match(CHARS);
			setState(358);
			match(SUMS);
			setState(359);
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
			if ( listener instanceof PARSERCONTROLLERListener) ((PARSERCONTROLLERListener)listener).enterMinus_one(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERCONTROLLERListener) ((PARSERCONTROLLERListener)listener).exitMinus_one(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERCONTROLLERVisitor) return ((PARSERCONTROLLERVisitor<? extends T>)visitor).visitMinus_one(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Minus_oneContext minus_one() throws RecognitionException {
		Minus_oneContext _localctx = new Minus_oneContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_minus_one);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			match(CHARS);
			setState(362);
			match(MINUSS);
			setState(363);
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
			if ( listener instanceof PARSERCONTROLLERListener) ((PARSERCONTROLLERListener)listener).enterNumber_attribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERCONTROLLERListener) ((PARSERCONTROLLERListener)listener).exitNumber_attribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERCONTROLLERVisitor) return ((PARSERCONTROLLERVisitor<? extends T>)visitor).visitNumber_attribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Number_attributeContext number_attribute() throws RecognitionException {
		Number_attributeContext _localctx = new Number_attributeContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_number_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
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
		public Variable_textContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_text; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERCONTROLLERListener) ((PARSERCONTROLLERListener)listener).enterVariable_text(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERCONTROLLERListener) ((PARSERCONTROLLERListener)listener).exitVariable_text(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERCONTROLLERVisitor) return ((PARSERCONTROLLERVisitor<? extends T>)visitor).visitVariable_text(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_textContext variable_text() throws RecognitionException {
		Variable_textContext _localctx = new Variable_textContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_variable_text);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			match(CHARS);
			setState(368);
			match(EQUAL);
			setState(369);
			match(SINGLE_QUOTE);
			setState(373);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CHARS) {
				{
				{
				setState(370);
				match(CHARS);
				}
				}
				setState(375);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(376);
			match(SINGLE_QUOTE);
			setState(388);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SUM) {
				{
				{
				setState(377);
				match(SUM);
				setState(378);
				match(SINGLE_QUOTE);
				setState(382);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CHARS) {
					{
					{
					setState(379);
					match(CHARS);
					}
					}
					setState(384);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(385);
				match(SINGLE_QUOTE);
				}
				}
				setState(390);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(391);
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
			if ( listener instanceof PARSERCONTROLLERListener) ((PARSERCONTROLLERListener)listener).enterVariable_get(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERCONTROLLERListener) ((PARSERCONTROLLERListener)listener).exitVariable_get(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERCONTROLLERVisitor) return ((PARSERCONTROLLERVisitor<? extends T>)visitor).visitVariable_get(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_getContext variable_get() throws RecognitionException {
		Variable_getContext _localctx = new Variable_getContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_variable_get);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			match(CHARS);
			setState(394);
			match(EQUAL);
			setState(395);
			getdata();
			setState(396);
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
		public Textinput_attributeContext textinput_attribute() {
			return getRuleContext(Textinput_attributeContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(PARSERCONTROLLER.SEMICOLON, 0); }
		public TextinputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textinput; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERCONTROLLERListener) ((PARSERCONTROLLERListener)listener).enterTextinput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERCONTROLLERListener) ((PARSERCONTROLLERListener)listener).exitTextinput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERCONTROLLERVisitor) return ((PARSERCONTROLLERVisitor<? extends T>)visitor).visitTextinput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextinputContext textinput() throws RecognitionException {
		TextinputContext _localctx = new TextinputContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_textinput);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(398);
			match(CHARS);
			setState(399);
			match(EQUAL);
			setState(400);
			match(CHARS);
			setState(401);
			match(DOT);
			setState(402);
			textinput_attribute();
			setState(403);
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

	public static class Textinput_attributeContext extends ParserRuleContext {
		public TerminalNode CONTENT() { return getToken(PARSERCONTROLLER.CONTENT, 0); }
		public TerminalNode COLOR() { return getToken(PARSERCONTROLLER.COLOR, 0); }
		public TerminalNode TEXT_HINT() { return getToken(PARSERCONTROLLER.TEXT_HINT, 0); }
		public Textinput_attributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textinput_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERCONTROLLERListener) ((PARSERCONTROLLERListener)listener).enterTextinput_attribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERCONTROLLERListener) ((PARSERCONTROLLERListener)listener).exitTextinput_attribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERCONTROLLERVisitor) return ((PARSERCONTROLLERVisitor<? extends T>)visitor).visitTextinput_attribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Textinput_attributeContext textinput_attribute() throws RecognitionException {
		Textinput_attributeContext _localctx = new Textinput_attributeContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_textinput_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONTENT) | (1L << COLOR) | (1L << TEXT_HINT))) != 0)) ) {
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

	public static final String _serializedATN =
		"\u0004\u00011\u0198\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0004\u0000O\b\u0000\u000b\u0000\f\u0000P\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001Z\b"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u0002a\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0003\u0002j\b\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0005\u0002o\b\u0002\n\u0002\f\u0002r\t\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0003\u0003w\b\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u007f"+
		"\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u0003\u0086\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u008b"+
		"\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u0003\u0092\b\u0003\u0005\u0003\u0094\b\u0003\n\u0003\f\u0003\u0097\t"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0004\u0003\u009c\b\u0003\u000b"+
		"\u0003\f\u0003\u009d\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0004\u0006\u00a9"+
		"\b\u0006\u000b\u0006\f\u0006\u00aa\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0005\b\u00bb\b\b\n\b\f\b\u00be\t\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0003\t\u00c6\b\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0003\u000b\u00ce\b\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00d6\b\f\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00de\b\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0003\u000f\u00e6"+
		"\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0003\u0010\u00ee\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u00f6\b\u0011\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u00fd\b\u0012\n"+
		"\u0012\f\u0012\u0100\t\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u0109\b\u0013\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003"+
		"\u0014\u0111\b\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0003"+
		"\u0015\u0117\b\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u0120\b\u0016\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0005\u0017\u012a\b\u0017\n\u0017\f\u0017\u012d\t\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0004\u0018"+
		"\u013b\b\u0018\u000b\u0018\f\u0018\u013c\u0003\u0018\u013f\b\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u0144\b\u0018\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0005\u0019\u014c"+
		"\b\u0019\n\u0019\f\u0019\u014f\t\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0003\u0019\u0155\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001!\u0001!\u0001!\u0001!\u0005"+
		"!\u0174\b!\n!\f!\u0177\t!\u0001!\u0001!\u0001!\u0001!\u0005!\u017d\b!"+
		"\n!\f!\u0180\t!\u0001!\u0005!\u0183\b!\n!\f!\u0186\t!\u0001!\u0001!\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0001#\u0001#"+
		"\u0001#\u0001#\u0001$\u0001$\u0001$\u0000\u0000%\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,."+
		"02468:<>@BDFH\u0000\u0005\u0002\u0000\u000f\u000f\u0011\u0011\u0004\u0000"+
		"\u0014\u0014\u0017\u0017%&+,\u0002\u0000\u0012\u0013\u0015\u0016\u0001"+
		"\u0000\u0007\n\u0001\u0000 \"\u01a2\u0000J\u0001\u0000\u0000\u0000\u0002"+
		"Y\u0001\u0000\u0000\u0000\u0004[\u0001\u0000\u0000\u0000\u0006v\u0001"+
		"\u0000\u0000\u0000\b\u00a1\u0001\u0000\u0000\u0000\n\u00a3\u0001\u0000"+
		"\u0000\u0000\f\u00a5\u0001\u0000\u0000\u0000\u000e\u00ae\u0001\u0000\u0000"+
		"\u0000\u0010\u00b1\u0001\u0000\u0000\u0000\u0012\u00c5\u0001\u0000\u0000"+
		"\u0000\u0014\u00c7\u0001\u0000\u0000\u0000\u0016\u00cd\u0001\u0000\u0000"+
		"\u0000\u0018\u00cf\u0001\u0000\u0000\u0000\u001a\u00d7\u0001\u0000\u0000"+
		"\u0000\u001c\u00df\u0001\u0000\u0000\u0000\u001e\u00e5\u0001\u0000\u0000"+
		"\u0000 \u00e7\u0001\u0000\u0000\u0000\"\u00ef\u0001\u0000\u0000\u0000"+
		"$\u00f7\u0001\u0000\u0000\u0000&\u0108\u0001\u0000\u0000\u0000(\u010a"+
		"\u0001\u0000\u0000\u0000*\u0114\u0001\u0000\u0000\u0000,\u011f\u0001\u0000"+
		"\u0000\u0000.\u0121\u0001\u0000\u0000\u00000\u0143\u0001\u0000\u0000\u0000"+
		"2\u0154\u0001\u0000\u0000\u00004\u0156\u0001\u0000\u0000\u00006\u015b"+
		"\u0001\u0000\u0000\u00008\u015e\u0001\u0000\u0000\u0000:\u0161\u0001\u0000"+
		"\u0000\u0000<\u0165\u0001\u0000\u0000\u0000>\u0169\u0001\u0000\u0000\u0000"+
		"@\u016d\u0001\u0000\u0000\u0000B\u016f\u0001\u0000\u0000\u0000D\u0189"+
		"\u0001\u0000\u0000\u0000F\u018e\u0001\u0000\u0000\u0000H\u0195\u0001\u0000"+
		"\u0000\u0000JK\u0005%\u0000\u0000KL\u0005-\u0000\u0000LN\u0005+\u0000"+
		"\u0000MO\u0003\u0002\u0001\u0000NM\u0001\u0000\u0000\u0000OP\u0001\u0000"+
		"\u0000\u0000PN\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000Q\u0001"+
		"\u0001\u0000\u0000\u0000RZ\u0003,\u0016\u0000SZ\u0003\u0010\b\u0000TZ"+
		"\u0003$\u0012\u0000UZ\u0003\u000e\u0007\u0000VZ\u0003\u0006\u0003\u0000"+
		"WZ\u0003\f\u0006\u0000XZ\u0003\u0004\u0002\u0000YR\u0001\u0000\u0000\u0000"+
		"YS\u0001\u0000\u0000\u0000YT\u0001\u0000\u0000\u0000YU\u0001\u0000\u0000"+
		"\u0000YV\u0001\u0000\u0000\u0000YW\u0001\u0000\u0000\u0000YX\u0001\u0000"+
		"\u0000\u0000Z\u0003\u0001\u0000\u0000\u0000[\\\u0005\u0010\u0000\u0000"+
		"\\`\u0005\u000b\u0000\u0000]^\u00051\u0000\u0000^_\u0005.\u0000\u0000"+
		"_a\u00051\u0000\u0000`]\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000"+
		"ab\u0001\u0000\u0000\u0000bc\u00050\u0000\u0000cd\u00051\u0000\u0000d"+
		"e\u0003\n\u0005\u0000ef\u00051\u0000\u0000fg\u0001\u0000\u0000\u0000g"+
		"i\u00050\u0000\u0000hj\u00030\u0018\u0000ih\u0001\u0000\u0000\u0000ij"+
		"\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000kl\u0005\f\u0000\u0000"+
		"lp\u0005\u0005\u0000\u0000mo\u0003\u0002\u0001\u0000nm\u0001\u0000\u0000"+
		"\u0000or\u0001\u0000\u0000\u0000pn\u0001\u0000\u0000\u0000pq\u0001\u0000"+
		"\u0000\u0000qs\u0001\u0000\u0000\u0000rp\u0001\u0000\u0000\u0000st\u0005"+
		"\u0006\u0000\u0000t\u0005\u0001\u0000\u0000\u0000uw\u0005\u0019\u0000"+
		"\u0000vu\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000wx\u0001\u0000"+
		"\u0000\u0000xy\u0005\u0018\u0000\u0000y~\u0005\u000b\u0000\u0000z\u007f"+
		"\u00051\u0000\u0000{|\u0005/\u0000\u0000|}\u00051\u0000\u0000}\u007f\u0005"+
		"/\u0000\u0000~z\u0001\u0000\u0000\u0000~{\u0001\u0000\u0000\u0000\u007f"+
		"\u0080\u0001\u0000\u0000\u0000\u0080\u0085\u0003\n\u0005\u0000\u0081\u0086"+
		"\u00051\u0000\u0000\u0082\u0083\u0005/\u0000\u0000\u0083\u0084\u00051"+
		"\u0000\u0000\u0084\u0086\u0005/\u0000\u0000\u0085\u0081\u0001\u0000\u0000"+
		"\u0000\u0085\u0082\u0001\u0000\u0000\u0000\u0086\u0095\u0001\u0000\u0000"+
		"\u0000\u0087\u008a\u0003\b\u0004\u0000\u0088\u008b\u00051\u0000\u0000"+
		"\u0089\u008b\u0001\u0000\u0000\u0000\u008a\u0088\u0001\u0000\u0000\u0000"+
		"\u008a\u0089\u0001\u0000\u0000\u0000\u008b\u008c\u0001\u0000\u0000\u0000"+
		"\u008c\u0091\u0003\n\u0005\u0000\u008d\u0092\u00051\u0000\u0000\u008e"+
		"\u008f\u0005/\u0000\u0000\u008f\u0090\u00051\u0000\u0000\u0090\u0092\u0005"+
		"/\u0000\u0000\u0091\u008d\u0001\u0000\u0000\u0000\u0091\u008e\u0001\u0000"+
		"\u0000\u0000\u0092\u0094\u0001\u0000\u0000\u0000\u0093\u0087\u0001\u0000"+
		"\u0000\u0000\u0094\u0097\u0001\u0000\u0000\u0000\u0095\u0093\u0001\u0000"+
		"\u0000\u0000\u0095\u0096\u0001\u0000\u0000\u0000\u0096\u0098\u0001\u0000"+
		"\u0000\u0000\u0097\u0095\u0001\u0000\u0000\u0000\u0098\u0099\u0005\f\u0000"+
		"\u0000\u0099\u009b\u0005\u0005\u0000\u0000\u009a\u009c\u0003\u0002\u0001"+
		"\u0000\u009b\u009a\u0001\u0000\u0000\u0000\u009c\u009d\u0001\u0000\u0000"+
		"\u0000\u009d\u009b\u0001\u0000\u0000\u0000\u009d\u009e\u0001\u0000\u0000"+
		"\u0000\u009e\u009f\u0001\u0000\u0000\u0000\u009f\u00a0\u0005\u0006\u0000"+
		"\u0000\u00a0\u0007\u0001\u0000\u0000\u0000\u00a1\u00a2\u0007\u0000\u0000"+
		"\u0000\u00a2\t\u0001\u0000\u0000\u0000\u00a3\u00a4\u0007\u0001\u0000\u0000"+
		"\u00a4\u000b\u0001\u0000\u0000\u0000\u00a5\u00a6\u0005\u0019\u0000\u0000"+
		"\u00a6\u00a8\u0005\u0005\u0000\u0000\u00a7\u00a9\u0003\u0002\u0001\u0000"+
		"\u00a8\u00a7\u0001\u0000\u0000\u0000\u00a9\u00aa\u0001\u0000\u0000\u0000"+
		"\u00aa\u00a8\u0001\u0000\u0000\u0000\u00aa\u00ab\u0001\u0000\u0000\u0000"+
		"\u00ab\u00ac\u0001\u0000\u0000\u0000\u00ac\u00ad\u0005\u0006\u0000\u0000"+
		"\u00ad\r\u0001\u0000\u0000\u0000\u00ae\u00af\u0005#\u0000\u0000\u00af"+
		"\u00b0\u00051\u0000\u0000\u00b0\u000f\u0001\u0000\u0000\u0000\u00b1\u00b2"+
		"\u00051\u0000\u0000\u00b2\u00b3\u0005(\u0000\u0000\u00b3\u00b4\u0005\u001e"+
		"\u0000\u0000\u00b4\u00b5\u0005\u000b\u0000\u0000\u00b5\u00b6\u0005\f\u0000"+
		"\u0000\u00b6\u00bc\u0005\u0005\u0000\u0000\u00b7\u00b8\u0003\u0012\t\u0000"+
		"\u00b8\u00b9\u0005\u001d\u0000\u0000\u00b9\u00bb\u0001\u0000\u0000\u0000"+
		"\u00ba\u00b7\u0001\u0000\u0000\u0000\u00bb\u00be\u0001\u0000\u0000\u0000"+
		"\u00bc\u00ba\u0001\u0000\u0000\u0000\u00bc\u00bd\u0001\u0000\u0000\u0000"+
		"\u00bd\u00bf\u0001\u0000\u0000\u0000\u00be\u00bc\u0001\u0000\u0000\u0000"+
		"\u00bf\u00c0\u0003\u0012\t\u0000\u00c0\u00c1\u0005\u0006\u0000\u0000\u00c1"+
		"\u00c2\u00050\u0000\u0000\u00c2\u0011\u0001\u0000\u0000\u0000\u00c3\u00c6"+
		"\u0003\u0014\n\u0000\u00c4\u00c6\u0003\u001c\u000e\u0000\u00c5\u00c3\u0001"+
		"\u0000\u0000\u0000\u00c5\u00c4\u0001\u0000\u0000\u0000\u00c6\u0013\u0001"+
		"\u0000\u0000\u0000\u00c7\u00c8\u00051\u0000\u0000\u00c8\u00c9\u0005(\u0000"+
		"\u0000\u00c9\u00ca\u0003\u0016\u000b\u0000\u00ca\u0015\u0001\u0000\u0000"+
		"\u0000\u00cb\u00ce\u0003\u001a\r\u0000\u00cc\u00ce\u0003\u0018\f\u0000"+
		"\u00cd\u00cb\u0001\u0000\u0000\u0000\u00cd\u00cc\u0001\u0000\u0000\u0000"+
		"\u00ce\u0017\u0001\u0000\u0000\u0000\u00cf\u00d0\u0005 \u0000\u0000\u00d0"+
		"\u00d5\u0005.\u0000\u0000\u00d1\u00d2\u0005/\u0000\u0000\u00d2\u00d3\u0005"+
		"1\u0000\u0000\u00d3\u00d6\u0005/\u0000\u0000\u00d4\u00d6\u00051\u0000"+
		"\u0000\u00d5\u00d1\u0001\u0000\u0000\u0000\u00d5\u00d4\u0001\u0000\u0000"+
		"\u0000\u00d6\u0019\u0001\u0000\u0000\u0000\u00d7\u00d8\u0005!\u0000\u0000"+
		"\u00d8\u00dd\u0005.\u0000\u0000\u00d9\u00da\u0005/\u0000\u0000\u00da\u00db"+
		"\u0005\'\u0000\u0000\u00db\u00de\u0005/\u0000\u0000\u00dc\u00de\u0005"+
		"1\u0000\u0000\u00dd\u00d9\u0001\u0000\u0000\u0000\u00dd\u00dc\u0001\u0000"+
		"\u0000\u0000\u00de\u001b\u0001\u0000\u0000\u0000\u00df\u00e0\u00051\u0000"+
		"\u0000\u00e0\u00e1\u0005(\u0000\u0000\u00e1\u00e2\u0003\u001e\u000f\u0000"+
		"\u00e2\u001d\u0001\u0000\u0000\u0000\u00e3\u00e6\u0003 \u0010\u0000\u00e4"+
		"\u00e6\u0003\"\u0011\u0000\u00e5\u00e3\u0001\u0000\u0000\u0000\u00e5\u00e4"+
		"\u0001\u0000\u0000\u0000\u00e6\u001f\u0001\u0000\u0000\u0000\u00e7\u00e8"+
		"\u0005\u001f\u0000\u0000\u00e8\u00ed\u0005.\u0000\u0000\u00e9\u00ea\u0005"+
		"/\u0000\u0000\u00ea\u00eb\u0005\u001c\u0000\u0000\u00eb\u00ee\u0005/\u0000"+
		"\u0000\u00ec\u00ee\u00051\u0000\u0000\u00ed\u00e9\u0001\u0000\u0000\u0000"+
		"\u00ed\u00ec\u0001\u0000\u0000\u0000\u00ee!\u0001\u0000\u0000\u0000\u00ef"+
		"\u00f0\u0005$\u0000\u0000\u00f0\u00f5\u0005.\u0000\u0000\u00f1\u00f2\u0005"+
		"/\u0000\u0000\u00f2\u00f3\u0005\'\u0000\u0000\u00f3\u00f6\u0005/\u0000"+
		"\u0000\u00f4\u00f6\u00051\u0000\u0000\u00f5\u00f1\u0001\u0000\u0000\u0000"+
		"\u00f5\u00f4\u0001\u0000\u0000\u0000\u00f6#\u0001\u0000\u0000\u0000\u00f7"+
		"\u00f8\u0005*\u0000\u0000\u00f8\u00fe\u0005\u000b\u0000\u0000\u00f9\u00fa"+
		"\u0003&\u0013\u0000\u00fa\u00fb\u0005\u0007\u0000\u0000\u00fb\u00fd\u0001"+
		"\u0000\u0000\u0000\u00fc\u00f9\u0001\u0000\u0000\u0000\u00fd\u0100\u0001"+
		"\u0000\u0000\u0000\u00fe\u00fc\u0001\u0000\u0000\u0000\u00fe\u00ff\u0001"+
		"\u0000\u0000\u0000\u00ff\u0101\u0001\u0000\u0000\u0000\u0100\u00fe\u0001"+
		"\u0000\u0000\u0000\u0101\u0102\u0003&\u0013\u0000\u0102\u0103\u0005\f"+
		"\u0000\u0000\u0103\u0104\u00050\u0000\u0000\u0104%\u0001\u0000\u0000\u0000"+
		"\u0105\u0109\u0003(\u0014\u0000\u0106\u0109\u0003*\u0015\u0000\u0107\u0109"+
		"\u00051\u0000\u0000\u0108\u0105\u0001\u0000\u0000\u0000\u0108\u0106\u0001"+
		"\u0000\u0000\u0000\u0108\u0107\u0001\u0000\u0000\u0000\u0109\'\u0001\u0000"+
		"\u0000\u0000\u010a\u010b\u0005)\u0000\u0000\u010b\u0110\u0005\u000b\u0000"+
		"\u0000\u010c\u010d\u0005/\u0000\u0000\u010d\u010e\u00051\u0000\u0000\u010e"+
		"\u0111\u0005/\u0000\u0000\u010f\u0111\u00051\u0000\u0000\u0110\u010c\u0001"+
		"\u0000\u0000\u0000\u0110\u010f\u0001\u0000\u0000\u0000\u0111\u0112\u0001"+
		"\u0000\u0000\u0000\u0112\u0113\u0005\f\u0000\u0000\u0113)\u0001\u0000"+
		"\u0000\u0000\u0114\u0116\u0005\u001b\u0000\u0000\u0115\u0117\u00051\u0000"+
		"\u0000\u0116\u0115\u0001\u0000\u0000\u0000\u0116\u0117\u0001\u0000\u0000"+
		"\u0000\u0117\u0118\u0001\u0000\u0000\u0000\u0118\u0119\u0005\u001b\u0000"+
		"\u0000\u0119+\u0001\u0000\u0000\u0000\u011a\u0120\u00032\u0019\u0000\u011b"+
		"\u0120\u0003B!\u0000\u011c\u0120\u0003D\"\u0000\u011d\u0120\u0003F#\u0000"+
		"\u011e\u0120\u0003.\u0017\u0000\u011f\u011a\u0001\u0000\u0000\u0000\u011f"+
		"\u011b\u0001\u0000\u0000\u0000\u011f\u011c\u0001\u0000\u0000\u0000\u011f"+
		"\u011d\u0001\u0000\u0000\u0000\u011f\u011e\u0001\u0000\u0000\u0000\u0120"+
		"-\u0001\u0000\u0000\u0000\u0121\u0122\u00051\u0000\u0000\u0122\u0123\u0005"+
		".\u0000\u0000\u0123\u0124\u0005\u001a\u0000\u0000\u0124\u012b\u0005\u000b"+
		"\u0000\u0000\u0125\u0126\u0005\u001b\u0000\u0000\u0126\u0127\u00051\u0000"+
		"\u0000\u0127\u0128\u0005\u001b\u0000\u0000\u0128\u012a\u0005\u001d\u0000"+
		"\u0000\u0129\u0125\u0001\u0000\u0000\u0000\u012a\u012d\u0001\u0000\u0000"+
		"\u0000\u012b\u0129\u0001\u0000\u0000\u0000\u012b\u012c\u0001\u0000\u0000"+
		"\u0000\u012c\u012e\u0001\u0000\u0000\u0000\u012d\u012b\u0001\u0000\u0000"+
		"\u0000\u012e\u012f\u0005\u001b\u0000\u0000\u012f\u0130\u00051\u0000\u0000"+
		"\u0130\u0131\u0005\u001b\u0000\u0000\u0131\u0132\u0005\f\u0000\u0000\u0132"+
		"/\u0001\u0000\u0000\u0000\u0133\u0134\u00051\u0000\u0000\u0134\u013e\u0005"+
		".\u0000\u0000\u0135\u013f\u00051\u0000\u0000\u0136\u013a\u00051\u0000"+
		"\u0000\u0137\u0138\u0003@ \u0000\u0138\u0139\u00051\u0000\u0000\u0139"+
		"\u013b\u0001\u0000\u0000\u0000\u013a\u0137\u0001\u0000\u0000\u0000\u013b"+
		"\u013c\u0001\u0000\u0000\u0000\u013c\u013a\u0001\u0000\u0000\u0000\u013c"+
		"\u013d\u0001\u0000\u0000\u0000\u013d\u013f\u0001\u0000\u0000\u0000\u013e"+
		"\u0135\u0001\u0000\u0000\u0000\u013e\u0136\u0001\u0000\u0000\u0000\u013f"+
		"\u0144\u0001\u0000\u0000\u0000\u0140\u0144\u00036\u001b\u0000\u0141\u0144"+
		"\u00038\u001c\u0000\u0142\u0144\u0003:\u001d\u0000\u0143\u0133\u0001\u0000"+
		"\u0000\u0000\u0143\u0140\u0001\u0000\u0000\u0000\u0143\u0141\u0001\u0000"+
		"\u0000\u0000\u0143\u0142\u0001\u0000\u0000\u0000\u01441\u0001\u0000\u0000"+
		"\u0000\u0145\u0146\u00051\u0000\u0000\u0146\u0147\u0005.\u0000\u0000\u0147"+
		"\u014d\u00051\u0000\u0000\u0148\u0149\u0003@ \u0000\u0149\u014a\u0005"+
		"1\u0000\u0000\u014a\u014c\u0001\u0000\u0000\u0000\u014b\u0148\u0001\u0000"+
		"\u0000\u0000\u014c\u014f\u0001\u0000\u0000\u0000\u014d\u014b\u0001\u0000"+
		"\u0000\u0000\u014d\u014e\u0001\u0000\u0000\u0000\u014e\u0150\u0001\u0000"+
		"\u0000\u0000\u014f\u014d\u0001\u0000\u0000\u0000\u0150\u0155\u00050\u0000"+
		"\u0000\u0151\u0155\u0003<\u001e\u0000\u0152\u0155\u0003>\u001f\u0000\u0153"+
		"\u0155\u00034\u001a\u0000\u0154\u0145\u0001\u0000\u0000\u0000\u0154\u0151"+
		"\u0001\u0000\u0000\u0000\u0154\u0152\u0001\u0000\u0000\u0000\u0154\u0153"+
		"\u0001\u0000\u0000\u0000\u01553\u0001\u0000\u0000\u0000\u0156\u0157\u0005"+
		"1\u0000\u0000\u0157\u0158\u0007\u0002\u0000\u0000\u0158\u0159\u00051\u0000"+
		"\u0000\u0159\u015a\u00050\u0000\u0000\u015a5\u0001\u0000\u0000\u0000\u015b"+
		"\u015c\u00051\u0000\u0000\u015c\u015d\u0005\r\u0000\u0000\u015d7\u0001"+
		"\u0000\u0000\u0000\u015e\u015f\u00051\u0000\u0000\u015f\u0160\u0005\u000e"+
		"\u0000\u0000\u01609\u0001\u0000\u0000\u0000\u0161\u0162\u00051\u0000\u0000"+
		"\u0162\u0163\u0007\u0002\u0000\u0000\u0163\u0164\u00051\u0000\u0000\u0164"+
		";\u0001\u0000\u0000\u0000\u0165\u0166\u00051\u0000\u0000\u0166\u0167\u0005"+
		"\r\u0000\u0000\u0167\u0168\u00050\u0000\u0000\u0168=\u0001\u0000\u0000"+
		"\u0000\u0169\u016a\u00051\u0000\u0000\u016a\u016b\u0005\u000e\u0000\u0000"+
		"\u016b\u016c\u00050\u0000\u0000\u016c?\u0001\u0000\u0000\u0000\u016d\u016e"+
		"\u0007\u0003\u0000\u0000\u016eA\u0001\u0000\u0000\u0000\u016f\u0170\u0005"+
		"1\u0000\u0000\u0170\u0171\u0005.\u0000\u0000\u0171\u0175\u0005/\u0000"+
		"\u0000\u0172\u0174\u00051\u0000\u0000\u0173\u0172\u0001\u0000\u0000\u0000"+
		"\u0174\u0177\u0001\u0000\u0000\u0000\u0175\u0173\u0001\u0000\u0000\u0000"+
		"\u0175\u0176\u0001\u0000\u0000\u0000\u0176\u0178\u0001\u0000\u0000\u0000"+
		"\u0177\u0175\u0001\u0000\u0000\u0000\u0178\u0184\u0005/\u0000\u0000\u0179"+
		"\u017a\u0005\u0007\u0000\u0000\u017a\u017e\u0005/\u0000\u0000\u017b\u017d"+
		"\u00051\u0000\u0000\u017c\u017b\u0001\u0000\u0000\u0000\u017d\u0180\u0001"+
		"\u0000\u0000\u0000\u017e\u017c\u0001\u0000\u0000\u0000\u017e\u017f\u0001"+
		"\u0000\u0000\u0000\u017f\u0181\u0001\u0000\u0000\u0000\u0180\u017e\u0001"+
		"\u0000\u0000\u0000\u0181\u0183\u0005/\u0000\u0000\u0182\u0179\u0001\u0000"+
		"\u0000\u0000\u0183\u0186\u0001\u0000\u0000\u0000\u0184\u0182\u0001\u0000"+
		"\u0000\u0000\u0184\u0185\u0001\u0000\u0000\u0000\u0185\u0187\u0001\u0000"+
		"\u0000\u0000\u0186\u0184\u0001\u0000\u0000\u0000\u0187\u0188\u00050\u0000"+
		"\u0000\u0188C\u0001\u0000\u0000\u0000\u0189\u018a\u00051\u0000\u0000\u018a"+
		"\u018b\u0005.\u0000\u0000\u018b\u018c\u0003(\u0014\u0000\u018c\u018d\u0005"+
		"0\u0000\u0000\u018dE\u0001\u0000\u0000\u0000\u018e\u018f\u00051\u0000"+
		"\u0000\u018f\u0190\u0005.\u0000\u0000\u0190\u0191\u00051\u0000\u0000\u0191"+
		"\u0192\u0005(\u0000\u0000\u0192\u0193\u0003H$\u0000\u0193\u0194\u0005"+
		"0\u0000\u0000\u0194G\u0001\u0000\u0000\u0000\u0195\u0196\u0007\u0004\u0000"+
		"\u0000\u0196I\u0001\u0000\u0000\u0000#PY`ipv~\u0085\u008a\u0091\u0095"+
		"\u009d\u00aa\u00bc\u00c5\u00cd\u00d5\u00dd\u00e5\u00ed\u00f5\u00fe\u0108"+
		"\u0110\u0116\u011f\u012b\u013c\u013e\u0143\u014d\u0154\u0175\u017e\u0184";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}