package ObP;

public class main {
    public static void main(String[] args) {

        SmartDevice apple  = new SmartDevice();

        apple iphone  = new apple("rojo","mini",2020, false);

        SmartDevice apple2 = new SmartDevice( "apple","mini","bionic","blanco",12.5, 2020,false);

        System.out.println(apple2.year);
        System.out.println(apple2.fabricante);
        System.out.println(apple2.procesador);
        System.out.println(apple2.modelo);
        System.out.println(apple2.camara);
        System.out.println(apple2.color);

    }
}
