package ObP;

public class SmartDevice {

    protected String fabricante;
    protected String modelo;
    protected String procesador;
    protected String color;

    protected Double camara;
    protected int year;
    protected boolean seguridad;

   public SmartDevice(){

    }

    public SmartDevice(String fabricante, String modelo, String procesador, String color, Double camara, int year, boolean seguridad) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.procesador = procesador;
        this.camara = camara;
        this.year = year;


    }
    public SmartDevice(String fabricante,String modelo,String camaras,int year,String procesador) {

    }

}
