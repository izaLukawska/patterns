package facade;

public class Demo {
    public static void main(String[] args) {
        CarFacade carFacade = new CarFacade(new Engine(), new BatteryMode(), new Lights());
        carFacade.startCar();
        carFacade.startingCarWithoutEngine();

    }
}
