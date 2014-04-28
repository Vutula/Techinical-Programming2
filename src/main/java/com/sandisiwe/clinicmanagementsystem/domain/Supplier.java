/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sandisiwe.clinicmanagementsystem.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author sandisiwe
 */
@Entity
public class Supplier implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String supplierName;
    private String phone;
    private String contractPersonal;
    
    private Supplier(Builder builder){
        
        id = builder.id;
        supplierName = builder.supplierName;
        phone = builder.phone;
        contractPersonal = builder.contractPersonal;
        
    }
    
    private Supplier(){
        
    }
    
    public static class Builder{
        
    private Long id;
    private String supplierName;
    private String phone;
    private String contractPersonal;
    
    public Builder id(Long value) {
            id = value;
            return this;
        }
    
     public Builder supplierName(String value) {
            supplierName = value;
            return this;
        }
     
      public Builder phone(String value) {
            phone = value;
            return this;
        }
      
       public Builder contractPersonal(String value) {
            contractPersonal = value;
            return this;
        }
    }

    public Long getId() {
        return id;
    }
    
    public String getSupplierName() {
        return supplierName;
    }
    
    public String getPhone() {
        return phone;
    }
    
    public String getContractPersonal() {
        return contractPersonal;
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
        if (!(object instanceof Supplier)) {
            return false;
        }
        Supplier other = (Supplier) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sandisiwe.clinicmanagementsystem.domain.Supplier[ id=" + id + " ]";
    }
    
}
