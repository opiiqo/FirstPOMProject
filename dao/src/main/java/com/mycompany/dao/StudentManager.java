/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dao;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author MacPro2015
 */
public class StudentManager {
    
    public static void main(String args[]) {
        
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("helloworld-config.xml");
        Student student = (Student) context.getBean("student");
	System.out.println(student.getAddress());
        System.out.println(student.getGrade());
        context.close();
    
    }
}
