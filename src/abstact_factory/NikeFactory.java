package abstact_factory;

public class NikeFactory implements ClothesFactory{
    @Override
    public Shoes getshoes() {
        return new NikeShoes();
    }

    @Override
    public Tshirt getTshirt() {
        return new NikeTshirt();
    }
}
