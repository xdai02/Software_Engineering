public class ShapeController {
    private Shape model;
    private ShapeView view;

    public ShapeController(Shape model, ShapeView view) {
        this.model = model;
        this.view = view;
    }

    public void setShapeType(String type) {
        model.setType(type);
    }

    public String getShapeType() {
        return model.getType();
    }

    public void setShapeColor(String color) {
        model.setColor(color);
    }

    public String getShapeColor() {
        return model.getColor();
    }

    public void updateView() {
        view.drawShape(model.getType(), model.getColor());
    }
}
