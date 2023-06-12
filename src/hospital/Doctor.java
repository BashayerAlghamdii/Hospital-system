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
public class Doctor extends Employeeinfo{
    private String rank; 
    private String specialty;
    
    
  
    public Doctor(String name, String address, String mobile_phone_number, String email,double salary,String rank, String specialty, int ID) {
        super(name,address, mobile_phone_number,email,salary,ID);
        this.rank = rank;
        this.specialty = specialty;
         }


    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }
    
    
    
    
}
