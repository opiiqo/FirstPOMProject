/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dao;

/**
 *
 * @author W208412665
 */
public class Student {
    
    private String name;
    private int age;
    
     public Student(String name, int age) {
         
        this.name   = name;
        this.age    = age;
  
    }

    @Override
    public String toString() {
        return name+" "+age; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
