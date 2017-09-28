/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.college;
import org.joda.time.DateTime;
/**
 *
 * @author daire
 */
public class Student {

public String name;
private String username="";
private int ID,age;
private DateTime dob;

    public Student(String name,int ID, DateTime dob){
        this.name=name;
      
        this.ID=ID;
        this.dob=dob;
        setAge();
    }
    public int getAge()
    {
        //when date time methods done change
        return this.age;
      
    }
    
    public int getID()
    {
        return this.ID;
      
    }
     
     public String getName()
    {
        return this.name;
      
    }
    
     public String getUsername()
    {
        return this.username;
      
    }  
        public DateTime getDOB()
    {
        return this.dob;
      
    }
        
        private void setUsername() {
            this.username = this.name+"."+Integer.toString(this.age);
        }
        
        public void setName(String new_name) {
            this.name = new_name;
            this.setUsername(); //regenerates new username (due to new name)
        }
  
          public void setDOB(String new_dob) {
            this.dob = new DateTime(new_dob);
            this.setAge();//possible new age so it is recalculated
        }
        
        private void setAge(){
           
            this.age=new DateTime().getYear()-this.dob.getYear();
            this.setUsername();
        }
          
          public void setID(int new_id) {
              this.ID=new_id;
          }
             
         
}