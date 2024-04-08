package fundamentos;

import java.util.Arrays;
import java.util.Collections;

public class F03a_ArrayNotas {
    public static void main(String[] args) {
        int[] notas = new int[4];
        notas[0] = 10;
        notas[1] = 8;
        notas[2] = 9;
        notas[3] = 7;

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota " + (i + 1) + ": " + notas[i]);
        }

        System.out.println("-------");
        System.out.println("Exemplo de laço for each:");
        for (int nota: notas) {
            System.out.println(nota);
        }

        System.out.println("-------");
        System.out.println("Notas ordenadas:");
        Arrays.sort(notas);
        System.out.println(java.util.Arrays.toString(notas));

        System.out.println("-------");
        Integer[] notasO = {10, 8, 9, 7};
        System.out.println("Notas ordenadas:");
        Arrays.sort(notasO, Collections.reverseOrder());
        Arrays.stream(notasO).forEach(System.out::println);
    }
}
