
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/*
 * BookMaster.java
 *
 * Created on March 19, 2014, 11:09 AM
 */
import javax.swing.JOptionPane;



/**
 *
 * @author  Administrator
 */
public class BookMaster extends javax.swing.JFrame {
    MainClass mc=new MainClass();
    ResultSet rsbook;
    int rspos=0;
    int rscount=0;
    boolean chadd=false;
    /** Creates new form BookMaster */
    public BookMaster() {
        initComponents();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TxtBookID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TxtBookTitle = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TxtAuthor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        TxtPublisher = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        TxtYear = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        TxtKeywords = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        CmbCategory = new javax.swing.JComboBox();
        CmdFirst = new javax.swing.JButton();
        CmdPrevious = new javax.swing.JButton();
        CmdNext = new javax.swing.JButton();
        CmdLast = new javax.swing.JButton();
        CmdNew = new javax.swing.JButton();
        CmdEdit = new javax.swing.JButton();
        CmdSave = new javax.swing.JButton();
        CmdClose = new javax.swing.JButton();
        LblPosition = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("P2P Library : Book Master");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 255));
        jLabel1.setText("Soshanguve Library - Add Book ");

        jLabel2.setText("Book ID:");

        TxtBookID.setEditable(false);
        TxtBookID.setText("jTextField1");

        jLabel3.setText("Book Title:");

        TxtBookTitle.setText("jTextField1");

        jLabel4.setText("Author:");

        TxtAuthor.setText("jTextField1");

        jLabel5.setText("Publisher:");

        TxtPublisher.setText("jTextField1");

        jLabel6.setText("Year Publish:");

        TxtYear.setText("jTextField1");

        jLabel7.setText("Search Keyword:");

        TxtKeywords.setText("jTextField1");

        jLabel8.setText("Category:");

        CmbCategory.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        CmdFirst.setText("Fisrt");
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

        LblPosition.setText("Book ID:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(87, 87, 87)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel7))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(TxtYear)
                                        .addComponent(TxtPublisher)
                                        .addComponent(TxtAuthor)
                                        .addComponent(TxtBookTitle)
                                        .addComponent(TxtBookID, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                                        .addComponent(CmbCategory, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(CmdNew)
                                        .addComponent(TxtKeywords, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(CmdFirst)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CmdPrevious)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CmdNext)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CmdLast)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CmdEdit)
                        .addGap(6, 6, 6)
                        .addComponent(CmdSave)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CmdClose))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(LblPosition)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addGap(19, 19, 19)
                        .addComponent(jLabel8))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(TxtBookID, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtBookTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtPublisher, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtYear, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(CmbCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TxtKeywords, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(LblPosition)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CmdFirst)
                    .addComponent(CmdPrevious)
                    .addComponent(CmdNext)
                    .addComponent(CmdLast)
                    .addComponent(CmdNew)
                    .addComponent(CmdEdit)
                    .addComponent(CmdSave)
                    .addComponent(CmdClose))
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CmdCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmdCloseActionPerformed
        // TODO add your handling code here:
         this.setVisible(false);
    }//GEN-LAST:event_CmdCloseActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:

        try
        {
            
            this.setLocationRelativeTo(null);
            
            ClearText();
            CmbCategory.removeAllItems();
        
            Connection connection;          
            connection=DriverManager.getConnection("jdbc:mysql://localhost/p2p_library","root","");
            ResultSet rs;
            
            //fill book category
            PreparedStatement stmt=connection.prepareStatement("select * from lib_book_category order by book_category");
            rs = stmt.executeQuery();
            while (rs.next()){
                CmbCategory.addItem(rs.getString(1));
            }
            rs.close();
            
            
            //get book count
            stmt=connection.prepareStatement("select count(*) from lib_book_master");
            rs = stmt.executeQuery();
            rs.first();
            rscount=rs.getInt(1);

            //get book details
            Statement stmt1 = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            String sqlQuery = "select * from lib_book_master order by book_id";
            rsbook = stmt1.executeQuery(sqlQuery);
            
            //display first record
            rsbook.first();
                 
            Display();         

        }
        catch (Exception e)
        {
            System.err.println(e);
            //System.exit(1);
        }
    }//GEN-LAST:event_formWindowOpened

    private void CmdNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmdNewActionPerformed
        
        chadd=true;
        ClearText();
    }//GEN-LAST:event_CmdNewActionPerformed

    private void CmdNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmdNextActionPerformed
       
        try
        {
            if (rsbook.isLast()==true)
            {
                JOptionPane.showMessageDialog(null,"Already in last record.");
                return;                
                
            }
            rsbook.next();
            Display();
           
        }
        catch (Exception e)
        {
            System.err.println(e);
           
        }
    }//GEN-LAST:event_CmdNextActionPerformed

    private void CmdFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmdFirstActionPerformed

        try
        {
            rsbook.first();
            Display();
            
        }
        catch (Exception e)
        {
            System.err.println(e);

        }
    }//GEN-LAST:event_CmdFirstActionPerformed

    private void CmdPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmdPreviousActionPerformed

        try
        {
            if (rsbook.isFirst()==true)
            {
                JOptionPane.showMessageDialog(null,"Already in first record.");
                return;                
                
            }
            
            rsbook.previous();
            Display();
            
        }
        catch (Exception e)
        {
            System.err.println(e);

        }
    }//GEN-LAST:event_CmdPreviousActionPerformed

    private void CmdLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmdLastActionPerformed
        
        try
        {
            rsbook.last();
            Display();
           
        }
        catch (Exception e)
        {
            System.err.println(e);
            //System.exit(1);
        }
    }//GEN-LAST:event_CmdLastActionPerformed

    private void CmdEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmdEditActionPerformed
        
        chadd=false;
    }//GEN-LAST:event_CmdEditActionPerformed

    private void CmdSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmdSaveActionPerformed

        //validate entry and save record
        try
        {

        if (TxtBookTitle.getText().trim().length()==0 )
        {
                JOptionPane.showMessageDialog(null,"Enter book title.");
                return;  
        }
        
        if (TxtAuthor.getText().trim().length()==0 )
        {
                JOptionPane.showMessageDialog(null,"Enter author.");
                return;  
        }        
        if (TxtPublisher.getText().trim().length()==0)
        {
                JOptionPane.showMessageDialog(null,"Enter publisher name.");
                return;  
        }
        if (CmbCategory.getSelectedItem().equals(""))
        {
                JOptionPane.showMessageDialog(null,"Select book category.");
                return;  
        }
         

            
        
            String strqr="";
            Connection connection;          
            connection=DriverManager.getConnection("jdbc:mysql://localhost/p2p_library","root","");
            Statement statement = null ;
            int executeUpdate =0;
            
            if (TxtBookID.getText().trim().length()==0 )
            {
               //strqr="insert into lib_book_master(book_title, book_author, book_publisher, book_publish_year, book_category, book_keyword) values ('" + TxtBookTitle.getText() + "','" + TxtAuthor.getText() +"','"+ TxtPublisher.getText() +"','" + TxtYear.getText() + "','" + CmbCategory.getSelectedItem().toString() +"','" + TxtKeywords.getText() +"')";
             //executeUpdate = statement.executeUpdate(strqr);
               
               rsbook.moveToInsertRow();
                
                rsbook.updateString("book_title",TxtBookTitle.getText());
                rsbook.updateString("book_author",TxtAuthor.getText());
                rsbook.updateString("book_publisher",TxtPublisher.getText());
                rsbook.updateString("book_publish_year",TxtYear.getText());
                rsbook.updateString("book_category",CmbCategory.getSelectedItem().toString());
                rsbook.updateString("book_keyword",TxtKeywords.getText());
                rsbook.updateString("book_status","Available");
                rsbook.insertRow();
                
                rsbook.last();
                Display();
            }
            else
            {
                rsbook.updateString("book_title",TxtBookTitle.getText());
                rsbook.updateString("book_author",TxtAuthor.getText());
                rsbook.updateString("book_publisher",TxtPublisher.getText());
                rsbook.updateString("book_publish_year",TxtYear.getText());
                rsbook.updateString("book_category",CmbCategory.getSelectedItem().toString());
                rsbook.updateString("book_keyword",TxtKeywords.getText());

                rsbook.updateRow();
                rsbook.refreshRow();
            }
            
            
            JOptionPane.showMessageDialog(null,"Record updated.");
        }
        catch (Exception e)
        {
            System.err.println(e);
            JOptionPane.showMessageDialog(null,"Unable to save record.");
            return; 
        }
    }//GEN-LAST:event_CmdSaveActionPerformed
    
    private void Display()
    {
        try
        {
            //clear text of fields for entry/display old data
            TxtBookID.setText(rsbook.getString("book_id"));
            TxtBookTitle.setText(rsbook.getString("book_title"));
            TxtAuthor.setText(rsbook.getString("book_author"));
            TxtPublisher.setText(rsbook.getString("book_publisher"));
            TxtYear.setText(rsbook.getString("book_publish_year"));
            CmbCategory.setSelectedItem(rsbook.getString("book_category"));
            TxtKeywords.setText(rsbook.getString("book_keyword"));
            
            LblPosition.setText("Record position : " + rsbook.getRow() + "/" + String.valueOf(rscount));
        }
        catch (Exception e)
        {
            System.err.println(e);
            
        }
    }
    
    private void ClearText()
    {
        //clear text of fields for entry/display old data
        TxtBookID.setText("");
        TxtBookTitle.setText("");
        TxtAuthor.setText("");
        TxtPublisher.setText("");
        TxtYear.setText("");
        CmbCategory.setSelectedItem(null);
        TxtKeywords.setText("");
        
        LblPosition.setText("");
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookMaster().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox CmbCategory;
    private javax.swing.JButton CmdClose;
    private javax.swing.JButton CmdEdit;
    private javax.swing.JButton CmdFirst;
    private javax.swing.JButton CmdLast;
    private javax.swing.JButton CmdNew;
    private javax.swing.JButton CmdNext;
    private javax.swing.JButton CmdPrevious;
    private javax.swing.JButton CmdSave;
    private javax.swing.JLabel LblPosition;
    private javax.swing.JTextField TxtAuthor;
    private javax.swing.JTextField TxtBookID;
    private javax.swing.JTextField TxtBookTitle;
    private javax.swing.JTextField TxtKeywords;
    private javax.swing.JTextField TxtPublisher;
    private javax.swing.JTextField TxtYear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
    
}
