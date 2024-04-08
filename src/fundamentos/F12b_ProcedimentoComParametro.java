package fundamentos;

public class F12b_ProcedimentoComParametro {
    static int resultado;

    public static void somar(int num1, int num2) {
        resultado = num1 + num2;
    }

    public static void main(String[] args) {
        somar(40, 2);

        System.out.println("Resultado = " + resultado);
    }
}
