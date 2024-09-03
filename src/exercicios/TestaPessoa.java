package exercicios;

public class TestaPessoa {
    public static void main(String[] arg) {
        // Instancia o objeto gabriel a partir da classe Pessoa
        Pessoa gabriel = new Pessoa();

        // Seta (define) os atributos
        gabriel.setNome("Gabriel Machado");
        gabriel.setIdade(20);
        gabriel.setNomeEIdade("GM", 33);

        // Imprime
        System.out.println(gabriel.getNome());
        System.out.println(gabriel.getIdade());

        // Mostra ano de nascimento
        System.out.printf("%s nasceu no ano de %d", gabriel.getNome(), gabriel.calcularAnoNascimento());
    }
}
