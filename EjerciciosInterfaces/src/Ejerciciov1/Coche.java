package Ejerciciov1;

public class Coche {
    String marca;
    int puertas;
    double cavallos;
    boolean camara;

    public Coche(){}

    @Override
    public String toString() {
        return "Coche{" +
                "marca='" + marca + '\'' +
                ", puertas=" + puertas +
                ", cavallos=" + cavallos +
                ", camara=" + camara +
                '}';
    }

    public Coche(String marca, int puertas, double cavallos, boolean camara) {
        this.marca = marca;
        this.puertas = puertas;
        this.cavallos = cavallos;
        this.camara = camara;


    }
}
