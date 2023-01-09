public class TemplatePatternDemo {
    public static void main(String[] args) {
        Burger burger = new ChickenBurger();
        burger.makeBurger();
        System.out.println("--------------------");
        burger = new FishBurger();
        burger.makeBurger();
    }
}
