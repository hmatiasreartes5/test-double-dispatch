import explorer.Explorer;
import explorer.LifeExplorer;
import painter.RedPainter;
import planet.Jupiter;
import planet.Mercurio;
import planet.Planet;
import shape.Shape;
import shape.ShapeFactory;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = new ShapeFactory().getShapes();

        for (Shape shape : shapes) {
            shape.paint(new RedPainter());
        }
    }

    /* EJEMPLO CON PLANETAS
    System.out.println("Hello world!");

        Planet mercurio = new Mercurio();
        Planet saturno = new Saturno();
        Planet jupiter = new Jupiter();

        Explorer explorer = new LifeExplorer();

        List<Planet> planets = new ArrayList<>();d
        planets.add(mercurio);
        planets.add(jupiter);
        planets.add(saturno);

        for (Planet planet : planets) {
            planet.accept(explorer);
        }
     */

    /* ErrorLogger logger = new PrintErrorErrorLogger();

        Error communication = new Communication("clabe", 404);
        Error repository = new Repository("entity", "insert");

        communication.createLog(logger);
        repository.createLog(logger);
        }*/

    /*Shape square = new Square();
        Shape triangle = new Triangle();

        Painter painterGreen = new GreenPainter();
        List<Shape> shapesGreen = new ArrayList<>();
        shapesGreen.add(square);
        shapesGreen.add(triangle);

        for (Shape shape : shapesGreen) {
            shape.paint(painterGreen);
        }

        Painter painterRed = new RedPainter();
        List<Shape> shapesRed = new ArrayList<>();
        shapesRed.add(square);
        shapesRed.add(triangle);

        for (Shape shape : shapesRed) {
            shape.paint(painterRed);
        }

        Phone iphone = new Iphone();
        iphone.paint(painterRed);*/
}