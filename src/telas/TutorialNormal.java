
package telas;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class TutorialNormal extends javax.swing.JPanel {
    int r;
    
    public TutorialNormal() {
        initComponents();
        r=0;
        
        lb_t2.setVisible(false);
        lb_t3.setVisible(false);
        lb_t4.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb_prox = new javax.swing.JLabel();
        lb_t4 = new javax.swing.JLabel();
        lb_t3 = new javax.swing.JLabel();
        lb_t2 = new javax.swing.JLabel();
        lb_t1 = new javax.swing.JLabel();
        bt_continuar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setLayout(null);

        lb_prox.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalhodoo_2/image/prox.png"))); // NOI18N
        lb_prox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_proxMouseClicked(evt);
            }
        });
        add(lb_prox);
        lb_prox.setBounds(450, 320, 60, 60);

        lb_t4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalhodoo_2/image/tut4.png"))); // NOI18N
        add(lb_t4);
        lb_t4.setBounds(160, 130, 370, 240);

        lb_t3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_t3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalhodoo_2/image/tut3.png"))); // NOI18N
        add(lb_t3);
        lb_t3.setBounds(160, 130, 380, 260);

        lb_t2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalhodoo_2/image/tutorialNormal2.png"))); // NOI18N
        add(lb_t2);
        lb_t2.setBounds(180, 140, 330, 254);

        lb_t1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalhodoo_2/image/tutorialNormal1.png"))); // NOI18N
        lb_t1.setToolTipText("");
        add(lb_t1);
        lb_t1.setBounds(180, 140, 320, 253);

        bt_continuar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalhodoo_2/image/continuar_1.png"))); // NOI18N
        bt_continuar.setBorderPainted(false);
        bt_continuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_continuarActionPerformed(evt);
            }
        });
        add(bt_continuar);
        bt_continuar.setBounds(220, 390, 240, 60);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalhodoo_2/image/tutorial_1.png"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(0, 0, 689, 515);
    }// </editor-fold>//GEN-END:initComponents

    private void bt_continuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_continuarActionPerformed
        Janela.level1 = new Level1();  //Inicializa o painel da tela de cadastro.
        JFrame janela = (JFrame)SwingUtilities.getWindowAncestor(this);  //Captura a referência ao frame.
        janela.getContentPane().remove(Janela.tutorialNormal);  //Remove o painel da tela de gerenciamento do frame.
        janela.add(Janela.level1, BorderLayout.CENTER);  //Adiciona o painel de cadastro ao frame.
        janela.pack();
        janela.setSize(690, 550);
    }//GEN-LAST:event_bt_continuarActionPerformed

    private void lb_proxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_proxMouseClicked
        r++;
        if(r==1){
            lb_t2.setVisible(true);
        }
        if(r==2){
            lb_t3.setVisible(true);
        }
        if(r==3){
            lb_t4.setVisible(true);
        }
    }//GEN-LAST:event_lb_proxMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_continuar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lb_prox;
    private javax.swing.JLabel lb_t1;
    private javax.swing.JLabel lb_t2;
    private javax.swing.JLabel lb_t3;
    private javax.swing.JLabel lb_t4;
    // End of variables declaration//GEN-END:variables
}
