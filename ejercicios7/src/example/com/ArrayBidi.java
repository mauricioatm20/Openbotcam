package example.com;

public class ArrayBidi {
    //cuando no se conocen los valores de las columnas POR EJEMPLO de un exel i= columna j= fila
    public static void main(String[] args) {
        int arrayBidi [][]= new int [2][2];
        arrayBidi [0][0]= 1;
        arrayBidi [0][1]= 2;

        arrayBidi [1][0]= 10;
        arrayBidi [1][1]= 20;

        for (int i=0; i < arrayBidi.length; i++){
            System.out.println("valor de i:" + i);

            for (int j=0; j < arrayBidi[1].length; j++){
                System.out.println("estoy en i=" + i + ",j="+j);
                System.out.println(arrayBidi[i][j]);
            }
        }
    }
}
