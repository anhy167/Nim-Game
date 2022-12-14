/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package FrameGame;

/**
 *
 * @author Acer
 */
public class ModeFrame extends javax.swing.JFrame {

    /**
     * Creates new form ModeFrame
     */
 
    public ModeFrame() {
        initComponents();
        getContentPane().setBackground(new java.awt.Color(51,40,128));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        easyModeBtn = new javax.swing.JButton();
        hardModeBtn = new javax.swing.JButton();
        humanModeBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mode");
        setResizable(false);

        easyModeBtn.setFont(new java.awt.Font("Wide Latin", 0, 12)); // NOI18N
        easyModeBtn.setForeground(new java.awt.Color(255, 168, 12));
        easyModeBtn.setText("Easy");
        easyModeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                easyModeBtnMouseClicked(evt);
            }
        });

        hardModeBtn.setFont(new java.awt.Font("Wide Latin", 0, 12)); // NOI18N
        hardModeBtn.setForeground(new java.awt.Color(255, 168, 12));
        hardModeBtn.setText("Hard");
        hardModeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hardModeBtnMouseClicked(evt);
            }
        });

        humanModeBtn.setFont(new java.awt.Font("Wide Latin", 0, 12)); // NOI18N
        humanModeBtn.setForeground(new java.awt.Color(255, 168, 12));
        humanModeBtn.setText("1vs1");
        humanModeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                humanModeBtnMouseClicked(evt);
            }
        });

        backBtn.setFont(new java.awt.Font("Wide Latin", 0, 12)); // NOI18N
        backBtn.setForeground(new java.awt.Color(255, 168, 12));
        backBtn.setText("Back");
        backBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(209, 209, 209)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(backBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(humanModeBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(hardModeBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(easyModeBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(197, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(easyModeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hardModeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(humanModeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(84, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backBtnMouseClicked
        // TODO add your handling code here:
        new Main().setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_backBtnMouseClicked

    private void easyModeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_easyModeBtnMouseClicked
        // TODO add your handling code here:
        new EasyFrame().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_easyModeBtnMouseClicked

    private void hardModeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hardModeBtnMouseClicked
        // TODO add your handling code here:
        new HardFrame().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_hardModeBtnMouseClicked

    private void humanModeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_humanModeBtnMouseClicked
        // TODO add your handling code here:
        new HumanFrame().setVisible(true);
        this.setVisible(false);
                                 
    }//GEN-LAST:event_humanModeBtnMouseClicked

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
            java.util.logging.Logger.getLogger(ModeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModeFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton easyModeBtn;
    private javax.swing.JButton hardModeBtn;
    private javax.swing.JButton humanModeBtn;
    // End of variables declaration//GEN-END:variables
}
