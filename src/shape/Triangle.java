package shape;

import painter.Painter;

public class Triangle implements Shape {
    @Override
    public void paint(Painter painter) {
        painter.paint(this);
    }
}
