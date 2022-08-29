public class ChickenFactory implements Factory {
    @Override
    public Burger produceBurger() {
        return new ChickenBurger();
    }

    @Override
    public Sandwich produceSandwich() {
        return new ChickenSandwich();
    }
}
