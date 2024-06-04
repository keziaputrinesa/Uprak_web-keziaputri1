/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Form;
   
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class Database {
    
    
    Connection conn;
    ResultSet hasil;
    Statement st;
    
    
    public Database(){
        try {Class.forName("com.mysql.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/uprak","root","");
            
        } catch (ClassNotFoundException | SQLException e) {  
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
       // method ambil data dari database 
    public ResultSet nyokotData(String query){
        try{
            st= conn.createStatement();
            return st.executeQuery(query);
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
            return null;
        }
  }
    
    //method rubah data
    public Boolean rubahData(String query){
            try {
                st = conn.createStatement();
                st.executeUpdate(query);
                return true;
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
                return false;
            }
    }
    
    
    
    
}
