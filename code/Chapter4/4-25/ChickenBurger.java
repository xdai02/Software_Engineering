public class ChickenBurger extends Burger {
    @Override
    public void prepare() {
        System.out.println("Preparing buns, chicken, cheese ...");
    }

    @Override
    public void cook() {
        System.out.println("Cooking for 10 mins ...");
    }

    @Override
    public void dishUp() {
        System.out.println("Chicken burger done ...");
    }
}
