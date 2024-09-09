package fundamentos.basico.matematica;

import java.util.ArrayList;
import java.util.List;

public class ClasseNumber {
    public static void main(String[] args) {
        List<Number> numeros = new ArrayList<>();

        numeros.add(10);
        numeros.add(123_456_789L);
        numeros.add(123f);
        numeros.add(123_456.78);

        for (Number numero : numeros) {
            System.out.println("Número " + numero + " é do tipo " + numero.getClass());
        }
    }
}
