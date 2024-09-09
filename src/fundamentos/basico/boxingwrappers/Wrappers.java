package fundamentos.basico.boxingwrappers;

import java.util.Arrays;
import java.util.List;

public class Wrappers {
    public static void main(String[] args) {
        int n1 = 1, n2 = 2, n3 = 3;
        Integer iN1 = 1, iN2 = 2, iN3 = 3;

        int[] numeros = {n1, n2, n3};
        Integer[] iNumeros = {iN1, iN2, iN3};

        System.out.println("Elementos de 'numeros'.: " + Arrays.toString(numeros));
        System.out.println("Elementos de 'iNumeros': " + Arrays.toString(iNumeros));

        System.out.println("Tipo do 1o. elemento 'numeros'.: int (não há métodos disponíveis)");
        System.out.println("Tipo do 1o. elemento 'iNumeros': " + iNumeros[0].getClass());
        //------
        List<Integer> lNumeros = Arrays.asList(n1, n2, n3);

        System.out.println("----------");
        System.out.println("Tipo do primeiro elemento: " + lNumeros.get(0).getClass());

        for (Integer numero : lNumeros) {
            System.out.print(numero + " ");
        }

        System.out.println();
        lNumeros.forEach(System.out::println); // Outra forma, mais compacta, de imprimir
    }
}
