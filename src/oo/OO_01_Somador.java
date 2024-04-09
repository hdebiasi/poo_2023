package oo;

public class OO_01_Somador {
    public int somar(int num1, int num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        // Forma mais detalhada
        OO_01_Somador objetoSomador = new OO_01_Somador();
        int resultado = objetoSomador.somar(40, 2);
        System.out.println("Resultado = " + resultado);

        // Forma mais simplificada
        System.out.println("Resultado = " + new OO_01_Somador().somar(40, 2));
    }
}
