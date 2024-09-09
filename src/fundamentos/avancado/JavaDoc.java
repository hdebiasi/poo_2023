/*
    Código de exemplo
    Desenvolvedor: Herculano De Biasi
    Data: 01.04.2024
 */

package fundamentos.avancado;

public class JavaDoc {
    /**
     * Soma dois números inteiros e retorna o resultado
     * @param n1 Primeiro inteiro a ser somado
     * @param n2 Segundo inteiro a ser somado
     * @return Soma dos 2 inteiros
     * @author Herculano De Biasi
     * @version 1.0
     * @since JDK1.0
     * @see <a href="https://docs.oracle.com/en/java/">Java Dcoumentation</a>
     */
    public int somar(int n1, int n2) {
        return n1 + n2;
    }

    // Método principal
    public static void main(String[] args) {
        System.out.println("Olá Mundo!!!");   // Imprime mensagem na tela
    }
}
