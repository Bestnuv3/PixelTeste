package telas;

import java.awt.BorderLayout;
import javax.swing.JFrame;

import javax.swing.SwingUtilities;

public class TelaInicial extends javax.swing.JPanel {
    public TelaInicial() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bt_normal = new javax.swing.JButton();
        bt_opcoes = new javax.swing.JButton();
        bt_sair = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setLayout(null);

        bt_normal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalhodoo_2/image/normal.png"))); // NOI18N
        bt_normal.setBorderPainted(false);
        bt_normal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_normalActionPerformed(evt);
            }
        });
        add(bt_normal);
        bt_normal.setBounds(250, 200, 170, 60);

        bt_opcoes.setBackground(new java.awt.Color(245, 203, 250));
        bt_opcoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalhodoo_2/image/opcoesMenu.png"))); // NOI18N
        bt_opcoes.setBorderPainted(false);
        bt_opcoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_opcoesActionPerformed(evt);
            }
        });
        add(bt_opcoes);
        bt_opcoes.setBounds(250, 270, 160, 60);

        bt_sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalhodoo_2/image/sair.png"))); // NOI18N
        bt_sair.setBorderPainted(false);
        bt_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_sairActionPerformed(evt);
            }
        });
        add(bt_sair);
        bt_sair.setBounds(280, 350, 120, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalhodoo_2/image/Inicial.png"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(0, 0, 689, 513);
    }// </editor-fold>//GEN-END:initComponents

    private void bt_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_sairActionPerformed
         System.exit(0);
    }//GEN-LAST:event_bt_sairActionPerformed

    private void bt_normalActionPerformed(java.awt.event.ActionEvent evt) {                                          
         Janela.tutorialNormal = new TutorialNormal();  //Inicializa o painel da tela de cadastro.
         JFrame janela = (JFrame)SwingUtilities.getWindowAncestor(this);  //Captura a referência ao frame.
         janela.getContentPane().remove(Janela.telaInicial);  //Remove o painel da tela de gerenciamento do frame.
         janela.add(Janela.tutorialNormal, BorderLayout.CENTER);  //Adiciona o painel de cadastro ao frame.
         janela.pack();
         janela.setSize(690, 550);
    }                                         

    private void bt_opcoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_opcoesActionPerformed
         Janela.opcoes = new Opcoes();  //Inicializa o painel da tela de cadastro.
         JFrame janela = (JFrame)SwingUtilities.getWindowAncestor(this);  //Captura a referência ao frame.
         janela.getContentPane().remove(Janela.telaInicial);  //Remove o painel da tela de gerenciamento do frame.
         janela.add(Janela.opcoes, BorderLayout.CENTER);  //Adiciona o painel de cadastro ao frame.
         janela.pack();
         janela.setSize(690, 550);
    }//GEN-LAST:event_bt_opcoesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_normal;
    private javax.swing.JButton bt_opcoes;
    private javax.swing.JButton bt_sair;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
