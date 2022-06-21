package com.company.ast.Nodes;

import java.util.ArrayList;

public class Else_statement {

    ArrayList<Code_attribuite> code_attributes =new ArrayList<>();
    String name_statement;

    public String getName_statement() {
        return name_statement;
    }

    public void setName_statement(String name_statement) {
        this.name_statement = name_statement;
    }

    public ArrayList<Code_attribuite> getCode_attributes() {
        return code_attributes;
    }

    public void setCode_attributes(ArrayList<Code_attribuite> code_attributes) {
        this.code_attributes = code_attributes;
    }
}
