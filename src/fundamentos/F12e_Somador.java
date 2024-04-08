package fundamentos;

public class F12e_Somador {
    public int somar(int num1, int num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        // Forma mais detalhada
        F12e_Somador objetoSomador = new F12e_Somador();
        int resultado = objetoSomador.somar(40, 2);
        System.out.println("Resultado = " + resultado);

        // Forma mais simplificada
        System.out.println("Resultado = " + new F12e_Somador().somar(40, 2));
    }
}
