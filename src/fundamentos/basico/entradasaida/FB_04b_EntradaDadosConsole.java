package fundamentos.basico.entradasaida;

import java.io.Console;

public class FB_04b_EntradaDadosConsole {
    public static void main(String[] args) {
        Console console = System.console();
        if (console == null) {
            System.out.print("Não há nenhum console disponível!");
            return;
        }

        System.out.print("Digite o seu nome completo: ");
        String nomeCompleto = console.readLine();
        System.out.println("Seu nome completo é [" + nomeCompleto + "]");

        char[] senha = console.readPassword("Digite a sua senha: ");
        console.printf("Sua senha é [%s]", String.valueOf(senha));
    }
}