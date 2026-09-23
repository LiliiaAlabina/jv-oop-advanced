package core.basesyntax;

public class RightTriangle extends Figure {
    private double sideA;

    public RightTriangle() {

    }

    public RightTriangle(String color, double sideA) {
        this.sideA = sideA;
        setColor(color);
    }

    @Override
    public double areaCalculation() {
        return (Math.pow(sideA,2) * Math.sqrt(3)) / 4;
    }

    @Override
    public void toDraw() {
        System.out.println("Figure: right triangle Color = " + getColor() + " " + "Side a = "
                + sideA + " " + "Area = " + areaCalculation() + "\n");
    }
}
