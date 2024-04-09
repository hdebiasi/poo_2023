package fundamentos.basico;

public class FB_06i_RepeticaoDoWhilePasso {
    public static void main(String[] args) {
        int num = 2;

        System.out.println("Lista de números pares de 1 a 10");
        do {
            System.out.print(num + " ");
            num += 2;
        } while (num <= 10);
    }
}
