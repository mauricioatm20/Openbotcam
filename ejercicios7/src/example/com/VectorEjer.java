package example.com;

import java.util.Vector;
public class VectorEjer {

    public static void main(String[] args) {
        //los vectores son como los array pueden ser integer , string. Cuando creamos un vector creamos por debajo un aray de un tamaño determinado los vectores son dinamicos
        //cuando ocupamos su capacidad incrementa en de 10 en 10
        Vector<Integer>vector = new Vector();
        vector.add(0);//si fuese string seria .add("hola");
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        System.out.println("datos del vector"+ vector);

        vector.remove(2);
        vector.remove(3);
        System.out.println("datos del vector"+ vector);

        System.out.println("Vector tamaño:" + vector.size() + " y capacidad:" + vector.capacity());/*tiene tamaño 3 porque hemos eliminado 2*/
        System.out.println("el problema : desperdiciamos mucha memoria del sistema, ya que cuando  sobrepasamos su capacidad se duplica de 10 en 10");
    }
}
