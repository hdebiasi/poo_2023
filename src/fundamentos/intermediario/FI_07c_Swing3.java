package fundamentos.intermediario;

import javax.swing.*;

public class FI_07c_Swing3 {
    public static void main(String[] args) {
        Object[] opcoes = { "sim", "não" };
        Object resposta;

        do {
            resposta = JOptionPane.showInputDialog(null,
                    "Deseja finalizar o programa?",
                    "Finalização",
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    opcoes,
                    "não");
        } while (resposta == null || resposta.equals("não"));
    }
}