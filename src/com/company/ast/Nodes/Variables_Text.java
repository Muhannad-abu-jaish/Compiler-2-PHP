package com.company.ast.Nodes;
import java.util.ArrayList;
public class Variables_Text {
    String name_variable;
    ArrayList<String>values_variables;
    ArrayList<String>operator;

    public String getName_variable() {
        return name_variable;
    }

    public void setName_variable(String name_variable) {
        this.name_variable = name_variable;
    }

    public ArrayList<String> getValues_variables() {
        return values_variables;
    }

    public void setValues_variables(ArrayList<String> values_variables) {
        this.values_variables = values_variables;
    }

    public ArrayList<String> getOperator() {
        return operator;
    }

    public void setOperator(ArrayList<String> operator) {
        this.operator = operator;
    }
}
