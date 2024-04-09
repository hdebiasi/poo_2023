package fundamentos.intermediario;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class FI_02a_ArrayNumeros {
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

        System.out.println("-------");
        System.out.println("Números ordenados em ordem crescente:");
        Arrays.sort(numeros);
        System.out.println(java.util.Arrays.toString(numeros));

        System.out.println("-------");
        Integer[] valores = {10, 8, 9, 7};
        System.out.println("Valores ordenados em ordem decrescente:");
        Arrays.sort(valores, Collections.reverseOrder());
        Arrays.stream(valores).forEach(System.out::println);
    }
}
