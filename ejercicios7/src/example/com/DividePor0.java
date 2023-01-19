package example.com;

import java.util.Scanner;

public class DividePor0 {

    private static int Dividir(int a, int b) throws ArithmeticException {
        return a / b;
    }
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Indica los numeros que quieres dividir: ");
        System.out.print("Numero 1: ");
        int a = scanner.nextInt();
        System.out.print("Numero 2: ");
        int b = scanner.nextInt();
        try {
            System.out.println("Resultado: " + Dividir(a, b));
        } catch (ArithmeticException e) {
            System.out.println("Esto no puede hacerse");
        } finally {
            System.out.println("Demo de código");
        }
    }
}
