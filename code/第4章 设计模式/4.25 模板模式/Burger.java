public abstract class Burger {
    public abstract void prepare();

    public abstract void cook();

    public abstract void dishUp();

    public void makeBurger() {
        prepare();
        cook();
        dishUp();
    }
}
