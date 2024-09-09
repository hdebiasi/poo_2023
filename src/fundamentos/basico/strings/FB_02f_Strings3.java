package fundamentos.basico.strings;

public class FB_02f_Strings3 {
    public static void main(String[] args) {
        char[] dados = {'a', 'b', 'c'};
        String letras = new String(dados);

        // Função split
        String frase = "Isto;é;uma;String;do;Java";
        String[] palavras = frase.split(";");
        for (String palavra : palavras) {
            System.out.print(palavra);
        }
    }
}