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
public class Receptionist implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String receptionistName;
    
    private Receptionist(Builder builder){
        
        id = builder.id;
        receptionistName = builder.receptionistName;
    }
    
    private Receptionist(){
        
    }
    
    public static class Builder{
    private Long id;
    private String receptionistName;
    
    public Builder id(Long value) {
            id = value;
            return this;
        }
    
    public Builder receptionistName(String value) {
            receptionistName = value;
            return this;
        }
    }

    public Long getId() {
        return id;
    }

    public String getReceptionistName() {
        return receptionistName;
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
        if (!(object instanceof Receptionist)) {
            return false;
        }
        Receptionist other = (Receptionist) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sandisiwe.clinicmanagementsystem.domain.Receptionist[ id=" + id + " ]";
    }
    
}
