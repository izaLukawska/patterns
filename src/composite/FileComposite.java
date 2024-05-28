package composite;

import java.util.ArrayList;
import java.util.List;

public class FileComposite implements File{

    private final List<File> fileList = new ArrayList<>();

    public void addFile(File file){
        fileList.add(file);
    }
    public void removeFile(File file){
        fileList.remove(file);
    }
    @Override
    public void print() {
        fileList.forEach(File::print);
    }

}
