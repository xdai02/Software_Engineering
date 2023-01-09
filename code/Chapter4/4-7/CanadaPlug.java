public class CanadaPlug implements CanadaVoltageStandard {
    @Override
    public void powerWithCanadaStandard() {
        System.out.println("Using Canada standard (110V)...");
    }
}
