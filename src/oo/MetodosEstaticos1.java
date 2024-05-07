package oo;

public class MetodosEstaticos1 {
    public static void main(String[] args) {
        System.out.printf("Valor do PI = %.4f\n", Matematica.PI);

        // Instanciando um objeto da classe Matematica
        // instanciar = criar objeto
        Matematica mat = new Matematica();
        System.out.println(mat.min(-10, -50));

        // Utilizando o método estático
        System.out.println(Matematica.min(-10, -50));
    }
}
