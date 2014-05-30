/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sandisiwe.clinicmanagementsystem.services.Impl;

import com.sandisiwe.clinicmanagementsystem.domain.Patient;
import com.sandisiwe.clinicmanagementsystem.repository.PatientRepository;
import com.sandisiwe.clinicmanagementsystem.services.TotalPatientService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author sandisiwe
 */
@Service
public class TotalPatientServiceImpl implements TotalPatientService{
    
    @Autowired
    private PatientRepository patientRepository;
    
    
    public  List<Patient> getTotalPetient(){
        return patientRepository.findAll();
    }

    @Override
    public List<Patient> getTotalPatient(String firstname) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object getTotalPatients() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
}
