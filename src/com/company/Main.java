package com.company;

import com.company.ast.Nodes.*;
import com.company.ast.visitor.BaseVisitor;
import generated.LEXERCONTROLLER;
import generated.PARSERCONTROLLER;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Main {

    public static void main(String[] args) throws IOException {

        String source = "D:\\Compiler-PHP\\Samples//sample_native.txt";
        CharStream charStream = fromFileName(source);
        LEXERCONTROLLER lexer = new LEXERCONTROLLER(charStream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        PARSERCONTROLLER parser = new PARSERCONTROLLER(tokenStream);
        ParseTree tree = parser.program();
        Program program = (Program) new BaseVisitor().visit(tree);

        generateAst(program);
        /*ErrorHandling(program);
        generateAst(program);
*/
        // write your code here
    }

    private static void generateAst(Program program) {

        System.out.println("\t\t\t<Controller>");
        for (int i = 0; i < program.getCode_attribuites().size(); i++) {
            String nameText = program.getCode_attribuites().get(i).getVariables().getName();
            String valueText = program.getCode_attribuites().get(i).getVariables().getValue();
           // Integer valueNumber = program.getCode_attribuites().get(i).getVariables().getNumber();

            if (valueText!=null&&nameText!=null)
            {
                System.out.println(nameText +" : "+valueText);
            }
            if(program.getCode_attribuites().get(i).getClicking()!=null){
                Clicking clicking = program.getCode_attribuites().get(i).getClicking();
                System.out.println("-----------ON Click-------------");
                System.out.println("Click by : " + clicking.getClick());
                int size_attribute_click = clicking.getAttribute_clickList().size();
                if(size_attribute_click!=0){
                    for(int j = 0 ; j<size_attribute_click;j++){
                        System.out.println("name_attribute : " +clicking.getAttribute_clickList().get(j).getName_attribute());
                        System.out.println("-----------Attribute:------------");
                        if(clicking.getAttribute_clickList().get(j).getText()!=null){
                            Text text = clicking.getAttribute_clickList().get(j).getText();
                            System.out.println("-----Text----");
                            System.out.println("Name Text : " + text.getName_text());
                            Text_Attribute text_attribute = text.getText_attribute();
                            if(text_attribute.getColor()!=null){
                                System.out.println("Color : "+text_attribute.getColor());
                            }
                            if(text_attribute.getContent()!=null){
                                System.out.println("Content : " + text_attribute.getContent());
                            }
                        }if(clicking.getAttribute_clickList().get(j).getButton()!=null){
                            Button button = clicking.getAttribute_clickList().get(j).getButton();
                            System.out.println("-----Button----");
                            System.out.println("Name Button : " + button.getName_button());
                            Button_Attribute button_attribute = button.getButton_attribute();
                            if(button_attribute.getWidth()!=null){
                                System.out.println("Width : "+button_attribute.getWidth());
                            }
                            if(button_attribute.getBackground() !=null){
                                System.out.println("Background : " + button_attribute.getBackground());
                            }
                        }
                    }
                }
            }

           /* if (valueNumber!=null&&nameText!=null)
            {
                System.out.println(nameText +" : "+valueNumber);
            }*/

        }
    }

}