package fundamentos.basico;

public class FB_02e_CastingReais {
    public static void main(String[] args) {
        // Divisões                                         Resultado
        System.out.println("Inteiro:");
        System.out.println("10/3   = " + 10/3);             // 3

        System.out.println("\nFloat:");
        System.out.println("10./3  = " + (float) (10./3));  // 3.3333333333333335
        System.out.println("10/3.  = " + (float) (10/3.));  // 3.3333333333333335
        System.out.println("10./3. = " + (float) (10./3.)); // 3.3333333333333335

        double n1 = 10;
        double n2 = 3;
        double resultado = n1 / n2;

        System.out.println("\nDouble:");
        System.out.println("10d/3d = " + resultado);        // 3.3333333333333335

        int i1 = 10, i2 = 3;
        double r1 = i1 / i2;
        double r2 = (double) i1 / i2;
        System.out.println("\nSem casting: " + r1);
        System.out.println("Com casting: " + r2);

        // Casting de tipos 'maiores' para 'menores'
        double a = 10.5;
//        int b = a;
        int b = (int) a;
        System.out.printf("\nDe double (%.2f) para int (%d)", a, b);
    }
}
