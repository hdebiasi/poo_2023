package oo.listas1;

public class CD extends Produto {
    private static final String tipo = "CD";
    private int numeroFaixas;

    public CD(String nome, double preco, int numeroFaixas) {
        super(nome, preco);
        this.numeroFaixas = numeroFaixas;
    }

    public int getNumeroFaixas() { return numeroFaixas; }
    public void setNumeroFaixas(int numeroFaixas) { this.numeroFaixas = numeroFaixas; }

    protected String tipoProduto() {
        return "CD";
    }

    @Override
    public String toString() {
        return super.toString() + ", numero de faixas: " + numeroFaixas;
    }
}
