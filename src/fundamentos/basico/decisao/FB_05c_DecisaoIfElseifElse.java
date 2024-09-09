package fundamentos.basico.decisao;

import java.util.Scanner;

public class FB_05c_DecisaoIfElseifElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a sua média final [0,0 - 10,0]: ");
        double media = scanner.nextDouble();

        if (media < 0 || media > 10) {
            System.out.println("Média inválida!");
        } else if (media == 10) {
            System.out.println("Parabéns!!! Nota perfeita!");
        } else if (media > 9) {
            System.out.println("Parabéns, ótima média!");
        } else if (media > 8) {
            System.out.println("Boa média!");
        } else if (media > 7) {
            System.out.println("Média suficiente, passou!");
        } else if (media > 4) {
            System.out.println("Média insuficiente, exame!");
        } else {
            System.out.println("Reprovação!");
        }
    }
}
