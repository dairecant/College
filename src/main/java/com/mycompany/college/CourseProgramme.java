/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.college;
import java.util.ArrayList;
import org.joda.time.DateTime;

/**
 *
 * @author daire
 */
public class CourseProgramme {
    public String course_name;
    public DateTime start;
    public DateTime end;
    public ArrayList<Module> modules= new ArrayList();
    
    public CourseProgramme(String course_name,DateTime start,DateTime end) {
        this.course_name=course_name;
        this.start=start;
        this.end=end;
        
    }
    
    public String getCourseName(){
        
        return this.course_name;
    }
    
    public ArrayList<Module> getModules(){
        return this.modules;
    }
    public DateTime getStartDate(){
        return this.start;
    }
    
     public DateTime getFinishDate(){
        return this.end;
    }
     
     // Adds module to course list
    public void addModule(Module m) { 
        
        this.modules.add(m);  
    }
    
    public void addModuleList(ArrayList<Module> m_l){
        
        this.modules.addAll(m_l);
    }
    
    public void setCourseName(String new_name){
        
        this.course_name=new_name;
    }
    
    public void setStartDate(DateTime s){
        
        this.start=s;
    }
    
    public void setFinishDate(DateTime e){
        
        this.end=e;
    }
}