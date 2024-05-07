package oo;

public class Pessoa {
    private String nome;
    private double salario;
    private static int numPessoas;

    public Pessoa(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;

        numPessoas++;
        System.out.printf("Criando pessoa número %d...\n", numPessoas);
    }

    public static int getNumPessoas() {
        return numPessoas;
    }

    public String retornarInfo() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
