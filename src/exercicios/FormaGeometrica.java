package exercicios;

public abstract class FormaGeometrica {
    private String nome;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract double calcular();
}
