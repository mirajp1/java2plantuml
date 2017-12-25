package visitors;

import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.EnumDeclaration;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;
import translate.Translator;

public class EnumVisitor extends VoidVisitorAdapter<Void> {

    private Translator translator;

    public EnumVisitor(Translator translator){
        this.translator=translator;
    }

    @Override
    public void visit(EnumDeclaration n, Void arg) {

        this.translator.addEnum(n);
        super.visit(n, arg);

    }
}
