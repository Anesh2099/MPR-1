/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demo2;
import sprtz.FINDTEAM;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.table.DefaultTableModel;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Dell
 */
public class buysellGUI1 extends javax.swing.JFrame {

    /**
     * Creates new form buysellGUI
     */
    public buysellGUI() {
        initComponents();
        table_update();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        txtcategory = new javax.swing.JTextField();
        txtcontact = new javax.swing.JTextField();
        txtproduct = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TABLE = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtprice = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(txtcategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 175, -1));
        getContentPane().add(txtcontact, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 390, 169, -1));

        txtproduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtproductActionPerformed(evt);
            }
        });
        getContentPane().add(txtproduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 175, -1));

        jLabel1.setText("CATEGORY");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 66, -1));

        jLabel2.setText("PRODUCT");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        jLabel3.setText("CONTACT");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 84, -1));

        TABLE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "CATEGORY", "PRODUCT", "PRICE", "CONTACT"
            }
        ));
        TABLE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TABLEMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TABLE);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, 1041, 486));

        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 101, 44));

        jLabel4.setText("PRICE");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 53, -1));

        txtprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpriceActionPerformed(evt);
            }
        });
        getContentPane().add(txtprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 175, -1));

        jButton2.setText("DELETE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 490, 110, 50));

        pack();
    }// </editor-fold>                        
Connection con1;
PreparedStatement insert;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
String category =txtcategory.getText();
String product =txtproduct.getText();
 String price =txtprice.getText();
String contact = txtcontact.getText();





      try {
          Class.forName("com.mysql.jdbc.Driver"); //Register the mysql driver
          con1 = DriverManager.getConnection("jdbc:mysql://localhost/mpr","root","root@1234");
          insert = con1.prepareStatement("insert into buysell (category , product , price , contact)values(?,?,?,?)");
          insert.setString(1,category);
          insert.setString(2,product);
          insert.setString(3,price);
          insert.setString(4,contact);
          insert.executeUpdate();
          JOptionPane.showMessageDialog(this, "Record Saved");
          
          
          txtcategory.setText("");
          txtproduct.setText("");
          txtprice.setText("");
          txtcontact.setText("");
          table_update();

      } catch (ClassNotFoundException ex) {
          Logger.getLogger(FINDTEAM.class.getName()).log(Level.SEVERE, null, ex);
      } catch (SQLException ex) {
          Logger.getLogger(FINDTEAM.class.getName()).log(Level.SEVERE, null, ex);
      }      



         
    }                                        
private void table_update() {
        int CC;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con1 = DriverManager.getConnection("jdbc:mysql://localhost/mpr","root","root@1234");
            insert = con1.prepareStatement("SELECT * FROM buysell");
            ResultSet Rs = insert.executeQuery();
            
            ResultSetMetaData RSMD = Rs.getMetaData();
            CC = RSMD.getColumnCount();
            DefaultTableModel DFT = (DefaultTableModel) TABLE.getModel();
            DFT.setRowCount(0);

            while (Rs.next()) {
                Vector v2 = new Vector();
           
                for (int ii = 1; ii <= CC; ii++) {
                    v2.add(Rs.getString("category"));
                    v2.add(Rs.getString("product"));
                    v2.add(Rs.getString("price"));
                    v2.add(Rs.getString("contact"));
                }
                DFT.addRow(v2);
            }
        } catch (Exception e) {
        }
    }
    private void txtproductActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void txtpriceActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void TABLEMouseClicked(java.awt.event.MouseEvent evt) {                                   
     DefaultTableModel model = (DefaultTableModel) TABLE.getModel();
    int selectedIndex = TABLE.getSelectedRow();

    // Check if the selected row is valid and has enough columns.
    if (selectedIndex >= 0 && selectedIndex < model.getRowCount() && model.getColumnCount() >= 5) {
        txtcategory.setText(model.getValueAt(selectedIndex, 1).toString()); // Index 1 is the second column (category).
        txtproduct.setText(model.getValueAt(selectedIndex, 2).toString());  // Index 2 is the third column (product).
        txtprice.setText(model.getValueAt(selectedIndex, 3).toString());    // Index 3 is the fourth column (price).
        txtcontact.setText(model.getValueAt(selectedIndex, 4).toString());  // Index 4 is the fifth column (contact).
    } else {
        // Handle the case where the selected row is not valid or doesn't have enough columns.
    }

    }                                  

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
     int row = TABLE.getSelectedRow(); // Get the selected row in the table
    
    if (row == -1) {
        JOptionPane.showMessageDialog(this, "Please select a row to delete.", "Delete Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Get the value in the first column (assumed to be the primary key) of the selected row
    String sportToDelete = TABLE.getModel().getValueAt(row, 0).toString();

    int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this record?", "Confirm Deletion", JOptionPane.YES_NO_OPTION);

    if (confirm == JOptionPane.YES_OPTION) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost/mpr", "root", "root@1234");
            PreparedStatement delete = con1.prepareStatement("DELETE FROM buysell WHERE category = ?");
            delete.setString(1, sportToDelete);
            delete.executeUpdate();
            JOptionPane.showMessageDialog(this, "Record Deleted");
            table_update();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(FINDTEAM.class.getName()).log(Level.SEVERE, null, ex);
        }
    }     
    }                                        

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
            java.util.logging.Logger.getLogger(buysellGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(buysellGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(buysellGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(buysellGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new buysellGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JTable TABLE;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtcategory;
    private javax.swing.JTextField txtcontact;
    private javax.swing.JTextField txtprice;
    private javax.swing.JTextField txtproduct;
    // End of variables declaration                   
}