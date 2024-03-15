package telas;

import classes.Data;
import java.awt.BorderLayout;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Concluir extends javax.swing.JPanel {
    String nomeArquivoD = "SerializableData.ser";
    Data data;
    
    public Concluir() {
        initComponents();
        
        data = new Data();
        
        try{
            FileInputStream arquivo = new FileInputStream(nomeArquivoD);
            ObjectInputStream in = new ObjectInputStream(arquivo);
            data = (Data) in.readObject();
            in.close();
            arquivo.close();
        }
        catch(IOException e){
            System.out.println("erro");
        }
        catch(ClassNotFoundException e){
            System.out.println("erro");
        }
        
        String clientes = String.valueOf(data.getClientesAtendidos());
        lb_costumers.setText(clientes);
        
        String cSoothie = String.valueOf(data.getcSmoothie());
        lb_cSmoothie.setText(cSoothie);
        
        String vSmoothie = String.valueOf(data.getvSmoothie());
        lb_vSmoothie.setText(vSmoothie);
        
        String sSmoothie = String.valueOf(data.getsSmoothie());
        lb_sSmoothie.setText(sSmoothie);

        String sIce = String.valueOf(data.getsIce());
        lb_sIce.setText(sIce);
        
        String cIce = String.valueOf(data.getcIce());
        lb_cIce.setText(cIce);
        
        String vIce = String.valueOf(data.getvIce());
        lb_vIce.setText(vIce);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb_sIce = new javax.swing.JLabel();
        lb_cIce = new javax.swing.JLabel();
        lb_vIce = new javax.swing.JLabel();
        lb_costumers = new javax.swing.JLabel();
        lb_vSmoothie = new javax.swing.JLabel();
        lb_cSmoothie = new javax.swing.JLabel();
        lb_sSmoothie = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setLayout(null);

        lb_sIce.setFont(new java.awt.Font("Swis721 BlkCn BT", 1, 36)); // NOI18N
        lb_sIce.setForeground(new java.awt.Color(51, 51, 51));
        lb_sIce.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_sIce.setText("00");
        add(lb_sIce);
        lb_sIce.setBounds(410, 330, 50, 50);

        lb_cIce.setFont(new java.awt.Font("Swis721 BlkCn BT", 1, 36)); // NOI18N
        lb_cIce.setForeground(new java.awt.Color(51, 51, 51));
        lb_cIce.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_cIce.setText("00");
        add(lb_cIce);
        lb_cIce.setBounds(410, 260, 50, 50);

        lb_vIce.setFont(new java.awt.Font("Swis721 BlkCn BT", 1, 36)); // NOI18N
        lb_vIce.setForeground(new java.awt.Color(51, 51, 51));
        lb_vIce.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_vIce.setText("00");
        add(lb_vIce);
        lb_vIce.setBounds(410, 190, 50, 50);

        lb_costumers.setFont(new java.awt.Font("Swis721 BlkCn BT", 1, 36)); // NOI18N
        lb_costumers.setForeground(new java.awt.Color(51, 51, 51));
        lb_costumers.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_costumers.setText("00");
        add(lb_costumers);
        lb_costumers.setBounds(330, 120, 50, 50);

        lb_vSmoothie.setFont(new java.awt.Font("Swis721 BlkCn BT", 1, 36)); // NOI18N
        lb_vSmoothie.setForeground(new java.awt.Color(51, 51, 51));
        lb_vSmoothie.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_vSmoothie.setText("00");
        add(lb_vSmoothie);
        lb_vSmoothie.setBounds(250, 190, 50, 50);

        lb_cSmoothie.setFont(new java.awt.Font("Swis721 BlkCn BT", 1, 36)); // NOI18N
        lb_cSmoothie.setForeground(new java.awt.Color(51, 51, 51));
        lb_cSmoothie.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_cSmoothie.setText("00");
        add(lb_cSmoothie);
        lb_cSmoothie.setBounds(250, 260, 50, 50);

        lb_sSmoothie.setFont(new java.awt.Font("Swis721 BlkCn BT", 1, 36)); // NOI18N
        lb_sSmoothie.setForeground(new java.awt.Color(51, 51, 51));
        lb_sSmoothie.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_sSmoothie.setText("00");
        add(lb_sSmoothie);
        lb_sSmoothie.setBounds(250, 330, 50, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalhodoo_2/image/continuar.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        add(jLabel1);
        jLabel1.setBounds(230, 400, 230, 45);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalhodoo_2/image/fim.png"))); // NOI18N
        add(jLabel6);
        jLabel6.setBounds(0, 0, 690, 514);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        Janela.telaInicial = new TelaInicial();  //Inicializa o painel da tela de cadastro.
        JFrame janela = (JFrame)SwingUtilities.getWindowAncestor(this);  //Captura a referência ao frame.
        janela.getContentPane().remove(Janela.concluir);  //Remove o painel da tela de gerenciamento do frame.
        janela.add(Janela.telaInicial, BorderLayout.CENTER);  //Adiciona o painel de cadastro ao frame.
        janela.pack();
    }//GEN-LAST:event_jLabel1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lb_cIce;
    private javax.swing.JLabel lb_cSmoothie;
    private javax.swing.JLabel lb_costumers;
    private javax.swing.JLabel lb_sIce;
    private javax.swing.JLabel lb_sSmoothie;
    private javax.swing.JLabel lb_vIce;
    private javax.swing.JLabel lb_vSmoothie;
    // End of variables declaration//GEN-END:variables
}
