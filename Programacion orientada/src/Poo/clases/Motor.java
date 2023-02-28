package Poo.clases;

public class Motor {
    //atributos

    String modelo;
    int caballos;
    double parNM;
    int numCilindros;

    //constuctor

    public Motor() {
    }

    public Motor(String modelo, int caballos, double parNM, int numCilindros) {
        this.modelo = modelo;
        this.caballos = caballos;
        this.parNM = parNM;
        this.numCilindros = numCilindros;

        System.out.println();
    }
}
