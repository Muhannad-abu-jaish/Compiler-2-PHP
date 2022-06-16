package com.company.ast.Nodes;

import java.util.ArrayList;

public class Code_attribuite {

    Variables variables=new Variables();
    Clicking clicking = new Clicking();

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
