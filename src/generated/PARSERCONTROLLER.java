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
		MULTIPLY_EQUAL=22, NOT_EQUAL=23, IF=24, ELSE=25, ELSE_IF=26, Array=27, 
		DOUBLE_QUOTE=28, SIZES=29, COMMA=30, CONTENT=31, COLOR=32, COUNT=33, TEXT_HINT=34, 
		COMMENT=35, TAG_OPEN=36, TAG_OPEN_EQUAL=37, BREAK=38, DOT=39, GET_DATA=40, 
		PRINT=41, TAG_CLOSE=42, TAG_CLOSE_EQUAL=43, CONTROLLER=44, EQUAL=45, SINGLE_QUOTE=46, 
		SEMICOLON=47, CHARS=48;
	public static final int
		RULE_program = 0, RULE_code_attribute = 1, RULE_for_statement = 2, RULE_if_statment = 3, 
		RULE_logical_sympol = 4, RULE_operation_if = 5, RULE_else_statment = 6, 
		RULE_comment = 7, RULE_print = 8, RULE_printattribute = 9, RULE_getdata = 10, 
		RULE_print_text = 11, RULE_variables = 12, RULE_array = 13, RULE_for_statement_variable_number = 14, 
		RULE_variable_number = 15, RULE_fast_math = 16, RULE_for_statement_adding_one = 17, 
		RULE_for_statement_minuss_one = 18, RULE_for_statement_fast_math = 19, 
		RULE_adding_one = 20, RULE_minus_one = 21, RULE_number_attribute = 22, 
		RULE_variable_text = 23, RULE_variable_get = 24, RULE_textinput = 25, 
		RULE_textinput_attribute = 26;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "code_attribute", "for_statement", "if_statment", "logical_sympol", 
			"operation_if", "else_statment", "comment", "print", "printattribute", 
			"getdata", "print_text", "variables", "array", "for_statement_variable_number", 
			"variable_number", "fast_math", "for_statement_adding_one", "for_statement_minuss_one", 
			"for_statement_fast_math", "adding_one", "minus_one", "number_attribute", 
			"variable_text", "variable_get", "textinput", "textinput_attribute"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "' '", "'\\n'", "'\\t'", "'\\r'", "'{'", "'}'", "'+'", "'/'", "'*'", 
			"'-'", "'('", "')'", "'++'", "'--'", "'||'", "'for'", "'&&'", "'+='", 
			"'-='", "'=='", "'/='", "'*='", "'!='", "'if'", "'else'", "'else if'", 
			"'array'", "'\"'", null, "','", "'Content'", "'Color'", "'count'", "'TextHint'", 
			"'//'", "'<'", "'<='", "'break'", "'.'", "'getData'", "'print'", "'>'", 
			"'>='", "'controller'", "'='", "'''", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SPACE", "UN", "UT", "UR", "CURLYOPEN", "CURLYCLOSE", "SUM", "DIVID", 
			"MULTIPLY", "MINUS", "OPENTEXT", "CLOSETEXT", "SUMS", "MINUSS", "OR", 
			"FOR", "AND", "SUM_EQUAL", "MINUS_EQUAL", "EQUALEQUAL", "DIVID_EQUAL", 
			"MULTIPLY_EQUAL", "NOT_EQUAL", "IF", "ELSE", "ELSE_IF", "Array", "DOUBLE_QUOTE", 
			"SIZES", "COMMA", "CONTENT", "COLOR", "COUNT", "TEXT_HINT", "COMMENT", 
			"TAG_OPEN", "TAG_OPEN_EQUAL", "BREAK", "DOT", "GET_DATA", "PRINT", "TAG_CLOSE", 
			"TAG_CLOSE_EQUAL", "CONTROLLER", "EQUAL", "SINGLE_QUOTE", "SEMICOLON", 
			"CHARS"
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
			setState(54);
			match(TAG_OPEN);
			setState(55);
			match(CONTROLLER);
			setState(56);
			match(TAG_CLOSE);
			setState(58); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(57);
				code_attribute();
				}
				}
				setState(60); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << IF) | (1L << ELSE) | (1L << ELSE_IF) | (1L << COMMENT) | (1L << BREAK) | (1L << PRINT) | (1L << CHARS))) != 0) );
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
		public TerminalNode BREAK() { return getToken(PARSERCONTROLLER.BREAK, 0); }
		public TerminalNode SEMICOLON() { return getToken(PARSERCONTROLLER.SEMICOLON, 0); }
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
			setState(70);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHARS:
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				variables();
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
				print();
				}
				break;
			case COMMENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(64);
				comment();
				}
				break;
			case IF:
			case ELSE_IF:
				enterOuterAlt(_localctx, 4);
				{
				setState(65);
				if_statment();
				}
				break;
			case ELSE:
				enterOuterAlt(_localctx, 5);
				{
				setState(66);
				else_statment();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 6);
				{
				setState(67);
				for_statement();
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 7);
				{
				setState(68);
				match(BREAK);
				setState(69);
				match(SEMICOLON);
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
		public TerminalNode DOT() { return getToken(PARSERCONTROLLER.DOT, 0); }
		public TerminalNode COUNT() { return getToken(PARSERCONTROLLER.COUNT, 0); }
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
			setState(72);
			match(FOR);
			setState(73);
			match(OPENTEXT);
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CHARS) {
				{
				setState(74);
				match(CHARS);
				setState(75);
				match(EQUAL);
				setState(76);
				match(CHARS);
				}
			}

			setState(79);
			match(SEMICOLON);
			{
			setState(80);
			match(CHARS);
			setState(81);
			operation_if();
			setState(86);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(82);
				match(CHARS);
				}
				break;
			case 2:
				{
				setState(83);
				match(CHARS);
				setState(84);
				match(DOT);
				setState(85);
				match(COUNT);
				}
				break;
			}
			}
			setState(88);
			match(SEMICOLON);
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CHARS) {
				{
				setState(89);
				for_statement_variable_number();
				}
			}

			setState(92);
			match(CLOSETEXT);
			setState(93);
			match(CURLYOPEN);
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << IF) | (1L << ELSE) | (1L << ELSE_IF) | (1L << COMMENT) | (1L << BREAK) | (1L << PRINT) | (1L << CHARS))) != 0)) {
				{
				{
				setState(94);
				code_attribute();
				}
				}
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(100);
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
		public TerminalNode ELSE_IF() { return getToken(PARSERCONTROLLER.ELSE_IF, 0); }
		public TerminalNode IF() { return getToken(PARSERCONTROLLER.IF, 0); }
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
			setState(104);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ELSE_IF:
				{
				{
				setState(102);
				match(ELSE_IF);
				}
				}
				break;
			case IF:
				{
				{
				setState(103);
				match(IF);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(106);
			match(OPENTEXT);
			setState(111);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHARS:
				{
				{
				setState(107);
				match(CHARS);
				}
				}
				break;
			case SINGLE_QUOTE:
				{
				{
				setState(108);
				match(SINGLE_QUOTE);
				setState(109);
				match(CHARS);
				setState(110);
				match(SINGLE_QUOTE);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(113);
			operation_if();
			setState(118);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHARS:
				{
				{
				setState(114);
				match(CHARS);
				}
				}
				break;
			case SINGLE_QUOTE:
				{
				{
				setState(115);
				match(SINGLE_QUOTE);
				setState(116);
				match(CHARS);
				setState(117);
				match(SINGLE_QUOTE);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR || _la==AND) {
				{
				{
				setState(120);
				logical_sympol();
				setState(125);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CHARS:
					{
					{
					setState(121);
					match(CHARS);
					}
					}
					break;
				case SINGLE_QUOTE:
					{
					{
					setState(122);
					match(SINGLE_QUOTE);
					setState(123);
					match(CHARS);
					setState(124);
					match(SINGLE_QUOTE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(127);
				operation_if();
				setState(132);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CHARS:
					{
					{
					setState(128);
					match(CHARS);
					}
					}
					break;
				case SINGLE_QUOTE:
					{
					{
					setState(129);
					match(SINGLE_QUOTE);
					setState(130);
					match(CHARS);
					setState(131);
					match(SINGLE_QUOTE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(139);
			match(CLOSETEXT);
			setState(140);
			match(CURLYOPEN);
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << IF) | (1L << ELSE) | (1L << ELSE_IF) | (1L << COMMENT) | (1L << BREAK) | (1L << PRINT) | (1L << CHARS))) != 0)) {
				{
				{
				setState(141);
				code_attribute();
				}
				}
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(147);
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
			setState(149);
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
			setState(151);
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
			setState(153);
			match(ELSE);
			setState(154);
			match(CURLYOPEN);
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << IF) | (1L << ELSE) | (1L << ELSE_IF) | (1L << COMMENT) | (1L << BREAK) | (1L << PRINT) | (1L << CHARS))) != 0)) {
				{
				{
				setState(155);
				code_attribute();
				}
				}
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(161);
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
			setState(163);
			match(COMMENT);
			setState(164);
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
		enterRule(_localctx, 16, RULE_print);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(PRINT);
			setState(167);
			match(OPENTEXT);
			setState(173);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(168);
					printattribute();
					setState(169);
					match(SUM);
					}
					} 
				}
				setState(175);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			setState(176);
			printattribute();
			setState(177);
			match(CLOSETEXT);
			setState(178);
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
		enterRule(_localctx, 18, RULE_printattribute);
		try {
			setState(183);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GET_DATA:
				enterOuterAlt(_localctx, 1);
				{
				setState(180);
				getdata();
				}
				break;
			case DOUBLE_QUOTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(181);
				print_text();
				}
				break;
			case CHARS:
				enterOuterAlt(_localctx, 3);
				{
				setState(182);
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
		enterRule(_localctx, 20, RULE_getdata);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(GET_DATA);
			setState(186);
			match(OPENTEXT);
			setState(191);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SINGLE_QUOTE:
				{
				{
				setState(187);
				match(SINGLE_QUOTE);
				setState(188);
				match(CHARS);
				setState(189);
				match(SINGLE_QUOTE);
				}
				}
				break;
			case CHARS:
				{
				setState(190);
				match(CHARS);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(193);
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
		enterRule(_localctx, 22, RULE_print_text);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(DOUBLE_QUOTE);
			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CHARS) {
				{
				setState(196);
				match(CHARS);
				}
			}

			setState(199);
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
		enterRule(_localctx, 24, RULE_variables);
		try {
			setState(206);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(201);
				variable_number();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(202);
				variable_text();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(203);
				variable_get();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(204);
				textinput();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(205);
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
		public TerminalNode SEMICOLON() { return getToken(PARSERCONTROLLER.SEMICOLON, 0); }
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
		enterRule(_localctx, 26, RULE_array);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(CHARS);
			setState(209);
			match(EQUAL);
			setState(210);
			match(Array);
			setState(211);
			match(OPENTEXT);
			setState(218);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(212);
					match(DOUBLE_QUOTE);
					setState(213);
					match(CHARS);
					setState(214);
					match(DOUBLE_QUOTE);
					setState(215);
					match(COMMA);
					}
					} 
				}
				setState(220);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			setState(221);
			match(DOUBLE_QUOTE);
			setState(222);
			match(CHARS);
			setState(223);
			match(DOUBLE_QUOTE);
			setState(224);
			match(CLOSETEXT);
			setState(225);
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
		enterRule(_localctx, 28, RULE_for_statement_variable_number);
		int _la;
		try {
			setState(243);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(227);
				match(CHARS);
				setState(228);
				match(EQUAL);
				setState(238);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(229);
					match(CHARS);
					}
					break;
				case 2:
					{
					setState(230);
					match(CHARS);
					setState(234); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(231);
						number_attribute();
						setState(232);
						match(CHARS);
						}
						}
						setState(236); 
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
				setState(240);
				for_statement_adding_one();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(241);
				for_statement_minuss_one();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(242);
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
		public List<TerminalNode> SINGLE_QUOTE() { return getTokens(PARSERCONTROLLER.SINGLE_QUOTE); }
		public TerminalNode SINGLE_QUOTE(int i) {
			return getToken(PARSERCONTROLLER.SINGLE_QUOTE, i);
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
		enterRule(_localctx, 30, RULE_variable_number);
		int _la;
		try {
			setState(269);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(245);
				match(CHARS);
				setState(246);
				match(EQUAL);
				setState(247);
				match(CHARS);
				setState(262);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUM) | (1L << DIVID) | (1L << MULTIPLY) | (1L << MINUS))) != 0)) {
					{
					{
					setState(248);
					number_attribute();
					setState(258);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case CHARS:
						{
						setState(249);
						match(CHARS);
						}
						break;
					case SINGLE_QUOTE:
						{
						{
						setState(250);
						match(SINGLE_QUOTE);
						setState(254);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==CHARS) {
							{
							{
							setState(251);
							match(CHARS);
							}
							}
							setState(256);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(257);
						match(SINGLE_QUOTE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					setState(264);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(265);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(266);
				adding_one();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(267);
				minus_one();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(268);
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
		enterRule(_localctx, 32, RULE_fast_math);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			match(CHARS);
			setState(272);
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
			setState(273);
			match(CHARS);
			}
			setState(274);
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
		enterRule(_localctx, 34, RULE_for_statement_adding_one);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			match(CHARS);
			setState(277);
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
		enterRule(_localctx, 36, RULE_for_statement_minuss_one);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			match(CHARS);
			setState(280);
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
		enterRule(_localctx, 38, RULE_for_statement_fast_math);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			match(CHARS);
			setState(283);
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
			setState(284);
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
		enterRule(_localctx, 40, RULE_adding_one);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			match(CHARS);
			setState(287);
			match(SUMS);
			setState(288);
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
		enterRule(_localctx, 42, RULE_minus_one);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			match(CHARS);
			setState(291);
			match(MINUSS);
			setState(292);
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
		enterRule(_localctx, 44, RULE_number_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
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
		enterRule(_localctx, 46, RULE_variable_text);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			match(CHARS);
			setState(297);
			match(EQUAL);
			setState(298);
			match(SINGLE_QUOTE);
			setState(302);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CHARS) {
				{
				{
				setState(299);
				match(CHARS);
				}
				}
				setState(304);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(305);
			match(SINGLE_QUOTE);
			setState(317);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SUM) {
				{
				{
				setState(306);
				match(SUM);
				setState(307);
				match(SINGLE_QUOTE);
				setState(311);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CHARS) {
					{
					{
					setState(308);
					match(CHARS);
					}
					}
					setState(313);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(314);
				match(SINGLE_QUOTE);
				}
				}
				setState(319);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(320);
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
		enterRule(_localctx, 48, RULE_variable_get);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			match(CHARS);
			setState(323);
			match(EQUAL);
			setState(324);
			getdata();
			setState(325);
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
		enterRule(_localctx, 50, RULE_textinput);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			match(CHARS);
			setState(328);
			match(EQUAL);
			setState(329);
			match(CHARS);
			setState(330);
			match(DOT);
			setState(331);
			textinput_attribute();
			setState(332);
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
		enterRule(_localctx, 52, RULE_textinput_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
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
		"\u0004\u00010\u0151\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0004\u0000;\b\u0000\u000b\u0000\f\u0000<\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0003\u0001G\b\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0003\u0002N\b\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u0002W\b\u0002\u0001\u0002\u0001\u0002\u0003\u0002[\b\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0005\u0002`\b\u0002\n\u0002\f\u0002c\t\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0003\u0003i\b\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"p\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003w\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u0003~\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003\u0085\b\u0003\u0005\u0003\u0087\b"+
		"\u0003\n\u0003\f\u0003\u008a\t\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0005\u0003\u008f\b\u0003\n\u0003\f\u0003\u0092\t\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0005\u0006\u009d\b\u0006\n\u0006\f\u0006\u00a0\t\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0005\b\u00ac\b\b\n\b\f\b\u00af\t\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0003\t\u00b8\b\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u00c0\b\n\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0003\u000b\u00c6\b\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00cf\b\f\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u00d9"+
		"\b\r\n\r\f\r\u00dc\t\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0004\u000e\u00eb\b\u000e\u000b\u000e\f\u000e\u00ec\u0003"+
		"\u000e\u00ef\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00f4"+
		"\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0005\u000f\u00fd\b\u000f\n\u000f\f\u000f\u0100\t\u000f"+
		"\u0001\u000f\u0003\u000f\u0103\b\u000f\u0005\u000f\u0105\b\u000f\n\u000f"+
		"\f\u000f\u0108\t\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0003\u000f\u010e\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0005\u0017\u012d\b\u0017\n\u0017\f\u0017\u0130\t\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u0136\b\u0017\n"+
		"\u0017\f\u0017\u0139\t\u0017\u0001\u0017\u0005\u0017\u013c\b\u0017\n\u0017"+
		"\f\u0017\u013f\t\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0000\u0000\u001b\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.024\u0000\u0005\u0002"+
		"\u0000\u000f\u000f\u0011\u0011\u0004\u0000\u0014\u0014\u0017\u0017$%*"+
		"+\u0002\u0000\u0012\u0013\u0015\u0016\u0001\u0000\u0007\n\u0002\u0000"+
		"\u001f \"\"\u0160\u00006\u0001\u0000\u0000\u0000\u0002F\u0001\u0000\u0000"+
		"\u0000\u0004H\u0001\u0000\u0000\u0000\u0006h\u0001\u0000\u0000\u0000\b"+
		"\u0095\u0001\u0000\u0000\u0000\n\u0097\u0001\u0000\u0000\u0000\f\u0099"+
		"\u0001\u0000\u0000\u0000\u000e\u00a3\u0001\u0000\u0000\u0000\u0010\u00a6"+
		"\u0001\u0000\u0000\u0000\u0012\u00b7\u0001\u0000\u0000\u0000\u0014\u00b9"+
		"\u0001\u0000\u0000\u0000\u0016\u00c3\u0001\u0000\u0000\u0000\u0018\u00ce"+
		"\u0001\u0000\u0000\u0000\u001a\u00d0\u0001\u0000\u0000\u0000\u001c\u00f3"+
		"\u0001\u0000\u0000\u0000\u001e\u010d\u0001\u0000\u0000\u0000 \u010f\u0001"+
		"\u0000\u0000\u0000\"\u0114\u0001\u0000\u0000\u0000$\u0117\u0001\u0000"+
		"\u0000\u0000&\u011a\u0001\u0000\u0000\u0000(\u011e\u0001\u0000\u0000\u0000"+
		"*\u0122\u0001\u0000\u0000\u0000,\u0126\u0001\u0000\u0000\u0000.\u0128"+
		"\u0001\u0000\u0000\u00000\u0142\u0001\u0000\u0000\u00002\u0147\u0001\u0000"+
		"\u0000\u00004\u014e\u0001\u0000\u0000\u000067\u0005$\u0000\u000078\u0005"+
		",\u0000\u00008:\u0005*\u0000\u00009;\u0003\u0002\u0001\u0000:9\u0001\u0000"+
		"\u0000\u0000;<\u0001\u0000\u0000\u0000<:\u0001\u0000\u0000\u0000<=\u0001"+
		"\u0000\u0000\u0000=\u0001\u0001\u0000\u0000\u0000>G\u0003\u0018\f\u0000"+
		"?G\u0003\u0010\b\u0000@G\u0003\u000e\u0007\u0000AG\u0003\u0006\u0003\u0000"+
		"BG\u0003\f\u0006\u0000CG\u0003\u0004\u0002\u0000DE\u0005&\u0000\u0000"+
		"EG\u0005/\u0000\u0000F>\u0001\u0000\u0000\u0000F?\u0001\u0000\u0000\u0000"+
		"F@\u0001\u0000\u0000\u0000FA\u0001\u0000\u0000\u0000FB\u0001\u0000\u0000"+
		"\u0000FC\u0001\u0000\u0000\u0000FD\u0001\u0000\u0000\u0000G\u0003\u0001"+
		"\u0000\u0000\u0000HI\u0005\u0010\u0000\u0000IM\u0005\u000b\u0000\u0000"+
		"JK\u00050\u0000\u0000KL\u0005-\u0000\u0000LN\u00050\u0000\u0000MJ\u0001"+
		"\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000"+
		"OP\u0005/\u0000\u0000PQ\u00050\u0000\u0000QV\u0003\n\u0005\u0000RW\u0005"+
		"0\u0000\u0000ST\u00050\u0000\u0000TU\u0005\'\u0000\u0000UW\u0005!\u0000"+
		"\u0000VR\u0001\u0000\u0000\u0000VS\u0001\u0000\u0000\u0000WX\u0001\u0000"+
		"\u0000\u0000XZ\u0005/\u0000\u0000Y[\u0003\u001c\u000e\u0000ZY\u0001\u0000"+
		"\u0000\u0000Z[\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\]\u0005"+
		"\f\u0000\u0000]a\u0005\u0005\u0000\u0000^`\u0003\u0002\u0001\u0000_^\u0001"+
		"\u0000\u0000\u0000`c\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000"+
		"ab\u0001\u0000\u0000\u0000bd\u0001\u0000\u0000\u0000ca\u0001\u0000\u0000"+
		"\u0000de\u0005\u0006\u0000\u0000e\u0005\u0001\u0000\u0000\u0000fi\u0005"+
		"\u001a\u0000\u0000gi\u0005\u0018\u0000\u0000hf\u0001\u0000\u0000\u0000"+
		"hg\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000jo\u0005\u000b\u0000"+
		"\u0000kp\u00050\u0000\u0000lm\u0005.\u0000\u0000mn\u00050\u0000\u0000"+
		"np\u0005.\u0000\u0000ok\u0001\u0000\u0000\u0000ol\u0001\u0000\u0000\u0000"+
		"pq\u0001\u0000\u0000\u0000qv\u0003\n\u0005\u0000rw\u00050\u0000\u0000"+
		"st\u0005.\u0000\u0000tu\u00050\u0000\u0000uw\u0005.\u0000\u0000vr\u0001"+
		"\u0000\u0000\u0000vs\u0001\u0000\u0000\u0000w\u0088\u0001\u0000\u0000"+
		"\u0000x}\u0003\b\u0004\u0000y~\u00050\u0000\u0000z{\u0005.\u0000\u0000"+
		"{|\u00050\u0000\u0000|~\u0005.\u0000\u0000}y\u0001\u0000\u0000\u0000}"+
		"z\u0001\u0000\u0000\u0000~\u007f\u0001\u0000\u0000\u0000\u007f\u0084\u0003"+
		"\n\u0005\u0000\u0080\u0085\u00050\u0000\u0000\u0081\u0082\u0005.\u0000"+
		"\u0000\u0082\u0083\u00050\u0000\u0000\u0083\u0085\u0005.\u0000\u0000\u0084"+
		"\u0080\u0001\u0000\u0000\u0000\u0084\u0081\u0001\u0000\u0000\u0000\u0085"+
		"\u0087\u0001\u0000\u0000\u0000\u0086x\u0001\u0000\u0000\u0000\u0087\u008a"+
		"\u0001\u0000\u0000\u0000\u0088\u0086\u0001\u0000\u0000\u0000\u0088\u0089"+
		"\u0001\u0000\u0000\u0000\u0089\u008b\u0001\u0000\u0000\u0000\u008a\u0088"+
		"\u0001\u0000\u0000\u0000\u008b\u008c\u0005\f\u0000\u0000\u008c\u0090\u0005"+
		"\u0005\u0000\u0000\u008d\u008f\u0003\u0002\u0001\u0000\u008e\u008d\u0001"+
		"\u0000\u0000\u0000\u008f\u0092\u0001\u0000\u0000\u0000\u0090\u008e\u0001"+
		"\u0000\u0000\u0000\u0090\u0091\u0001\u0000\u0000\u0000\u0091\u0093\u0001"+
		"\u0000\u0000\u0000\u0092\u0090\u0001\u0000\u0000\u0000\u0093\u0094\u0005"+
		"\u0006\u0000\u0000\u0094\u0007\u0001\u0000\u0000\u0000\u0095\u0096\u0007"+
		"\u0000\u0000\u0000\u0096\t\u0001\u0000\u0000\u0000\u0097\u0098\u0007\u0001"+
		"\u0000\u0000\u0098\u000b\u0001\u0000\u0000\u0000\u0099\u009a\u0005\u0019"+
		"\u0000\u0000\u009a\u009e\u0005\u0005\u0000\u0000\u009b\u009d\u0003\u0002"+
		"\u0001\u0000\u009c\u009b\u0001\u0000\u0000\u0000\u009d\u00a0\u0001\u0000"+
		"\u0000\u0000\u009e\u009c\u0001\u0000\u0000\u0000\u009e\u009f\u0001\u0000"+
		"\u0000\u0000\u009f\u00a1\u0001\u0000\u0000\u0000\u00a0\u009e\u0001\u0000"+
		"\u0000\u0000\u00a1\u00a2\u0005\u0006\u0000\u0000\u00a2\r\u0001\u0000\u0000"+
		"\u0000\u00a3\u00a4\u0005#\u0000\u0000\u00a4\u00a5\u00050\u0000\u0000\u00a5"+
		"\u000f\u0001\u0000\u0000\u0000\u00a6\u00a7\u0005)\u0000\u0000\u00a7\u00ad"+
		"\u0005\u000b\u0000\u0000\u00a8\u00a9\u0003\u0012\t\u0000\u00a9\u00aa\u0005"+
		"\u0007\u0000\u0000\u00aa\u00ac\u0001\u0000\u0000\u0000\u00ab\u00a8\u0001"+
		"\u0000\u0000\u0000\u00ac\u00af\u0001\u0000\u0000\u0000\u00ad\u00ab\u0001"+
		"\u0000\u0000\u0000\u00ad\u00ae\u0001\u0000\u0000\u0000\u00ae\u00b0\u0001"+
		"\u0000\u0000\u0000\u00af\u00ad\u0001\u0000\u0000\u0000\u00b0\u00b1\u0003"+
		"\u0012\t\u0000\u00b1\u00b2\u0005\f\u0000\u0000\u00b2\u00b3\u0005/\u0000"+
		"\u0000\u00b3\u0011\u0001\u0000\u0000\u0000\u00b4\u00b8\u0003\u0014\n\u0000"+
		"\u00b5\u00b8\u0003\u0016\u000b\u0000\u00b6\u00b8\u00050\u0000\u0000\u00b7"+
		"\u00b4\u0001\u0000\u0000\u0000\u00b7\u00b5\u0001\u0000\u0000\u0000\u00b7"+
		"\u00b6\u0001\u0000\u0000\u0000\u00b8\u0013\u0001\u0000\u0000\u0000\u00b9"+
		"\u00ba\u0005(\u0000\u0000\u00ba\u00bf\u0005\u000b\u0000\u0000\u00bb\u00bc"+
		"\u0005.\u0000\u0000\u00bc\u00bd\u00050\u0000\u0000\u00bd\u00c0\u0005."+
		"\u0000\u0000\u00be\u00c0\u00050\u0000\u0000\u00bf\u00bb\u0001\u0000\u0000"+
		"\u0000\u00bf\u00be\u0001\u0000\u0000\u0000\u00c0\u00c1\u0001\u0000\u0000"+
		"\u0000\u00c1\u00c2\u0005\f\u0000\u0000\u00c2\u0015\u0001\u0000\u0000\u0000"+
		"\u00c3\u00c5\u0005\u001c\u0000\u0000\u00c4\u00c6\u00050\u0000\u0000\u00c5"+
		"\u00c4\u0001\u0000\u0000\u0000\u00c5\u00c6\u0001\u0000\u0000\u0000\u00c6"+
		"\u00c7\u0001\u0000\u0000\u0000\u00c7\u00c8\u0005\u001c\u0000\u0000\u00c8"+
		"\u0017\u0001\u0000\u0000\u0000\u00c9\u00cf\u0003\u001e\u000f\u0000\u00ca"+
		"\u00cf\u0003.\u0017\u0000\u00cb\u00cf\u00030\u0018\u0000\u00cc\u00cf\u0003"+
		"2\u0019\u0000\u00cd\u00cf\u0003\u001a\r\u0000\u00ce\u00c9\u0001\u0000"+
		"\u0000\u0000\u00ce\u00ca\u0001\u0000\u0000\u0000\u00ce\u00cb\u0001\u0000"+
		"\u0000\u0000\u00ce\u00cc\u0001\u0000\u0000\u0000\u00ce\u00cd\u0001\u0000"+
		"\u0000\u0000\u00cf\u0019\u0001\u0000\u0000\u0000\u00d0\u00d1\u00050\u0000"+
		"\u0000\u00d1\u00d2\u0005-\u0000\u0000\u00d2\u00d3\u0005\u001b\u0000\u0000"+
		"\u00d3\u00da\u0005\u000b\u0000\u0000\u00d4\u00d5\u0005\u001c\u0000\u0000"+
		"\u00d5\u00d6\u00050\u0000\u0000\u00d6\u00d7\u0005\u001c\u0000\u0000\u00d7"+
		"\u00d9\u0005\u001e\u0000\u0000\u00d8\u00d4\u0001\u0000\u0000\u0000\u00d9"+
		"\u00dc\u0001\u0000\u0000\u0000\u00da\u00d8\u0001\u0000\u0000\u0000\u00da"+
		"\u00db\u0001\u0000\u0000\u0000\u00db\u00dd\u0001\u0000\u0000\u0000\u00dc"+
		"\u00da\u0001\u0000\u0000\u0000\u00dd\u00de\u0005\u001c\u0000\u0000\u00de"+
		"\u00df\u00050\u0000\u0000\u00df\u00e0\u0005\u001c\u0000\u0000\u00e0\u00e1"+
		"\u0005\f\u0000\u0000\u00e1\u00e2\u0005/\u0000\u0000\u00e2\u001b\u0001"+
		"\u0000\u0000\u0000\u00e3\u00e4\u00050\u0000\u0000\u00e4\u00ee\u0005-\u0000"+
		"\u0000\u00e5\u00ef\u00050\u0000\u0000\u00e6\u00ea\u00050\u0000\u0000\u00e7"+
		"\u00e8\u0003,\u0016\u0000\u00e8\u00e9\u00050\u0000\u0000\u00e9\u00eb\u0001"+
		"\u0000\u0000\u0000\u00ea\u00e7\u0001\u0000\u0000\u0000\u00eb\u00ec\u0001"+
		"\u0000\u0000\u0000\u00ec\u00ea\u0001\u0000\u0000\u0000\u00ec\u00ed\u0001"+
		"\u0000\u0000\u0000\u00ed\u00ef\u0001\u0000\u0000\u0000\u00ee\u00e5\u0001"+
		"\u0000\u0000\u0000\u00ee\u00e6\u0001\u0000\u0000\u0000\u00ef\u00f4\u0001"+
		"\u0000\u0000\u0000\u00f0\u00f4\u0003\"\u0011\u0000\u00f1\u00f4\u0003$"+
		"\u0012\u0000\u00f2\u00f4\u0003&\u0013\u0000\u00f3\u00e3\u0001\u0000\u0000"+
		"\u0000\u00f3\u00f0\u0001\u0000\u0000\u0000\u00f3\u00f1\u0001\u0000\u0000"+
		"\u0000\u00f3\u00f2\u0001\u0000\u0000\u0000\u00f4\u001d\u0001\u0000\u0000"+
		"\u0000\u00f5\u00f6\u00050\u0000\u0000\u00f6\u00f7\u0005-\u0000\u0000\u00f7"+
		"\u0106\u00050\u0000\u0000\u00f8\u0102\u0003,\u0016\u0000\u00f9\u0103\u0005"+
		"0\u0000\u0000\u00fa\u00fe\u0005.\u0000\u0000\u00fb\u00fd\u00050\u0000"+
		"\u0000\u00fc\u00fb\u0001\u0000\u0000\u0000\u00fd\u0100\u0001\u0000\u0000"+
		"\u0000\u00fe\u00fc\u0001\u0000\u0000\u0000\u00fe\u00ff\u0001\u0000\u0000"+
		"\u0000\u00ff\u0101\u0001\u0000\u0000\u0000\u0100\u00fe\u0001\u0000\u0000"+
		"\u0000\u0101\u0103\u0005.\u0000\u0000\u0102\u00f9\u0001\u0000\u0000\u0000"+
		"\u0102\u00fa\u0001\u0000\u0000\u0000\u0103\u0105\u0001\u0000\u0000\u0000"+
		"\u0104\u00f8\u0001\u0000\u0000\u0000\u0105\u0108\u0001\u0000\u0000\u0000"+
		"\u0106\u0104\u0001\u0000\u0000\u0000\u0106\u0107\u0001\u0000\u0000\u0000"+
		"\u0107\u0109\u0001\u0000\u0000\u0000\u0108\u0106\u0001\u0000\u0000\u0000"+
		"\u0109\u010e\u0005/\u0000\u0000\u010a\u010e\u0003(\u0014\u0000\u010b\u010e"+
		"\u0003*\u0015\u0000\u010c\u010e\u0003 \u0010\u0000\u010d\u00f5\u0001\u0000"+
		"\u0000\u0000\u010d\u010a\u0001\u0000\u0000\u0000\u010d\u010b\u0001\u0000"+
		"\u0000\u0000\u010d\u010c\u0001\u0000\u0000\u0000\u010e\u001f\u0001\u0000"+
		"\u0000\u0000\u010f\u0110\u00050\u0000\u0000\u0110\u0111\u0007\u0002\u0000"+
		"\u0000\u0111\u0112\u00050\u0000\u0000\u0112\u0113\u0005/\u0000\u0000\u0113"+
		"!\u0001\u0000\u0000\u0000\u0114\u0115\u00050\u0000\u0000\u0115\u0116\u0005"+
		"\r\u0000\u0000\u0116#\u0001\u0000\u0000\u0000\u0117\u0118\u00050\u0000"+
		"\u0000\u0118\u0119\u0005\u000e\u0000\u0000\u0119%\u0001\u0000\u0000\u0000"+
		"\u011a\u011b\u00050\u0000\u0000\u011b\u011c\u0007\u0002\u0000\u0000\u011c"+
		"\u011d\u00050\u0000\u0000\u011d\'\u0001\u0000\u0000\u0000\u011e\u011f"+
		"\u00050\u0000\u0000\u011f\u0120\u0005\r\u0000\u0000\u0120\u0121\u0005"+
		"/\u0000\u0000\u0121)\u0001\u0000\u0000\u0000\u0122\u0123\u00050\u0000"+
		"\u0000\u0123\u0124\u0005\u000e\u0000\u0000\u0124\u0125\u0005/\u0000\u0000"+
		"\u0125+\u0001\u0000\u0000\u0000\u0126\u0127\u0007\u0003\u0000\u0000\u0127"+
		"-\u0001\u0000\u0000\u0000\u0128\u0129\u00050\u0000\u0000\u0129\u012a\u0005"+
		"-\u0000\u0000\u012a\u012e\u0005.\u0000\u0000\u012b\u012d\u00050\u0000"+
		"\u0000\u012c\u012b\u0001\u0000\u0000\u0000\u012d\u0130\u0001\u0000\u0000"+
		"\u0000\u012e\u012c\u0001\u0000\u0000\u0000\u012e\u012f\u0001\u0000\u0000"+
		"\u0000\u012f\u0131\u0001\u0000\u0000\u0000\u0130\u012e\u0001\u0000\u0000"+
		"\u0000\u0131\u013d\u0005.\u0000\u0000\u0132\u0133\u0005\u0007\u0000\u0000"+
		"\u0133\u0137\u0005.\u0000\u0000\u0134\u0136\u00050\u0000\u0000\u0135\u0134"+
		"\u0001\u0000\u0000\u0000\u0136\u0139\u0001\u0000\u0000\u0000\u0137\u0135"+
		"\u0001\u0000\u0000\u0000\u0137\u0138\u0001\u0000\u0000\u0000\u0138\u013a"+
		"\u0001\u0000\u0000\u0000\u0139\u0137\u0001\u0000\u0000\u0000\u013a\u013c"+
		"\u0005.\u0000\u0000\u013b\u0132\u0001\u0000\u0000\u0000\u013c\u013f\u0001"+
		"\u0000\u0000\u0000\u013d\u013b\u0001\u0000\u0000\u0000\u013d\u013e\u0001"+
		"\u0000\u0000\u0000\u013e\u0140\u0001\u0000\u0000\u0000\u013f\u013d\u0001"+
		"\u0000\u0000\u0000\u0140\u0141\u0005/\u0000\u0000\u0141/\u0001\u0000\u0000"+
		"\u0000\u0142\u0143\u00050\u0000\u0000\u0143\u0144\u0005-\u0000\u0000\u0144"+
		"\u0145\u0003\u0014\n\u0000\u0145\u0146\u0005/\u0000\u0000\u01461\u0001"+
		"\u0000\u0000\u0000\u0147\u0148\u00050\u0000\u0000\u0148\u0149\u0005-\u0000"+
		"\u0000\u0149\u014a\u00050\u0000\u0000\u014a\u014b\u0005\'\u0000\u0000"+
		"\u014b\u014c\u00034\u001a\u0000\u014c\u014d\u0005/\u0000\u0000\u014d3"+
		"\u0001\u0000\u0000\u0000\u014e\u014f\u0007\u0004\u0000\u0000\u014f5\u0001"+
		"\u0000\u0000\u0000\u001e<FMVZahov}\u0084\u0088\u0090\u009e\u00ad\u00b7"+
		"\u00bf\u00c5\u00ce\u00da\u00ec\u00ee\u00f3\u00fe\u0102\u0106\u010d\u012e"+
		"\u0137\u013d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}