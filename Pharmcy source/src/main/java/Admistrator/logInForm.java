/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Admistrator;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class logInForm extends javax.swing.JFrame {

    /**
     * Creates new form logInForm
     */
    Connection con;
    public logInForm() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmcy","root", "eslam23467859");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Connection Failed");
        }
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
        jLabel3 = new javax.swing.JLabel();
        edt_username = new javax.swing.JTextField();
        edt_password = new javax.swing.JPasswordField();
        btn_login = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(720, 420));
        getContentPane().setLayout(null);

        jLabel1.setBackground(new java.awt.Color(51, 51, 51));
        jLabel1.setFont(new java.awt.Font("Perpetua Titling MT", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 0));
        jLabel1.setText("welcome");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(270, 10, 153, 47);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 0));
        jLabel2.setText("password");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(150, 170, 130, 40);

        jLabel3.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 153, 0));
        jLabel3.setText("username");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(150, 110, 140, 33);

        edt_username.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        edt_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edt_usernameActionPerformed(evt);
            }
        });
        getContentPane().add(edt_username);
        edt_username.setBounds(320, 110, 210, 30);
        getContentPane().add(edt_password);
        edt_password.setBounds(320, 180, 210, 30);

        btn_login.setBackground(new java.awt.Color(255, 153, 0));
        btn_login.setFont(new java.awt.Font("Stencil", 2, 24)); // NOI18N
        btn_login.setText("login");
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });
        getContentPane().add(btn_login);
        btn_login.setBounds(260, 300, 200, 50);

        jPanel1.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        jPanel1.setMinimumSize(new java.awt.Dimension(1080, 720));
        jPanel1.setLayout(null);

        jLabel4.setIcon(new javax.swing.ImageIcon("D:\\صور\\ىثص.jpg")); // NOI18N
        jLabel4.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        jLabel4.setMinimumSize(new java.awt.Dimension(1080, 720));
        jPanel1.add(jLabel4);
        jLabel4.setBounds(0, 0, 740, 420);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1080, 720);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        // TODO add your handling code here:
        boolean flag=false;
        String username = edt_username.getText();
        String password = String.valueOf(edt_password.getPassword());
        if (edt_username.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "please enter the username");
            edt_username.setText("");
            edt_password.setText("");
        }
        if (edt_password.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "please enter the password");
            edt_username.setText("");
            edt_password.setText("");
        }
        else{
        try {
            PreparedStatement pre = con.prepareStatement("select * from register where register_username = ? And register_password = ?");
            pre.setString(1, username);
            pre.setString(2, password);
            ResultSet re = pre.executeQuery();
            if (re.next()) {           
            flag = true;
        }
        else {
            flag = false;
        }
            
        } catch (SQLException ex) {
            Logger.getLogger(logInForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(flag){    
        JOptionPane.showMessageDialog(null, "Login Successfully");
        new NewJFrame1().setVisible(true);
        }
        else{
        JOptionPane.showMessageDialog(null, "Invalid Username OR Password");
            edt_username.setText("");
            edt_password.setText("");
        }
        }
    }//GEN-LAST:event_btn_loginActionPerformed

    private void edt_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edt_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edt_usernameActionPerformed

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
            java.util.logging.Logger.getLogger(logInForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(logInForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(logInForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(logInForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new logInForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_login;
    private javax.swing.JPasswordField edt_password;
    private javax.swing.JTextField edt_username;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
