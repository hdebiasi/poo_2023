package fundamentos.basico;

import java.util.Scanner;

public class FB_04a_EntradaDadosScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a sua idade..: ");
        int idade = scanner.nextInt();

        scanner.nextLine(); // Esvazia o buffer de teclado

        System.out.print("Digite o seu nome...: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o seu salário: ");
        double salario = scanner.nextDouble();

        System.out.printf("Seu nome é %s, você tem %d anos e ganha R$ %.2f", nome, idade, salario);
    }
}
