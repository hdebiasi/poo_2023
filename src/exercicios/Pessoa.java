package exercicios;

import java.time.LocalDate;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa() { }

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public int getIdade() { return idade; }
    public void setIdade(int i) { idade = i; }

    public void setNomeEIdade(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    void imprimirDados() {
        System.out.println("Nome.: " + this.nome);
        System.out.println("Idade: " + this.idade);
    }

    int calcularAnoNascimento() {
        return LocalDate.now().getYear() - this.idade;
    }
}
