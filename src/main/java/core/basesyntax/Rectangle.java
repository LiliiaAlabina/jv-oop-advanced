package core.basesyntax;

public class Rectangle extends Figure {
    private double sideA;
    private double sideB;

    public Rectangle() {

    }

    public Rectangle(String color, double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
        setColor(color);
    }

    @Override
    public double areaCalculation() {
        return (sideA * sideB) / 2;
    }

    @Override
    public void toDraw() {
        System.out.println("Figure: rectangle, Color = " + getColor() + ", " + "Side a = " + sideA
                + ", " + "Side b = " + sideB + ", " + "Area = " + areaCalculation() + "\n");
    }

}
