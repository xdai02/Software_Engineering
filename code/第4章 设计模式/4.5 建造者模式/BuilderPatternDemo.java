public class BuilderPatternDemo {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();

        Meal mealA = mealBuilder.prepareMealA();
        System.out.println("Meal A");
        mealA.showItems();
        System.out.println("====================");
        System.out.println("Total cost: " + mealA.getCost());
        System.out.println();

        Meal mealB = mealBuilder.prepareMealA();
        System.out.println("Meal B");
        mealB.showItems();
        System.out.println("====================");
        System.out.println("Total cost: " + mealB.getCost());
        System.out.println();
    }
}
