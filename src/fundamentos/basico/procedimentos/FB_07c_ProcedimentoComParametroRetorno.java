package fundamentos.basico.procedimentos;

public class FB_07c_ProcedimentoComParametroRetorno {
    public static int somar(int num1, int num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        int resultado = somar(40, 2);

        System.out.println("Resultado = " + resultado);
    }
}
