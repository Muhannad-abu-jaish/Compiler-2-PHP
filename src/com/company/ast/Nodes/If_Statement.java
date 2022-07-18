package com.company.ast.Nodes;
import java.util.ArrayList;
public class If_Statement {
    String  name_statement;
    ArrayList<Logic_symbol>logic_symbol;
    ArrayList<OperationIF>operationIFS;
    ArrayList<String> variables_one , variables_two;
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

    public ArrayList<String> getVariables_one() {
        return variables_one;
    }

    public void setVariables_one(ArrayList<String> variables_one) {
        this.variables_one = variables_one;
    }

    public ArrayList<String> getVariables_two() {
        return variables_two;
    }

    public void setVariables_two(ArrayList<String> variables_two) {
        this.variables_two = variables_two;
    }
}
