package fundamentos.basico.tipos;

public class Tipos {
    public static void main(String[] args) {
        Integer numero = 42;

        System.out.println(numero.getClass());
        System.out.println(numero.getClass().getName());
        System.out.println(numero.getClass().getSimpleName());

        if (numero.getClass() == Integer.class) {
            System.out.println("Variável 'numero' é do tipo Integer!");
        }

        String nome = "Herculano";
        if (nome instanceof String) {
            System.out.println("Variável 'nome' é do tipo String!");
        }
    }
}