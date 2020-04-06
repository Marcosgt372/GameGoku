/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import javax.swing.JOptionPane;

/**
 *
 * @author frank
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    //variables que usare en el juego 
    int vidaGoku=100,vidaVegeta=100,quitaVida=0;
    public Principal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlbVidaVegeta = new javax.swing.JLabel();
        jlbVidaGoku = new javax.swing.JLabel();
        jlbGoku = new javax.swing.JLabel();
        jlbVegeta = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnMultiplesPunetesGoku = new javax.swing.JButton();
        btnPuneteGoku = new javax.swing.JButton();
        btnPatadaGoku = new javax.swing.JButton();
        btnKaiokenGoku = new javax.swing.JButton();
        btnBolaDePoderVegeta = new javax.swing.JButton();
        btnInsultoVegeta = new javax.swing.JButton();
        btnPatadaVegeta = new javax.swing.JButton();
        btnPuneteVegeta = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("JuegoGoku");
        setLocation(new java.awt.Point(300, 150));
        setName("pricipalframe"); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlbVidaVegeta.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jlbVidaVegeta.setForeground(new java.awt.Color(0, 0, 0));
        jlbVidaVegeta.setText("Vida Vegeta :100");
        getContentPane().add(jlbVidaVegeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 0, 240, 30));

        jlbVidaGoku.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jlbVidaGoku.setForeground(new java.awt.Color(255, 0, 51));
        jlbVidaGoku.setText("Vida Goku :100");
        getContentPane().add(jlbVidaGoku, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 250, 30));

        jlbGoku.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Goku.png"))); // NOI18N
        getContentPane().add(jlbGoku, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 330, 500));

        jlbVegeta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/VegetaRojas2018.png"))); // NOI18N
        getContentPane().add(jlbVegeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 20, 320, 510));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/110833_versus-logo-png.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, 290, 210));

        btnMultiplesPunetesGoku.setBackground(new java.awt.Color(255, 0, 51));
        btnMultiplesPunetesGoku.setForeground(new java.awt.Color(255, 255, 255));
        btnMultiplesPunetesGoku.setText("MULTIPLES PUÑETES");
        btnMultiplesPunetesGoku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplesPunetesGokuActionPerformed(evt);
            }
        });
        getContentPane().add(btnMultiplesPunetesGoku, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 540, 180, -1));

        btnPuneteGoku.setBackground(new java.awt.Color(204, 0, 51));
        btnPuneteGoku.setForeground(new java.awt.Color(255, 255, 255));
        btnPuneteGoku.setText("PUÑETE");
        btnPuneteGoku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPuneteGokuActionPerformed(evt);
            }
        });
        getContentPane().add(btnPuneteGoku, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 580, 130, -1));

        btnPatadaGoku.setBackground(new java.awt.Color(255, 0, 51));
        btnPatadaGoku.setForeground(new java.awt.Color(255, 255, 255));
        btnPatadaGoku.setText("PATADA");
        btnPatadaGoku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPatadaGokuActionPerformed(evt);
            }
        });
        getContentPane().add(btnPatadaGoku, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 540, 130, -1));

        btnKaiokenGoku.setBackground(new java.awt.Color(255, 0, 51));
        btnKaiokenGoku.setForeground(new java.awt.Color(255, 255, 255));
        btnKaiokenGoku.setText("KAIOKEN");
        btnKaiokenGoku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKaiokenGokuActionPerformed(evt);
            }
        });
        getContentPane().add(btnKaiokenGoku, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 580, 130, -1));

        btnBolaDePoderVegeta.setBackground(new java.awt.Color(0, 0, 0));
        btnBolaDePoderVegeta.setForeground(new java.awt.Color(255, 255, 255));
        btnBolaDePoderVegeta.setText("BOLA DE PODER");
        btnBolaDePoderVegeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBolaDePoderVegetaActionPerformed(evt);
            }
        });
        getContentPane().add(btnBolaDePoderVegeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 590, 140, -1));

        btnInsultoVegeta.setBackground(new java.awt.Color(0, 0, 0));
        btnInsultoVegeta.setForeground(new java.awt.Color(255, 255, 255));
        btnInsultoVegeta.setText("INSULTO");
        btnInsultoVegeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsultoVegetaActionPerformed(evt);
            }
        });
        getContentPane().add(btnInsultoVegeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 540, 100, -1));

        btnPatadaVegeta.setBackground(new java.awt.Color(0, 0, 0));
        btnPatadaVegeta.setForeground(new java.awt.Color(255, 255, 255));
        btnPatadaVegeta.setText("PATADA");
        btnPatadaVegeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPatadaVegetaActionPerformed(evt);
            }
        });
        getContentPane().add(btnPatadaVegeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 540, 100, -1));

        btnPuneteVegeta.setBackground(new java.awt.Color(0, 0, 0));
        btnPuneteVegeta.setForeground(new java.awt.Color(255, 255, 255));
        btnPuneteVegeta.setText("PUÑETE");
        btnPuneteVegeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPuneteVegetaActionPerformed(evt);
            }
        });
        getContentPane().add(btnPuneteVegeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 590, 100, -1));

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Create by FapCod");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 660, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMultiplesPunetesGokuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplesPunetesGokuActionPerformed
        // TODO add your handling code here:
        if (vidaVegeta<=0) {
            JOptionPane.showMessageDialog(null, "Ya esta muerto!");
            JOptionPane.showMessageDialog(null, "Goku gano!");
        }else{
            quitaVida= (int) (Math.random()*20)+1;
            vidaVegeta-= quitaVida;
            
            if (vidaVegeta<0) {
                vidaVegeta=0;
                JOptionPane.showMessageDialog(null, "Goku gano!");
            }
            JOptionPane.showMessageDialog(null, "La vida de Vegeta bajo:"+quitaVida);
            jlbVidaVegeta.setText("VIDA DE VEGETA:"+vidaVegeta);
        }
    }//GEN-LAST:event_btnMultiplesPunetesGokuActionPerformed

    private void btnPatadaGokuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPatadaGokuActionPerformed
        // TODO add your handling code here:
        if (vidaVegeta<=0) {
            JOptionPane.showMessageDialog(null, "Ya esta muerto!");
            JOptionPane.showMessageDialog(null, "Goku gano!");
        }else{
            quitaVida= (int) (Math.random()*30)+1;
            vidaVegeta-= quitaVida;
            
            if (vidaVegeta<0) {
                vidaVegeta=0;
                JOptionPane.showMessageDialog(null, "Goku gano!");
            }
            JOptionPane.showMessageDialog(null, "La vida de Vegeta bajo:"+quitaVida);
            jlbVidaVegeta.setText("VIDA DE VEGETA:"+vidaVegeta);
        }
        
    }//GEN-LAST:event_btnPatadaGokuActionPerformed

    private void btnKaiokenGokuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKaiokenGokuActionPerformed
        // TODO add your handling code here:
        if (vidaVegeta<=0) {
            JOptionPane.showMessageDialog(null, "Ya esta muerto!");
            JOptionPane.showMessageDialog(null, "Goku gano!");
        }else{
            quitaVida= (int) (Math.random()*80)+1;
            vidaVegeta-= quitaVida;
            
            if (vidaVegeta<0) {
                vidaVegeta=0;
                JOptionPane.showMessageDialog(null, "Goku gano!");
            }
            JOptionPane.showMessageDialog(null, "La vida de Vegeta bajo:"+quitaVida);
            jlbVidaVegeta.setText("VIDA DE VEGETA:"+vidaVegeta);
        }
         
    }//GEN-LAST:event_btnKaiokenGokuActionPerformed

    private void btnPuneteGokuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPuneteGokuActionPerformed
        // TODO add your handling code here:
        if (vidaVegeta<=0) {
            JOptionPane.showMessageDialog(null, "Ya esta muerto!");
            JOptionPane.showMessageDialog(null, "Goku gano!");
        }else{
            quitaVida= (int) (Math.random()*15)+1;
            vidaVegeta-= quitaVida;
            
            if (vidaVegeta<0) {
                vidaVegeta=0;
                JOptionPane.showMessageDialog(null, "Goku gano!");
            }
            JOptionPane.showMessageDialog(null, "La vida de Vegeta bajo:"+quitaVida);
            jlbVidaVegeta.setText("VIDA DE VEGETA:"+vidaVegeta);
        }
        
    }//GEN-LAST:event_btnPuneteGokuActionPerformed

    private void btnInsultoVegetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsultoVegetaActionPerformed
        // TODO add your handling code here:
        if (vidaGoku<=0) {
            JOptionPane.showMessageDialog(null, "Ya esta muerto!");
            JOptionPane.showMessageDialog(null, "Vegeta gano!");
        }else{
            quitaVida= (int) (Math.random()*15)+1;
            vidaGoku-= quitaVida;
            
            if (vidaGoku<0) {
                vidaGoku=0;
                JOptionPane.showMessageDialog(null, "Vegeta gano!");
            }
            JOptionPane.showMessageDialog(null, "La vida de Goku bajo:"+quitaVida);
            jlbVidaGoku.setText("VIDA DE GOKU:"+vidaGoku);
        }
    }//GEN-LAST:event_btnInsultoVegetaActionPerformed

    private void btnPatadaVegetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPatadaVegetaActionPerformed
        // TODO add your handling code here:
         if (vidaGoku<=0) {
            JOptionPane.showMessageDialog(null, "Ya esta muerto!");
            JOptionPane.showMessageDialog(null, "Vegeta gano!");
        }else{
            quitaVida= (int) (Math.random()*35)+1;
            vidaGoku-= quitaVida;
            
            if (vidaGoku<0) {
                vidaGoku=0;
                JOptionPane.showMessageDialog(null, "Vegeta gano!");
            }
            JOptionPane.showMessageDialog(null, "La vida de Goku bajo:"+quitaVida);
            jlbVidaGoku.setText("VIDA DE GOKU:"+vidaGoku);
        }
    }//GEN-LAST:event_btnPatadaVegetaActionPerformed

    private void btnPuneteVegetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPuneteVegetaActionPerformed
        // TODO add your handling code here:
         if (vidaGoku<=0) {
            JOptionPane.showMessageDialog(null, "Ya esta muerto!");
            JOptionPane.showMessageDialog(null, "Vegeta gano!");
        }else{
            quitaVida= (int) (Math.random()*40)+1;
            vidaGoku-= quitaVida;
            
            if (vidaGoku<0) {
                vidaGoku=0;
                JOptionPane.showMessageDialog(null, "Vegeta gano!");
            }
            JOptionPane.showMessageDialog(null, "La vida de Goku bajo:"+quitaVida);
            jlbVidaGoku.setText("VIDA DE GOKU:"+vidaGoku);
        }
    }//GEN-LAST:event_btnPuneteVegetaActionPerformed

    private void btnBolaDePoderVegetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBolaDePoderVegetaActionPerformed
        // TODO add your handling code here:
         if (vidaGoku<=0) {
            JOptionPane.showMessageDialog(null, "Ya esta muerto!");
            JOptionPane.showMessageDialog(null, "Vegeta gano!");
        }else{
            quitaVida= (int) (Math.random()*75)+1;
            vidaGoku-= quitaVida;
            
            if (vidaGoku<0) {
                vidaGoku=0;
                JOptionPane.showMessageDialog(null, "Vegeta gano!");
            }
            JOptionPane.showMessageDialog(null, "La vida de Goku bajo:"+quitaVida);
            jlbVidaGoku.setText("VIDA DE GOKU:"+vidaGoku);
        }
    }//GEN-LAST:event_btnBolaDePoderVegetaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBolaDePoderVegeta;
    private javax.swing.JButton btnInsultoVegeta;
    private javax.swing.JButton btnKaiokenGoku;
    private javax.swing.JButton btnMultiplesPunetesGoku;
    private javax.swing.JButton btnPatadaGoku;
    private javax.swing.JButton btnPatadaVegeta;
    private javax.swing.JButton btnPuneteGoku;
    private javax.swing.JButton btnPuneteVegeta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jlbGoku;
    private javax.swing.JLabel jlbVegeta;
    private javax.swing.JLabel jlbVidaGoku;
    private javax.swing.JLabel jlbVidaVegeta;
    // End of variables declaration//GEN-END:variables
}
