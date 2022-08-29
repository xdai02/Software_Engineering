public class FactoryProducer {
    public static Factory getFactory(boolean vegetarian) {
        if(vegetarian) {
            return new VegeFactory();
        } else {
            return new ChickenFactory();
        }
    }
}
