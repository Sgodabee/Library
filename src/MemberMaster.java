/*
 * MemberMaster.java
 *
 * Created on August 19, 2012, 8:40 PM
 */

import java.sql.Statement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
/**
 *
 * @author  Administrator
 */
public class MemberMaster extends javax.swing.JFrame {
    MainClass mc=new MainClass();
    ResultSet rsmem;
    int rspos=0;
    int rscount=0;
    boolean chadd=false;
    /** Creates new form MemberMaster */
    public MemberMaster() {
        initComponents();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TxtMemID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TxtName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TxtAddress = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        TxtEmailID = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        TxtMobileNo = new javax.swing.JTextField();
        CmdFirst = new javax.swing.JButton();
        CmdPrevious = new javax.swing.JButton();
        CmdNext = new javax.swing.JButton();
        CmdLast = new javax.swing.JButton();
        CmdNew = new javax.swing.JButton();
        CmdEdit = new javax.swing.JButton();
        CmdSave = new javax.swing.JButton();
        CmdClose = new javax.swing.JButton();
        ChkMemActive = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        LblPosition = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        jLabel12.setText("jLabel12");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Soshanguve Library : Member Registration And Update");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 255));
        jLabel1.setText("Soshanguve Library - Member Registration And Update");

        jLabel2.setText("Member ID:");

        TxtMemID.setEditable(false);
        TxtMemID.setText("jTextField1");

        jLabel3.setText("Name:");

        TxtName.setText("jTextField1");

        jLabel4.setText("Address:");

        TxtAddress.setText("jTextField1");

        jLabel5.setText("Email ID:");

        TxtEmailID.setText("jTextField1");

        jLabel6.setText("Mobile No:");

        TxtMobileNo.setText("jTextField1");

        CmdFirst.setText("First");
        CmdFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmdFirstActionPerformed(evt);
            }
        });

        CmdPrevious.setText("Previous");
        CmdPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmdPreviousActionPerformed(evt);
            }
        });

        CmdNext.setText("Next");
        CmdNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmdNextActionPerformed(evt);
            }
        });

        CmdLast.setText("Last");
        CmdLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmdLastActionPerformed(evt);
            }
        });

        CmdNew.setText("New");
        CmdNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmdNewActionPerformed(evt);
            }
        });

        CmdEdit.setText("Edit");
        CmdEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmdEditActionPerformed(evt);
            }
        });

        CmdSave.setText("Save");
        CmdSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmdSaveActionPerformed(evt);
            }
        });

        CmdClose.setText("Close");
        CmdClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmdCloseActionPerformed(evt);
            }
        });

        ChkMemActive.setText("Member Active");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setText("If Payment is recieved Make member Active / Notice : member  can only Borow book if the Have pay the Registration fee.  ");

        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setText("*");

        jLabel9.setForeground(new java.awt.Color(255, 0, 0));
        jLabel9.setText("*");

        jLabel10.setForeground(new java.awt.Color(255, 0, 0));
        jLabel10.setText("*");

        jLabel11.setForeground(new java.awt.Color(255, 0, 0));
        jLabel11.setText("*");

        LblPosition.setText("All the field that contain this must be filed with details");

        jLabel13.setForeground(new java.awt.Color(255, 0, 0));
        jLabel13.setText("*");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtMobileNo)
                            .addComponent(TxtEmailID)
                            .addComponent(TxtAddress)
                            .addComponent(TxtName)
                            .addComponent(TxtMemID, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9)
                            .addComponent(jLabel11)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(LblPosition, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel13))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(CmdFirst)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(CmdPrevious)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(CmdNext)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(CmdLast))))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(418, 418, 418)
                                .addComponent(CmdNew)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CmdEdit)
                                .addGap(18, 18, 18)
                                .addComponent(CmdSave)
                                .addGap(25, 25, 25)
                                .addComponent(CmdClose)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(177, 177, 177)
                .addComponent(ChkMemActive)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(TxtMemID, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtName, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtEmailID, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TxtMobileNo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6))
                    .addComponent(jLabel11))
                .addGap(40, 40, 40)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ChkMemActive)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblPosition)
                    .addComponent(jLabel13))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CmdFirst)
                            .addComponent(CmdPrevious)
                            .addComponent(CmdNext)
                            .addComponent(CmdLast)
                            .addComponent(CmdSave)
                            .addComponent(CmdClose))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CmdEdit)
                            .addComponent(CmdNew))
                        .addGap(21, 21, 21))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 private void Display()
    {
        try
        {

                    
            //clear text of fields for entry/display old data
            TxtMemID.setText(rsmem.getString("mem_id"));
            TxtName.setText(rsmem.getString("mem_name"));
            TxtAddress.setText(rsmem.getString("mem_address"));
            TxtEmailID.setText(rsmem.getString("mem_email_id"));
            TxtMobileNo.setText(rsmem.getString("mem_mobile_no"));
                                
            if (rsmem.getString("mem_active").equals("Y"))
            {
                ChkMemActive.setSelected(true);
            }
            else
            {
                ChkMemActive.setSelected(false);
            }

            
            LblPosition.setText("Record position : " + rsmem.getRow() + "/" + String.valueOf(rscount));
        }
        catch (Exception e)
        {
            System.err.println(e);
            
        }
    }
    
    private void ClearText()
    {
        //clear text of fields for entry/display old data
        TxtMemID.setText("");
        TxtName.setText("");
        TxtAddress.setText("");
        TxtEmailID.setText("");
        TxtMobileNo.setText("");

        ChkMemActive.setSelected(false);
        
        LblPosition.setText("");
    }
    private void CmdFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmdFirstActionPerformed
        try {
            rsmem.first();
            Display();
            
        } catch (Exception e) {
            System.err.println(e);
            
        }
    }//GEN-LAST:event_CmdFirstActionPerformed

    private void CmdPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmdPreviousActionPerformed
        try {
            if (rsmem.isFirst()==true) {
                JOptionPane.showMessageDialog(null,"Already in first record.");
                return;
                
            }
            
            rsmem.previous();
            Display();
            
        } catch (Exception e) {
            System.err.println(e);
            
        }
    }//GEN-LAST:event_CmdPreviousActionPerformed

    private void CmdNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmdNextActionPerformed
        try {
            if (rsmem.isLast()==true) {
                JOptionPane.showMessageDialog(null,"Already in last record.");
                return;
                
            }
            rsmem.next();
            Display();
            
        } catch (Exception e) {
            System.err.println(e);
            
        }
    }//GEN-LAST:event_CmdNextActionPerformed

    private void CmdLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmdLastActionPerformed
        try {
            rsmem.last();
            Display();
            
        } catch (Exception e) {
            System.err.println(e);
            //System.exit(1);
        }
    }//GEN-LAST:event_CmdLastActionPerformed

    private void CmdNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmdNewActionPerformed
        chadd=true;
        ClearText();
    }//GEN-LAST:event_CmdNewActionPerformed

    private void CmdEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmdEditActionPerformed
        chadd=false;
    }//GEN-LAST:event_CmdEditActionPerformed

    private void CmdSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmdSaveActionPerformed
        //validate entry and save record
        try {
            
            if (TxtName.getText().trim().length()==0 ) {
                JOptionPane.showMessageDialog(null,"Enter member name.");
                return;
            }
            
            if (TxtAddress.getText().trim().length()==0 ) {
                JOptionPane.showMessageDialog(null,"Enter address.");
                return;
            }
            if (TxtEmailID.getText().trim().length()==0) {
                JOptionPane.showMessageDialog(null,"Enter email id.");
                return;
            }
            if (TxtMobileNo.getText().trim().length()==0) {
                JOptionPane.showMessageDialog(null,"Enter mobile no.");
                return;
            }
            
            
            
            
            //String strqr="";
            Connection connection;
            connection=DriverManager.getConnection("jdbc:mysql://localhost/p2p_library","root","");
            
            if (TxtMemID.getText().trim().length()==0 ) {
 
                rsmem.moveToInsertRow();
                
                rsmem.updateString("mem_name",TxtName.getText());
                rsmem.updateString("mem_address",TxtAddress.getText());
                rsmem.updateString("mem_email_id",TxtEmailID.getText());
                rsmem.updateString("mem_mobile_no",TxtMobileNo.getText());
                
                if (ChkMemActive.isSelected()==true)
                {
                    rsmem.updateString("mem_active","Y");
                }
                else
                {
                    rsmem.updateString("mem_active","N");
                }
                
                rsmem.insertRow();
                
                rsmem.last();
                Display();
            } else {
                rsmem.updateString("mem_name",TxtName.getText());
                rsmem.updateString("mem_address",TxtAddress.getText());
                rsmem.updateString("mem_email_id",TxtEmailID.getText());
                rsmem.updateString("mem_mobile_no",TxtMobileNo.getText());
                
                if (ChkMemActive.isSelected()==true)
                {
                    rsmem.updateString("mem_active","Y");
                }
                else
                {
                    rsmem.updateString("mem_active","N");
                }

                
                
                rsmem.updateRow();
                rsmem.refreshRow();
            }
            
            
            JOptionPane.showMessageDialog(null,"Record updated.");
        } catch (Exception e) {
            System.err.println(e);
            JOptionPane.showMessageDialog(null,"Unable to save record.");
            return;
        }
    }//GEN-LAST:event_CmdSaveActionPerformed

    private void CmdCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmdCloseActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_CmdCloseActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
                try
        {
            
            this.setLocationRelativeTo(null);
            
            ClearText();

        
            Connection connection;          
            connection=DriverManager.getConnection("jdbc:mysql://localhost/p2p_library","root","");
            ResultSet rs;
            

            
            
            //get mem count
            PreparedStatement stmt;
            stmt=connection.prepareStatement("select count(*) from lib_member_master");
            rs = stmt.executeQuery();
            rs.first();
            rscount=rs.getInt(1);

            //get mem details
            Statement stmt1 = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            String sqlQuery = "select * from lib_member_master order by mem_id";
            rsmem = stmt1.executeQuery(sqlQuery);
            
            //display first record
            rsmem.first();
                 
            Display();         

        }
        catch (Exception e)
        {
            System.err.println(e);
            //System.exit(1);
        }

        
    }//GEN-LAST:event_formWindowOpened
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MemberMaster().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox ChkMemActive;
    private javax.swing.JButton CmdClose;
    private javax.swing.JButton CmdEdit;
    private javax.swing.JButton CmdFirst;
    private javax.swing.JButton CmdLast;
    private javax.swing.JButton CmdNew;
    private javax.swing.JButton CmdNext;
    private javax.swing.JButton CmdPrevious;
    private javax.swing.JButton CmdSave;
    private javax.swing.JLabel LblPosition;
    private javax.swing.JTextField TxtAddress;
    private javax.swing.JTextField TxtEmailID;
    private javax.swing.JTextField TxtMemID;
    private javax.swing.JTextField TxtMobileNo;
    private javax.swing.JTextField TxtName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
    
}
