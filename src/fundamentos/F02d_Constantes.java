package fundamentos;

public class F02d_Constantes {
    // Floats literais exigem o sufixo 'f'
    final static float NUMERO = 42.42f;

    // Longs exigem o sufixo 'L'
    final static long NUMERO_LONGO = 10_550_430_001L;

    final static double PI = 3.14159;
    final boolean STATUS = true;

    public static void main(String[] args) {
        System.out.println(F02d_Constantes.NUMERO);
        System.out.println(F02d_Constantes.NUMERO_LONGO);
        System.out.println(F02d_Constantes.PI);

        System.out.println(new F02d_Constantes().STATUS);

        // Definição de constantes locais
        final String UNIVERSIDADE = "Unoesc";

        // UNIVERSIDADE = "Unoutra"; // *** ERRO ***

        System.out.println(UNIVERSIDADE);
    }


}
