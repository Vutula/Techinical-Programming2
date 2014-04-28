/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sandisiwe.clinicmanagementsystem.domain;

import java.io.Serializable;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author sandisiwe
 */
@Entity
public class Patient implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstname;
    private String lastname;
    private String address;
    private String sex;
    private String city;
    
    @Embedded
    private Discharge discharge;
    
    private Patient(Builder builder){
        
        id = builder.id;
        firstname = builder.firstname;
        lastname = builder.lastname;
        sex = builder.sex;
        address = builder.address;
        discharge = builder.discharge;
        
        
    }
    
    private Patient(){
        
    }
    
    public static class Builder{
        
    private Long id;
    private String firstname;
    private String lastname;
    private String address;
    private String sex;
    private String city;
    private Discharge discharge;
    
    public Builder id(Long value){
        
        id = value;
        return this;
        
    }
    
    public Builder firstname(String value){
        
        firstname = value;
        return this;
        
    }
    
    public Builder lastname(String value){
        
        lastname = value;
        return this;
        
    }
    
    public Builder address(String value){
        
        address = value;
        return this;
        
    }
    
    public Builder sex(String value){
        
        sex = value;
        return this;
        
    }
    
    public Builder city(String value){
        
        city = value;
        return this;
        
    }
    
    public Builder discharge(Discharge value) {
            discharge = value;
            return this;
        }
    
    
 }

    public Long getId() {
        return id;
    }
    
    public String getFirstName(){
        return firstname;
    }
    
    public String getLastName(){
        return lastname;
    }
    
    public String getAddress(){
        return address;
    }
    
    public String getSex(){
        return sex;
    }
    
    public String getCity(){
        return city;
    }
    
    public Discharge getDischarge() {
        return discharge;
    }
    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Patient)) {
            return false;
        }
        Patient other = (Patient) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sandisiwe.clinicmanagementsystem.domain.Patient[ id=" + id + " ]";
    }
    
}
