/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Management_Model;

/**
 *
 * @author Mahran
 */
public class Test {
    public static void main(String[] args) {
Operation_Factory shapeFactory = new Operation_Factory();

// Maneg op1 = shapeFactory.get_Operation("ADD");
//   op1.Operation("1", "mahran", "55");  
//   
//   Maneg op3 = shapeFactory.get_Operation("ADD");
//   op3.Operation("3", "sal", "44");  
   
//   Maneg op4 = shapeFactory.get_Operation("Update");
//      op4.Operation("1", "hhhh", "66");  
   
//Maneg op2 = shapeFactory.get_Operation("Delete");
//   op2.Operation("3");   
   Operation op2 = shapeFactory.get_Operation("Search");
       op2.Operation("2");
     
       
       
   
  
}
}
