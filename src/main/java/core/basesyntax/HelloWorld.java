package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */
public class HelloWorld {
    public static void main(String[] args) {
        FigureSupplier randomFigure = new FigureSupplier();
        Figure[] figures = {randomFigure.getRandomFigure(), randomFigure.getRandomFigure(),
                randomFigure.getDefaultFigure()};
        for (Figure figure : figures) {
            figure.toDraw();
        }
    }
}
