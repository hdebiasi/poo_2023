package fundamentos;

public class F11b_RepeticaoDoWhileDecremento {
    public static void main(String[] args) {
        int num = 10;

        System.out.println("Lista de números 10 a 1");
        do {
            System.out.print(num + " ");
            num--;
        } while (num > 0);
    }
}
