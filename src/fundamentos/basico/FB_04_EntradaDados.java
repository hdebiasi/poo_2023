package fundamentos.basico;

import java.util.Scanner;

public class FB_04_EntradaDados {
    public static void main(String[] args) {
        double n1, n2, resultado;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        n1 = scanner.nextDouble();

        System.out.print("Digite o segundo número.: ");
        n2 = scanner.nextDouble();

        resultado = n1 + n2;
        System.out.println("Soma: " + resultado);
    }
}
