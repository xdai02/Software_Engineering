public class BusinessDelegatePatternDemo {
    public static void main(String[] args) {
        BusinessDelegate businessDelegate = new BusinessDelegate();
        Client client = new Client(businessDelegate);

        businessDelegate.setServiceName("order");
        client.work();

        businessDelegate.setServiceName("delivery");
        client.work();
    }
}
