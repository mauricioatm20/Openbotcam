package Com.Coche.Interfaces;

import Com.Coche.Coche;

public class CocheServiceclasicimpl implements CocheService {
    @Override
    public Coche crearCocheDemo() {
        System.out.println("Creando coche clasico");



        return null;
    }

    @Override
    public void destruirCoche(Coche coche) {
        System.out.println("descatalagado");
    }
}
