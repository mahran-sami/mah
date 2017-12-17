/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Management_Model;

import DB.DBconnectionProduct;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mahran
 */
public class Search_pro {

    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    Statement st;

    String id;
    String name;
    String price;
    
 
   public Search_pro(){};
    public void Search_proh(String id) throws SQLException {
       
       
        
        con = DBconnectionProduct.getInstance();
            pst = con.prepareStatement("SELECT * FROM project_final_product WHERE ID_pro=?");
            pst.setString(1,id);
            rs = pst.executeQuery();
            while (rs.next()) {
               this.id=rs.getString(1);
               this.name=rs.getString(2);
               this.price=rs.getString(3);
             
            } 
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    
   
  

    
   

   
    
//    public static void main(String[] args) throws SQLException {
//      Search_pro p = new Search_pro("2");
//        System.out.println(""+p.getId());
//        System.out.println(""+p.getName());
//        System.out.println(""+p.getPrice());
//    }

   

}
