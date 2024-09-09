package fundamentos.basico.arranjos;

public class FB_03a_ArrayNotas {
    public static void main(String[] args) {
        int[] notas = new int[4];
        notas[0] = 10;
        notas[1] = 8;
        notas[2] = 9;
        notas[3] = 7;

        for (int i = 0; i < 4; i++) {
            System.out.println("Nota " + (i + 1) + ": " + notas[i]);
        }

        System.out.println("-------");
        System.out.println("Exemplo de laço for each:");
        for (int nota: notas) {
            System.out.println(nota);
        }
    }
}
