public class CompositeEntityPatternDemo {
    public static void main(String[] args) {
        Client client = new Client();
        client.setData("test1", "test2");
        client.printData();
        client.setData("test3", "test4");
        client.printData();
    }
}
