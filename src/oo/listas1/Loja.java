package oo.listas1;

import java.util.ArrayList;

public class Loja {
    public static void main(String[] args) {
        ArrayList<Produto> estoque = new ArrayList<Produto>();

        estoque.add(new Livro("Duna", 149.99, "Frank Herbert", "Campus"));
        estoque.add(new CD("The Wall", 49.49, 16));
        estoque.add(new DVD("Vingadores", 99.99, 180));

        for (Produto p : estoque) {
            System.out.println(p.toString());
        }
    }
}
