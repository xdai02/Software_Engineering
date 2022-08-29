public class ChinaPlug implements ChinaVoltageStandard {
    @Override
    public void powerWithChinaStandard() {
        System.out.println("Using China standard (220V)...");
    }
}
