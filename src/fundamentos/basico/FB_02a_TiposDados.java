package fundamentos.basico;

public class FB_02a_TiposDados {
    public static void main(String[] args) {
        // Booleanos
        boolean status = true;
        System.out.println(status);

        // Caracteres / strings
        char letra = 'H';
        char unicode = '\u2318';
        String nome = "Herculano";
        System.out.println( "\n" + letra + " | " + unicode + " " + nome + " " + unicode);

        // Números inteiros
        byte idade = 42;
        short valor = -1_000;
        int numero = 65536;
        long numeroLongo = 9_876_543_210L;
        System.out.println("\n" + idade + "\n" + valor + "\n" + numero + "\n" + numeroLongo);

        // Números reais (ponto-flutuante)
        float  salario1 = 12.987654321f;
        double salario2 = 12.987654321d;
        System.out.println("\n" + salario1 + "\n" + salario2);
    }
}
