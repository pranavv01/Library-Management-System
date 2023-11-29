
package librarymanagementsystem;

import java.sql.Connection;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import net.proteanit.sql.DbUtils;


public class ReturnBook extends javax.swing.JInternalFrame {

    
    public ReturnBook() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui=(BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);
        load();
        
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

        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("RETURN BOOK");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51), 3));
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 330, 200, 40));
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, 190, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("STUDENT ID");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 120, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("BOOK   NAME");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 130, 30));

        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, 190, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        try{
            Class.forName("com.mysql.jdbc.Driver");
            //establish connection
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/librarymanagement","root","rajanmysql");
            
             Statement statement = con.createStatement();
             statement.executeUpdate("DELETE FROM VIEWISSUEBOOK WHERE Book_Name='"+jComboBox1.getSelectedItem()+"' and Std_Enroll="+jTextField2.getText()+" ");
             
                   int qty=0;
	    try{
		
         	PreparedStatement ps=con.prepareStatement("select quantity from addbook where book_name=?");
		ps.setString(1, jComboBox1.getSelectedItem().toString());
		ResultSet rs=ps.executeQuery();
		if(rs.next())
                     {
			qty=rs.getInt("quantity");
                     }
	
                    int newqty=qty+1;
		     PreparedStatement ps2=con.prepareStatement("update addbook set quantity=? where book_name=?");
		     ps2.setInt(1,newqty);
                     ps2.setString(2,jComboBox1.getSelectedItem().toString());
                     ps2.executeUpdate();
	
		   con.close();
	       }
               catch(Exception e)
             {System.out.println(e);}
             
             
           JOptionPane.showMessageDialog(null,"BOOK RETURNED SUCCESSFULLY!");
           jTextField2.setText("");
             
             statement.close();
             con.close();
         

        }
        catch(SQLException | ClassNotFoundException e)
        {
            JOptionPane.showMessageDialog(null,"BOOK NOT RETURN!");
        }
        
        
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
