package fundamentos.basico.conversoes;

public class CastingReais {
    public static void main(String[] args) {
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
