/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;
import java.util.ArrayList;
/**
 *
 * @author بشاير
 */
public class patient {
private int ID;
private String name;
private String address;
private String mobile_phone_number;
private String email; 
private char type;
ArrayList <Service> services=new ArrayList<Service>();

    
   public patient(int ID, String name, String address, String mobile_phone_number, String email,char type,ArrayList <Service> services) {
      this.ID = ID;
      this.name = name;
      this.address = address;
      this.mobile_phone_number = mobile_phone_number;
      this.email = email;
      this.type = type;
      this.services = (ArrayList<Service>)services.clone();
     
   }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobile_phone_number() {
        return mobile_phone_number;
    }

    public void setMobile_phone_number(String mobile_phone_number) {
        this.mobile_phone_number = mobile_phone_number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }
    
    public ArrayList<Service> getServices(){
        return this.services;
    }

@Override
   public String toString() {
    String pa=" ";
    for(int i=0;i<this.services.size();i++){
    pa=pa+" "+this.services.get(i);
    }
   return "\nPatient's ID: "+this.ID+"\nthe name: "+this.name+"\nthe address: "+this.address
              +"\nhis/her phone number is: "+this.mobile_phone_number+"\nhis/her email is: "+this.email+"\nhis/her type is: "+this.type+
           "the service: "+pa;
   }







   
}
