package phone;

import painter.Painter;

public class Samsung implements Phone{
    @Override
    public void paint(Painter painter) {
        painter.paint(this);
    }
}
