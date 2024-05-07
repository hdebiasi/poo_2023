package oo;

public class TrataExcecao {
    public static void main(String[] args) {
        System.out.println("Exemplo de Tratamento de Exceções\n");

        try {
            System.out.println(10 / 0);
        } catch (Exception erro) {
            System.out.print("Erro capturado!!! - ");
            System.out.println(erro.getMessage());
        }

        System.out.println("\nPrograma finalizado!!!");
    }
}
