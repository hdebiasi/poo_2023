package fundamentos.basico.repeticao;

public class FB_06f_RepeticaoWhilePasso {
    public static void main(String[] args) {
        int num = 2;

        System.out.println("Lista de números pares de 1 a 10");
        while (num <= 10) {
            System.out.print(num + " ");
            num += 2;
        }
    }
}
