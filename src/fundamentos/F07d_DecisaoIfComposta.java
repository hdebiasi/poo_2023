package fundamentos;

import java.util.Scanner;

public class F07d_DecisaoIfComposta {
    public static void main(String[] args) {
        String nome;
        double media;
        float frequencia;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome estudante: ");
        nome = scanner.next();

        System.out.print("Média final: ");
        media = scanner.nextDouble();

        System.out.print("Frequência: ");
        frequencia = scanner.nextFloat();

        if (media >= 7 &&  frequencia >= 75) {
            System.out.println("Estudante " + nome + " passou!");
        } else {
            System.out.println("Estudante " + nome + " reprovou!");
        }
    }
}
