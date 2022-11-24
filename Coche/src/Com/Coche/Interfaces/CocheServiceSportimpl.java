package Com.Coche.Interfaces;

import Com.Coche.Coche;

public class CocheServiceSportimpl implements CocheService {

    @Override
    public Coche crearCocheDemo() {
        System.out.println("creando coche de carreras");

        return null;
    }

    @Override
    public void destruirCoche(Coche coche) {
        System.out.println("en el desguace");

    }
}
