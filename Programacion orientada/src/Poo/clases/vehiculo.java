package Poo.clases;

// CLASE PADRE O RAIZ

public class vehiculo {


 //1 ATRIBUTOS

 protected String fabricante;
 protected String modelo;
 protected Double cavallos;
 protected int year;
 protected boolean sport;
 protected int speed;

 Motor motor;



 //2 CONSTURCTORES

 //"el constructor :el nombre que recibe es el mismo que el de la calse
    public vehiculo(){
    }

    public vehiculo(String fabricante, String modelo, Double cavallos, int year, boolean sport, int speed, Motor motor) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.cavallos = cavallos;
        this.year = year;
        this.sport = sport;
        this.speed = speed;
        this.motor = motor;
    }

    public vehiculo(String fabricante, String modelo, Double cavallos, int year, boolean sport){



    }

 //3 METODOS con boton izquierdo fuera de corchetes se seleccionamos generate y podemos crear constrcutores

    public void acelerar (int quantity){
        this.speed += quantity;

    }
    // getter/setter
    //tostring

    public vehiculo(String fabricante, int year) {
        this.fabricante = fabricante;
        this.year = year;
    }
}
