/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sandisiwe.clinicmanagementsystem.domain;

import java.io.Serializable;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author sandisiwe
 */
@Embeddable
public class Doctor implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String doctorType;
    
    private Doctor(Builder builder){
        
        id = builder.id;
        doctorType = builder.doctorType;
        
    }
    
    private Doctor(){
        
    }
    
    public static class Builder{
        
        private Long id;
        private String doctorType;
        
        public Builder id(Long value){
            id = value;
            return this;
        }
        
        public Builder doctorType(String value){
            doctorType = value;
            return this;
        }
    }

    public Long getId() {
        return id;
    }

    public String getDoctorType() {
        return doctorType;
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
        if (!(object instanceof Doctor)) {
            return false;
        }
        Doctor other = (Doctor) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sandisiwe.clinicmanagementsystem.domain.Doctor[ id=" + id + " ]";
    }
    
}
