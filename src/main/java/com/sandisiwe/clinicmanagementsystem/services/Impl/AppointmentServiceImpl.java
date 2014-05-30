/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sandisiwe.clinicmanagementsystem.services.Impl;

import com.sandisiwe.clinicmanagementsystem.domain.Administrator;
import com.sandisiwe.clinicmanagementsystem.domain.Appointment;
import com.sandisiwe.clinicmanagementsystem.repository.AppointmentRepository;
import com.sandisiwe.clinicmanagementsystem.services.AppointmentService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author sandisiwe
 */
@Service
public class AppointmentServiceImpl implements AppointmentService {
    
    @Autowired
    private AppointmentRepository appointmentRepository;
    
    
    @Override
    public List<Appointment> getAppointmentMade() {
        return appointmentRepository.findAll();
        }

    @Override
    public void persist(Administrator administrator) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void merge(Appointment appointment) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
