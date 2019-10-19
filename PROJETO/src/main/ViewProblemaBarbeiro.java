/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.awt.Color;
import java.util.Observable;
import java.util.Observer;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author root
 */
public class ViewProblemaBarbeiro extends javax.swing.JFrame implements Observer {

    /**
     * Creates new form InterfaceGrafica
     */
    boolean controle = true;

    private Observable processor;
    ProblemaDoBarbeiro p1;

    public ViewProblemaBarbeiro() {
        initComponents();

        cadeira1.setBackground(Color.gray);
        cadeira2.setBackground(Color.gray);
        cadeira3.setBackground(Color.gray);
        cadeira4.setBackground(Color.gray);
        cadeira5.setBackground(Color.gray);

        p1 = ProblemaDoBarbeiro.getInstance();

        registerObserver(p1);
        
       cadeiraBarbeiro.setIcon(new ImageIcon(getClass().getResource("/icones/barbeiro_dormindo.png")));
    }

    public void registerObserver(Observable barbeiro) {
        this.processor = barbeiro;
        barbeiro.addObserver(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cadeira1 = new javax.swing.JButton();
        cadeira2 = new javax.swing.JButton();
        cadeira3 = new javax.swing.JButton();
        cadeiraBarbeiro = new javax.swing.JButton();
        cadeira5 = new javax.swing.JButton();
        cadeira4 = new javax.swing.JButton();
        btComecar = new javax.swing.JButton();
        btParar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        cadeiraBarbeiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/barbeiro_dormindo.PNG"))); // NOI18N

        btComecar.setText("Começar");
        btComecar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btComecarActionPerformed(evt);
            }
        });

        btParar.setText("Parar");
        btParar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPararActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(89, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(cadeiraBarbeiro, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(137, 137, 137))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btComecar)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cadeira1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cadeira2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(btParar))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cadeira3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(cadeira4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cadeira5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(77, 77, 77))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cadeiraBarbeiro, javax.swing.GroupLayout.PREFERRED_SIZE, 243, Short.MAX_VALUE)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cadeira1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cadeira2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cadeira3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cadeira4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cadeira5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btComecar)
                    .addComponent(btParar))
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(488, 446));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btComecarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btComecarActionPerformed
        p1.setExecuta(true);

        ExecutorService executor = Executors.newFixedThreadPool(5);

        for (int i = 0; i < 200 && controle; i++) {
            executor.execute(() -> {
                try {
                    ProblemaDoBarbeiro.getInstance().connect();
                } catch (InterruptedException ex) {
                    Logger.getLogger(ViewProblemaBarbeiro.class.getName()).log(Level.SEVERE, null, ex);
                }
            });
        }

        executor.shutdown();

    }//GEN-LAST:event_btComecarActionPerformed

    private void btPararActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPararActionPerformed
        // TODO add your handling code here:
        p1.setExecuta(false);
        cadeiraBarbeiro.setIcon(new ImageIcon(getClass().getResource("/icones/barbeiro_dormindo.png")));
    }//GEN-LAST:event_btPararActionPerformed

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
            java.util.logging.Logger.getLogger(ViewProblemaBarbeiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewProblemaBarbeiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewProblemaBarbeiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewProblemaBarbeiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewProblemaBarbeiro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btComecar;
    private javax.swing.JButton btParar;
    private javax.swing.JButton cadeira1;
    private javax.swing.JButton cadeira2;
    private javax.swing.JButton cadeira3;
    private javax.swing.JButton cadeira4;
    private javax.swing.JButton cadeira5;
    private javax.swing.JButton cadeiraBarbeiro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(Observable o, Object arg) {
        Thread GUIThread = new Thread(() -> {
            synchronized (this) {
                int cadeiras;
                boolean barbeiro;
                if (o instanceof ProblemaDoBarbeiro) {
                    ProblemaDoBarbeiro p = (ProblemaDoBarbeiro) o;
                    cadeiras = p.getCadeirasOcupadas();
                    barbeiro = p.getCadeiraBarbeiroOcupada();

                    if (barbeiro) {
                        cadeiraBarbeiro.setIcon(new ImageIcon(getClass().getResource("/icones/barbeiro_cortando.gif")));
                    } 
                    if(cadeiras == 0){
                        cadeiraBarbeiro.setIcon(new ImageIcon(getClass().getResource("/icones/barbeiro_dormindo.png")));
                    }
                    if (cadeiras > 0) {
                        cadeira1.setBackground(Color.ORANGE);
                        jLabel1.setText("Ocupado");
                    } else {
                        jLabel1.setText("");
                        cadeira1.setBackground(Color.gray);
                    }
                    if (cadeiras > 1) {
                        jLabel2.setText("Ocupado");
                        cadeira2.setBackground(Color.ORANGE);
                    } else {
                        jLabel2.setText("");
                        cadeira2.setBackground(Color.gray);
                    }
                    if (cadeiras > 2) {
                        jLabel3.setText("Ocupado");
                        cadeira3.setBackground(Color.ORANGE);
                    } else {
                        jLabel3.setText("");
                        cadeira3.setBackground(Color.gray);
                    }
                    if (cadeiras > 3) {
                        jLabel4.setText("Ocupado");
                        cadeira4.setBackground(Color.ORANGE);
                    } else {
                        jLabel4.setText("");
                        cadeira4.setBackground(Color.gray);
                    }
                    if (cadeiras > 4) {
                        jLabel5.setText("Ocupado");
                        cadeira5.setBackground(Color.ORANGE);
                    } else {
                        jLabel5.setText("");
                        cadeira5.setBackground(Color.gray);
                    }
                }
            }
        });
        GUIThread.start();
    }
}