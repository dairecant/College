/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.college;
import java.util.ArrayList;
/**
 *
 * @author daire
 */
public class Module {
    public String mod_name;
    public String mod_code;
    private ArrayList<Student> student_list= new ArrayList();
    
public Module(String mod_name,String mod_code) {
    
    this.mod_code=mod_code;
    this.mod_name=mod_name;
    
}

public String getModuleName() {

    return this.mod_name;
}

public String getModuleCode() {

    return this.mod_code;
}


public ArrayList<Student> getStudents(){
    
    return this.student_list;
}

public void addStudent(Student student) {
    
    this.student_list.add(student);
}
}