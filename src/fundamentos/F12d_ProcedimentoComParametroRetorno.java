package fundamentos;

public class F12d_ProcedimentoComParametroRetorno {
    public static int somar(int num1, int num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        System.out.println("Resultado = " + somar(40, 2));
        System.out.println("Resultado = " + F12d_ProcedimentoComParametroRetorno.somar(40, 2));
    }
}
