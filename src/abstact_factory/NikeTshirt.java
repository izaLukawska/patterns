package abstact_factory;

public class NikeTshirt implements Tshirt{
    @Override
    public void putOn() {
        System.out.println("Putting on Nike T-shirt");
    }
}
