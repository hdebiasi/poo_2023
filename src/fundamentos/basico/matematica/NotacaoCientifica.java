package fundamentos.basico.matematica;

import java.text.DecimalFormat;

public class NotacaoCientifica {
    public static void main(String[] args) {
        double numero = 1.23e2;         // 1.23 x 10^2
        System.out.println(numero);

        numero = 1.23e3;                // 1.23 x 10^3
        System.out.println(numero);

        numero = 123;
        DecimalFormat f = new DecimalFormat("0.#####E0");
        System.out.println(f.format(numero));
    }
}
