public class VisitorPatternDemo {
    public static void main(String[] args) {
        Node node = new Statement("PI = 3.1415 * radius * radius");
        node.accept(new Visitor());
    }
}
