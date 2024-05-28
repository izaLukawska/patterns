package adapter;

public class iPhone15 implements USB_C_Charger{
    @Override
    public void charge() {
        System.out.println("Charging iPhone by USB C.");
    }
}
