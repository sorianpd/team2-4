/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.*;

/**
 *
 * @author sorianpd
 */
public class UserPersistence {
    
    public static boolean validateLogin(String user_id, String password)
    {
        DBHandler dbHandler = new DBHandler();
        String query = "SELECT password FROM user WHERE user_id='" + user_id +"';"; 
        boolean res = false; 
        
        try
        {
            ResultSet rs = dbHandler.doQuery(query);
            if (rs != null)
            {
               while (rs.next())
               {  
                   res = rs.getString("password").equals(password);
               }
               rs.close();
            }
            dbHandler.close();
        }
        catch (SQLException ex) {
            return false;
        } 
        return res; 
    }
    
    
}
