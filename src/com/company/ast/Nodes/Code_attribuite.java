package com.company.ast.Nodes;

import java.util.ArrayList;

public class Code_attribuite {

    Variables variables;
    Clicking clicking ;
    If_Statement if_statement;
    Else_statement else_statement;
    Print print ;

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

    public Clicking getClicking() {
        return clicking;
    }

    public void setClicking(Clicking clicking) {
        this.clicking = clicking;
    }

    public Variables getVariables() {
        return variables;
    }

    public void setVariables(Variables variables) {
        this.variables = variables;
    }
}
