package Poo.sininterfaces;

import java.util.List;

public class Main {

    public static void main(String[] args) {


        //con comand D duplico una linea
        EmpleadoCRUD empleadoCRUD = new EmpleadoCRUD();

        Empleado gafas = new Empleado ("gafas", 30,1520.4,true);
        Empleado merlos  = new Empleado ("merlos", 25,1520.4,true);
        Empleado aegon = new Empleado ("aegon", 3,1520.4,false);

        //guardar empleados
        empleadoCRUD.guardar(gafas);
        empleadoCRUD.guardar(merlos);
        empleadoCRUD.guardar(aegon);

        //consultar empleados

        List<Empleado> empleados = empleadoCRUD.verEmpleados();
        System.out.println(empleados);

    }
}
