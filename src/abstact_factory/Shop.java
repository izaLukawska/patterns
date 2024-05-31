package abstact_factory;

public class Shop {

    private ClothesFactory clothesFactory;

    public Shop(String brand) {
        chooseBrand(brand);
        Shoes shoes = clothesFactory.getshoes();
        Tshirt tshirt = clothesFactory.getTshirt();
        shoes.putOn();
        tshirt.putOn();
    }

    private void chooseBrand(String brand){
        if(brand.equals("Nike")){
            clothesFactory = new NikeFactory();
        }else{
            clothesFactory = new AdidasFactory();
        }
    }
}
