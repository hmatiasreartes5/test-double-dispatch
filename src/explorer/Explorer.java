package explorer;

import planet.Jupiter;
import planet.Mercurio;
import planet.Planet;
import planet.Saturno;

public interface Explorer {
    void visit(Mercurio mercurio);
    void visit(Jupiter jupiter);
    void visit(Saturno saturno);

    void visit(Planet planet);
}
