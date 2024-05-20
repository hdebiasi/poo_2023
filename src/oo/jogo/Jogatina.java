package oo.jogo;

public class Jogatina {
    public static void main(String[] args) {
        JogoTabuleiro jogoT = new JogoTabuleiro();

        jogoT.setNome("Catan");
        jogoT.setDistribuidora("Devir");
        jogoT.setNrJogadores(4);
        jogoT.setFaixaEtaria(12);
        jogoT.setTamanhoTabuleiro("30x40");
        jogoT.setQuantPecas(30);

        jogoT.infoJogo();
        jogoT.setupTabuleiro();
        jogoT.jogar();
    }
}
