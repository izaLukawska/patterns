package factory_method;

public class RegistrationService {

    private Informable informable;

    public RegistrationService (boolean condition){
        formOfInform(condition);
    }

    public void registerUser(String username){
        System.out.println("Registering user");
        System.out.println("Informing user by: ");
        informable.inform();
    }

    private void formOfInform(boolean condition) {
        if (condition) {
            informable = new SmsNotification();
        } else {
            informable = new EmailNotification();
        }
    }
}
