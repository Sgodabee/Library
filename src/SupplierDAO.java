
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sgoda
 */
public class SupplierDAO 
{
    private Connection connect;
    private Statement statement;
    

    public SupplierDAO() throws SQLException {
        connect = DriverManager.getConnection("jdbc:mysql://localhost/p2p_library","root","");
        statement = connect.createStatement();
        
        
    }
    
    public int supplier(String libName, String supAddress,String libMess) throws SQLException
    {
       String sql = "insert into tblSupplier(library_name, supplier_Address,library_mess) values ('"+libName+"','"+supAddress+"','"+libMess+"')";
        
        return statement.executeUpdate(sql);
        
    }
    
    public void CloseConnection() throws SQLException
    {
        statement.close();
        connect.close();
        
    
    }
}
