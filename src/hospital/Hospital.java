/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author بشاير
 */
public class Hospital {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input= new Scanner(System.in);
        //we are going to make an object to enter the data... 
        Administration_staff adminstaff1= new Administration_staff("organising data","Ali","alsharayaa","0509876124","ali33@gmail.com",8900,1119603966);
        //another object
        Administration_staff adminstaff2=new Administration_staff("analayzing data","Layla","khaldeyah","0555784311","Lay999@hotmail.com",11755.95,1123798053);
        //third object
         Administration_staff adminstaff3=new Administration_staff("Acountant","Yara","alsharayaa","0557883346","yyy65@gmail.com",9766,1007888943); 
         //here we are going to make an array of objects to start reading the adminstaff...
         Administration_staff[] adm=new Administration_staff[]{adminstaff1,adminstaff2,adminstaff3};
      // we are going to make an object to enter the doctors data...
        Doctor D1= new Doctor("Ahmad","khadraa","0500007777","98hmm@hotmail.com",14000,"Junior Brain Surgeon","Brain",1134446789);
        /////
        Doctor D2= new Doctor("Bushra","alsharayaa","0555343432","boshsol@gmail.com",16430.33,"Senior Physical Therapy","bones",1111198765);
        // we are going to make an objects from array list to add the data
        ArrayList<Administration_staff> admin=new ArrayList<Administration_staff>(); 
        admin.add(adminstaff1);
        admin.add(adminstaff2);
        admin.add(adminstaff3);
        ArrayList<Doctor> doc=new ArrayList<Doctor>();
        doc.add(D1);
        doc.add(D2);
        ///another objects for services..
        Service s1=new Service(1432,"blood analysis",470);
        Service s2=new Service(2465,"Orthopedic x-rays",250.70);
        Service s3=new Service(3333,"Dental Clinic",250);
        ////
        ArrayList<Service> services=new ArrayList<Service>();// this one for case 3..
        ArrayList<Service> servicee=new ArrayList<Service>();
        servicee.add(s1);
        servicee.add(s2);
        servicee.add(s3);
        //at this step we are going to make an object of patients to enter the data we want..
        ArrayList<patient> pat=new ArrayList<patient>();
        
        ///now we are going to make the user enter the adminstaffs name if it is exist and then the program will continue.
        int repeat=1;
        int selection;
        int t=1;
        int choice;
        int id_number_p;
        int id_number_s;
        Administration_staff ad=null;
       
        //making do loop to show the menu every time..
        do{
           while(repeat!=0){
        System.out.println("Please Enter Your Name: ");   
        String name=input.nextLine();
          selection=-1;
        for(int i=0;i<adm.length;i++){
         if(adm[i].getName().equals(name)){ 
           selection=t;
           break;}}
         if(selection==-1){
          System.out.println("The name is not found! "); } 
         else
           repeat=0;
        }
            
             System.out.println("-*HOSPITAL SYSTEM*-\n1-Add a doctor"
                + "\n2-Add a service\n3-Add a patient\n4-Print all doctors information"
             +"\n5-Print all patients information\n6-Display specific doctor data\n7-Display specific patient data\n8-Print a specific patient’s bill\n9-Exit "); 
            System.out.println("Enter your choice:");
        choice= input.nextInt();
        switch(choice){
            case 1: 
                //to enter the data we want..
                System.out.println("enter the ID:"); 
                int id=input.nextInt();
                System.out.println("enter the name:");
                String name=input.next();     
                System.out.println("enter the address:");
                String address=input.next();
                System.out.println("enter the phone number:");
                String phone=input.next();
                System.out.println("enter the email:");
                String email=input.next();
                System.out.println("enter the salary:");
                double salary=input.nextDouble();
                System.out.println("enter the rank:");
                String rank=input.next();
                System.out.println("enter the Specialty:");
                String special=input.next();
                
                Doctor doct=new Doctor(name,address,phone,email,salary,rank,special,id);
                doc.add(doct); //adding the data to the list
                break;
            case 2:   System.out.println("enter the service name:");
                      String n=input.next();
                      System.out.println("enter the ID:");
                      int idd=input.nextInt();
                      System.out.println("enter the service price:");
                      double price=input.nextDouble();
                      Service serv=new Service(idd,n,price);
                      servicee.add(serv);//adding the data to the list
                break;
            
            case 3: 
                int iid;
                try{ //here we are going to to make an error message if the user enterd stored id..
                System.out.println("enter the ID:"); 
                iid=input.nextInt();
                for(int i=0;i<pat.size();i++){
                    if(pat.get(i).getID()==iid)
                     throw new DuplicatePateientException("\nInvalid patient ID.. \nThis patient ID is already used!!");
                } //entering the data
                System.out.println("enter the name:");
                String nam=input.next();     
                System.out.println("enter the address:");
                String add=input.next();
                System.out.println("enter the phone number:");
                String phonen=input.next();
                System.out.println("enter the email:");
                String emaill=input.next();
                System.out.println("enter the Type:");
                char type= input.next().charAt(0);
                    System.out.println("Here are the services: "+servicee); //show the data to the user to choose
                    System.out.println("enter the service number you want to add: ");
                    int nums=input.nextInt();
                for(int i=0;i<nums;i++){
                    System.out.println("enter the service ID:");
                    id_number_s=input.nextInt();
                    boolean find=false;
                    Service v=null;
                    for(int j=0;j<servicee.size();j++){
                        if(id_number_s==((Service)servicee.get(j)).getID()){
                         services.add(servicee.get(j));
                         find=true;
                         break;
                        }
                    }
                    if(!find){System.out.println("the ID service's not available! "); i--;}
                }
                pat.add(new patient(iid,nam,add,phonen,emaill,type,services));
                services.clear();
                } catch(DuplicatePateientException massege){
                    System.out.println(massege);}      
                break;
                //at this step we are going to show all the data we entered and the already exist..
            case 4:
                for(int i=0;i<doc.size();i++){
                    System.out.println("the doctor ID is: "+doc.get(i).getID()+"\n");   
                    System.out.println("his/her name is: "+doc.get(i).getName()+"\n");
                    System.out.println("his/her phone is: "+doc.get(i).getMobile_phone_number()+"\n");
                    System.out.println("his/her email is: "+doc.get(i).getEmail()+"\n");
                    System.out.println("his/her salary is: "+doc.get(i).getSalary()+"\n");
                    System.out.println("his/her Specialty is: "+doc.get(i).getSpecialty()+"\n");
                    System.out.println("his/her rank is: "+doc.get(i).getRank()+"\n");
                    System.out.println("****************************************");
                }
                break;
            case 5: //to show the patient information..
                for(int i=0;i<pat.size();i++){
                    System.out.println("the patient ID is: "+pat.get(i).getID()+"\n");   
                    System.out.println("his/her name is: "+pat.get(i).getName()+"\n");
                    System.out.println("his/her phone is: "+pat.get(i).getMobile_phone_number()+"\n");
                    System.out.println("his/her email is: "+pat.get(i).getEmail()+"\n"); 
                    System.out.println("his/her services: "+pat.get(i).getServices()+"\n"); 
                    System.out.println("****************************************");
                }
                break;
            case 6:
                     System.out.println("Enter ID number of the doctor:"); //Select specific doctor
                          int idnum=input.nextInt();
                           for(int i=0;i<doc.size();i++){
                            if(idnum==doc.get(i).getID()){
                            System.out.println("The doctor information: "+doc.get(i).getID()+"\n"+doc.get(i).getName()+"\n"
                             +doc.get(i).getMobile_phone_number()+"\n"+doc.get(i).getEmail()+"\n"+doc.get(i).getSalary()+"\n"
                             +doc.get(i).getSpecialty()+"\n"+doc.get(i).getRank()+"\n");}} break;
                            
            case 7: 
                     System.out.println("Enter ID number of the patient:"); //Select specific patient
                          int id_num=input.nextInt();
                           for(int i=0;i<pat.size();i++){
                            if(id_num==pat.get(i).getID()){
                            System.out.println("The patient information: "+pat.get(i).getID()+"\n"+pat.get(i).getName()+"\n"+
                            pat.get(i).getMobile_phone_number()+"\n"+pat.get(i).getEmail()+"\n" );
                            }} break;
            case 8: 
                    System.out.println("Enter ID number of the patient:"); //Select specific patient's bill.
                          id_number_p=input.nextInt();
                          patient pp=null;
                          double dis=0.0;
                           for(int i=0;i<pat.size();i++){
                             pp=pat.get(i);
                             if(pp.getID()==id_number_p){
                            if(pp.getType()=='A'){
                                dis=0.25;} }}
                           double total_price=0.0;  
                           ArrayList<Service> s=new ArrayList<Service>();
                           s=pp.getServices();
                           for(int j=0;j<s.size();j++){
                            total_price+=s.get(j).getPrice();
                           }
                          double total_discount=0.0;
                          if(dis==0.25){
                           total_discount=total_price*(1.0- dis);} //caluclatoring the 25% off disscount..
                          else {total_discount=total_price; } 
                          System.out.println("The patient's total bill who has the id: "+id_number_p+" is "+total_price);
                          if(pp.getType()=='A'){
                          System.out.println("bill after 25% discount for the patient: "+total_discount);}
                           break;
            case 9: System.out.println("Exit");    break;
            default:System.out.println("<<<<<Invalid choice>>>>>"); break;       
        }
        }while(choice!=9); 
        
    }
    
}
