/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Employees_Model;

import DB.DBconnectionProduct;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Mahran
 */
public class Check {
     Connection con;
    PreparedStatement pst;
    ResultSet rs;
    Statement st;
    
  public boolean Check(String name , String pass) throws SQLException{
        String i = null;
         con = DBconnectionProduct.getInstance();
            pst = con.prepareStatement("SELECT * FROM project_final_employee WHERE Name_emp=?");
            pst.setString(1,name);
            rs = pst.executeQuery();
            
            while (rs.next()) {
               i=rs.getString(1);
            } 
      if(i.equals("1")){  
        return false;
      } else
     return true;     
    }   
}
