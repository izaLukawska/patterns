package composite;

public class TxtFile implements File{
    @Override
    public void print() {
        System.out.println("Printing txt file.");
    }
}
