/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sandisiwe.clinicmanagementsystem.domain;

import com.sandisiwe.clinicmanagementsystem.domain.Employee.Builder;
import java.io.Serializable;
import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author sandisiwe
 */
@Embeddable
public class Administrator implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String username;
    private String password;
    
    private Administrator(Builder builder){
        id = builder.id;
        username = builder.username;
        password = builder.password;
        
        
    }
    
    public Administrator(){
        
    }
    
    public static class Builder{
    private Long id;
    private String username;
    private String password;
    
    
        public Builder id(Long value){
            this.id = value;
            return this;
        }
    
    public Builder username(String value){
        this.username = value;
        return this;
    }
    
    public Builder password(String value){
        this.password = value;
        return this;
    }
    
    public Administrator build(){
        return new Administrator(this);
    }
  }
    

    public Long getId() {
        return id;
    }
    
    public String getUsername(){
        return username;
    }
    
    public String getPassword(){
        return password;
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
        if (!(object instanceof Administrator)) {
            return false;
        }
        Administrator other = (Administrator) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sandisiwe.clinicmanagementsystem.domain.Administrator[ id=" + id + " ]";
    }
    
}
