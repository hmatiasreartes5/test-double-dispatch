package painter;

import phone.Iphone;
import phone.Samsung;
import shape.Square;
import shape.Triangle;

public class GreenPainter implements Painter{
    @Override
    public void paint(Triangle triangle) {
        System.out.println("Triangulo pintado de verde");
    }

    @Override
    public void paint(Square square) {
        System.out.println("Cuadrado pintado de verde");
    }

    @Override
    public void paint(Iphone iphone) {
        System.out.println("Samsung pintado de verde");
    }

    @Override
    public void paint(Samsung samsung) {
        System.out.println("Samsung pintado de verde");
    }
}
