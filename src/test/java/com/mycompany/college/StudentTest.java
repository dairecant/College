/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.college;

import org.joda.time.DateTime;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Dáire
 */
public class StudentTest {
    Student a = new Student("John",14439308,new DateTime("1996-02-28"));
    public StudentTest() {
        
        
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void testUserName() {
     
         assertEquals(a.getUsername(),"John.21"); //tests username has been created correctly
                                                  // on instantiation of student, age is calculated using DOB
                                                  //username created by concatenating name.age
         
         assertEquals(a.getAge(),21); //tests age get
         assertEquals(a.getDOB(),new DateTime("1996-02-28")); //tests date of birth get
         assertEquals(a.getID(),14439308); //tests username get
         
         //Change student parameters using set methods, methods tested using assertEquals() for get methods
         a.setID(1111111); //changes student's id no.
         assertEquals(a.getID(),1111111); //checks student's ID has been changed
         
         a.setName("Jack");//changes name of student
         assertEquals(a.getName(),"Jack");//checks that name has been changed
         assertEquals(a.getUsername(),"Jack.21"); //checks that username  automatically changed
         
         a.setDOB("1995-02-28");
         assertEquals(a.getDOB(),new DateTime("1995-02-28")); //checks age has been changed
         assertEquals(a.getAge(),22); //checks age has been changed
         assertEquals(a.getUsername(),"Jack.22"); //checks username has been changed
         
         
         
         
     }
}
