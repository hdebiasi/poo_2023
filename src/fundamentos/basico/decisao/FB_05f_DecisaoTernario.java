package fundamentos.basico.decisao;

import java.util.Scanner;

public class FB_05f_DecisaoTernario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Você é " + ((idade >= 18) ? "maior" : "menor") + " de idade!");
    }
}
