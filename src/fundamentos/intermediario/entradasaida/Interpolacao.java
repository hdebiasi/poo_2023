package fundamentos.intermediario.entradasaida;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.MessageFormat;

import static java.util.FormatProcessor.FMT;

public class Interpolacao {
    public static double valor(double valor) {
        return valor + 100;
    }

    public static void main(String[] args) {
        String nome = "Fulano";
        int idade = 18;
        double salario = 123.45;

        // Formatador decimal (utilizado em alguns casos mais abaixo)
        DecimalFormatSymbols decimalFormatSymbols = DecimalFormatSymbols.getInstance();
        decimalFormatSymbols.setDecimalSeparator(',');
        DecimalFormat df = new DecimalFormat("0.00", decimalFormatSymbols);

        // Método format()
        String resultado = String.format("Aluno %s tem %d anos e ganha R$ %.2f", nome, idade, salario);
        System.out.println(resultado);

        resultado = String.format("Aluno %1$s tem %2$d anos e ganha R$ %3$.2f", nome, idade, salario);
        System.out.println(resultado);

        // Classe StringBuilder()
        StringBuilder builder = new StringBuilder();
        builder.append("Aluno ").append(nome)
                .append(" tem ").append(idade)
                .append(" anos e ganha R$ ").append(df.format(salario));
        resultado = builder.toString();
        System.out.println(resultado);

        // Classe MessageFormat()
        resultado = MessageFormat.format("Aluno {0} tem {1} anos e ganha R$ {2}", nome, idade, salario);
        System.out.println(resultado);

        // Método formatted()
        resultado = "Aluno %s tem %d anos e ganha R$ %.2f".formatted(nome, idade, salario);
        System.out.println(resultado);

        // Template strings
        resultado = STR."Aluno \{nome} tem \{idade} anos e ganha R$ \{df.format(salario)}";
        System.out.println(resultado);
        resultado = FMT."Aluno \{nome} tem \{idade+10} anos e ganha R$ %s\{(df.format(valor(salario)))}";
        System.out.println(resultado);
    }
}

