package painter;

import phone.Iphone;
import phone.Phone;
import phone.Samsung;
import shape.Square;
import shape.Triangle;

public interface Painter {
    void paint(Triangle triangle);
    void paint(Square square);
    void paint(Iphone iphone);
    void paint(Samsung samsung);
}
