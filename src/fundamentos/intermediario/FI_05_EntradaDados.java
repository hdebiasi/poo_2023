package fundamentos.intermediario;

import java.util.Scanner;

public class FI_05_EntradaDados {
    public static void main(String[] args) {
        double n1, n2, resultado;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite o primeiro número: ");
            n1 = scanner.nextDouble();

            System.out.print("Digite o segundo número.: ");
            n2 = scanner.nextDouble();
        }
        resultado = n1 + n2;
        System.out.println("Soma: " + resultado);
    }
}
