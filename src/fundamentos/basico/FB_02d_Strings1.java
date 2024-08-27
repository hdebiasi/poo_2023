package fundamentos.basico;

public class FB_02d_Strings1 {
    public static void main(String[] args) {
        String nome = "Herculano";
        System.out.println("Tamanho da String: " + nome.length());

        if (!"HERCULANO".equals(nome)) {
            System.out.println("strings não são iguais!");
        }

        if (nome.equalsIgnoreCase("Herculano")) {
            System.out.println("strings são iguais!");
        }

        if (nome.equalsIgnoreCase(" Herculano ".trim())) {
            System.out.println("strings são iguais!");
        }
    }
}