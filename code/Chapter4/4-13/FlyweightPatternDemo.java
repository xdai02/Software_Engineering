public class FlyweightPatternDemo {
    private static final String[] types = {
            "I", "J", "L",
            "O", "S", "T", "Z"
    };

    private static final String[] colors = {
            "grey", "green", "blue",
            "yellow", "indigo", "red", "pink"
    };

    public static void main(String[] args) {
        for(int i = 0; i < 10; i++) {
            Shape shape = ShapeFactory.getShape(getRandomType());
            shape.setColor(getRandomColor());
            shape.display();
        }
    }

    public static String getRandomType() {
        return types[(int)(Math.random() * types.length)];
    }

    public static String getRandomColor() {
        return colors[(int)(Math.random() * colors.length)];
    }
}
