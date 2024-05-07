package oo;

public class MetodosEstaticos2 {
    public static void main(String[] args) {
        System.out.println("Total de pessoas: " + Pessoa.getNumPessoas() + "\n");

        // Criando pessoas
        Pessoa fulano = new Pessoa("Fulano", 999.99);
        System.out.println("Total de pessoas: " + fulano.getNumPessoas() + "\n");

        // Método estático sendo acessado através de um objeto
        Pessoa beltrano = new Pessoa("Beltrano", 9_999.99);
        System.out.println("Total de pessoas: " + beltrano.getNumPessoas() + "\n");

        // Método estático sendo acessado diretamente pela classe
        Pessoa sicrano = new Pessoa("Sicrano", 42.42);
        System.out.println("Total de pessoas: " + Pessoa.getNumPessoas() + "\n");
    }
}
