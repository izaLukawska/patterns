package abstact_factory;

public class AdidasTshirt implements Tshirt{
    @Override
    public void putOn() {
        System.out.println("Putting on Adidas T-shirt.");
    }
}
