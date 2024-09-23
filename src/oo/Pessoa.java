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

//    @Override
//    public String toString() {
//        return String.format("Pessoa [nome='%s', salario=%.2f]",
//                this.nome,
//                this.salario);
//    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}