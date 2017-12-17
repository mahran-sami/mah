/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Employees_Model;

/**
 *
 * @author Mahran
 */
public class Emp_Facade {

    private Employee a_Employee ;
    private Employee n_Employee ;

    
    
   public String id="1" , name , price ;
    
   
    
    
  public Emp_Facade() {
       a_Employee= new A_Employee();
       n_Employee= new N_Employee();
        
    }

    public void get_a_Employee() {
     a_Employee.Create_Emp(id, name, price); 
    }

    public void get_n_Employee() {
      n_Employee.Create_Emp(id, name, price); 
    }
    
  

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(String price) {
        this.price = price;
    }

   
}
