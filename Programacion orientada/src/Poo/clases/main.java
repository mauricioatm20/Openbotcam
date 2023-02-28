package Poo.clases;

//CLASE HIJA

import Poo.herencia.Camion;
import Poo.herencia.Coche;
import Poo.herencia.Motocicleta;

public class main {

    public static void main(String[] args) {
      /* 1 creando objeto y clases

        clase indentificador asiganacion
        ejemplo
        (clase)vehiculo(identioficador)renault = new vehiculo();

         */
        // crear un objeto utilizando  el constructor vacio

        vehiculo audi = new vehiculo();

        Motor motorgti = new Motor("gti", 190, 100.2,6);

        vehiculo renault = new vehiculo("renault","2015", 110.5,2015, false, 0, motorgti );
        // con control P dentro del parentesis se pasan los atributos
        System.out.println(renault.fabricante);
        System.out.println(renault.year);
        System.out.println(renault.speed);
        renault.acelerar(50);
        System.out.println(renault.speed);


        //  2 herencia

        Motocicleta ktmduke = new Motocicleta ();
        ktmduke.fabricante = "ktm";

        System.out.println( "fin de programa ");

        // 3 polimorfismosç

        vehiculo Vehiculo;

        Vehiculo = new Motocicleta();
        Vehiculo.fabricante = "ktm";

        Vehiculo = new Camion();
        Vehiculo.acelerar(50);

        Vehiculo = new Coche();
        Vehiculo.year = (2015);

        // 4 clases abstractas no se pueden instanciar (crear un objeto) solo instancian las clases hijas
    }
}
