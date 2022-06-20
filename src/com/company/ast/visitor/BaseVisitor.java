package com.company.ast.visitor;

import com.company.ast.Nodes.*;
import generated.PARSERCONTROLLER;
import generated.PARSERCONTROLLERBaseVisitor;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;

public class BaseVisitor extends PARSERCONTROLLERBaseVisitor{
    @Override
    public Object visitFor_statement(PARSERCONTROLLER.For_statementContext ctx) {
        return super.visitFor_statement(ctx);
    }
    @Override
    public If_Statement visitIf_statment(PARSERCONTROLLER.If_statmentContext ctx) {
        If_Statement if_statement = new If_Statement();
        ArrayList<Code_attribuite>code_attributes = new ArrayList<>();
        for(int i = 0;i<ctx.code_attribute().size();i++) {
            code_attributes.add(visitCode_attribute(ctx.code_attribute(i)));
        }
        if_statement.setCode_attributes(code_attributes);
        if(ctx.ELSE()!=null){
            if_statement.setName_statement(ctx.IF().getText()+ctx.ELSE().getText());
        }
        else if(ctx.IF()!=null) {
            if_statement.setName_statement(ctx.IF().getText());
        }
            if (ctx.CHARS(0) != null)
                if_statement.setVariable_one(ctx.CHARS(0).getText());
            if (ctx.CHARS(1) != null)
                if_statement.setVariable_two(ctx.CHARS(1).getText());
        ArrayList<OperationIF>operationIFS = new ArrayList<>();
        for(int i=0;i<ctx.operation_if().size();i++){
            operationIFS.add(visitOperation_if(ctx.operation_if(i)));
        }
        if_statement.setOperationIFS(operationIFS);
        ArrayList<Logic_symbol>logic_symbols = new ArrayList<>();
        for(int i = 0 ; i<ctx.logical_sympol().size();i++){
            logic_symbols.add(visitLogical_sympol(ctx.logical_sympol(i)));
        }
        if_statement.setLogic_symbol(logic_symbols);
        return if_statement;
    }

    @Override
    public Logic_symbol visitLogical_sympol(PARSERCONTROLLER.Logical_sympolContext ctx) {
        Logic_symbol logic_symbol = new Logic_symbol();
        if(ctx.OR()!=null) {
            logic_symbol.setSymbol(ctx.OR().getText());
        }else{
            logic_symbol.setSymbol(ctx.AND().getText());
        }
        return logic_symbol;
    }

    @Override
    public OperationIF visitOperation_if(PARSERCONTROLLER.Operation_ifContext ctx) {
       OperationIF operationIF  = new OperationIF();
       if(ctx.TAG_CLOSE()!=null){
           operationIF.setOperation(ctx.TAG_CLOSE().getText());
       }else if (ctx.TAG_OPEN()!=null){
          operationIF.setOperation(ctx.TAG_OPEN().getText());
        }else if(ctx.NOT_EQUAL()!=null){
           operationIF.setOperation(ctx.NOT_EQUAL().getText());
       }else if (ctx.EQUALEQUAL()!=null){
           operationIF.setOperation(ctx.EQUALEQUAL().getText());
       }else if (ctx.TAG_CLOSE_EQUAL()!=null){
           operationIF.setOperation(ctx.TAG_CLOSE_EQUAL().getText());
       }else if (ctx.TAG_OPEN_EQUAL()!=null) {
           operationIF.setOperation(ctx.TAG_OPEN_EQUAL().getText());
       }
       return operationIF;
    }
    @Override
    public Else_statement visitElse_statment(PARSERCONTROLLER.Else_statmentContext ctx) {
        Else_statement else_statement = new Else_statement();
        ArrayList<Code_attribuite>code_attributes = new ArrayList<>();
        for(int i = 0;i<ctx.code_attribute().size();i++)
        {
            code_attributes.add(visitCode_attribute(ctx.code_attribute(i)));
        }
        else_statement.setCode_attributes(code_attributes);
        return else_statement;
    }

    @Override
    public Program visitProgram(PARSERCONTROLLER.ProgramContext ctx) {
        Program program = new Program();
        ArrayList<Code_attribuite>code_attribuites = new ArrayList<>();
        for(int i = 0;i<ctx.code_attribute().size();i++)
        {
            code_attribuites.add(visitCode_attribute(ctx.code_attribute(i)));
        }
        program.setCode_attribuites(code_attribuites);
        return program;
    }

    @Override
    public Code_attribuite visitCode_attribute(PARSERCONTROLLER.Code_attributeContext ctx) {
        Code_attribuite code_attribuite=new Code_attribuite();
        if(ctx.variables()!=null)
        {
            code_attribuite.setVariables(visitVariables(ctx.variables()));
        }
         if(ctx.on_click()!=null)
        {
            code_attribuite.setClicking(visitOn_click(ctx.on_click()));
        }
         if (ctx.if_statment()!=null)
        {
            code_attribuite.setIf_statement(visitIf_statment(ctx.if_statment()));
        }
        return code_attribuite;
    }

    @Override
    public Object visitComment(PARSERCONTROLLER.CommentContext ctx) {
        return super.visitComment(ctx);
    }

    @Override
    public Clicking visitOn_click(PARSERCONTROLLER.On_clickContext ctx) {
        Clicking clicking = new Clicking();
        clicking.setClick(ctx.CHARS().getText());
        ArrayList<Attribute_click> attribute_clicks = new ArrayList<>();
        for(int i =0 ;i<ctx.click_attribute().size();i++){
              attribute_clicks.add(visitClick_attribute(ctx.click_attribute(i)));
        }
        clicking.setAttribute_clickList(attribute_clicks);
        return clicking;
    }

    @Override
    public Attribute_click visitClick_attribute(PARSERCONTROLLER.Click_attributeContext ctx) {
        Attribute_click attribute_click = new Attribute_click();
        if(ctx.text()!=null)
        {
            attribute_click.setText(visitText(ctx.text()));
            attribute_click.setName_attribute(ctx.text().CHARS().getText());
        }
       if(ctx.button()!=null)
       {
           attribute_click.setName_attribute(ctx.button().CHARS().getText());
           attribute_click.setButton(visitButton(ctx.button()));
       }
       return attribute_click;
    }

    @Override
    public Text visitText(PARSERCONTROLLER.TextContext ctx) {
        Text text = new Text();
        text.setName_text(ctx.CHARS().getText());
        text.setText_attribute(visitText_attribute(ctx.text_attribute()));
        return  text;
    }

    @Override
    public Text_Attribute visitText_attribute(PARSERCONTROLLER.Text_attributeContext ctx) {
      Text_Attribute text_attribute = new Text_Attribute();
     if(ctx.color()!=null)
      text_attribute.setColor(visitColor(ctx.color()));
     if(ctx.content()!=null)
      text_attribute.setContent(visitContent(ctx.content()));
      return text_attribute;
    }

    @Override
    public String visitContent(PARSERCONTROLLER.ContentContext ctx) {
            return ctx.CHARS().getText();
    }

    @Override
    public String visitColor(PARSERCONTROLLER.ColorContext ctx) {
          return ctx.COLORS().getText();
    }

    @Override
    public Button visitButton(PARSERCONTROLLER.ButtonContext ctx) {
        Button button = new Button();
        button.setName_button(ctx.CHARS().getText());
        button.setButton_attribute(visitButton_attribute(ctx.button_attribute()));
        return button;
    }

    @Override
    public Button_Attribute visitButton_attribute(PARSERCONTROLLER.Button_attributeContext ctx) {
        Button_Attribute button_attribute = new Button_Attribute();
        if(ctx.width()!=null)
        button_attribute.setWidth(visitWidth(ctx.width()));
        if(ctx.background()!=null)
        button_attribute.setBackground(visitBackground(ctx.background()));
        return button_attribute;
    }

    @Override
    public String visitWidth(PARSERCONTROLLER.WidthContext ctx) {

        return ctx.SIZES().getText();
    }

    @Override
    public String visitBackground(PARSERCONTROLLER.BackgroundContext ctx) {

        return ctx.COLORS().getText();
    }

    @Override
    public Object visitPrint(PARSERCONTROLLER.PrintContext ctx) {
        return super.visitPrint(ctx);
    }

    @Override
    public Object visitPrintattribute(PARSERCONTROLLER.PrintattributeContext ctx) {
        return super.visitPrintattribute(ctx);
    }

    @Override
    public Object visitGetdata(PARSERCONTROLLER.GetdataContext ctx) {
        return super.visitGetdata(ctx);
    }

    @Override
    public Object visitPrint_text(PARSERCONTROLLER.Print_textContext ctx) {
        return super.visitPrint_text(ctx);
    }

    @Override
    public Variables visitVariables(PARSERCONTROLLER.VariablesContext ctx) {
        Variables variables = new Variables();
        if(ctx.variable_text()!=null){
            variables.setVariables_text(visitVariable_text(ctx.variable_text()));
        }
        if(ctx.variable_number()!=null){
            variables.setVariable_numbers(visitVariable_number(ctx.variable_number()));
        }
        if(ctx.textinput()!=null){
            variables.setTextInput(visitTextinput(ctx.textinput()));
        }
        return variables;
    }

    @Override
    public Variable_Numbers visitVariable_number(PARSERCONTROLLER.Variable_numberContext ctx) {
        Variable_Numbers variable_numbers = new Variable_Numbers();
        variable_numbers.setName_variable(ctx.CHARS(0).getText());
        ArrayList<String>values_variables = new ArrayList<>();
        ArrayList<Number_Attribute>number_attributes = new ArrayList<>();
        for(int i = 1 ; i<ctx.CHARS().size();i++){
            values_variables.add(ctx.CHARS(i).getText());
        }
        for(int i = 0 ;i<ctx.number_attribute().size();i++){
            number_attributes.add(visitNumber_attribute(ctx.number_attribute(i)));
        }
        variable_numbers.setValues_variables(values_variables);
        variable_numbers.setName_attributes(number_attributes);
        return variable_numbers;
    }

    @Override
    public Fast_math visitFast_math(PARSERCONTROLLER.Fast_mathContext ctx) {
        Fast_math fast_math = new Fast_math();

        if (ctx.CHARS()!=null)
        {
            fast_math.setName(ctx.CHARS(0).getText());
            fast_math.setNumber(ctx.CHARS(1).getText());
        }

        if (ctx.SUM_EQUAL()!=null)
            fast_math.setOperation(ctx.SUM_EQUAL().getText());

        else if (ctx.MINUS_EQUAL()!=null)
            fast_math.setOperation(ctx.MINUS_EQUAL().getText());

        else if(ctx.DIVID_EQUAL()!=null)
            fast_math.setOperation(ctx.DIVID_EQUAL().getText());

        else if (ctx.MULTIPLY_EQUAL()!=null)
            fast_math.setOperation(ctx.MULTIPLY_EQUAL().getText());
        return fast_math;

    }

    @Override
    public Variables visitAdding_one(PARSERCONTROLLER.Adding_oneContext ctx) {
        Variables variables = new Variables();


        if(ctx.CHARS()!=null)
            variables.setName(ctx.CHARS().getText());

        if(ctx.SUMS()!=null)
            variables.setOneOperation(ctx.SUMS().getText());

        return variables;
    }

    @Override
    public Variables visitMinus_one(PARSERCONTROLLER.Minus_oneContext ctx) {

        Variables variables = new Variables();

        if (ctx.CHARS()!=null)
        variables.setName(ctx.CHARS().getText());

        if (ctx.MINUSS()!=null)
            variables.setOneOperation(ctx.MINUSS().getText());

        return variables;
    }

    @Override
    public Number_Attribute visitNumber_attribute(PARSERCONTROLLER.Number_attributeContext ctx) {
       Number_Attribute number_attribute = new Number_Attribute();
        if (ctx.SUM()!=null)
        number_attribute.setOperator(ctx.SUM().getText());
        if (ctx.DIVID()!=null)
            number_attribute.setOperator(ctx.DIVID().getText());
        if (ctx.MULTIPLY()!=null)
            number_attribute.setOperator(ctx.MULTIPLY().getText());
        if (ctx.MINUS()!=null)
            number_attribute.setOperator(ctx.MINUS().getText());
        return number_attribute;
    }

    @Override
    public Variables_Text visitVariable_text(PARSERCONTROLLER.Variable_textContext ctx) {
        Variables_Text variables_text = new Variables_Text();
        variables_text.setName_variable(ctx.CHARS(0).getText());
        ArrayList<String>values_variables = new ArrayList<>();
        ArrayList<String>operators = new ArrayList<>();
        for(int i = 1;i<ctx.CHARS().size();i++){
            values_variables.add(ctx.CHARS(i).getText());
        }
        for(int i = 0 ;i < ctx.SUM().size();i++){
            operators.add(ctx.SUM(i).getText());
        }
        variables_text.setValues_variables(values_variables);
        variables_text.setOperator(operators);
        return variables_text;
    }


    @Override
    public Object visitVariable_get(PARSERCONTROLLER.Variable_getContext ctx) {
        return super.visitVariable_get(ctx);
    }

    @Override
    public TextInput visitTextinput(PARSERCONTROLLER.TextinputContext ctx) {
        TextInput textInput = new TextInput();
        textInput.setKey(ctx.CHARS(0).getText());
        textInput.setValue(ctx.CHARS(1).getText());
        if(ctx.textinput_attribute()!=null) {
            textInput.setAttribute_textInput(visitTextinput_attribute(ctx.textinput_attribute()));
        }
        return textInput;
    }

    @Override
    public Attribute_TextInput visitTextinput_attribute(PARSERCONTROLLER.Textinput_attributeContext ctx) {
       Attribute_TextInput attribute_textInput = new Attribute_TextInput();
       if(ctx.COLOR()!=null)
           attribute_textInput.setName_attribute_TextInput(ctx.COLOR().getText());
       else if (ctx.CONTENT()!=null)
           attribute_textInput.setName_attribute_TextInput(ctx.CONTENT().getText());
        return attribute_textInput;
    }
    @Override
    public Object visit(ParseTree tree) {
        return super.visit(tree);
    }

    @Override
    public Object visitChildren(RuleNode node) {
        return super.visitChildren(node);
    }

    @Override
    public Object visitTerminal(TerminalNode node) {
        return super.visitTerminal(node);
    }

    @Override
    public Object visitErrorNode(ErrorNode node) {
        return super.visitErrorNode(node);
    }

    @Override
    protected Object defaultResult() {
        return super.defaultResult();
    }

    @Override
    protected Object aggregateResult(Object aggregate, Object nextResult) {
        return super.aggregateResult(aggregate, nextResult);
    }

    @Override
    protected boolean shouldVisitNextChild(RuleNode node, Object currentResult) {
        return super.shouldVisitNextChild(node, currentResult);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
