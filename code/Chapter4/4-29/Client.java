public class Client {
    private CompositeEntity entity = new CompositeEntity();

    public void printData() {
        for(int i = 0; i < entity.getData().length; i++) {
            System.out.println("Data: " + entity.getData()[i]);
        }
    }

    public void setData(String data1, String data2) {
        entity.setData(data1, data2);
    }
}
