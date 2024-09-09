package fundamentos.basico.numeros;

public class OperacoesNumericas {
    public static void main(String[] args) {
        // Divisões                                                 Resultado
        System.out.println("Inteiro:");
        System.out.println("10/3   = " + 10/3);                     // 3

        System.out.println("\nFloats e Ints:");
        System.out.println("10.f/3  = " + 10f / 3);                 // 3.3333333
        System.out.println("10/3.f  = " + 10 / (float) 3.);         // 3.3333333

        System.out.println("\nSomente Floats:");
        System.out.println("10.f/3.f = " + (float) 10. / (float) 3.); // 3.3333333

        System.out.println("\nSomente Doubles:");
        System.out.println("10d/3d = " + 10. / 3.);                 // 3.3333333333333335
        double n1 = 10;
        double n2 = 3;
        double resultado = n1 / n2;                                 // 3.3333333333333335
        System.out.println("10d/3d = " + resultado);                // 3.3333333333333335

        int num1 = 10, num2 = 3;
        double resposta = 10 / 3;
        System.out.println(resposta);
    }
}