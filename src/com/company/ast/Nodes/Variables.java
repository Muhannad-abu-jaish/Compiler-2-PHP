package com.company.ast.Nodes;

import java.util.ArrayList;

public class Variables {

    Variables_Text variables_text;
    Variable_Numbers variable_numbers;
    VariableGet variableGet;
    Array_statement array_statement;

    public Array_statement getArray_statement() {
        return array_statement;
    }

    public void setArray_statement(Array_statement array_statement) {
        this.array_statement = array_statement;
    }

    public VariableGet getVariableGet() {
        return variableGet;
    }

    public void setVariableGet(VariableGet variableGet) {
        this.variableGet = variableGet;
    }

    public Variable_Numbers getVariable_numbers() {
        return variable_numbers;
    }

    public void setVariable_numbers(Variable_Numbers variable_numbers) {
        this.variable_numbers = variable_numbers;
    }

    public Variables_Text getVariables_text() {
        return variables_text;
    }

    public void setVariables_text(Variables_Text variables_text) {
        this.variables_text = variables_text;
    }






}
