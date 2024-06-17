package oo.listas1;

public class DVD extends Produto {
    private static final String tipo = "DVD";
    private int duracao;

    public DVD(String nome, double preco, int duracao) {
        super(nome, preco);
        this.duracao = duracao;
    }

    protected String tipoProduto() {
        return "DVD";
    }

    @Override
    public String toString() {
        return super.toString() + ", duracao: " + duracao + " min";
    }
}
