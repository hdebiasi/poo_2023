package testes;

public class Quadrado extends FormaGeometrica {
    private int lado;

    public Quadrado(int lado) {
        this.lado = lado;
    }

    public int getLado() { return this.lado; }
    public void setLado(int lado) { this.lado = lado; }

    public double calcular() {
        // Eleva lado ao quadrado, ou seja, lado * lado
        return Math.pow(this.lado, 2);
    }
}
