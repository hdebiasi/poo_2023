package oo.jogo;

public class Jogo {
    private String nome;
    private String distribuidora;
    private int nrJogadores;
    private int faixaEtaria;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDistribuidora(String distribuidora) {
        this.distribuidora = distribuidora;
    }

    public void setNrJogadores(int nrJogadores) {
        this.nrJogadores = nrJogadores;
    }

    public void setFaixaEtaria(int faixaEtaria) {
        this.faixaEtaria = faixaEtaria;
    }

    public void infoJogo() {
        System.out.println("Nome do jogo.......: " + this.nome);
        System.out.println("Distribuidora......: " + this.distribuidora);
        System.out.println("Número de jogadores: " + this.nrJogadores);
        System.out.println("Faixa etária.......: " + this.faixaEtaria + " anos");
    }

    public void jogar() {
        System.out.println("Você já está jogando...");
    }
}
