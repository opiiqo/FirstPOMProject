/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.service;

import com.mycompany.dao.Student;
import com.mycompany.dao.imp.StudentManagerDao;



/**
 *
 * @author W208412665
 */
public class StudentManager implements StudentManagerInterface {
    
    public int addStudent(Student student){
       
        StudentManagerDao smd = new StudentManagerDao();
        smd.addStudent(student);
        try{
            smd.addStudent(student);
            return 0;
        }
        catch(Exception ex){
            return -1;
        }
    }

      
    }
    
   