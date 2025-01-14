/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package demo2;

import GUI.SwimmingCoachGUI;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/**
 *
 * @author Dell
 */
public class SWIMMINGLANDINGSCREENGUI extends javax.swing.JFrame {

    /**
     * Creates new form SWIMMINGLANDINGSCREENGUI
     */
    public SWIMMINGLANDINGSCREENGUI() {
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SWIMMING");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 150, 40));

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("\nSwimming is a water-based activity that provides a delightful \ncombination of exercise and leisure. Swimmers engage in propelling \nthemselves through the water using a variety of strokes, promoting \ncardiovascular fitness, strength, and flexibility. The sport encompasses\na range of styles, including freestyle, breaststroke, butterfly, and more, \nallowing individuals to select their preferred method of movement.\n\nSwimming has a broad appeal, serving both recreational and \ncompetitive interests, attracting a diverse spectrum of enthusiasts. \nWhether used as a relaxing pastime on a hot summer day or pursued \nas a serious competitive endeavor, swimming offers a rewarding \nexperience that adapts to different skill levels. Furthermore, it's a crucial\nlife-saving skill, equipping individuals with the ability to navigate water \nsafely during emergencies.\n\n\n\n");
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 590, 460));

        jButton1.setText("WARM-UP");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 590, 150, 40));

        jButton2.setText("COACHES");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 590, 160, 40));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon("/Users/anesh2099/Desktop/MPR/swimming/swimmingpool-620x400-noexp.jpg")); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 30, 400, 610));

        jLabel3.setIcon(new javax.swing.ImageIcon("/Users/anesh2099/Desktop/MPR/swimming/010 Winter Neva.png")); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 670));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        swimcoach s1 = new swimcoach();
        s1.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try {
            Desktop browser = Desktop.getDesktop();
            URI uri = new URI("https://www.youtube.com/playlist?list=PL3Z5Jfl29LzHvFOSUgVSB3kjmapgglsdM");
            browser.browse(uri);
        } catch (URISyntaxException | IOException err) {
            // Handle the exception
            err.printStackTrace();
        }


    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(SWIMMINGLANDINGSCREENGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SWIMMINGLANDINGSCREENGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SWIMMINGLANDINGSCREENGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SWIMMINGLANDINGSCREENGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SWIMMINGLANDINGSCREENGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
