package telas;

import classes.Data;
import java.awt.BorderLayout;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import javax.swing.Timer;

public class Level1 extends javax.swing.JPanel {
    String nomeArquivoD = "SerializableData.ser";
    int done=0, nClientes=5, humor=1;
    Data data = new Data();
    
    public Level1() {
         initComponents();
        
         lb_coneOn.setVisible(false);
         lb_cupOn.setVisible(false);
         
         sair();
         novoCliente();
    }
    
    public void trocaIceCream(){
        Point p1 = lb_chocolateCone.getLocation();
        Point p2 = lb_strawberryCone.getLocation();
        Point p3 = lb_vanillaCone.getLocation();
        
        int y = randomNumber(6);
        
        if(y==0){
            lb_chocolateCone.setLocation(p2);
            lb_strawberryCone.setLocation(p1);
            lb_vanillaCone.setLocation(p3);
        }
        if(y==1){
            lb_chocolateCone.setLocation(p1);
            lb_strawberryCone.setLocation(p2);
            lb_vanillaCone.setLocation(p3);
        }
        if(y==2){
            lb_chocolateCone.setLocation(p1);
            lb_strawberryCone.setLocation(p3);
            lb_vanillaCone.setLocation(p2);
        }
        if(y==3){
            lb_chocolateCone.setLocation(p3);
            lb_strawberryCone.setLocation(p2);
            lb_vanillaCone.setLocation(p1);
        }
        if(y==4){
            lb_chocolateCone.setLocation(p3);
            lb_strawberryCone.setLocation(p1);
            lb_vanillaCone.setLocation(p2);
        }
        if(y==5){
            lb_chocolateCone.setLocation(p2);
            lb_strawberryCone.setLocation(p3);
            lb_vanillaCone.setLocation(p1);
        }
    }
    
    public void trocaSmoothie(){
        Point p1 = bt_chocolateCup.getLocation();
        Point p2 = bt_strawberryCup.getLocation();
        Point p3 = bt_vanillaCup.getLocation();
        
        int y = randomNumber(6);
        
        if(y==0){
            bt_chocolateCup.setLocation(p2);
            bt_strawberryCup.setLocation(p1);
            bt_vanillaCup.setLocation(p3);
        }
        if(y==1){
            bt_chocolateCup.setLocation(p1);
            bt_strawberryCup.setLocation(p2);
            bt_vanillaCup.setLocation(p3);
        }
        if(y==2){
            bt_chocolateCup.setLocation(p1);
            bt_strawberryCup.setLocation(p3);
            bt_vanillaCup.setLocation(p2);
        }
        if(y==3){
            bt_chocolateCup.setLocation(p3);
            bt_strawberryCup.setLocation(p2);
            bt_vanillaCup.setLocation(p1);
        }
        if(y==4){
            bt_chocolateCup.setLocation(p3);
            bt_strawberryCup.setLocation(p1);
            bt_vanillaCup.setLocation(p2);
        }
        if(y==5){
            bt_chocolateCup.setLocation(p2);
            bt_strawberryCup.setLocation(p3);
            bt_vanillaCup.setLocation(p1);
        }
    }
    
    public void novoCliente(){
        int c = randomNumber(4);
        humor = 1;
        
        if(c==0){
            npc1();
        }
        if(c==1){
            npc2();
        }
        if(c==2){
            npc3(); 
        }
        if(c==3){
            npc4();
        }
        
        nClientes--;
        
        data.setClientesAtendidos(data.getClientesAtendidos()+1);
        
        trocaSmoothie();
        trocaIceCream();
        moods();
    }
    
    public void sair(){
        lb_npc1.setVisible(false);
        lb_npc2.setVisible(false);
        lb_npc3.setVisible(false);
        lb_npc4.setVisible(false);
        
        lb_mood1.setVisible(false);
        lb_mood2.setVisible(false);
        lb_mood3.setVisible(false);
         
        lb_chocolateSmoothie.setVisible(false);
        lb_strawberrySmoothie.setVisible(false);
        lb_vanillaSmoothie.setVisible(false);
        lb_chocolateIceCream.setVisible(false);
        lb_strawberryIceCream.setVisible(false);
        lb_vanillaIceCream.setVisible(false);
         
        lb_chocolateSmoothieDone.setVisible(false);
        lb_strawberrySmoothieDone.setVisible(false);
        lb_vanillaSmoothieDone.setVisible(false);
        lb_chocolateIceCreamDone.setVisible(false);
        lb_strawberryIceCreamDone.setVisible(false);
        lb_vanillaIceCreamDone.setVisible(false);
        
        done = 0;
         
        if(nClientes<0){
            try{
            FileOutputStream fileOut = new FileOutputStream(nomeArquivoD);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(data);
            out.close();
            fileOut.close();
            } catch (IOException e) {
                System.out.println("erro");
            }
            Janela.concluir = new Concluir();  //Inicializa o painel da tela de cadastro.
            JFrame janela = (JFrame)SwingUtilities.getWindowAncestor(this);  //Captura a referência ao frame.
            janela.getContentPane().remove(Janela.level1);  //Remove o painel da tela de gerenciamento do frame.
            janela.add(Janela.concluir, BorderLayout.CENTER);  //Adiciona o painel de cadastro ao frame.
            janela.pack();
        }
    }
    
    public void saborIceCream(){
         int a = randomNumber(3);
         
         if(a==0){
            lb_vanillaIceCream.setVisible(true);
         }
         if(a==1){
            lb_chocolateIceCream.setVisible(true);
         }
         if(a==2){
            lb_strawberryIceCream.setVisible(true);
         }
    }
    
    public void saborSmoothie(){
        int a = randomNumber(3);
        
        if(a==0){
            lb_vanillaSmoothie.setVisible(true);
        }
        if(a==1){
            lb_chocolateSmoothie.setVisible(true);
        }
        if(a==2){
            lb_strawberrySmoothie.setVisible(true);
        }
    }

    public void moods(){
        System.out.println(done);
        if(humor == 1){
            lb_mood1.setVisible(true);
            lb_mood2.setVisible(false);
            lb_mood3.setVisible(false);
        }
        if(humor == 2){
            lb_mood1.setVisible(false);
            lb_mood2.setVisible(true);
            lb_mood3.setVisible(false);
        }
        if(humor == 3){
            lb_mood1.setVisible(false);
            lb_mood3.setVisible(true);
            lb_mood2.setVisible(false);  

            Timer timer = new Timer(2000, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    sair();
                    novoCliente();
                }
            });
            timer.setRepeats(false);  
            timer.start();
        }
    }
    
    public void npc1(){
        lb_npc1.setVisible(true);
        lb_npc2.setVisible(false);
        lb_npc3.setVisible(false);
        lb_npc4.setVisible(false);
        
        lb_mood1.setVisible(false);
        lb_mood2.setVisible(false);
        lb_mood3.setVisible(true);
        
        lb_baloon.setVisible(true);
        
        saborIceCream();
        saborSmoothie();
    }
    
    public void npc2(){
        lb_npc2.setVisible(true);
        lb_npc1.setVisible(false);
        lb_npc3.setVisible(false);
        lb_npc4.setVisible(false);
        
        lb_mood1.setVisible(false);
        lb_mood2.setVisible(false);
        lb_mood3.setVisible(true);
        
        lb_baloon.setVisible(true);
        
        saborIceCream();
        saborSmoothie();
    }
    
    public void npc3(){
        lb_npc3.setVisible(true);
        lb_npc2.setVisible(false);
        lb_npc1.setVisible(false);
        lb_npc4.setVisible(false);
        
        lb_mood1.setVisible(false);
        lb_mood2.setVisible(false);
        lb_mood3.setVisible(true);
        
        lb_baloon.setVisible(true);
        
        saborIceCream();
        saborSmoothie();
    }
    
    public void npc4(){
        lb_npc4.setVisible(true);
        lb_npc2.setVisible(false);
        lb_npc3.setVisible(false);
        lb_npc1.setVisible(false);
        
        lb_mood1.setVisible(false);
        lb_mood2.setVisible(false);
        lb_mood3.setVisible(true);
        
        lb_baloon.setVisible(true);
        
        saborIceCream();
        saborSmoothie();
    }
    
    public int randomNumber(int z){
        Random random = new Random();
        return random.nextInt(z);
    }
    
    public boolean contaTempo(long delayMillis){
        long startTime = System.currentTimeMillis(), currentTime;
        do {
            currentTime = System.currentTimeMillis();
        } while (currentTime - startTime < delayMillis);

        return true;
    }
    
    public void finalizaClicaSabor(){
        done++;
        humor++;
        moods();
    }
    
    public void clicaSaborIceCream(JLabel alvo){
        if(lb_coneOn.isVisible()){
            if(alvo.isVisible()){
                if(alvo == lb_vanillaIceCream){
                    lb_vanillaIceCreamDone.setVisible(true);
                    alvo.setVisible(false);
                    lb_coneOn.setVisible(false);

                    data.setvIce(data.getvIce()+1);
                    
                    finalizaClicaSabor();
                }
                if(alvo == lb_strawberryIceCream){
                    lb_strawberryIceCreamDone.setVisible(true);
                    alvo.setVisible(false);
                    lb_coneOn.setVisible(false);
                    
                    data.setsIce(data.getsIce()+1);
                    
                    finalizaClicaSabor();
                }
                if(alvo == lb_chocolateIceCream){
                    lb_chocolateIceCreamDone.setVisible(true);
                    alvo.setVisible(false);
                    lb_coneOn.setVisible(false);
                    
                    data.setcIce(data.getcIce()+1);

                    finalizaClicaSabor();
                }
            } 
        } 
    }
    
    public void clicaSaborSmoothie(JLabel alvo){
        if(lb_cupOn.isVisible()){
            if(alvo.isVisible()){
                if(alvo == lb_vanillaSmoothie){
                    lb_vanillaSmoothieDone.setVisible(true);
                    alvo.setVisible(false);
                    lb_cupOn.setVisible(false);
                    
                    data.setvSmoothie(data.getvSmoothie()+1);
                    
                    finalizaClicaSabor();
                }
            }
            if(alvo.isVisible()){
                if(alvo == lb_strawberrySmoothie){
                    lb_strawberrySmoothieDone.setVisible(true);
                    alvo.setVisible(false);
                    lb_cupOn.setVisible(false);
                    
                    data.setsSmoothie(data.getsSmoothie()+1);
                    
                    finalizaClicaSabor();
                }
            }
            if(alvo.isVisible()){
                if(alvo == lb_chocolateSmoothie){
                    lb_chocolateSmoothieDone.setVisible(true);
                    alvo.setVisible(false);
                    lb_cupOn.setVisible(false);
                    
                    data.setcSmoothie(data.getcSmoothie()+1);
                    
                    finalizaClicaSabor();
                }
            } 
        }  
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb_vanillaIceCreamDone = new javax.swing.JLabel();
        lb_strawberryIceCreamDone = new javax.swing.JLabel();
        lb_chocolateIceCreamDone = new javax.swing.JLabel();
        lb_vanillaSmoothieDone = new javax.swing.JLabel();
        lb_strawberrySmoothieDone = new javax.swing.JLabel();
        lb_chocolateSmoothieDone = new javax.swing.JLabel();
        lb_vanillaSmoothie = new javax.swing.JLabel();
        lb_vanillaIceCream = new javax.swing.JLabel();
        lb_strawberrySmoothie = new javax.swing.JLabel();
        lb_strawberryIceCream = new javax.swing.JLabel();
        lb_chocolateSmoothie = new javax.swing.JLabel();
        lb_chocolateIceCream = new javax.swing.JLabel();
        lb_npc4 = new javax.swing.JLabel();
        lb_coneOn = new javax.swing.JLabel();
        lb_cupOn = new javax.swing.JLabel();
        lb_baloon = new javax.swing.JLabel();
        lb_npc3 = new javax.swing.JLabel();
        lb_strawberryCone = new javax.swing.JLabel();
        lb_chocolateCone = new javax.swing.JLabel();
        lb_vanillaCone = new javax.swing.JLabel();
        lb_npc2 = new javax.swing.JLabel();
        lb_npc1 = new javax.swing.JLabel();
        bt_cups = new javax.swing.JButton();
        bt_cones = new javax.swing.JButton();
        bt_vanillaCup = new javax.swing.JButton();
        bt_chocolateCup = new javax.swing.JButton();
        bt_strawberryCup = new javax.swing.JButton();
        lb_mood1 = new javax.swing.JLabel();
        lb_mood2 = new javax.swing.JLabel();
        lb_mood3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setLayout(null);

        lb_vanillaIceCreamDone.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_vanillaIceCreamDone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalhodoo_2/image/vanillaIceCreamDone.png"))); // NOI18N
        add(lb_vanillaIceCreamDone);
        lb_vanillaIceCreamDone.setBounds(330, 120, 100, 110);

        lb_strawberryIceCreamDone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalhodoo_2/image/strawberryIceCreamDone.png"))); // NOI18N
        add(lb_strawberryIceCreamDone);
        lb_strawberryIceCreamDone.setBounds(330, 120, 100, 110);

        lb_chocolateIceCreamDone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalhodoo_2/image/chocolateIceCreamDone.png"))); // NOI18N
        add(lb_chocolateIceCreamDone);
        lb_chocolateIceCreamDone.setBounds(330, 120, 100, 110);

        lb_vanillaSmoothieDone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalhodoo_2/image/vanillaSmoothieDone.png"))); // NOI18N
        add(lb_vanillaSmoothieDone);
        lb_vanillaSmoothieDone.setBounds(420, 100, 110, 140);

        lb_strawberrySmoothieDone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalhodoo_2/image/strawberrySmoothieDone.png"))); // NOI18N
        add(lb_strawberrySmoothieDone);
        lb_strawberrySmoothieDone.setBounds(420, 90, 110, 150);

        lb_chocolateSmoothieDone.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_chocolateSmoothieDone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalhodoo_2/image/chocolateSmoothieDone.png"))); // NOI18N
        add(lb_chocolateSmoothieDone);
        lb_chocolateSmoothieDone.setBounds(430, 100, 100, 140);

        lb_vanillaSmoothie.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalhodoo_2/image/vanillaSmothie.png"))); // NOI18N
        add(lb_vanillaSmoothie);
        lb_vanillaSmoothie.setBounds(420, 90, 110, 150);

        lb_vanillaIceCream.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalhodoo_2/image/vanillaIceCream.png"))); // NOI18N
        add(lb_vanillaIceCream);
        lb_vanillaIceCream.setBounds(340, 120, 80, 110);

        lb_strawberrySmoothie.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalhodoo_2/image/strawberrySmothie.png"))); // NOI18N
        add(lb_strawberrySmoothie);
        lb_strawberrySmoothie.setBounds(420, 100, 110, 140);

        lb_strawberryIceCream.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalhodoo_2/image/strawberryIceCream.png"))); // NOI18N
        add(lb_strawberryIceCream);
        lb_strawberryIceCream.setBounds(340, 110, 90, 110);

        lb_chocolateSmoothie.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalhodoo_2/image/chocolateSmothie.png"))); // NOI18N
        add(lb_chocolateSmoothie);
        lb_chocolateSmoothie.setBounds(410, 90, 120, 150);

        lb_chocolateIceCream.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalhodoo_2/image/chocolateIceCream.png"))); // NOI18N
        add(lb_chocolateIceCream);
        lb_chocolateIceCream.setBounds(330, 110, 90, 120);

        lb_npc4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalhodoo_2/image/npc4.png"))); // NOI18N
        add(lb_npc4);
        lb_npc4.setBounds(170, 140, 100, 160);

        lb_coneOn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_coneOn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalhodoo_2/image/Captura de tela 2023-05-26 081452.png"))); // NOI18N
        add(lb_coneOn);
        lb_coneOn.setBounds(400, 430, 90, 76);

        lb_cupOn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_cupOn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalhodoo_2/image/cupOn.png"))); // NOI18N
        add(lb_cupOn);
        lb_cupOn.setBounds(180, 420, 110, 90);

        lb_baloon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalhodoo_2/image/baloon.png"))); // NOI18N
        add(lb_baloon);
        lb_baloon.setBounds(290, 60, 290, 250);

        lb_npc3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalhodoo_2/image/npc3.png"))); // NOI18N
        add(lb_npc3);
        lb_npc3.setBounds(170, 130, 110, 170);

        lb_strawberryCone.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_strawberryCone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalhodoo_2/image/strawberryLaranja.png"))); // NOI18N
        lb_strawberryCone.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_strawberryConeMouseClicked(evt);
            }
        });
        add(lb_strawberryCone);
        lb_strawberryCone.setBounds(410, 330, 60, 40);

        lb_chocolateCone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalhodoo_2/image/chocolateLaranja.png"))); // NOI18N
        lb_chocolateCone.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_chocolateConeMouseClicked(evt);
            }
        });
        add(lb_chocolateCone);
        lb_chocolateCone.setBounds(360, 330, 40, 40);

        lb_vanillaCone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalhodoo_2/image/vanillaLaranja.png"))); // NOI18N
        lb_vanillaCone.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_vanillaConeMouseClicked(evt);
            }
        });
        add(lb_vanillaCone);
        lb_vanillaCone.setBounds(470, 330, 50, 40);

        lb_npc2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalhodoo_2/image/npc2.png"))); // NOI18N
        add(lb_npc2);
        lb_npc2.setBounds(180, 150, 90, 150);

        lb_npc1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalhodoo_2/image/npc1.png"))); // NOI18N
        add(lb_npc1);
        lb_npc1.setBounds(180, 150, 85, 150);

        bt_cups.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalhodoo_2/image/cup.png"))); // NOI18N
        bt_cups.setBorderPainted(false);
        bt_cups.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_cupsActionPerformed(evt);
            }
        });
        add(bt_cups);
        bt_cups.setBounds(550, 450, 130, 60);

        bt_cones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalhodoo_2/image/cone.png"))); // NOI18N
        bt_cones.setBorderPainted(false);
        bt_cones.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bt_cones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_conesActionPerformed(evt);
            }
        });
        add(bt_cones);
        bt_cones.setBounds(550, 380, 140, 60);

        bt_vanillaCup.setBackground(new java.awt.Color(110, 222, 253));
        bt_vanillaCup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalhodoo_2/image/vanillaAzul.png"))); // NOI18N
        bt_vanillaCup.setBorderPainted(false);
        bt_vanillaCup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_vanillaCupActionPerformed(evt);
            }
        });
        add(bt_vanillaCup);
        bt_vanillaCup.setBounds(270, 330, 50, 40);

        bt_chocolateCup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalhodoo_2/image/chocolateAzul.png"))); // NOI18N
        bt_chocolateCup.setBorderPainted(false);
        bt_chocolateCup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_chocolateCupActionPerformed(evt);
            }
        });
        add(bt_chocolateCup);
        bt_chocolateCup.setBounds(160, 330, 40, 40);

        bt_strawberryCup.setBackground(new java.awt.Color(110, 222, 253));
        bt_strawberryCup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalhodoo_2/image/strawberryAzul.png"))); // NOI18N
        bt_strawberryCup.setBorderPainted(false);
        bt_strawberryCup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_strawberryCupActionPerformed(evt);
            }
        });
        add(bt_strawberryCup);
        bt_strawberryCup.setBounds(220, 330, 40, 40);

        lb_mood1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalhodoo_2/image/mood1.png"))); // NOI18N
        add(lb_mood1);
        lb_mood1.setBounds(200, 80, 50, 40);

        lb_mood2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalhodoo_2/image/mood2.png"))); // NOI18N
        add(lb_mood2);
        lb_mood2.setBounds(200, 80, 50, 40);

        lb_mood3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalhodoo_2/image/mood3.png"))); // NOI18N
        add(lb_mood3);
        lb_mood3.setBounds(200, 80, 50, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalhodoo_2/image/level1.png"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(0, 0, 690, 515);
    }// </editor-fold>//GEN-END:initComponents

    private void bt_cupsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_cupsActionPerformed
        lb_cupOn.setVisible(true);
    }//GEN-LAST:event_bt_cupsActionPerformed

    private void bt_conesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_conesActionPerformed
        lb_coneOn.setVisible(true);
    }//GEN-LAST:event_bt_conesActionPerformed

    private void bt_vanillaCupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_vanillaCupActionPerformed
        clicaSaborSmoothie(lb_vanillaSmoothie);
    }//GEN-LAST:event_bt_vanillaCupActionPerformed

    private void bt_strawberryCupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_strawberryCupActionPerformed
        clicaSaborSmoothie(lb_strawberrySmoothie);
    }//GEN-LAST:event_bt_strawberryCupActionPerformed

    private void bt_chocolateCupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_chocolateCupActionPerformed
        clicaSaborSmoothie(lb_chocolateSmoothie);
    }//GEN-LAST:event_bt_chocolateCupActionPerformed

    private void lb_chocolateConeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_chocolateConeMouseClicked
        clicaSaborIceCream(lb_chocolateIceCream);
    }//GEN-LAST:event_lb_chocolateConeMouseClicked

    private void lb_strawberryConeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_strawberryConeMouseClicked
        clicaSaborIceCream(lb_strawberryIceCream);
    }//GEN-LAST:event_lb_strawberryConeMouseClicked

    private void lb_vanillaConeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_vanillaConeMouseClicked
        clicaSaborIceCream(lb_vanillaIceCream);
    }//GEN-LAST:event_lb_vanillaConeMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_chocolateCup;
    private javax.swing.JButton bt_cones;
    private javax.swing.JButton bt_cups;
    private javax.swing.JButton bt_strawberryCup;
    private javax.swing.JButton bt_vanillaCup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lb_baloon;
    private javax.swing.JLabel lb_chocolateCone;
    private javax.swing.JLabel lb_chocolateIceCream;
    private javax.swing.JLabel lb_chocolateIceCreamDone;
    private javax.swing.JLabel lb_chocolateSmoothie;
    private javax.swing.JLabel lb_chocolateSmoothieDone;
    private javax.swing.JLabel lb_coneOn;
    private javax.swing.JLabel lb_cupOn;
    private javax.swing.JLabel lb_mood1;
    private javax.swing.JLabel lb_mood2;
    private javax.swing.JLabel lb_mood3;
    private javax.swing.JLabel lb_npc1;
    private javax.swing.JLabel lb_npc2;
    private javax.swing.JLabel lb_npc3;
    private javax.swing.JLabel lb_npc4;
    private javax.swing.JLabel lb_strawberryCone;
    private javax.swing.JLabel lb_strawberryIceCream;
    private javax.swing.JLabel lb_strawberryIceCreamDone;
    private javax.swing.JLabel lb_strawberrySmoothie;
    private javax.swing.JLabel lb_strawberrySmoothieDone;
    private javax.swing.JLabel lb_vanillaCone;
    private javax.swing.JLabel lb_vanillaIceCream;
    private javax.swing.JLabel lb_vanillaIceCreamDone;
    private javax.swing.JLabel lb_vanillaSmoothie;
    private javax.swing.JLabel lb_vanillaSmoothieDone;
    // End of variables declaration//GEN-END:variables
}
