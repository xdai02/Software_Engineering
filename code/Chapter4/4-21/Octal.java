public class Octal extends Observer {
    public Octal(Decimal decimal) {
        this.decimal = decimal;
        this.decimal.attach(this);
    }

    @Override
    public void update() {
        System.out.println(
            "Octal: " +
            Integer.toOctalString(decimal.getValue())
        );
    }
}
