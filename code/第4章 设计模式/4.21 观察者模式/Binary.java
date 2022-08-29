public class Binary extends Observer {
    public Binary(Decimal decimal) {
        this.decimal = decimal;
        this.decimal.attach(this);
    }

    @Override
    public void update() {
        System.out.println(
            "Binary: " +
            Integer.toBinaryString(decimal.getValue())
        );
    }
}
