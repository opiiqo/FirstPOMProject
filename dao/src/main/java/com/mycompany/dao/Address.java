/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dao;

/**
 *
 * @author MacPro2015
 */
public class Address {
    
        private String street;
	private String zip;
        private String city;
        
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
        public String getCity(){
                return city;
        }
        public void setCity(){
            this.city = city;
        }
}
