package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle() {

    }

    public RightTriangle(String color, double firstLeg, double secondLeg) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        setColor(color);
    }

    @Override
    public double areaCalculation() {
        return (firstLeg * secondLeg) / 2;
    }

    @Override
    public void toDraw() {
        System.out.println("Figure: right triangle, area = " + areaCalculation()
                + " sq. units, firstLeg = " + firstLeg + " units, " + "firstLeg = "
                + firstLeg + " units, " + "color = " + getColor());
    }
}
