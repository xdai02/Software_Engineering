public class PurchaseOrder implements Order {
    private Dish dish;

    public PurchaseOrder(Dish dish) {
        this.dish = dish;
    }

    @Override
    public void execute() {
        dish.purchase();
    }
}
