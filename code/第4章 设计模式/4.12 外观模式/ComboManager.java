public class ComboManager {
    private Item burger;
    private Item fries;
    private Item coke;
    private Item chicken;
    private Item salad;

    public ComboManager() {
        burger = new Burger();
        fries = new Fries();
        coke = new Coke();
        chicken = new Chicken();
        salad = new Salad();
    }

    public void comboA() {
        System.out.println("Combo A: "
                            + burger.getName() + ", "
                            + fries.getName() + ", "
                            + coke.getName());
    }

    public void comboB() {
        System.out.println("Combo B: "
                + burger.getName() + ", "
                + chicken.getName() + ", "
                + salad.getName());
    }
}
