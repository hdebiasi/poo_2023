package fundamentos.basico.decisao;

import java.util.Scanner;

public class FB_05e_DecisaoSwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a sua média final [0 - 10]: ");
        int media = scanner.nextInt();

        switch (media) {
            case 10: { System.out.println("Parabéns!!! Nota perfeita!"); break; }
            case 9: System.out.println("Parabéns, ótima média!"); break;
            case 8: System.out.println("Boa média!"); break;
            case 7: System.out.println("Média suficiente, passou!"); break;
            case 6:
            case 5:
            case 4:
                System.out.println("Média insuficiente, exame!");
                break;
            case 3, 2, 1, 0: {
                System.out.println("Reprovação!");
                break;
            }
            default:
                System.out.println("Média inválida!");
        }
    }
}

