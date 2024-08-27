package fundamentos.basico;

import java.util.Scanner;

public class FB_05d_DecisaoIfComposta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome estudante: ");
        String nome = scanner.next();

        System.out.print("Média final: ");
        double media = scanner.nextDouble();

        System.out.print("Frequência: ");
        float frequencia = scanner.nextFloat();

        if (media >= 7 &&  frequencia >= 75) {
            System.out.println("Estudante " + nome + " passou!");
        } else {
            System.out.println("Estudante " + nome + " reprovou!");
        }
    }
}
