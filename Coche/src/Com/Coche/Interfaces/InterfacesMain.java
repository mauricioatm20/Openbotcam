package Com.Coche.Interfaces;

import Com.Coche.Coche;

public class InterfacesMain {

    public static void main(String[] args) {


        CocheService service1= new CocheServiceSportimpl();



        Coche coche = service1.crearCocheDemo();







    }
}
