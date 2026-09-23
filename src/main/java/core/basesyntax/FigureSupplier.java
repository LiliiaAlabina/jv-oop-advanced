package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final Random random = new Random();
    private final ColorSupplier randomColor = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureType = random.nextInt(5);
        double sideA;
        double sideB;
        double height;
        switch (figureType) {
            case 0: // Square
                sideA = random.nextInt(10) + 1;
                return new Square(randomColor.getRandomColor(), sideA);
            case 1: // Rectangle
                sideA = random.nextInt(10) + 1;
                sideB = random.nextInt(10) + 1;
                return new Rectangle(randomColor.getRandomColor(), sideA, sideB);
            case 2: // Circle
                int radius = random.nextInt(10) + 1;
                return new Circle(randomColor.getRandomColor(), radius);
            case 3://Triangle
                sideA = random.nextInt(10) + 1;
                return new RightTriangle(randomColor.getRandomColor(), sideA);
            case 4:// Trapezoid
                sideA = random.nextInt(10) + 1;
                sideB = random.nextInt(10) + 1;
                height = random.nextInt(10) + 1;
                return new IsoscelesTrapezoid(randomColor.getRandomColor(), sideA, sideB, height);
            default:
                return null;
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("WHITE", 10);
    }

}
