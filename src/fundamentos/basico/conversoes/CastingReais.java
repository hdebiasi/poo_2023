package fundamentos.basico.conversoes;

public class CastingReais {
    public static void main(String[] args) {
        // Divisões                                         Resultado
        System.out.println("Inteiro:");
        System.out.println("10/3   = " + 10/3);             // 3

        System.out.println("\nFloats e Ints:");
        System.out.println("10.f/3  = " + 10f / 3);  // 3.3333333
        System.out.println("10/3.f  = " + 10 / (float) 3.);  // 3.3333333

        System.out.println("\nSomente Floats:");
        System.out.println("10.f/3.f = " + (float) 10. / (float) 3.); // 3.3333333

        System.out.println("\nSomente Doubles:");
        double n1 = 10;
        double n2 = 3;
        double resultado = n1 / n2;     // 3.3333333333333335
        System.out.println("10d/3d = " + 10. / 3.);     // 3.3333333333333335
        System.out.println("10d/3d = " + resultado);    // 3.3333333333333335

        // Upcasting de tipos 'menores' para 'maiores'
        int i1 = 10, i2 = 3;
        double r1 = i1 / i2;            // 3.0
        double r2 = (double) i1 / i2;   // 3.3333333333333335
        System.out.println("\nSem casting: " + r1);
        System.out.println("Com casting: " + r2);

        // Downcasting de tipos 'maiores' para 'menores'
        double a = 10.5;
//        int b = a;          // Causa erro de compilação
        int b = (int) a;    // Conversão explícita: 10
        System.out.printf("\nDe double (%.2f) para int (%d)", a, b);
    }
}
