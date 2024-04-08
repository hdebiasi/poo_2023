package fundamentos;

public class F02f_AreaCirculo {
    public static void main(String[] args) {
        // Declaração e inicialização de uma constante
        final double PI = 3.14159;

        double raio = 1;
        double area = PI * (raio * raio);

        System.out.println("Área = " + area);

        // Substituição dos valores das variáveis
        raio = 10;
        area = PI * (raio * raio);
        System.out.println("Área = " + area);
    }
}
