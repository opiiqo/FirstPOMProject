/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.service;

import com.mycompany.dao.Student;
import junit.framework.TestCase;

/**
 *
 * @author W208412665
 */
public class StudentManagerTest extends TestCase{
    
    public StudentManagerTest(String name){
        super(name);
        
    }
    
    public void testAddStudent(){
        Student s = new Student("David",22);
        StudentManagerInterface smi = new StudentManager();
        int result = smi.addStudent(s);
        assertEquals(0, result);
        
    }
    
}
