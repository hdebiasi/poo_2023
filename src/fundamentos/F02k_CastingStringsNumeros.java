package fundamentos;

public class F02k_CastingStringsNumeros {
    public static void main(String[] args) {
        Integer num1 = 40;
        System.out.println(num1 + 2);
        System.out.println(num1.toString() + 2);

        System.out.println("-----");

        int num2 = 40;
        System.out.println(num2 + 2);
        System.out.println(String.valueOf(num2) + 2);

        System.out.println("-----");

        double num3 = 789.01;
        System.out.println(num3 + 10);
        System.out.println(Double.valueOf(num3) + 10);
    }
}
