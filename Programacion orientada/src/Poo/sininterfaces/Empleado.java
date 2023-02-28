package Poo.sininterfaces;

public class Empleado {

    String name;
    int edad;
    double salario;
    boolean alta;

// constructor
    public Empleado(){}

    @Override
    public String toString() {
        return "Empleado{" +
                "name='" + name + '\'' +
                ", edad=" + edad +
                ", salario=" + salario +
                ", alta=" + alta +
                '}';
    }

    public Empleado(String name, int edad, double salario, boolean alta) {
        this.name = name;
        this.edad = edad;
        this.salario = salario;
        this.alta = alta;

        //metodos para que los datos se muestren en el print hay que crear un to string con boton derecho, generate




    }
}

