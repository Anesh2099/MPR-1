/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package demo2;
/**
 *
 * @author anesh2099
 */
public class gui21 extends javax.swing.JFrame {

    /**
     * Creates new form gui21
     */
    public gui21() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon("/Users/anesh2099/Downloads/Optimized-gui21c1.jpeg")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, 270));

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("David Martinez");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 150, 285, 46));

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Helvetica Neue", 0, 15)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("Experience: David has over 12 years of coaching experience in \nfootball. He has coached youth teams and worked with\nprofessional academies.\n\nAchievements: Led a youth team to a regional championship. \nRecognized for developing young talents and fostering team cohesion.\n\nFees: ₹5,250 per hour for individual coaching sessions.");
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 210, 480, 206));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon("/Users/anesh2099/Downloads/Optimized-Screenshot 2023-10-17 at 1.26.24 AM.png")); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 490, 310, -1));

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("John Smith");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 490, 285, 46));

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Helvetica Neue", 0, 15)); // NOI18N
        jTextArea2.setRows(5);
        jTextArea2.setText("Experience: John has been coaching football for 10 years,\nwith a focus on developing advanced skills in young players.\n\nAchievements: Coached a youth team to multiple tournament victories\nKnown for his emphasis on tactical understanding and strategy.\n\nFees: ₹4,125 per hour for individual coaching sessions.");
        jScrollPane2.setViewportView(jTextArea2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 550, 480, 206));

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("FOOTBALL COACHES");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 800, 81));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setIcon(new javax.swing.ImageIcon("/Users/anesh2099/Desktop/MPR/football/coaches/007 Sunny Morning.png")); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 110));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon("/Users/anesh2099/Desktop/MPR/football/coaches/048 Strong Bliss.png")); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 1040, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(gui21.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gui21.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gui21.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gui21.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gui21().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables
}
