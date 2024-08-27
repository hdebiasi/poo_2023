package fundamentos.basico;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FB_06l_RepeticaoForeach {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4};
        for (int nota: numeros) {
            System.out.print(nota + " ");
        }

        System.out.println();

        List<String> frutas = new ArrayList<>(Arrays.asList("Uva", "Banana", "Melancia"));
        for (String fruta : frutas) {
            System.out.print(fruta + " ");
        }
    }
}
