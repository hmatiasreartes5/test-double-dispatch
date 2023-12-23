package phone;

import painter.Painter;

public class Iphone implements Phone{
    @Override
    public void paint(Painter painter) {
        painter.paint(this);
    }
}
