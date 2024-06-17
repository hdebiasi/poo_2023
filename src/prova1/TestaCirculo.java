package prova1;

public class TestaCirculo {
    public static void main(String[] args) {
        Circulo c = new Circulo();
        c.calcularArea(5);
        new Circulo().calcularArea(5);
        Circulo.calcularArea(5);
    }
}