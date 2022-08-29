public class Dish {
    private String name;
    private double price;
    private int quantity;

    public Dish(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void purchase() {
        System.out.println(String.format("[%s]\t$%.2f\t*%d", name, price, quantity));
    }
}
