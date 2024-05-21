package adapter;

public class iPhone14 implements LighteningCharger{
    @Override
    public void charge() {
        System.out.println("Charging iPhone by lightening.");
    }
}
