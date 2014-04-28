/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sandisiwe.clinicmanagementsystem.domain;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
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
public class Employee implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    
    @Column(unique = true)
    private String email;
    
    @Embedded
    private Contact contact;
    private Doctor doctor;
    private Nurse nurse;
    private Administrator admin;
    private Receptionist receptionist;
    
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "employee_id")
    List<Doctor> doctors;
    
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "employee_id")
    List<Nurse> nurses;
    
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "employee_id")
    List<Receptionist> receptionists;
    
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "employee_id")
    List<Administrator> admins;
    
    private Employee() {
        
    }
     
    public static class Builder {
        
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private Contact contact;
    List<Doctor> doctors; 
    List<Nurse> nurse;
    List<Receptionist> receptionists;
    List<Administrator> admins;
    
    
    public Employee build(){
            return new Employee();
        }
    
     public Builder id(Long value) {
            id = value;
            return this;
    }
    
    public Builder firstName(String value) {
        firstName = value;
        return this;
    }
    
    public Builder lastName(String value) {
            lastName = value;
            return this;
        }
    
    public Builder contact(Contact value) {
            contact = value;
            return this;
        }
    
     public Builder(String email) {
            this.email = email;
        }
    
    public List<Doctor> getDoctors() {
        
        return doctors;   
    }
    
    public List<Nurse> getNurse() {
        
        return nurse;
    }
    
    public List<Receptionist> getReceptionistName() {
        
        return receptionists;
    }
    
    public List<Administrator> getAdministrator() {
        
        return admins;
    }
    
    public String getEmail() {
        return email;
    }

    public Long getId() {
        return id;
    }
    
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
        if (!(object instanceof Employee)) {
            return false;
        }
        Employee other = (Employee) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sandisiwe.clinicmanagementsystem.domain.Employee[ id=" + id + " ]";
    }
    
}
