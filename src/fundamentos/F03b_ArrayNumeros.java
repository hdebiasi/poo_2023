package fundamentos;

import java.util.Scanner;

public class F03b_ArrayNumeros {
    public static void main(String[] args) {
        int[] numeros = new int[4];
        int contador;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os " + numeros.length + " numeros:");
        for (contador = 0; contador < numeros.length; contador++) {
            System.out.print((contador + 1) + "o. numero: ");
            numeros[contador] = scanner.nextInt();
        }

        System.out.println("-------");
        for (int nota: numeros) {
            System.out.println(nota);
        }
    }
}
