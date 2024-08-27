package prova1;

import java.time.LocalDate;

public class Pessoa {
    private String nome;
    private int anoNascimento;

    public Pessoa() { }

    public Pessoa(String nome, int anoNascimento) {
        this.nome = nome;
        this.anoNascimento = anoNascimento;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public int getAnoNascimento() { return anoNascimento; }
    public void setAnoNascimento(int anoNascimento) { this.anoNascimento = anoNascimento; }

    void imprimirDados() {
        System.out.println("Nome..........: " + this.nome);
        System.out.println("Ano nascimento: " + this.anoNascimento);
    }

    int calcularIdade() {
        return LocalDate.now().getYear() - this.anoNascimento;
    }
}
