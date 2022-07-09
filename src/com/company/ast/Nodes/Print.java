package com.company.ast.Nodes;
import java.util.*;
public class Print {
   String name_print;
   ArrayList<Attribute_print> attribute_prints;
   ArrayList<String> operation ;

   public ArrayList<String> getOperation() {
      return operation;
   }

   public void setOperation(ArrayList<String> operation) {
      this.operation = operation;
   }

   public ArrayList<Attribute_print> getAttribute_prints() {
      return attribute_prints;
   }

   public void setAttribute_prints(ArrayList<Attribute_print> attribute_prints) {
      this.attribute_prints = attribute_prints;
   }

   public String getName_print() {
      return name_print;
   }

   public void setName_print(String name_print) {
      this.name_print = name_print;
   }
}
