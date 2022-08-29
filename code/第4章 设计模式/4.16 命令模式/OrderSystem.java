import java.util.ArrayList;
import java.util.List;

public class OrderSystem {
    private List<Order> orderList = new ArrayList<>();

    public void takeOrder(Order order) {
        orderList.add(order);
    }

    public void handleOrders() {
        for(Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}
