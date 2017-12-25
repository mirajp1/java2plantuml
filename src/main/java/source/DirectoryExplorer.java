package source;

import java.io.File;
import java.io.FileFilter;

public class DirectoryExplorer {

    private FileHandler fileHandler;

    public DirectoryExplorer (FileHandler fileHandler){
        this.fileHandler=fileHandler;
    }


    FileFilter fileFilter = new FileFilter() {
        @Override
        public boolean accept(File pathname) {

            return pathname.toString().endsWith(".java");

        }
    };

    public void explore(File file){

        if(file.isDirectory()){
            for(File f : file.listFiles(fileFilter)){
                explore(f);
            }
            for(File f:file.listFiles()){
                if(f.isDirectory()){
                    explore(f);
                }
            }
        }
        else{

            fileHandler.handle(file);
        }


    }

}
