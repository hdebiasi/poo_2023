package fundamentos.basico;

public class FB_03c_MatrizNotas {
    public static void main(String[] args) {
        int[][] notas = new int[2][4];

        // Notas do 1o. aluno
        notas[0][0] = 1;
        notas[0][1] = 2;
        notas[0][2] = 1;
        notas[0][3] = 2;

        // Notas do 2o. aluno
        notas[1][0] = 10;
        notas[1][1] = 9;
        notas[1][2] = 10;
        notas[1][3] = 9;

        for (int aluno = 0; aluno <= 1; aluno++) {
            System.out.printf("Aluno %d:\n", (aluno + 1));
            for (int nota = 0; nota <= 3; nota++) {
                System.out.printf("\tNota %d: %d\n", (nota+1), notas[aluno][nota]);
            }
            System.out.println();
        }
    }
}
