package com.company.ast.Nodes;

import java.util.ArrayList;

public class ForStatementVariableNumber {

    String thirdID ;
    ArrayList<String> countValue ;
    Fast_math fast_math ;
    OneOperation oneOperation ;


    public String getThirdID() {
        return thirdID;
    }

    public void setThirdID(String thirdID) {
        this.thirdID = thirdID;
    }

    public ArrayList<String> getCountValue() {
        return countValue;
    }

    public void setCountValue(ArrayList<String> countValue) {
        this.countValue = countValue;
    }

    public Fast_math getFast_math() {
        return fast_math;
    }

    public void setFast_math(Fast_math fast_math) {
        this.fast_math = fast_math;
    }

    public OneOperation getOneOperation() {
        return oneOperation;
    }

    public void setOneOperation(OneOperation oneOperation) {
        this.oneOperation = oneOperation;
    }
}
