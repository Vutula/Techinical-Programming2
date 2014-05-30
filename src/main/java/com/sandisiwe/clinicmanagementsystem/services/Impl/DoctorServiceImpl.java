/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sandisiwe.clinicmanagementsystem.services.Impl;

import com.sandisiwe.clinicmanagementsystem.domain.Doctor;
import com.sandisiwe.clinicmanagementsystem.repository.DoctorRepository;
import com.sandisiwe.clinicmanagementsystem.services.DoctorService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author sandisiwe
 */
@Service
public class DoctorServiceImpl implements  DoctorService{
    
    @Autowired
    private DoctorRepository doctorRepository;
    
    @Override
    public List<Doctor> getDoctor(){
        return doctorRepository.findAll();
    }
}
