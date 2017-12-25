package translate;

import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.EnumDeclaration;
import com.github.javaparser.ast.body.FieldDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.Serializable;

public interface Translator{

    public void addClass(ClassOrInterfaceDeclaration c);
    public void addEnum(EnumDeclaration c);
    public void addInterface(ClassOrInterfaceDeclaration i);
    public void addField(FieldDeclaration f);
    public void addMethod(MethodDeclaration d);
    public void setError(Boolean b);
    public void translateFile(File f) throws FileNotFoundException;

}