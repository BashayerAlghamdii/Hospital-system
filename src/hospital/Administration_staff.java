/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

/**
 *
 * @author بشاير
 */
public class Administration_staff extends Employeeinfo{
 
 private String position; 
 

  public Administration_staff(String position,String name,String address,String mobile_phone_number, String email, double salary,int ID) {
   super(name,address, mobile_phone_number,email,salary,ID);
   this.position = position;
  }


    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
 
    
    
    
    
    
}
