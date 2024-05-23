package builder;

public class Demo {
    public static void main(String[] args) {
        Car car = Car.CarBuilder.builder().brand("Opel").model("Astra").engine(2.2).build();
        System.out.println(car);
    }
}
