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
public class Operation implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String operationDate;
    private String operationTime;
    
    private Operation(Builder builder){
        
        id = builder.id;
        operationDate = builder.operationDate;
        operationTime = builder.operationTime;
        
    }
    
    private Operation(){
        
    }
    
    public static class Builder{
        
    private Long id;
    private String operationDate;
    private String operationTime;
    
    public Builder id(Long value) {
            id = value;
            return this;
        }
    
    public Builder operationDate(String value) {
            operationDate = value;
            return this;
        }
    
    public Builder operationTime(String value) {
            operationTime = value;
            return this;
        }
    
    }

    public Long getId() {
        return id;
    }
    
    public String getOperationDate(){
        return operationDate;
    }
    
    public String getOperationTime(){
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
