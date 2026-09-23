package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle() {
    }

    public Circle(String color, double radius) {
        this.radius = radius;
        setColor(color);
    }

    @Override
    public double areaCalculation() {
        return Math.PI * radius * radius;
    }

    @Override
    public void toDraw() {
        System.out.println("Figure: circle Color = " + getColor() + " " + "Radius = " + radius + " "
                + "Area = " + areaCalculation() + "\n");
    }

}
