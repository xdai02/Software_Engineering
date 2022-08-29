public class FishBurger extends Burger {
    @Override
    public void prepare() {
        System.out.println("Preparing buns, fish, vegetable ...");
    }

    @Override
    public void cook() {
        System.out.println("Cooking for 5 mins ...");
    }

    @Override
    public void dishUp() {
        System.out.println("Fish burger done ...");
    }
}
