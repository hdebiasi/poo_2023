package fundamentos;

import java.util.Scanner;

public class F12a_ProcedimentoSemParametro {
    static int num1, num2, resultado;

    public static void somar() {
        resultado = num1 + num2;
    }

    public static void main(String[] args) {
        num1 = 40;
        num2 = 2;

        somar();

        System.out.println("Resultado = " + resultado);
    }
}
