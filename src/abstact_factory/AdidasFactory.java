package abstact_factory;

public class AdidasFactory implements ClothesFactory{
    @Override
    public Shoes getshoes() {
        return new AdidasShoes();
    }

    @Override
    public Tshirt getTshirt() {
        return new AdidasTshirt();
    }
}
