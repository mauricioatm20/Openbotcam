package Poo.coninterfaces;
//LAS INTERFACES SOLO DECALRAN METODOS
import Poo.sininterfaces.Empleado;
import java.util.List;
/*
se declaran los metodos no se declaran
actua como un contrato, dice lo que hay que hacer pero no lo hace
 */
public interface EmpleadoCRUD {

    void save(Empleado empleado);

    List<Empleado> finAll();

    void delete(Empleado empleado);


}
