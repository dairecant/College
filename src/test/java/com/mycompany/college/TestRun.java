/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.college;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 *
 * @author Dáire
 */
public class TestRun {
    
    public static void main(String args[]){
      Result r = JUnitCore.runClasses(StudentTest.class);
      
      for (Failure fail : r.getFailures()){
          System.out.println(fail.toString());
      }
      
                System.out.println(r.wasSuccessful());

    }
    
}
