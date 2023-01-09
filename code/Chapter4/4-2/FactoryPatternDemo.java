public class FactoryPatternDemo {
    public static void main(String[] args) {
        BurgerFactory burgerFactory = new BurgerFactory();

        Burger burger1 = burgerFactory.produce("chicken burger");
        System.out.println(burger1.getProductInfo());

        Burger burger2 = burgerFactory.produce("vegeburger");
        System.out.println(burger2.getProductInfo());
    }
}