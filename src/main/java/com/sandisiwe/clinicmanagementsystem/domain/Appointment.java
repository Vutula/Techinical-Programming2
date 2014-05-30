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
import javax.persistence.Temporal;

/**
 *
 * @author sandisiwe
 */
@Entity
public class Appointment implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Date appointmentDate;
    private Timestamp appointmentTime;
    private int duration;
    private String reason;
    
    private Appointment(Builder builder){
        
        appointmentDate = builder.appointmentDate;
        appointmentTime = builder.appointmentTime;
        duration = builder.duration;
        reason = builder.reason;
        
    }
    
    public Appointment() {
        
    }
    
    public static class Builder {
       
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long id;
        private Date appointmentDate;
        private Timestamp appointmentTime;
        private int duration;
        private String reason;
        
        public Builder id(Long value){
            this.id = value;
            return this;
        }
        
        public Builder date(Date value){
            this.appointmentDate = value;
            return this;
        }
        
        public Builder time(Timestamp value){
            this.appointmentTime = value;
            return this;
        }
        
        public Builder duration(int value){
            this.duration = value;
            return this;
        }
        
        public Builder reason(String value){
            this.reason = value;
            return this;
        }
    }

    public Long getId() {
        return id;
    }
    
    public Date getDate(){
        return appointmentDate;
    }
    
    
    public Timestamp getTime(){
        return appointmentTime;
    }

    
    public int getDuration(){
        return duration;
    }
    
    
    public String getReason(){
        return reason;
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
        if (!(object instanceof Appointment)) {
            return false;
        }
        Appointment other = (Appointment) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sandisiwe.clinicmanagementsystem.domain.Appointment[ id=" + id + " ]";
    }
    
}
