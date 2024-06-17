package oo.listas2;

public class Quadrado extends FormaGeometrica {
    private int lado;

    public Quadrado(String nome, int lado) {
        super(nome);
        this.lado = lado;
    }

    public double calcular() {
        return Math.pow(lado, 2);
    }
}
