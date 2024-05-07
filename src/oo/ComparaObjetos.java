package oo;

public class ComparaObjetos {
    public static void main(String[] args) {
        Pessoa fulano1 = new Pessoa("Fulano", 999.99);
        System.out.println(fulano1.retornarInfo() + "\n");

        Pessoa fulano2 = new Pessoa("Fulano", 999.99);
        System.out.println(fulano2.retornarInfo() + "\n");

        // Objetos diferentes mesmo contendo os mesmos valores para os atributos
        if (fulano1 == fulano2) {
            System.out.println("Objetos são iguais!");
        } else {
            System.out.println("Objetos são diferentes!");
        }

        System.out.println(fulano1);
        System.out.println(fulano2);
        System.out.println("---------");

        // Objetos iguais pois apontam para a mesma instância na memória
        fulano2 = fulano1;

        if (fulano1 == fulano2) {
            System.out.println("Objetos são iguais!");
        } else {
            System.out.println("Objetos são diferentes!");
        }

        System.out.println(fulano1);
        System.out.println(fulano2);
    }
}
