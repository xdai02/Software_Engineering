public class Hex extends Observer {
    public Hex(Decimal decimal) {
        this.decimal = decimal;
        this.decimal.attach(this);
    }

    @Override
    public void update() {
        System.out.println(
            "Hex: " +
            Integer.toHexString(decimal.getValue())
        );
    }
}
