package factory_method;

public class Demo {
    public static void main(String[] args) {
        RegistrationService registrationService = new RegistrationService(true);
        registrationService.registerUser("Iza.Java");

    }
}
