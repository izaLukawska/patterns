package factory_method;

public class SmsNotification implements Informable{
    @Override
    public void inform() {
        System.out.println("Inform by SMS.");
    }
}
