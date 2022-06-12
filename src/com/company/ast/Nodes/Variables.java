package com.company.ast.Nodes;

import java.util.ArrayList;

public class Variables {
    String name, value;
    Character operation;




    public Variables ()
    {


    }
    public Variables(String name, String value,Character operation) {
        this.name = name;
        this.value = value;
        this.operation = operation;
    }

    public String getName() {
        return name;
    }


    public Character getOperation() {
        return operation;
    }

    public void setOperation(Character operation) {
        this.operation = operation;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void setName(String name) {
        this.name=name;

    }
}
