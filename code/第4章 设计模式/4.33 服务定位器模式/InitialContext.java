public class InitialContext {
    public Object lookup(String serviceName) {
        if(serviceName.equalsIgnoreCase("SCAN")) {
            System.out.println("Looking up and creating a new SCAN object.");
            return new ScanService();
        } else if(serviceName.equalsIgnoreCase("ANALYSIS")) {
            System.out.println("Looking up and creating a new ANALYSIS object.");
            return new AnalysisService();
        }
        return null;
    }
}
