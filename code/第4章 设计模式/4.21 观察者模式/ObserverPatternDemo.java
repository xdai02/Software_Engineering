public class ObserverPatternDemo {
    public static void main(String[] args) {
        Decimal decimal = new Decimal();
        new Binary(decimal);
        new Octal(decimal);
        new Hex(decimal);

        decimal.setValue(10);
        decimal.setValue(20);
    }
}
