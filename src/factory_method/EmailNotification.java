package factory_method;

public class EmailNotification implements Informable{
    @Override
    public void inform() {
        System.out.println("Inform by email.");
    }
}
