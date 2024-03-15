
package telas;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Opcoes extends javax.swing.JPanel {

    public Opcoes() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        bt_tutorial = new javax.swing.JButton();
        bt_voltar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setLayout(null);

        bt_tutorial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalhodoo_2/image/tutorial.png"))); // NOI18N
        bt_tutorial.setBorderPainted(false);
        bt_tutorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_tutorialActionPerformed(evt);
            }
        });
        add(bt_tutorial);
        bt_tutorial.setBounds(240, 160, 200, 60);

        bt_voltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalhodoo_2/image/voltar.png"))); // NOI18N
        bt_voltar.setBorderPainted(false);
        bt_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_voltarActionPerformed(evt);
            }
        });
        add(bt_voltar);
        bt_voltar.setBounds(260, 360, 170, 60);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalhodoo_2/image/sim.png"))); // NOI18N
        add(jLabel2);
        jLabel2.setBounds(210, 290, 130, 60);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalhodoo_2/image/opcoes_1.png"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(0, 0, 690, 515);
    }// </editor-fold>//GEN-END:initComponents

    private void bt_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_voltarActionPerformed
        Janela.telaInicial = new TelaInicial();  //Inicializa o painel da tela de cadastro.
        JFrame janela = (JFrame)SwingUtilities.getWindowAncestor(this);  //Captura a referência ao frame.
        janela.getContentPane().remove(Janela.opcoes);  //Remove o painel da tela de gerenciamento do frame.
        janela.add(Janela.telaInicial, BorderLayout.CENTER);  //Adiciona o painel de cadastro ao frame.
        janela.pack();
    }//GEN-LAST:event_bt_voltarActionPerformed

    private void bt_tutorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_tutorialActionPerformed
        Janela.tutorialNormal = new TutorialNormal();  //Inicializa o painel da tela de cadastro.
        JFrame janela = (JFrame)SwingUtilities.getWindowAncestor(this);  //Captura a referência ao frame.
        janela.getContentPane().remove(Janela.opcoes);  //Remove o painel da tela de gerenciamento do frame.
        janela.add(Janela.tutorialNormal, BorderLayout.CENTER);  //Adiciona o painel de cadastro ao frame.
        janela.pack();
    }//GEN-LAST:event_bt_tutorialActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_tutorial;
    private javax.swing.JButton bt_voltar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
