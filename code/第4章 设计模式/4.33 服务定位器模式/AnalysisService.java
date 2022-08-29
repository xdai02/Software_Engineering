public class AnalysisService implements Service {
    @Override
    public String getName() {
        return "ANALYSIS";
    }

    @Override
    public void execute() {
        System.out.println("Analyzing ...");
    }
}
