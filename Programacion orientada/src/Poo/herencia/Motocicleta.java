package Poo.herencia;

import Poo.clases.Motor;
import Poo.clases.vehiculo;

public class Motocicleta extends vehiculo {

    boolean baul ;

    public Motocicleta(){// siempre que da error hay que crear un cosntructor vacio

    }

    public Motocicleta(String fabricante, String modelo, Double cavallos, int year, boolean sport, int speed, Motor motor, boolean baul) {
        super(fabricante, modelo, cavallos, year, sport, speed, motor);
        this.baul = baul;
    }
}
