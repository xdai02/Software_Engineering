public class CanadaAdapter implements CanadaVoltageStandard {
    private ChinaPlug chinaPlug;

    public CanadaAdapter(ChinaPlug chinaPlug) {
        this.chinaPlug = chinaPlug;
    }

    @Override
    public void powerWithCanadaStandard() {
        chinaPlug.powerWithChinaStandard();
    }
}
