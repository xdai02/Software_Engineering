public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        Factory factory1 = FactoryProducer.getFactory(false);
        Burger burger1 = factory1.produceBurger();
        System.out.println(burger1.getProductInfo());
        Sandwich sandwich1 = factory1.produceSandwich();
        System.out.println(sandwich1.getProductInfo());

        Factory factory2 = FactoryProducer.getFactory(true);
        Burger burger2 = factory2.produceBurger();
        System.out.println(burger2.getProductInfo());
        Sandwich sandwich2 = factory2.produceSandwich();
        System.out.println(sandwich2.getProductInfo());
    }
}
