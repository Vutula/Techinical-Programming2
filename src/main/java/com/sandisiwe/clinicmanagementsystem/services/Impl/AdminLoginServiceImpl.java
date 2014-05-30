/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sandisiwe.clinicmanagementsystem.services.Impl;

import com.sandisiwe.clinicmanagementsystem.domain.Administrator;
import com.sandisiwe.clinicmanagementsystem.domain.Admission;
import com.sandisiwe.clinicmanagementsystem.repository.AdmissionRepository;
import com.sandisiwe.clinicmanagementsystem.services.AdmissionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author sandisiwe
 */
@Service
public class AdminLoginServiceImpl implements AdmissionService {
    
    @Autowired
    private AdmissionRepository admissionRepository;
    
    @Override
    public List<Admission> getAdmitted(){
        return admissionRepository.findAll();
    }

    @Override
    public void persist(Administrator administrator) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void merge(Administrator employee) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
