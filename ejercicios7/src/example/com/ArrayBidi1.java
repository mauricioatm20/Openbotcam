package example.com;

public class ArrayBidi1 {

    public static void main(String[] args) {
        //cuando se conocen los valores se usa este metodo
        //un array no puedo crecerlo ni decrecerlo pero si mutarlo
        //2 filas x 4 columnas
        Integer[][] numeros = {
                {5, 10, 15},
                {20, 25, 30}
        };

        for (int i = 0; i < numeros.length; i++) {

            for (int y = 0; y < numeros[i].length; y++) {

                System.out.println("Fila: " + (i + 1) + " | Columna: " + (y + 1) +
                        "\nEl valor es: " + numeros[i][y] + "\n");
            }
        }
    }
}

