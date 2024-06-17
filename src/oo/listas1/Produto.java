package oo.listas1;

public abstract class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public double getPreco() { return preco; }
    public void setPreco(double preco) { this.preco = preco; }

    protected abstract String tipoProduto();

    @Override
    public String toString() {
        return "Produto: <<" + this.tipoProduto() + ">> nome: " + this.nome + ", preco: " + this.preco;
    }
}