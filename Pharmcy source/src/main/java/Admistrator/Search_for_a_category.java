
package Admistrator;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class Search_for_a_category extends javax.swing.JFrame {
    
    DateFormat dataformat = new SimpleDateFormat("dd/MM/YY");
    Date data = new Date();
    Calendar cal = Calendar.getInstance();
    DefaultTableModel model1 = new DefaultTableModel();
    Connection con;
    JFrame frame = new JFrame();
    JComboBox combo;
    ArrayList<Integer>iddrugs = new ArrayList<>();
    /*
     * Creates new form Search_for_a_category
     */
    
    public Search_for_a_category() {
        initComponents(); 
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmcy","root", "eslam23467859");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Connection Failed");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tab_finded = new javax.swing.JTable();
        btn_search = new javax.swing.JButton();
        btn_ok = new javax.swing.JButton();
        search_field = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Search for a category");
        setMinimumSize(new java.awt.Dimension(700, 500));
        setPreferredSize(new java.awt.Dimension(600, 400));
        getContentPane().setLayout(null);

        jPanel1.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        jPanel1.setMinimumSize(new java.awt.Dimension(600, 400));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 0));
        jLabel1.setText("Search for a category");
        jLabel1.setMaximumSize(new java.awt.Dimension(600, 400));
        jLabel1.setMinimumSize(new java.awt.Dimension(600, 400));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(200, 10, 280, 33);

        jPanel2.setLayout(null);

        tab_finded.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 153, 0)));
        tab_finded.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Id", "Quantity", "Selling Price", "Perchasing Price", "start date", "ended Date", "Discount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tab_finded.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tab_findedMouseClicked(evt);
            }
        });
        tab_finded.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tab_findedKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(tab_finded);

        jPanel2.add(jScrollPane2);
        jScrollPane2.setBounds(0, 0, 650, 230);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(20, 140, 650, 230);

        btn_search.setBackground(new java.awt.Color(51, 51, 51));
        btn_search.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_search.setForeground(new java.awt.Color(255, 153, 0));
        btn_search.setText("Search");
        btn_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchActionPerformed(evt);
            }
        });
        jPanel1.add(btn_search);
        btn_search.setBounds(50, 400, 160, 50);

        btn_ok.setBackground(new java.awt.Color(51, 51, 51));
        btn_ok.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_ok.setForeground(new java.awt.Color(255, 153, 0));
        btn_ok.setText("OK");
        btn_ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_okActionPerformed(evt);
            }
        });
        jPanel1.add(btn_ok);
        btn_ok.setBounds(480, 400, 160, 50);

        search_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_fieldActionPerformed(evt);
            }
        });
        jPanel1.add(search_field);
        search_field.setBounds(270, 69, 230, 30);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Name", "id" }));
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(70, 70, 150, 30);

        jLabel5.setIcon(new javax.swing.ImageIcon("D:\\صور\\ىثص.jpg")); // NOI18N
        jLabel5.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        jLabel5.setMinimumSize(new java.awt.Dimension(720, 420));
        jPanel1.add(jLabel5);
        jLabel5.setBounds(0, 0, 690, 520);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 810, 550);

        getAccessibleContext().setAccessibleName("               Search for a category");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void search_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_fieldActionPerformed

    }//GEN-LAST:event_search_fieldActionPerformed

    private void btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchActionPerformed
            fullTableModel();
    }//GEN-LAST:event_btn_searchActionPerformed

    private void tab_findedKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tab_findedKeyPressed

    }//GEN-LAST:event_tab_findedKeyPressed

    private void tab_findedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab_findedMouseClicked

    }//GEN-LAST:event_tab_findedMouseClicked

    private void btn_okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_okActionPerformed
        // TODO add your handling code here:
      
       NewJFrame1 sell = new NewJFrame1(); 
       TableModel model = tab_finded.getModel();
        DefaultTableModel model1 = (DefaultTableModel)sell.tab_Sales.getModel();
        int[] index = tab_finded.getSelectedRows();
        Object[] row = new Object[8];
        for (int i = 0; i < index.length; i++) {
            row[0] = model.getValueAt(index[i], 0);
            row[1] = model.getValueAt(index[i], 1);
            row[2] = model.getValueAt(index[i], 2);
            row[3] = model.getValueAt(index[i], 3);
            row[4] = model.getValueAt(index[i], 4);
            row[5] = model.getValueAt(index[i], 5);
            row[6] = model.getValueAt(index[i], 6);
            row[7] = model.getValueAt(index[i], 7);
            model1.insertRow(model1.getRowCount(),row);
        }
        //sell.dispose();
        //this.dispose();      
        sell.setVisible(true);
        
    }//GEN-LAST:event_btn_okActionPerformed

   private void fullTableModel(){
       String name = search_field.getText();
                 
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmcy","root", "eslam23467859");
            PreparedStatement stmt;
            if(jComboBox1.getSelectedIndex()==1){                
            stmt = con.prepareStatement("select * from dataOfDrugs where idOfDrugs =? ");           
            stmt.setString(1, search_field.getText());
            ResultSet re = stmt.executeQuery();
            DefaultTableModel model1 ;
            model1 = new DefaultTableModel();
            model1.addColumn("Name");
            model1.addColumn("ID");
            model1.addColumn("Quantity");
            model1.addColumn("Selling Price");
            model1.addColumn("Perchasing Price");
            model1.addColumn("start date");
            model1.addColumn("ended date");
            model1.addColumn("discount");
            while(re.next())
            {
                String r[] = {re.getString(1),re.getString(2),re.getString(3),re.getString(4),re.getString(5),re.getString(6),re.getString(7),re.getString(8)};
            model1.addRow(r);
            }
            tab_finded.setModel(model1);
            }
            else{
            stmt = con.prepareStatement("select * from dataOfDrugs where nameOfDrugs = ? ");           
            stmt.setString(1, search_field.getText());
            ResultSet re = stmt.executeQuery();
            
            DefaultTableModel model1 ;
            model1 = new DefaultTableModel();
            model1.addColumn("Name");
            model1.addColumn("ID");
            model1.addColumn("Quantity");
            model1.addColumn("Selling Price");
            model1.addColumn("Perchasing Price");
            model1.addColumn("start date");
            model1.addColumn("ended date");
            model1.addColumn("discount");
            while(re.next())
            {
                String r[] = {re.getString(1),re.getString(2),re.getString(3),re.getString(4),re.getString(5),re.getString(6),re.getString(7),re.getString(8)};
                model1.addRow(r);
            }
            tab_finded.setModel(model1);
            }  
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Connection Failed");
        }
    }
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
            java.util.logging.Logger.getLogger(Search_for_a_category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Search_for_a_category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Search_for_a_category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Search_for_a_category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Search_for_a_category().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ok;
    private javax.swing.JButton btn_search;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    public static javax.swing.JTextField search_field;
    public static javax.swing.JTable tab_finded;
    // End of variables declaration//GEN-END:variables
}
