/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dao;

import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author W208412665
 */
public class Student {
    
    private String lastname;
    private String firstname;
    private String DoB;
     
    @Autowired
    private Address address;
    private Grade grade;
 
    public String getLastName(){
        return lastname;
    }
    public void setLastName(String lastname){
        this.lastname = lastname;
    }
    public String getFirstName(){
        return firstname;
    }
    public void setFirstName(String FirstName){
        this.firstname = firstname;
    }
    public String getDoB(){
        return DoB;
    }
    public void setDob(String DoB){
        this.DoB = DoB;
    }
    
    public Address getAddress() {
		return address;
    }
    public void setAddress(Address address) {
		this.address = address;
    }
   
    public Grade getGrade() {
		return grade;
    }
    public void setGrade(Grade grade) {
		this.grade = grade;
    }
    
    
    
}