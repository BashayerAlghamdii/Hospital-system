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
public class Employeeinfo {
private int ID;
private String name;
private String address;
private String mobile_phone_number;
private String email;
private double salary;


public Employeeinfo(String name,String address,String mobile_phone_number, String email, double salary,int ID){
this.ID=ID;
this.name = name;
this.address = address;
this.mobile_phone_number =mobile_phone_number;
this.email = email;
this.salary = salary;
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
 

    
}
