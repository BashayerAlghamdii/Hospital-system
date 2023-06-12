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
public class Service{
private int ID;
private String name;
private double price;


 public Service(int ID,String name,double price) {
      this.ID = ID;
      this.name = name;
      this.price = price;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

  

@Override 
   public String toString(){
       return "\nThe service ID: "+this.ID+"\nThe service name: "+this.name+"\nThe price: "+this.price+"\n---------";
   }





}
