public class AutopilotCarDecorator extends CarDecorator {
    public AutopilotCarDecorator(Car car) {
        super(car);
    }

    public void autopilot() {
        System.out.println("Start autopilot mode...");
    }

    @Override
    public void start() {
        car.start();
        autopilot();
    }
}
