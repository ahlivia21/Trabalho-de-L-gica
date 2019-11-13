
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
            + "\n O primeiro modelo científico para o átomo foi proposto por Dalton em 1808. Este modelo foi comparado a: \n"
            + "A) Uma bola de tênis \n"
            + "B) Uma bola de futebol \n"
            + "C) Uma bola de pingue-pongue \n"
            + "D) Uma bola de bilhar \n"
            + "E) Uma bexiga cheia de água \n");
        if ("D".equals(fase1)){
            JOptionPane.showMessageDialog(null,"Resposta Correta!");
            Pontos = Pontos + 100;
        }
        else {
            JOptionPane.showMessageDialog(null,"Resposta Incorreta");
            JOptionPane.showMessageDialog(null,"Sua Pontuação foi:" + Pontos);
            System.exit(0);
        }
        fase1 = JOptionPane.showInputDialog("\n Usuário" + usuario + "\nPontos: " + Pontos 
            + "\n (UFTM-MG)Fogos de artifício utilizam sais de diferentes íons metálicos misturados"
                + " com um material explosivo. Quando incendiados, emitem \n"
                + "diferentes colorações. Por exemplo: sais de sódio emitem cor amarela, de \n"
                + " bário, cor verde, e de cobre, cor azul. Essas cores são produzidas quando os \n" 
                + "elétrons excitados dos íons metálicos retornam para níveis de menor energia.\n " 
                + "O modelo atômico mais adequado para explicar esse fenômeno é o modelo de: \n"
            + "A) Rutherford \n"
            + "B) Rutherford-Bohr \n"
            + "C) Thomson \n"
            + "D) Dalton \n"
            + "E) Millikan \n");
        if ("B".equals(fase1)){
            JOptionPane.showMessageDialog(null,"Resposta Correta!");
            Pontos = Pontos + 100;
        }
        else {
            JOptionPane.showMessageDialog(null,"Resposta Incorreta");
            JOptionPane.showMessageDialog(null,"Sua Pontuação foi:" + Pontos);
            Pontos = Pontos + 0;
        }
        fase1 = JOptionPane.showInputDialog("\n Usuário" + usuario + "\nPontos: " + Pontos 
            + "\n  (UFJF-MG) Associe as afirmações a seus respectivos responsáveis:\n"+
"I- O átomo não é indivisível e a matéria possui propriedades elétricas (1897).\n" +
"II- O átomo é uma esfera maciça (1808).\n" +
"III- O átomo é formado por duas regiões denominadas núcleo e eletrosfera (1911). \n"
            + "A) I-Dalton,II-Rutherford,III-Thomson \n"
            + "B) I-Thomson,II-Dalton,III-Rutherford. \n"
            + "C) I-Dalton,II-Thomson,III-Rutherford. \n"
            + "D) I-Rutherford,II-Thomson,III-Dalton. \n"
            + "E) I-Thomson,II-Rutherford,III-Dalton. \n");
        if ("B".equals(fase1)){
            JOptionPane.showMessageDialog(null,"Resposta Correta!");
            Pontos = Pontos + 100;
        }
        else {
            JOptionPane.showMessageDialog(null,"Resposta Incorreta");
            JOptionPane.showMessageDialog(null,"Sua Pontuação foi:" + Pontos);
            Pontos = Pontos + 0;
        }
        
        fase2 = JOptionPane.showInputDialog("\n Usuário" + usuario + "\nPontos: " + Pontos 
            + "\n Na classificação periódica, os elementos Ca (cálcio, Z = 20), Br (bromo,\n"
            + " Z = 35) e S (enxofre) são conhecidos, respectivamente, como sendo das famílias dos: \n"
            + "A) Halogênios,Calcogênios e Gases nobres. \n"
            + "B) Metais alcalinos,Metais alcalinoterrosos e Calcogênios \n"
            + "C) Metais alcalinos,Halogênios e Calcogênios. \n"
            + "D) Metais alcalinoterrosos,Halogênios e Calcogênios. \n"
            + "E) Halogênios,Calcogênios e Metais alcalinoterrosos. \n");
        if ("D".equals(fase1)){
            JOptionPane.showMessageDialog(null,"Resposta Correta!");
            Pontos = Pontos + 100;
        }
        else {
            JOptionPane.showMessageDialog(null,"Resposta Incorreta");
            JOptionPane.showMessageDialog(null,"Sua Pontuação foi:" + Pontos);
            System.exit(0);
        }
        fase2 = JOptionPane.showInputDialog("\n Usuário" + usuario + "\nPontos: " + Pontos 
            + "\n (UFPA) Um átomo, cujo número atômico é 18, está classificado na Tabela Periódica como:\n"
            + "A) Metal Alcalino  \n"
            + "B) Metal Alcalino Terroso  \n"
            + "C) Metal Terroso \n"
            + "D) Ametal \n"
            + "E) Gás Nobre \n");
        if ("E".equals(fase1)){
            JOptionPane.showMessageDialog(null,"Resposta Correta!");
            Pontos = Pontos + 100;
        }
        else {
            JOptionPane.showMessageDialog(null,"Resposta Incorreta");
            JOptionPane.showMessageDialog(null,"Sua Pontuação foi:" + Pontos);
            Pontos = Pontos + 0;
        }
        fase2 = JOptionPane.showInputDialog("\n Usuário" + usuario + "\nPontos: " + Pontos 
            + "\n Assinale a única alternativa em que todos os elementos possuem propriedades semelhantes: \n" +
            + "A) He, Ar, Rn. \n"
            + "B) Li, Ni, Bi. \n"
            + "C) Ba, Ra, Rn. \n"
            + "D) Au, Hg, C. \n"
            + "E) C, Cs, Cd. \n");
        if ("A".equals(fase1)){
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
