package Poo.coninterfaces;

import Poo.sininterfaces.Empleado;

public class main {

    static EmpleadoCRUD empleadoCRUD; //= new EmpleadoCRUDMySQL();  O  = new EmpleadoCRUDexel();

    public static void main(String[] args) {

        empleadoCRUD.finAll();
        empleadoCRUD.save(new Empleado());

    }
}
