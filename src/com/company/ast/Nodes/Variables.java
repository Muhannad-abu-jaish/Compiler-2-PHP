package com.company.ast.Nodes;

import java.util.ArrayList;

public class Variables {
    String name;
    ArrayList<String> value;
    ArrayList<String> operation;
    String oneValue;
    String oneOperation ;
    Fast_math fast_math ;

    public Fast_math getFast_math() {
        return fast_math;
    }

    public void setFast_math(Fast_math fast_math) {
        this.fast_math = fast_math;
    }

    public String getOneOperation() {
        return oneOperation;
    }

    public void setOneOperation(String oneOperation) {
        this.oneOperation = oneOperation;
    }

    public Variables ()
    {


    }

    public String getOneValue() {
        return oneValue;
    }

    public void setOneValue(String oneValue) {
        this.oneValue = oneValue;
    }

    public String getName() {
        return name;
    }


    public ArrayList<String> getOperation() {
        return operation;
    }

    public void setOperation(ArrayList<String> operation) {
        this.operation = operation;
    }

    public ArrayList<String> getValue() {
        return value;
    }

    public void setValue(ArrayList<String> value) {
        this.value = value;
    }

    public void setName(String name) {
        this.name=name;

    }
}
