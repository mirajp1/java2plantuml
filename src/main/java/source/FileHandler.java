package source;

import com.github.javaparser.ast.CompilationUnit;
import translate.Translator;

import java.io.File;
import java.io.FileNotFoundException;

public class FileHandler {

    private Translator translator;

    public FileHandler(Translator translator){
        this.translator=translator;
    }



    void handle(File f){

        System.out.println("File Found: " +f.getName());

        CompilationUnit cu = null;
        try {
            translator.translateFile(new File(f.getAbsolutePath()));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e){
            translator.setError(true);
        }

    }


}
