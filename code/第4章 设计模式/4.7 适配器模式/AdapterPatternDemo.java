public class AdapterPatternDemo {
    public static void main(String[] args) {
        CanadaPlug canadaPlug = new CanadaPlug();
        canadaPlug.powerWithCanadaStandard();

        ChinaPlug chinaPlug = new ChinaPlug();
        CanadaAdapter adapter = new CanadaAdapter(chinaPlug);
        adapter.powerWithCanadaStandard();
    }
}
