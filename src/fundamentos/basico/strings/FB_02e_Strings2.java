package fundamentos.basico.strings;

public class FB_02e_Strings2 {
    public static void main(String[] args) {
        String s = "Bom dia X!";
        String nome = "Herculano";

        s = s.replace("X", nome)
             .toUpperCase()
             .concat("!!");

        System.out.println(s);

        System.out.println("Caractere na posição 8: " + s.charAt(8));
        System.out.println("Posição do caractere 'H': " + s.indexOf("H"));

        System.out.println("String 's' contém 'HERCULANO': " + s.contains("HERCULANO"));
        System.out.println("String 's' contém 'HERCULANO': " + (s.contains("HERCULANO") ? "Sim" : "Não"));
    }
}