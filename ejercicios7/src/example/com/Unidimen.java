package example.com;

public class Unidimen {
    public static void main(String[] args) {
        String nombres[]={
                "Mauricio",
                "Aegon",
                "Bella",
        };
       // recorre el Array y muestra las posiciones
        for (int i=0; i<nombres.length; i++){
            System.out.println("Nombre actual: " + nombres[i] + " en posición: "+i);
        }
    }
}        //solo recorre el Array
        /*for (String nombre: nombres) {
         System.out.println("Nombre actual:"+ nombre);
         }*/
