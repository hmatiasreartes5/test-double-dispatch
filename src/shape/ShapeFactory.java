package shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeFactory {

    public List<Shape> getShapes() {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Square());
        shapes.add(new Triangle());
        return shapes;
    }
}
