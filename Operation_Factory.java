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

public class Operation_Factory {
    
    public Operation get_Operation(String shapeType){
        
    if(shapeType == null){
       return null;
    }
    if(shapeType.equalsIgnoreCase("Add")){
    return new Add_pro();
    } else if(shapeType.equalsIgnoreCase("Delete")){
    return new Delete_pro();
    
    } else if(shapeType.equalsIgnoreCase("Update")){
    return new Update_pro();
    }
  
    return null;
    }
    
    }
