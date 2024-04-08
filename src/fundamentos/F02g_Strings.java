package fundamentos;

public class F02g_Strings {
    public static void main(String[] args) {
        String s = "Bom dia X!";
        String nome = "Herculano";

        s = s.replace("X", nome)
             .toUpperCase()
             .concat("!!");

        System.out.println(s);
        System.out.println("Caractere na posição 8: " + s.charAt(8));
        System.out.println("Tamanho da String: " + s.length());
        System.out.println("String 's' contém 'HERCULANO': " + s.contains("HERCULANO"));
        System.out.println("String 's' contém 'HERCULANO': "
                + (s.contains("HERCULANO") ? "Sim" : "Não"));

        if (nome.equalsIgnoreCase("Herculano")) {
            System.out.println("Posição do caractere 'H': " + s.indexOf("H"));
        }
    }
}
