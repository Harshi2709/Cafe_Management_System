/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author SHREE
 */
public class DBoperations {
public static void setDataOrDelete(String Query, String msg)
{
try{
        Connection con = ConnectionProvider.getCon();
        Statement st = con.createStatement();
        st.executeUpdate(Query);
        if(!msg.equals(""))
            JOptionPane.showMessageDialog(null, msg);
            
        }
      
    
catch(Exception e){
        JOptionPane.showMessageDialog(null, e, "Message", JOptionPane.ERROR_MESSAGE);
        }
}
public static ResultSet getData(String query){
try{
Connection con = ConnectionProvider.getCon();
Statement st = con.createStatement();
ResultSet rs = st.executeQuery(query);
return rs;
}
catch(Exception e){
 JOptionPane.showMessageDialog(null, e, "Message", JOptionPane.ERROR_MESSAGE);
 return null;
}
}
}
