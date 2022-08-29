import java.util.HashMap;

public class ShapeFactory {
    private static HashMap<String, Shape> shapeMap = new HashMap<>();

    public static Shape getShape(String type) {
        Shape shape = shapeMap.get(type);
        if(shape == null) {
            shape = new Shape(type);
            shapeMap.put(type, shape);
            System.out.println("Shape " + type + " created");
        }
        return shape;
    }
}
