package Poo.coninterfaces;

import Poo.sininterfaces.Empleado;

import java.util.List;

//para implementar interfaces se utiliza la palabra implements
public class EmpleadoCRUDMySQL implements EmpleadoCRUD{

    @Override
    public void save(Empleado empleado) {
    }

    @Override
    public List<Empleado> finAll() {
        return null;
    }

    @Override
    public void delete(Empleado empleado) {

    }
}
