package shape;

import painter.Painter;

public class Square implements Shape{
    @Override
    public void paint(Painter painter) {
        painter.paint(this);
    }
}
