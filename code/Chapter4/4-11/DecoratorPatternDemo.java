public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Car benz = new Benz();
        benz.start();
        System.out.println("===================");
        Car autopilotTesla = new AutopilotCarDecorator(new Tesla());
        autopilotTesla.start();
    }
}
