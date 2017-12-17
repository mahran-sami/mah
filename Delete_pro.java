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
public class Delete_pro implements Operation {

    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    Statement st;

    @Override
    public void  Operation(String id) {
        try {
            String q = "DELETE FROM project_final_product WHERE ID_pro="+id;
            con = DBconnectionProduct.getInstance();
            pst = con.prepareStatement(q);
            pst.executeUpdate();
             System.out.println("yes delete");
        } catch (SQLException ex) {
            Logger.getLogger(Delete_pro.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }

    @Override
    public void Operation(String id, String name, String price) {
     
    }

}
