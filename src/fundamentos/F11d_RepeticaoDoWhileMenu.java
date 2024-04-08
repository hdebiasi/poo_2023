package fundamentos;

import java.util.Scanner;

public class F11d_RepeticaoDoWhileMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("=== MENU DE OPÇÕES ===\n");
            System.out.println("1. Incluir");
            System.out.println("2. Alterar");
            System.out.println("3. Excluir");
            System.out.println("4. Listar");
            System.out.println("5. Pesquisar");
            System.out.println("6. Finalizar\n");
            System.out.print("Digite a opção [1-6]: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1: System.out.println("\nIncluindo...\n"); break;
                case 2: System.out.println("\nAlterando...\n"); break;
                case 3: System.out.println("\nExcluindo...\n"); break;
                case 4: System.out.println("\nListando...\n"); break;
                case 5: System.out.println("\nPesquisando...\n"); break;
                case 6: System.out.println("\nFinalizando...\n"); break;
                default: System.out.println("\nOpção inválida...\n");
            }
        } while (opcao != 6);
    }
}
