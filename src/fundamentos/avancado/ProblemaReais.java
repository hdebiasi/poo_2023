package fundamentos.avancado;

import java.text.DecimalFormat;
import java.util.Locale;

public class ProblemaReais {
    public static void main(String[] args) {
        double a = 0.1;
        double b = 0.2;
        double c = a + b;

        if (c == 0.3) {
            System.out.println("c = 0,1 + 0,2");
        }

        if (c != 0.3) {
            System.out.println("Algo estranho está acontecendo: 0,1 + 0,2 = " + c + "\n");
        }

        // 1a. solução: Arredondamento 'manual
        c = Math.round((a + b) * 100) / 100.;
        if (c == 0.3) {
            System.out.println("Método 1, ok! 0,1 + 0,2 = " + c);
        }

        // 2a. solução: String.format()
        String str = String.format(Locale.US, "%.2f", (a + b));
        c = Double.valueOf(str);

        if (c == 0.3) {
            System.out.println("Método 2, ok! 0,1 + 0,2 = " + c);
        }

        // 3a. solução: DecimalFormat.format()
        Locale.setDefault(Locale.US);
        str = new DecimalFormat("0.00").format(a + b);
        c = Double.valueOf(str);

        if (c == 0.3) {
            System.out.println("Método 3, ok! 0,1 + 0,2 = " + c);
        }
    }
}