package Poo.sininterfaces;

import java.util.ArrayList;
import java.util.List;
/*
CRUD
Create
Read
Update
Delete
 */
public class EmpleadoCRUD {
// estructura de datos
List<Empleado> empleados = new ArrayList<>();

//CREATE - guardar empleado
    public void guardar(Empleado empleado){
        empleados.add(empleado);

    }

    public List<Empleado> verEmpleados(){
        return empleados;
    }

}

