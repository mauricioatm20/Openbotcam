package example.com;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayLst {
    public static void main(String[] args) {
        //crear un array list y copiarlo en linkedlist y recorrer ambos
        ArrayList<String> lista= new ArrayList<String>();
        lista.add("genis");
        lista.add("Aegon");
        lista.add("Bella");
        lista.add("mauricio");

        LinkedList<String> linkedlist = new LinkedList<String>();
        for ( int i = 0; i < lista.size(); i++ ) {
            linkedlist.add(lista.get(i));
        }
        System.out.println("Elementos del Array:");
        for (String elementos : lista){
            System.out.println(elementos + " " );
        }
        System.out.println("elements de la LinkedList:");
        for (String elementos : linkedlist){
            System.out.println(elementos + "");
        }
    }
}
