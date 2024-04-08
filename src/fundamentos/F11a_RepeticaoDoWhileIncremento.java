package fundamentos;

public class F11a_RepeticaoDoWhileIncremento {
    public static void main(String[] args) {
        int num = 1;

        System.out.println("Lista de números de 1 a 10");
        do {
            System.out.print(num + " ");
            num++;
        } while (num <= 10);
    }
}
