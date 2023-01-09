public class ScanService implements Service {
    @Override
    public String getName() {
        return "SCAN";
    }

    @Override
    public void execute() {
        System.out.println("Scanning ...");
    }
}
