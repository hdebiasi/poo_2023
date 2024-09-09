package fundamentos.avancado.swing;

import javax.swing.*;

public class Swing2 {
    public static void main(String[] args) {
        //O mais simples possivel
        JOptionPane.showConfirmDialog(null,"Teste" );

        // Três botões
        JOptionPane.showConfirmDialog(null,
                "Teste",
                "Titulo",
                JOptionPane.YES_NO_OPTION);

        // Mais personalizado...
        Object[] opcoes = {"Sim!", "Não", "Talvez"};

        int n = JOptionPane.showOptionDialog(null,
                "Deseja executar o procedimento?",
                "Pergunta",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                opcoes,
                opcoes[0]);
    }
}