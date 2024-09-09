package fundamentos.avancado.swing;

import javax.swing.*;

public class Swing1 {
    public static void main(String[] args) {
        String nome = null;
        while (true) {
            nome = JOptionPane.showInputDialog("Qual o seu nome?");

            if (nome==null) {         //se clicar no botão cancelar
                System.exit(0); //então finaliza o programa
            }

            if(!nome.equals("oi")) {
                System.out.println("não digitei oi");
            } else {
                System.out.println("digitei oi");
            }

            if (nome.isEmpty()) {
                JOptionPane.showMessageDialog(null,"Você não respondeu a pergunta.");
            } else if(nome.equals("fim")) {
                System.exit(0); //finaliza o programa
            } else if(nome.equals("Udesc")) {
                JOptionPane.showMessageDialog(null, "Vai chover");
            } else {
                break; //sai do laço while
            }
        }
        JOptionPane.showMessageDialog(null, "Seu nome é " + nome);
    }
}