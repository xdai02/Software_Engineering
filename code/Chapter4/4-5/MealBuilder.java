public class MealBuilder {
    public Meal prepareMealA() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareMealB() {
        Meal meal = new Meal();
        meal.addItem(new FishBurger());
        meal.addItem(new Juice());
        return meal;
    }
}