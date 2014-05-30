/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sandisiwe.clinicmanagementsystem.domain;

import java.io.Serializable;
import java.sql.Timestamp;
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
public class Operation implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Date operationDate;
    private Timestamp operationTime;
    
    private Operation(Builder builder){
        
        id = builder.id;
        operationDate = builder.operationDate;
        operationTime = builder.operationTime;
        
    }
    
    private Operation(){
        
    }
    
    public static class Builder{
        
    private Long id;
    private Date operationDate;
    private Timestamp operationTime;
    
    public Builder id(Long value) {
            id = value;
            return this;
        }
    
    public Builder operationDate(Date value) {
            operationDate = value;
            return this;
        }
    
    public Builder operationTime(Timestamp value) {
            operationTime = value;
            return this;
        }
    
    }

    public Long getId() {
        return id;
    }
    
    public Date getOperationDate(){
        return operationDate;
    }
    
    public Timestamp getOperationTime(){
        return operationTime;
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
        if (!(object instanceof Operation)) {
            return false;
        }
        Operation other = (Operation) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sandisiwe.clinicmanagementsystem.domain.Operation[ id=" + id + " ]";
    }
    
}
