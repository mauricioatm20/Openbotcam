package example.com;

import java.util.ArrayList;

public class ArrayInt {
    public static void main(String[] args) {

        ArrayList <Integer> lista = new ArrayList<Integer>();
        //se crea el bulce del 1-10
        for (int i = 1; i < 11; i++) {
            lista.add(i);
            //recorre el bucle del 1-10
            for (int num = 0; num < lista.size(); num++) {

               //con esta condiciuon se eliminan los nº pares
                if (lista.get(num) % 2 == 0) {
                    lista.remove(num);
                }
            }
        }
        System.out.println(lista);
    }
}
