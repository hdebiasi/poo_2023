package oo.jogo;

public class JogoTabuleiro extends Jogo {
    private String tamanhoTabuleiro;
    private int quantPecas;

    public void setTamanhoTabuleiro(String tamanhoTabuleiro) {
        this.tamanhoTabuleiro = tamanhoTabuleiro;
    }

    public void setQuantPecas(int quantPecas) {
        this.quantPecas = quantPecas;
    }

    public void setupTabuleiro() {
        System.out.println("Tabuleiro montado!");
    }

    public void moverPeca() {
        System.out.println("Peça movimentada!");
    }

    @Override
    public void infoJogo() {
        super.infoJogo();
        System.out.println("Tamanho tabuleiro..: " + this.tamanhoTabuleiro);
        System.out.println("Quantidade de peças: " + this.quantPecas);
    }
}
