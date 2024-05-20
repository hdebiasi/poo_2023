package oo.jogo;

public class JogoCartas extends Jogo {
    private String tamanhoCartas;
    private int quantCartas;

    public void comprarCarta() {
        System.out.println("Carta comprada!");
    }

    public void descartarCarta() {
        System.out.println("Carta descartada!");
    }

    public void jogarCarta() {
        System.out.println("Carta jogada!");
    }
}
