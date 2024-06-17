package oo.listas1;

public class Livro extends Produto {
    protected final static String TIPO_PRODUTO = "Livro";

    private String autor;
    private String editora;

    public Livro(String nome, double preco, String autor, String editora) {
        super(nome, preco);
        this.autor = autor;
        this.editora = editora;
    }

    public String getAutor() { return autor; }
    public void setAutor(String autor) { this.autor = autor; }

    public String getEditora() { return editora; }
    public void setEditora(String editora) { this.editora = editora; }

    protected String tipoProduto() {
        return "Livro";
    }

    @Override
    public String toString() {
        return super.toString()+ ", autor: " + autor + ", editora: " + editora;
    }
}
