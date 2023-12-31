/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */


package bank;


import java.sql.Connection;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author patel
 */
public class Account extends javax.swing.JInternalFrame {

    /**
     * Creates new form Customer
     */
    public Account() {
        initComponents();
        autoID();
       // branch();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtcustomerid = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtcustomername = new javax.swing.JTextField();
        txtbalance = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        accounttype = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        txtpin = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Account"));
        jPanel1.setPreferredSize(new java.awt.Dimension(533, 274));

        jLabel2.setText("Account No");

        jLabel3.setText("Customer id");

        jLabel4.setText("Customer Name");

        jLabel5.setText("Account Type");

        jLabel6.setText("Balance");

        txtcustomerid.setPreferredSize(new java.awt.Dimension(226, 30));
        txtcustomerid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcustomeridActionPerformed(evt);
            }
        });
        txtcustomerid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcustomeridKeyPressed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setText("Cancel");
        jButton1.setPreferredSize(new java.awt.Dimension(100, 100));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton2.setText("ADD");
        jButton2.setPreferredSize(new java.awt.Dimension(100, 100));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 255));
        jLabel9.setText("jLabel9");

        txtcustomername.setPreferredSize(new java.awt.Dimension(226, 30));
        txtcustomername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcustomernameActionPerformed(evt);
            }
        });

        txtbalance.setPreferredSize(new java.awt.Dimension(226, 30));
        txtbalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbalanceActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton4.setText("Find");
        jButton4.setPreferredSize(new java.awt.Dimension(100, 100));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        accounttype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Savings accounts", "Fixed deposit account", "Current account" }));
        accounttype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accounttypeActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("PIn ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel6))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcustomerid, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtpin, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtcustomername, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(accounttype, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbalance, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 43, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcustomerid, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcustomername, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(accounttype, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtbalance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtpin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(132, 132, 132))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 460, 516));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\patel\\OneDrive\\Desktop\\Bank\\src\\bank\\plain-light-blue-background-3440-x-1440-20l5bry2v5zc3pzv (1).jpg")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 590, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents
Connection con;
 PreparedStatement insert;
   public void autoID() {
    try {
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "root");
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT MAX(Account_id) FROM Account");
        rs.next();
        String maxCustomerId = rs.getString(1);
        
        if (maxCustomerId == null) {
            jLabel9.setText("A001");
        } else {
            long id = Long.parseLong(rs.getString("Max(Account_id)").substring(2, rs.getString("Max(Account_id)").length()));
            id++;
            jLabel9.setText("A" + String.format("%03d", id));
        }
        
        rs.close();
        st.close();
        con.close();
    } catch (ClassNotFoundException | SQLException ex) {
        Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
    }
}

//   public void branch(){
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//             con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "root");
//             insert = con.prepareStatement("select *from branch");
//             ResultSet rs = insert.executeQuery();
//             jComboBox1.removeAllItems();
//             while(rs.next()){
//                jComboBox1.addItem(rs.getString(2));          
//                }
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
//        }
//         catch (SQLException ex) {
//            Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
//        }
//   }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String Account_No = jLabel9.getText();
        String Customer_ID = txtcustomerid.getText();
        String Customer_Name = txtcustomername.getText();
        String Balance = txtbalance.getText();
        char[] Pin = txtpin.getPassword();
        String Account_Type = accounttype.getSelectedItem().toString();
        
       try {
           Class.forName("com.mysql.jdbc.Driver");
           con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "root");
          insert = con.prepareStatement("INSERT INTO Account (Account_id, Customer_id, Account_Type,Balance,Pin) VALUES (?,?, ?, ?, ?)");
          String pinString = new String(Pin);
          insert.setString(1, Account_No);
          insert.setString(2, Customer_ID);
          insert.setString(3, Account_Type);
          insert.setString(4, Balance);
          insert.setString(5, pinString);
          
                 
           insert.executeUpdate();
           JOptionPane.showMessageDialog(this,"Account Created Successfully");
           
            txtcustomerid.setText("");
            txtcustomername.setText("");
           txtbalance.setText("");
           accounttype.setSelectedIndex(-1);
            autoID();
           txtcustomerid.requestFocus();
            
       } catch (ClassNotFoundException ex) {
           Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
       } catch (SQLException ex) {
            Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
        }
 
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtcustomernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcustomernameActionPerformed
        // TODO add your handling code here:
        
             
        
    }//GEN-LAST:event_txtcustomernameActionPerformed

    private void txtcustomeridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcustomeridActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcustomeridActionPerformed

    private void txtbalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbalanceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbalanceActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        String Customer_id = txtcustomerid.getText();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "root");
            insert = con.prepareStatement("select *from Customer where Customer_id=?");
            insert.setString(1, Customer_id);
            ResultSet rs = insert.executeQuery();
            if(rs.next()==false){
                JOptionPane.showMessageDialog(this,"Customer ID Not Found");
            }
            else{
                String First_Name = rs.getString("First_Name");
                txtcustomername.setText(First_Name.trim());
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void accounttypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accounttypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_accounttypeActionPerformed

    private void txtcustomeridKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcustomeridKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcustomeridKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> accounttype;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtbalance;
    private javax.swing.JTextField txtcustomerid;
    private javax.swing.JTextField txtcustomername;
    private javax.swing.JPasswordField txtpin;
    // End of variables declaration//GEN-END:variables
}
