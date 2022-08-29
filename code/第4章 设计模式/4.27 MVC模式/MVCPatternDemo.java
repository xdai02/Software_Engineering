public class MVCPatternDemo {
    public static void main(String[] args) {
        Shape shape = new Shape("circle", "red");
        ShapeView view = new ShapeView();
        ShapeController controller = new ShapeController(shape, view);

        controller.updateView();
        controller.setShapeType("square");
        controller.setShapeColor("blue");
        controller.updateView();
    }
}
