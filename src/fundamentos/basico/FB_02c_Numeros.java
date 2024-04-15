package fundamentos.basico;

public class FB_02c_Numeros {
    public static void main(String[] args) {
        int n1 = 40, n2 = 2;

        System.out.println("Operações básicas:");
        System.out.printf("n1 = %d; n2 = %d\n", n1, n2);
        System.out.printf("n1 + n2 = %d\n", n1 + n2);
        System.out.printf("n1 - n2 = %d\n", n1 - n2);
        System.out.printf("n1 * n2 = %d\n", n1 * n2);
        System.out.printf("n1 / n2 = %d\n", n1 / n2);
        System.out.printf("n1 %% n2 = %d\n", n1 % n2);
        System.out.printf("Resto da divisão de 10 %% 3 = %d\n", 10 % 3);

        System.out.println("\nOperadores unários");
        int a, b;

        a = 10; b = 5;
        a = b++;
        System.out.printf("a = b++ | a = %d | b = %d", a, b);

        a = 10; b = 5;
        a = ++b;
        System.out.printf("\na = ++b | a = %d | b = %d", a, b);
    }
}
