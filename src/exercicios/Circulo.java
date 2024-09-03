package exercicios;

public class Circulo {
    static void calcularArea(double raio) {
        double area = Math.round(Math.PI * Math.pow(raio, 2));
        System.out.println(area);
    }

    public Circulo() {
        calcularArea(10);
    }
}