public class Variable implements Node {
    private String variable;

    public Variable(String variable) {
        this.variable = variable;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return variable + "\t(Variable)";
    }
}
