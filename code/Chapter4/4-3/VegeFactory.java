public class VegeFactory implements Factory {
    @Override
    public Burger produceBurger() {
        return new VegeBurger();
    }

    @Override
    public Sandwich produceSandwich() {
        return new VegeSandwich();
    }
}
