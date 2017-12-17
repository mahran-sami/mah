/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Employees_Model;

import Employees_Model.Employee;
import DB.DBconnectionProduct;
import Employees_Model.Employee;
import Management_Model.Add_pro;
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
public class N_Employee implements Employee {

    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    Statement st;
    
    public N_Employee(){}
            
    @Override
    public void Create_Emp(String id, String name, String price) {
        if (id.equals("1")) {
            try {
                String q = "insert into project_final_employee(ID_emp , Name_emp , Password_emp ) VALUES (?,?,?)";
                con = (Connection) DBconnectionProduct.getInstance();
                pst = con.prepareStatement(q);
                pst.setString(1, id);
                pst.setString(2, name);
                pst.setString(3, price);
                System.out.println("yes add");
                pst.execute();
            } catch (SQLException ex) {
                Logger.getLogger(Add_pro.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            System.out.println("Error A_Employee use id 1 ");
        }

    }

}
