/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sandisiwe.clinicmanagementsystem.domain;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

/**
 *
 * @author sandisiwe
 */
@Entity
public class Department implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String departmentName;
    private String treatment;
    
    //@OneToMany(cascade = CascadeType.ALL)
    //@JoinColumn(name = "department_id")
    
    private  Department(Builder builder) {
        
        id = builder.id;
        departmentName = builder.departmentName;
        treatment = builder.treatment;
        
    }
    
    private  Department(){
    
    }
    
    public static class Builder{
        
        private Long id;
        private String departmentName;
        private String treatment;
        
        public Builder id(Long value) {
            id = value;
            return this;
        }
        
        public Builder departmentName(String value) {
            departmentName = value;
            return this;
        }
        
        public Builder treatment(String value) {
            treatment = value;
            return this;
        }
    }
    public Long getId() {
        return id;
    }
    
    public String getDepartmentName() {
        return departmentName;
    }
    
    public String getTreatment() {
        return treatment;
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
        if (!(object instanceof Department)) {
            return false;
        }
        Department other = (Department) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sandisiwe.clinicmanagementsystem.domain.Department[ id=" + id + " ]";
    }
    
}
