package exercicios;

import java.util.ArrayList;
import java.util.List;

public class TestaFormas {
    public static void main(String[] args) {
        List<FormaGeometrica> formas = new ArrayList<FormaGeometrica>();

        formas.add(new Quadrado(10));
        formas.add(new Retangulo(10, 5));

        for (FormaGeometrica forma: formas) {
            System.out.println(forma.calcular());
        }

        for (int i = 0; i < formas.size(); i++) {
            System.out.println(formas.get(i).calcular());
        }
    }
}
