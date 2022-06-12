package com.company.ast.visitor;

import com.company.ast.Nodes.Code_attribuite;
import com.company.ast.Nodes.Program;
import com.company.ast.Nodes.Variables;
import generated.PARSERCONTROLLER;
import generated.PARSERCONTROLLERBaseVisitor;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;

public class BaseVisitor extends PARSERCONTROLLERBaseVisitor{
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

        Variables variables=new Variables();

        code_attribuite.setVariables( visitVariables(ctx.variables()));

        return code_attribuite;
    }

    @Override
    public Object visitComment(PARSERCONTROLLER.CommentContext ctx) {
        return super.visitComment(ctx);
    }

    @Override
    public Object visitOn_click(PARSERCONTROLLER.On_clickContext ctx) {
        return super.visitOn_click(ctx);
    }

    @Override
    public Object visitClick_attribute(PARSERCONTROLLER.Click_attributeContext ctx) {
        return super.visitClick_attribute(ctx);
    }

    @Override
    public Object visitText(PARSERCONTROLLER.TextContext ctx) {
        return super.visitText(ctx);
    }

    @Override
    public Object visitText_attribute(PARSERCONTROLLER.Text_attributeContext ctx) {
        return super.visitText_attribute(ctx);
    }

    @Override
    public Object visitContent(PARSERCONTROLLER.ContentContext ctx) {
        return super.visitContent(ctx);
    }

    @Override
    public Object visitColor(PARSERCONTROLLER.ColorContext ctx) {
        return super.visitColor(ctx);
    }

    @Override
    public Object visitButton(PARSERCONTROLLER.ButtonContext ctx) {
        return super.visitButton(ctx);
    }

    @Override
    public Object visitButton_attribute(PARSERCONTROLLER.Button_attributeContext ctx) {
        return super.visitButton_attribute(ctx);
    }

    @Override
    public Object visitWidth(PARSERCONTROLLER.WidthContext ctx) {
        return super.visitWidth(ctx);
    }

    @Override
    public Object visitBackground(PARSERCONTROLLER.BackgroundContext ctx) {
        return super.visitBackground(ctx);
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


             if (ctx.variable_number()!=null)
            variables = visitVariable_number(ctx.variable_number());

            else if (!ctx.variable_text().getText().isEmpty())
                variables = visitVariable_text(ctx.variable_text());





        /*try {
            String nameText = ctx.variable_text().CHARS(0).toString();
            String valueText = ctx.variable_text().CHARS(1).toString();
            variables.setName(nameText);
            variables.setValue(valueText);
        }catch (NullPointerException e)
        {
            e.printStackTrace();
        }*/


        return variables;
    }

    @Override
    public Variables visitVariable_number(PARSERCONTROLLER.Variable_numberContext ctx) {
        Variables variables = new Variables();

        if (ctx!=null)
        {
            String nameNumber = ctx.CHARS(0).getText().toString() ;
            String valueNumber = ctx.NUMBER(0).getText().toString()  ;
            variables.setName(nameNumber);
            variables.setValue(valueNumber);
            return variables;
        }
        return variables;
    }

    @Override
    public Object visitFast_math(PARSERCONTROLLER.Fast_mathContext ctx) {
        return super.visitFast_math(ctx);
    }

    @Override
    public Object visitAdding_one(PARSERCONTROLLER.Adding_oneContext ctx) {
        return super.visitAdding_one(ctx);
    }

    @Override
    public Object visitMinus_one(PARSERCONTROLLER.Minus_oneContext ctx) {
        return super.visitMinus_one(ctx);
    }

    @Override
    public Object visitNumber_attribute(PARSERCONTROLLER.Number_attributeContext ctx) {
        return super.visitNumber_attribute(ctx);
    }

    @Override
    public Variables visitVariable_text(PARSERCONTROLLER.Variable_textContext ctx) {
        Variables variables = new Variables(" " , " ",' ');

        if (ctx!=null)
        {

            String nameText = ctx.CHARS(0).getText().toString() ;
            String valueText = ctx.CHARS(1).getText().toString() ;
            variables.setName(nameText);
            variables.setValue(valueText);
            return variables;
        }
        return variables ;
    }


    @Override
    public Object visitVariable_get(PARSERCONTROLLER.Variable_getContext ctx) {
        return super.visitVariable_get(ctx);
    }

    @Override
    public Object visitTextinput(PARSERCONTROLLER.TextinputContext ctx) {
        return super.visitTextinput(ctx);
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
