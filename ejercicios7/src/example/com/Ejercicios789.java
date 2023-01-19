package example.com;

public class Ejercicios789 {
    public static void main(String[] args) {
        String cadena = "hola mundo";
        // Crear un StringBuilder a partir de la cadena
        StringBuilder stringBuilder = new StringBuilder(cadena);
        // Y llamar al método reverse de StringBuilder (lo convertimos a cadena con toString)
        String invertida = stringBuilder.reverse().toString();
        System.out.println("Cadena original: " + cadena);
        System.out.println("Cadena invertida: " + invertida);

    }
}

