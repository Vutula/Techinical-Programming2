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
public class Payment implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private double payAmount;
    private String paymentDate;
    private String payMethod;
    
    private Payment(Builder builder){
        
        id = builder.id;
        payAmount = builder.payAmount;
        paymentDate = builder.paymentDate;
        payMethod = builder.payMethod;
    }
    
    private Payment(){
        
    }
    
    public static class Builder{
    
    private Long id;
    private double payAmount;
    private String paymentDate;
    private String payMethod;
    
    public Builder id(Long value) {
            id = value;
            return this;
        }
    
    public Builder payAmount(double value){
        payAmount = value;
        return this;
        
    }
    
    public Builder paymentDate(String value){
        paymentDate = value;
        return this;
        
    }
    
    public Builder payMethod(String value){
        payMethod = value;
        return this;
        
    }
               
 }
    public Long getId() {
        return id;
    }
    
    public double getPayAmount(){
        return payAmount;
    }
    
    public String getPaymentDate(){
        return paymentDate;
    }
    
     public String getPayMethod(){
        return payMethod;
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
        if (!(object instanceof Payment)) {
            return false;
        }
        Payment other = (Payment) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sandisiwe.clinicmanagementsystem.domain.Payment[ id=" + id + " ]";
    }
    
}
