public class Shape implements Tetris {
    private String type;
    private String color;

    public Shape(String type) {
        this.type = type;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void display() {
        System.out.println("Shape: " + type + "\tColor: " + color);
    }
}
