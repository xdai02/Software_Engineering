public class Number implements Node {
    private String number;

    public Number(String number) {
        this.number = number;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return number + "\t(Number)";
    }
}
