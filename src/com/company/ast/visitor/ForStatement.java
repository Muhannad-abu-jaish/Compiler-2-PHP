package com.company.ast.visitor;

import com.company.ast.Nodes.*;

import java.util.ArrayList;

public class ForStatement {

    private String forID , idValue , secondID , compareValue , count  ;
    OperationIF operationIF ;
    ArrayList<OperationIF> operationIFS ;
    ForStatementVariableNumber forStatementVariableNumber ;
    ArrayList<Code_attribuite> code_attributes =new ArrayList<>() ;

    public ForStatementVariableNumber getForStatementVariableNumber() {
        return forStatementVariableNumber;
    }

    public void setForStatementVariableNumber(ForStatementVariableNumber forStatementVariableNumber) {
        this.forStatementVariableNumber = forStatementVariableNumber;
    }

    public OperationIF getOperationIF() {
        return operationIF;
    }

    public void setOperationIF(OperationIF operationIF) {
        this.operationIF = operationIF;
    }

    public ArrayList<OperationIF> getOperationIFS() {
        return operationIFS;
    }

    public void setOperationIFS(ArrayList<OperationIF> operationIFS) {
        this.operationIFS = operationIFS;
    }

    public ArrayList<Code_attribuite> getCode_attributes() {
        return code_attributes;
    }

    public void setCode_attributes(ArrayList<Code_attribuite> code_attributes) {
        this.code_attributes = code_attributes;
    }

    public String getForID() {
        return forID;
    }

    public void setForID(String forID) {
        this.forID = forID;
    }

    public String getIdValue() {
        return idValue;
    }

    public void setIdValue(String idValue) {
        this.idValue = idValue;
    }

    public String getSecondID() {
        return secondID;
    }

    public void setSecondID(String secondID) {
        this.secondID = secondID;
    }

    public String getCompareValue() {
        return compareValue;
    }

    public void setCompareValue(String compareValue) {
        this.compareValue = compareValue;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }
}
