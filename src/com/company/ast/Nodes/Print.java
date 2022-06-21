package com.company.ast.Nodes;

public class Print {
   String name_print;
   Attribute_print attribute_print;

   public Attribute_print getAttribute_print() {
      return attribute_print;
   }

   public void setAttribute_print(Attribute_print attribute_print) {
      this.attribute_print = attribute_print;
   }

   public String getName_print() {
      return name_print;
   }

   public void setName_print(String name_print) {
      this.name_print = name_print;
   }
}
