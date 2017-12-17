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
public class Update_pro implements Operation {
   
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    Statement st;
    
   
    @Override
    public void Operation(String id, String name, String price) {

       try {
           

    String sql = "UPDATE project_final_product SET Name_pro = ? , "
                + "Price_pro = ? "
                + "WHERE ID_pro = ?";
                    con = DBconnectionProduct.getInstance();
                    pst = con.prepareStatement(sql);

                    pst.setString(1, name);
                    pst.setString(2, price);
                    pst.setString(3, id);
                    pst.execute();
                    System.out.println("yes update");
                } catch (SQLException ex) {
                    Logger.getLogger(Update_pro.class.getName()).log(Level.SEVERE, null, ex);
                } 

    }

    @Override
    public void  Operation(String id) {
       
     }

   

  

    
    
}
