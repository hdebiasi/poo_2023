package fundamentos.intermediario.listas;

import java.util.*;

public class ListasNotas {
    public static void main(String[] args) {
        List<Integer> notas = new ArrayList<>();

        notas.add(10);
        notas.add(8);
        notas.add(9);
        notas.add(7);

        System.out.println("\nLaço <for> convencional:");
        for (int i = 0; i < notas.size(); i++) {
            System.out.println(notas.get(i));
        }

        notas.add(0, 5);
        System.out.println("\nLaço <foreach>:");
        for (Integer nota : notas) {
            System.out.println(nota);
        }

        notas.remove(notas.size()-1);
        System.out.println("\nLaço <foreach> com expressão lambda:");
        notas.forEach(nota -> {
            System.out.println(nota);
        });
    }
}
