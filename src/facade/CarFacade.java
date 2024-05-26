package facade;

public class CarFacade {

    private Engine engine;
    private BatteryMode batteryMode;
    private Lights lights;

    public CarFacade(Engine engine, BatteryMode batteryMode, Lights lights) {
        this.engine = engine;
        this.batteryMode = batteryMode;
        this.lights = lights;
    }
    public void startCar(){
        engine.start();
        batteryMode.turnOn();
        lights.turnOn();
        System.out.println("Car started.");
    }
    public void startingCarWithoutLights(){
        engine.start();
        batteryMode.turnOn();
        System.out.println("Car without lights started.");
    }

    public void startingCarWithoutBatteryMode(){
        engine.start();
        lights.turnOn();
        System.out.println("Car without battery mode started.");
    }
    public void startingCarWithoutEngine(){
        batteryMode.turnOn();
        lights.turnOn();
        System.out.println("Car without engine started.");
    }


}
