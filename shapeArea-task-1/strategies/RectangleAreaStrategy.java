package strategies;
public class RectangleAreaStrategy implements AreaCalculationStrategy {
    @Override
    public double calculateArea(Shape shape) {
        if (shape instanceof Rectangle) {
            Rectangle rectangle = (Rectangle) shape;
            return rectangle.getArea();
        }
        return 0.0;
}}
