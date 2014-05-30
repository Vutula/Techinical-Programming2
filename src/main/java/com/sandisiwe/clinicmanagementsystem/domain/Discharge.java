/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sandisiwe.clinicmanagementsystem.domain;

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
public class Discharge implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String dischargeDate;
    private String dischargeTime;

    public Discharge() {
    }
    
    private Discharge(Builder builder){
        
        id = builder.id;
        dischargeDate = builder.dischargeDate;
        dischargeTime = builder.dischargeTime;
        
    }
    
    
    public static class Builder{
        
    private Long id;
    private String dischargeDate;
    private String dischargeTime;
    
    public Builder id(Long value) {
            id = value;
            return this;
        } 
    
     public Builder dischargeDate(String value) {
            dischargeDate = value;
            return this;
        }
     
     public Builder dischargeTime(String value) {
            dischargeTime = value;
            return this;
        }
        
    }

    public Long getId() {
        return id;
    }
    
    public String getDischargeDate(){
        return dischargeDate;
    }
    
    public String getdischargeTime(){
        return dischargeTime;
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
        if (!(object instanceof Discharge)) {
            return false;
        }
        Discharge other = (Discharge) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sandisiwe.clinicmanagementsystem.domain.Discharge[ id=" + id + " ]";
    }
    
}
