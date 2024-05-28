package composite;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        JavaFile javaFile = new JavaFile();
        TxtFile txtFile = new TxtFile();
        List<File> files = new ArrayList<>();
        FileComposite fileComposite = new FileComposite();
        fileComposite.addFile(javaFile);
        fileComposite.addFile(txtFile);
        files.add(fileComposite);
        files.add(javaFile);
        files.add(txtFile);
        print(files);

    }

    public static void print(List<File> file){
        file.forEach(File::print);
    }
}
