public class ServiceQuery {
    public static Service getService(String serviceName) {
        if(serviceName.equalsIgnoreCase("order")) {
            return new OrderService();
        } else {
            return new DeliveryService();
        }
    }
}
