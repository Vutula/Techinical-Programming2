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
public class PrescriptionMedicine implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long medicineNumber;
    private double quantity;
     
    private PrescriptionMedicine(Builder builder){
        
        id = builder.id;
        medicineNumber = builder.medicineNumber;
        quantity = builder.quantity;
        
    }
    
    private PrescriptionMedicine(){
        
    }
    
    public static class Builder{
        
    private Long id;
    private Long medicineNumber;
    private double quantity;
    
    public Builder id(Long value) {
            id = value;
            return this;
        }
    
    public Builder medicineNumber(Long value){
        medicineNumber = value;
        return this;
    }
    
    public Builder quantity(double value){
        quantity = value;
        return this;
    }
    
    }
    public Long getMedicineNumber() {
        return medicineNumber;
    }
    
    public double getQuantity() {
        return quantity;
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
        if (!(object instanceof PrescriptionMedicine)) {
            return false;
        }
        PrescriptionMedicine other = (PrescriptionMedicine) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sandisiwe.clinicmanagementsystem.domain.PrescriptionMedicine[ id=" + id + " ]";
    }
    
}
