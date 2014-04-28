/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sandisiwe.clinicmanagementsystem.domain;

import com.sandisiwe.clinicmanagementsystem.domain.Employee.Builder;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author sandisiwe
 */
@Entity
public class Bill implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String dateSent;
    private double amountInsured;
    private String billStatus; 
    
    
    private Bill(Builder builder) {
        id = builder.id;
        dateSent = builder.dateSent;
        amountInsured = builder.amountInsured;
        billStatus = builder.billStatus;
        }

    public Bill() {
    }
    
    public static class Builder{
    private Long id;
    private String dateSent;
    private double amountInsured;
    private String billStatus;

        public Builder(String dateSent) {
            this.dateSent = dateSent;
           
        }
    
        public Builder id(Long value){
            this.id = value;
            return this;
        }
        
        public Builder amountInsured(double value){
            this.amountInsured = value;
            return this;
        }
        public Builder billStatus(String billStatus){
            this.billStatus = billStatus;
            return this;
        }
        
        public Bill build(){
            return new Bill(this);
        }

    
    
  }
    
    
    public Long getId() {
        return id;
    }
    
    public String getDateSent(){
        return dateSent;
    }
    public double getAmountInsured(){
        return amountInsured;
    }
    public String getBillStatus(){
        return billStatus;
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
        if (!(object instanceof Bill)) {
            return false;
        }
        Bill other = (Bill) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sandisiwe.clinicmanagementsystem.domain.Bill[ id=" + id + " ]";
    }
    

}
