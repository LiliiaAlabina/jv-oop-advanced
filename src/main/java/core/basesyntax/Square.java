package core.basesyntax;

public class Square extends Figure {
    private double sideA;

    public Square() {

    }

    public Square(String color, double sideA) {
        this.sideA = sideA;
        setColor(color);
    }

    @Override
    public double areaCalculation() {
        return sideA * sideA;
    }

    @Override
    public void toDraw() {
        System.out.println("Figure: Square, area = " + areaCalculation()
                + " sq. units, side a = " + sideA + " units, "
                + " color = " + getColor());
    }

}
