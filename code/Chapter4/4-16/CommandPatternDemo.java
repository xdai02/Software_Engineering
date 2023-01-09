public class CommandPatternDemo {
    public static void main(String[] args) {
        PurchaseOrder purchaseOrder1 = new BuyOrder(new Dish("Boiled Fish", 20, 1));
        PurchaseOrder purchaseOrder2 = new BuyOrder(new Dish("B.B.Q Pork", 15, 2));
        PurchaseOrder purchaseOrder3 = new BuyOrder(new Dish("Lemon beef", 25, 1));

        OrderSystem orderSystem = new OrderSystem();
        orderSystem.takeOrder(purchaseOrder1);
        orderSystem.takeOrder(purchaseOrder2);
        orderSystem.takeOrder(purchaseOrder3);

        orderSystem.handleOrders();
    }
}
