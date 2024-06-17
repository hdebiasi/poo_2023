package oo.listas2;

public class Retangulo extends FormaGeometrica {
    private int comprimento, largura;

    public Retangulo(String nome, int comprimento, int largura) {
        super(nome);
        this.comprimento = comprimento;
        this.largura = largura;
    }

    public int getComprimento() { return comprimento; }
    public void setComprimento(int comprimento) { this.comprimento = comprimento; }

    public int getLargura() { return largura; }
    public void setLargura(int largura) { this.largura = largura; }

    public double calcular() {
        return comprimento * largura;
    }
}
