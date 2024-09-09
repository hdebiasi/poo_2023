package fundamentos.basico.procedimentos;

public class FB_07d_ProcedimentoComParametroRetorno {
    public static int somar(int num1, int num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        System.out.println("Resultado = " + somar(40, 2));
        System.out.println("Resultado = " + FB_07d_ProcedimentoComParametroRetorno.somar(40, 2));
    }
}
