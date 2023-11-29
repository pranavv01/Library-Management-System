
package librarymanagementsystem;

import java.sql.*;
import javax.swing.*;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import net.proteanit.sql.DbUtils;
import java.lang.String;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class AddStudent extends javax.swing.JInternalFrame {
    int lastid;

    public void refresh(){
            jenroll.setText("");
            jname.setText("");
            jpass.setText("");
           
            jmobile.setText("");
            jemail.setText("");
            jaddress.setText("");
            getlastid();
        
    }
    public AddStudent() {
        
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui=(BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);
        getlastid();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        jLabeldate.setText(dtf.format(now));
        
    }

    public void getlastid(){
        try
        {   
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/librarymanagement","root","rajanmysql");
            String sql = "select max(Enroll_num) from addstudent";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if(rs.next())
            {
                lastid = rs.getInt(1);
                lastid++;
                jenroll.setText(Integer.toString(lastid));
            }
            
        }
        
     catch(Exception ex){
        JOptionPane.showMessageDialog(this, ex);
            
      }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jaddress = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jenroll = new javax.swing.JTextField();
        jpass = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jemail = new javax.swing.JTextField();
        jmobile = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabeldate = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(153, 255, 153));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 51));
        jLabel9.setText("Mobile No. :");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 390, 110, 20));
        jPanel3.add(jaddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 430, 230, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 51));
        jLabel3.setText("Enrollment NO. :");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 160, 20));

        jenroll.setEditable(false);
        jenroll.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jenroll.setToolTipText("Student id cannot be changed");
        jPanel3.add(jenroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, 230, -1));

        jpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpassActionPerformed(evt);
            }
        });
        jPanel3.add(jpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, 230, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 51));
        jLabel5.setText("Password :");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 100, 20));

        jname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jnameActionPerformed(evt);
            }
        });
        jPanel3.add(jname, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, 230, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 51));
        jLabel4.setText("Name :");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, 70, 20));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 51));
        jLabel10.setText("Email :");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, 70, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 51));
        jLabel2.setText("Address :");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 430, 90, 20));

        jemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jemailActionPerformed(evt);
            }
        });
        jPanel3.add(jemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 340, 230, -1));

        jmobile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmobileActionPerformed(evt);
            }
        });
        jPanel3.add(jmobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 390, 230, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 51));
        jLabel8.setText("University :");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, 110, 20));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 51));
        jLabel7.setText("Semester :");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, 100, 20));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 51));
        jLabel6.setText("Course :");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, 90, 20));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/save.png"))); // NOI18N
        jButton1.setText("  ADD");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 480, 140, 50));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon back.png"))); // NOI18N
        jButton2.setText("   BACK");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 480, 140, 50));

        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BCA", "MCA", "B.SC", "M.SC", "BBA", "B.COM", "M.COM" }));
        jComboBox1.setSelectedItem(null);
        jPanel3.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, 230, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1st  Sem", "2st  Sem", "3rd  Sem", "4th  Sem", "5th  Sem", "6th Sem", "7th  Sem" }));
        jComboBox2.setSelectedItem(null);
        jPanel3.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 240, 230, -1));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MGKVP", "VBPSU" }));
        jComboBox3.setSelectedItem(null);
        jPanel3.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 290, 230, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 51));
        jLabel11.setText("DATE AND TIME");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 40, 130, -1));

        jLabeldate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabeldate.setForeground(new java.awt.Color(255, 255, 51));
        jPanel3.add(jLabeldate, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 70, 200, 30));

        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/student form.jpg"))); // NOI18N
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-200, -40, 1120, 600));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try{
            Class.forName("com.mysql.jdbc.Driver");
            //establish connection
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/librarymanagement","root","rajanmysql");
            
             Statement statement = con.createStatement();
             statement.executeUpdate("insert into addstudent values("+jenroll.getText()+",'"+jname.getText()+"','"+jpass.getText()+"','"+jComboBox1.getSelectedItem()+"','"+jComboBox2.getSelectedItem()+"','"+jComboBox3.getSelectedItem()+"',"+jmobile.getText()+",'"+jemail.getText()+"','"+jaddress.getText()+"','"+jLabeldate.getText()+"')");
             
            JOptionPane.showMessageDialog(null,"Student added successfully...");
            statement.close();
            con.close();
           refresh();
 
        }
        catch(SQLException | ClassNotFoundException e){
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        this.toBack();
        setVisible(false);
        new AdminDashboard().toFront();

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jnameActionPerformed

    private void jemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jemailActionPerformed

    private void jmobileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmobileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmobileActionPerformed

    private void jpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jpassActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabeldate;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jaddress;
    private javax.swing.JTextField jemail;
    private javax.swing.JTextField jenroll;
    private javax.swing.JTextField jmobile;
    private javax.swing.JTextField jname;
    private javax.swing.JTextField jpass;
    // End of variables declaration//GEN-END:variables
}
