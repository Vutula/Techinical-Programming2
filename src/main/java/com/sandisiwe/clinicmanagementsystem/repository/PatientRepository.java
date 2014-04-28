/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sandisiwe.clinicmanagementsystem.repository;

import com.sandisiwe.clinicmanagementsystem.domain.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author sandisiwe
 */

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long>{
    
}
