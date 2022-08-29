public class Operator implements Node {
    private String operator;

    public Operator(String operator) {
        this.operator = operator;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return operator + "\t(Operator)";
    }
}
