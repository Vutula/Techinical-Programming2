/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sandisiwe.clinicmanagementsystem.domain;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
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
public class Admission implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String admissionDate;
    private String admissionTime;
    
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "petient_id")
    List<Patient> patients;
    
    private Admission(Builder builder){
        
        id = builder.id;
        admissionDate = builder.admissionDate;
        admissionTime = builder.admissionTime;
        patients = builder.patients;
        
    }
    
    private Admission(){
        
    }
    
    public static class Builder{
        
    private Long id;
    private String admissionDate;
    private String admissionTime;
    List<Patient> patients;
    
     public Builder id(Long value) {
            id = value;
            return this;
        }
     
      public Builder admissionDate(String value) {
            admissionDate = value;
            return this;
        }
      
      public Builder admissionTime(String value) {
            admissionTime = value;
            return this;
        }
      
      public Builder patients(List<Patient> value) {
            patients = value;
            return this;
        }
        
      public Builder admission(Admission admission){
          id = admission.getId();
          admissionDate = admission.getAdmissionDate();
          admissionTime = admission.getAdmissionTime();
          patients = admission.getPatients();
          
          return this;
          
      }
    }

    public Long getId() {
        return id;
    }
    
    public String getAdmissionDate() {
        return admissionDate;
    }
    
    public String getAdmissionTime() {
        return admissionTime;
    }

    public List<Patient> getPatients() {
        return patients;
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
        if (!(object instanceof Admission)) {
            return false;
        }
        Admission other = (Admission) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sandisiwe.clinicmanagementsystem.domain.Admission[ id=" + id + " ]";
    }
    
}
