package com.company;

import com.company.ast.Nodes.Program;
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

        String source = "C:\\Users\\muhannad\\IdeaProjects\\Compiler-2-2-\\Samples//sample_native.txt";
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

           /* if (valueNumber!=null&&nameText!=null)
            {
                System.out.println(nameText +" : "+valueNumber);
            }*/

        }
    }

}