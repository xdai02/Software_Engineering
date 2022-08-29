public class ServiceLocatorPatternDemo {
    public static void main(String[] args) {
        Service service = ServiceLocator.getService("SCAN");
        service.execute();

        service = ServiceLocator.getService("ANALYSIS");
        service.execute();

        service = ServiceLocator.getService("SCAN");
        service.execute();

        service = ServiceLocator.getService("ANALYSIS");
        service.execute();
    }
}
