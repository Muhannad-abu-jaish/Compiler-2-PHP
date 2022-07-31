package com.company.ast.Nodes;

public class Code_attribuite {

    Variables variables;
    If_Statement if_statement;
    Else_statement else_statement;
    ForStatement forStatement;
    Print print ;
    boolean isBreak;

    public boolean isBreak() {
        return isBreak;
    }

    public void setBreak(boolean aBreak) {
        isBreak = aBreak;
    }

    public ForStatement getForStatement() {
        return forStatement;
    }

    public void setForStatement(ForStatement forStatement) {
        this.forStatement = forStatement;
    }

    public Print getPrint() {
        return print;
    }

    public void setPrint(Print print) {
        this.print = print;
    }

    public Else_statement getElse_statement() {
        return else_statement;
    }

    public void setElse_statement(Else_statement else_statement) {
        this.else_statement = else_statement;
    }

    public If_Statement getIf_statement() {
        return if_statement;
    }

    public void setIf_statement(If_Statement if_statement) {
        this.if_statement = if_statement;
    }


    public Variables getVariables() {
        return variables;
    }

    public void setVariables(Variables variables) {
        this.variables = variables;
    }
}
