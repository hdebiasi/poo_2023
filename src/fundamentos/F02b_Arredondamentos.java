package fundamentos;

import java.text.DecimalFormat;
import java.util.Locale;

public class F02b_Arredondamentos {
    public static void main(String[] args) {
        // Arredondamento
        final DecimalFormat df = new DecimalFormat("0.0");

        double valor1 = 9.999;
        double valor2 = 9.41;
        double valor3 = 9.46;

        Locale.setDefault(Locale.US);
        System.out.println("9.999 arredondado para duas casas decimais: " + String.format("%.2f", valor1));
        System.out.println("9,41 é arredondado para baixo: " + df.format(valor2));
        System.out.println("9,46 é arredondado para cima.: " + df.format(valor3));
    }
}
