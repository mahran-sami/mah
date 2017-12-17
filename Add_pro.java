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
public class Add_pro implements Operation {

    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    Statement st;

    @Override
    public void Operation(String id, String name, String price) {
        try {
            String q = "insert into project_final_product(ID_pro ,Name_pro ,Price_pro) VALUES (?,?,?)";
            con = DBconnectionProduct.getInstance();
            pst = con.prepareStatement(q);
            pst.setString(1, id);
            pst.setString(2, name);
            pst.setString(3, price);
            System.out.println("yes add");
            pst.execute();
        } catch (SQLException ex) {
            Logger.getLogger(Add_pro.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void Operation(String id) {
        
    }

   

}
