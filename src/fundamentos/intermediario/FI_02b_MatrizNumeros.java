package fundamentos.intermediario;

import java.util.Scanner;

public class FI_02b_MatrizNumeros {
    public static void main(String[] args) {
        int[][] numeros = new int[3][4];
        Scanner scanner = new Scanner(System.in);

        for (int linha = 0; linha < numeros.length; linha++) {
            System.out.printf("Linha %d:\n", (linha + 1));
            for (int coluna = 0; coluna < numeros[linha].length; coluna++) {
                System.out.printf("\tColuna %d: ", (coluna+1));
                numeros[linha][coluna] = scanner.nextInt();
            }
            System.out.println();
        }

        for (int linha = 0; linha < numeros.length; linha++) {
            for (int coluna = 0; coluna < numeros[linha].length; coluna++) {
                System.out.print(numeros[linha][coluna] + "\t");
            }
            System.out.println();
        }
    }
}
