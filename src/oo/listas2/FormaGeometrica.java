package oo.listas2;

public abstract class FormaGeometrica implements Calculavel {
    private String nome;

    public FormaGeometrica(String nome) {
        this.nome = nome;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public abstract double calcular();
}
