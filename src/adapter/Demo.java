package adapter;

public class Demo {
    public static void main(String[] args) {
        iPhone14 iPhone14 = new iPhone14();
        iPhone15 iPhone15 = new iPhone15();
        chargeByUSB_C(iPhone15);
        chargeByLightening(iPhone14);
        ChargerAdapter chargerAdapter = new ChargerAdapter(iPhone14);
        chargeByUSB_C(chargerAdapter);
    }

    public static void chargeByUSB_C(USB_C_Charger usb_c_charger){
        System.out.println("Charging device by USB C charger.");
    }
    public static void chargeByLightening(LighteningCharger lighteningCharger){
        System.out.println("Charging device by lightening charger.");
    }
}
