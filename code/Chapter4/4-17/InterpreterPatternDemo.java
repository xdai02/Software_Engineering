public class InterpreterPatternDemo {
    public static void main(String[] args) {
        Calculator calculator = new Calculator("1 + 22 + 333");
        System.out.println(calculator.calculate());
    }
}
