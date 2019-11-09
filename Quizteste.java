
package quizteste;

import javax.swing.JOptionPane;

public class Quizteste {

    public static void main(String[] args) {
        // TODO code application logic here
        int Pontos = 0;
        String usuario;
        usuario = JOptionPane.showInputDialog("Digite seu nome:");
        JOptionPane.showMessageDialog(null, "Seja Bem Vindo(a)" + usuario +"!");
        String fase1, fase2, fase3;
        fase1 = JOptionPane.showInputDialog("\n Usuário" + usuario + "\nPontos: " + Pontos 
            + "\n pergunta \n"
            + "A) alternativa a \n"
            + "B) alternativa b \n"
            + "C) alternativa c \n"
            + "D) alternativa d \n"
            + "E) alternativa e \n");
        if ("A".equals(fase1)){
            JOptionPane.showMessageDialog(null,"Resposta Correta!");
            Pontos = Pontos + 100;
        }
        else {
            JOptionPane.showMessageDialog(null,"Resposta Incorreta");
            JOptionPane.showMessageDialog(null,"Sua Pontuação foi:" + Pontos);
            System.exit(0);
        }
        fase1 = JOptionPane.showInputDialog("\n Usuário" + usuario + "\nPontos: " + Pontos 
            + "\n pergunta \n"
            + "A) alternativa a \n"
            + "B) alternativa b \n"
            + "C) alternativa c \n"
            + "D) alternativa d \n"
            + "E) alternativa e \n");
        if ("C".equals(fase1)){
            JOptionPane.showMessageDialog(null,"Resposta Correta!");
            Pontos = Pontos + 100;
        }
        else {
            JOptionPane.showMessageDialog(null,"Resposta Incorreta");
            JOptionPane.showMessageDialog(null,"Sua Pontuação foi:" + Pontos);
            Pontos = Pontos + 0;
        }
        fase1 = JOptionPane.showInputDialog("\n Usuário" + usuario + "\nPontos: " + Pontos 
            + "\n pergunta \n"
            + "A) alternativa a \n"
            + "B) alternativa b \n"
            + "C) alternativa c \n"
            + "D) alternativa d \n"
            + "E) alternativa e \n");
        if ("E".equals(fase1)){
            JOptionPane.showMessageDialog(null,"Resposta Correta!");
            Pontos = Pontos + 100;
        }
        else {
            JOptionPane.showMessageDialog(null,"Resposta Incorreta");
            JOptionPane.showMessageDialog(null,"Sua Pontuação foi:" + Pontos);
            Pontos = Pontos + 0;
        }
        
    }
    
}
