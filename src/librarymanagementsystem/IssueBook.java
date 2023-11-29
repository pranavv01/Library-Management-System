
package librarymanagementsystem;
import java.sql.*;
import javax.swing.*;
import java.lang.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.plaf.basic.BasicInternalFrameUI;



public class IssueBook extends javax.swing.JInternalFrame {
    int stock;
    
      public void Refresh()
    {
        jenroll_no.setText("");
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        
   
    }

    
    public IssueBook() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui=(BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);
        load();
        
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        jLabeldate.setText(dtf.format(now));
        
    }

    public void load()
    {
     
        try{
            Class.forName("com.mysql.jdbc.Driver");
            //establish connection
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/librarymanagement","root","rajanmysql");
            
            Statement st = con.createStatement();
            
            ResultSet r = st.executeQuery("select*from addbook");
            
            jComboBox1.removeAllItems();
            
            while(r.next())
            {
                jComboBox1.addItem(r.getString("book_name"));
             }
            
            con.close();
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"failed to connect to database","Error Connection",JOptionPane.WARNING_MESSAGE);
            System.exit(0);
        }
    }
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jenroll_no = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabeldate = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 255, 153));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setText("Student Enrollment Number");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 200, -1));

        jenroll_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jenroll_noActionPerformed(evt);
            }
        });
        jPanel3.add(jenroll_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 140, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 51, 255));
        jButton1.setText("Search");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 100, 30));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("Reset");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 140, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Student Name");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, 110, -1));

        jLabel3.setBackground(new java.awt.Color(204, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("Course");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, 80, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("Semester/Year");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, 110, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setText("Mobile Number");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 200, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("Email");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 250, -1, -1));
        jPanel3.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 70, 180, -1));
        jPanel3.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 110, 180, -1));
        jPanel3.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 150, 180, -1));
        jPanel3.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 200, 180, -1));
        jPanel3.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 250, 180, -1));

        jLabeldate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabeldate.setForeground(new java.awt.Color(255, 51, 51));
        jPanel3.add(jLabeldate, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 10, 210, 20));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 340));

        jPanel4.setBackground(new java.awt.Color(0, 255, 102));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setText("Book Name");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, -1, -1));

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(51, 51, 255));
        jButton4.setText("Issue  Book");
        jButton4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51), 2));
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, 190, 40));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel4.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, 250, -1));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 920, 230));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jenroll_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jenroll_noActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jenroll_noActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try{
            Class.forName("com.mysql.jdbc.Driver");
            //establish connection
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/librarymanagement","root","rajanmysql");
            PreparedStatement st = con.prepareStatement("SELECT * FROM addstudent WHERE Enroll_num=?");
            st.setString(1, jenroll_no.getText());

            //Executing query
            ResultSet rs = st.executeQuery();

            if(rs.next())
            {
                JOptionPane.showMessageDialog(null,"Record Found On Table");

                //sets record in TextFields
                jTextField1.setText(rs.getString(2));
                jTextField2.setText(rs.getString(4));
                jTextField3.setText(rs.getString(5));
                jTextField4.setText(rs.getString(7));
                jTextField5.setText(rs.getString(8));

            }
            else{
                JOptionPane.showMessageDialog(null,"Enrollment Not Found \n    OR ELSE \n  Add Student");
                jenroll_no.setText("");
            }
        }
        catch(Exception ex){
            System.out.println(ex);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        jenroll_no.setText("");
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        
    }//GEN-LAST:event_jButton2ActionPerformed

   
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        try{
            Class.forName("com.mysql.jdbc.Driver");
            //establish connection
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/librarymanagement","root","rajanmysql");
            Statement statement = con.createStatement();
            statement.executeUpdate("INSERT INTO viewissuebook VALUES('"+jComboBox1.getSelectedItem()+"',"+jenroll_no.getText()+",'"+jTextField1.getText()+"','"+jTextField2.getText()+"','"+jTextField3.getText()+"',"+jTextField4.getText()+",'"+jTextField5.getText()+"','"+jLabeldate.getText()+"')");
          
           
	int qty=0;
	try{
		
		
		PreparedStatement ps=con.prepareStatement("select quantity from addbook where book_name=?");
		ps.setString(1, jComboBox1.getSelectedItem().toString());
		ResultSet rs=ps.executeQuery();
		if(rs.next())
                     {
			qty=rs.getInt("quantity");
		
                      }
		
		if(qty>0)
                {
                    int newqty=qty-1;
		     PreparedStatement ps2=con.prepareStatement("update addbook set quantity=?    where book_name=?");
		     ps2.setInt(1,newqty);
                     ps2.setString(2,jComboBox1.getSelectedItem().toString());
                     ps2.executeUpdate();
		
		}
		con.close();
	   }
        catch(Exception e)
        {System.out.println(e);}
           
        
        
        
            JOptionPane.showMessageDialog(null,"Book Issued...");
           
            statement.close();
            con.close();
            Refresh();

        }
        catch(SQLException | ClassNotFoundException e){
            JOptionPane.showMessageDialog(null,e);
        }

    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabeldate;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jenroll_no;
    // End of variables declaration//GEN-END:variables
}
