package testes;

public class Retangulo extends FormaGeometrica {
    private int comprimento, largura;

    public Retangulo(int comprimento, int largura) {
        this.comprimento = comprimento;
        this.largura = largura;
    }

    public int getComprimento() { return this.comprimento; }
    public void setComprimento(int comprimento) { this.comprimento = comprimento; }

    public int getLargura() { return this.largura; }
    public void setLargura(int largura) { this.largura = largura; }

    public double calcular() {
        return comprimento * largura;
    }
}
