package com.company.ast.Nodes;
import java.util.ArrayList;
public class If_Statement {
    String variable_one , variable_two , name_statement;
    ArrayList<Logic_symbol>logic_symbol;
    ArrayList<OperationIF>operationIFS;
    ArrayList<Code_attribuite> code_attributes =new ArrayList<>();

    public ArrayList<Code_attribuite> getCode_attributes() {
        return code_attributes;
    }

    public void setCode_attributes(ArrayList<Code_attribuite> code_attributes) {
        this.code_attributes = code_attributes;
    }

    public String getName_statement() {
        return name_statement;
    }

    public void setName_statement(String name_statement) {
        this.name_statement = name_statement;
    }

    public ArrayList<Logic_symbol> getLogic_symbol() {
        return logic_symbol;
    }

    public void setLogic_symbol(ArrayList<Logic_symbol> logic_symbol) {
        this.logic_symbol = logic_symbol;
    }

    public ArrayList<OperationIF> getOperationIFS() {
        return operationIFS;
    }

    public void setOperationIFS(ArrayList<OperationIF> operationIFS) {
        this.operationIFS = operationIFS;
    }

    public String getVariable_one() {
        return variable_one;
    }

    public void setVariable_one(String variable_one) {
        this.variable_one = variable_one;
    }

    public String getVariable_two() {
        return variable_two;
    }

    public void setVariable_two(String variable_two) {
        this.variable_two = variable_two;
    }
}
