public class StrategyPatternDemo {
    public static void main(String[] args) {
        Context context = new Context(new Addition());
        System.out.println("10 + 5 = " + context.execute(10, 5));

        context = new Context(new Subtraction());
        System.out.println("10 - 5 = " + context.execute(10, 5));

        context = new Context(new Multiplication());
        System.out.println("10 * 5 = " + context.execute(10, 5));
    }
}
