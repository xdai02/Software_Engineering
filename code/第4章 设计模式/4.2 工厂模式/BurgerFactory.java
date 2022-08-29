public class BurgerFactory {
    public Burger produce(String burgerType) {
        if(burgerType == null) {
            return null;
        }
        if(burgerType.equalsIgnoreCase("chicken burger")) {
            return new ChickenBurger();
        } else if(burgerType.equalsIgnoreCase("vegeburger")) {
            return new VegeBurger();
        }
        return null;
    }
}