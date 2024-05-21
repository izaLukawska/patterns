package adapter;

public class ChargerAdapter implements USB_C_Charger{

    private final iPhone14 iPhone14;

    public ChargerAdapter (iPhone14 iPhone14){
        this.iPhone14 = iPhone14;
    }
    @Override
    public void charge() {
        System.out.println("Charging lightening iPhone by USB C.");
    }
}
