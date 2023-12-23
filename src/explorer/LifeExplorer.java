package explorer;

import planet.Jupiter;
import planet.Mercurio;
import planet.Planet;
import planet.Saturno;

public class LifeExplorer implements Explorer {
    @Override
    public void visit(Mercurio mercurio) {
        System.out.println("Estoy en marte chabon");
    }

    @Override
    public void visit(Jupiter jupiter) {
        System.out.println("Estoy en jupiter chabon");
    }

    @Override
    public void visit(Saturno saturno) {
        System.out.println("Estoy en saturno chabon");
    }

    @Override
    public void visit(Planet planet) {
        System.out.println("Cannot explore life on an unknown planet...");
    }
}
