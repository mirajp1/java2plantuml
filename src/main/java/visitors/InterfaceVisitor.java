package visitors;

import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;
import translate.Translator;

public class InterfaceVisitor extends VoidVisitorAdapter<Void> {

    private Translator translator;

    public InterfaceVisitor(Translator translator){
        this.translator=translator;
    }

    @Override
    public void visit(ClassOrInterfaceDeclaration n, Void arg) {

        if(n.isInterface()) {
            this.translator.addInterface(n);
        }
        super.visit(n, arg);

    }
}
