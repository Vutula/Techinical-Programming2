/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sandisiwe.clinicmanagementsystem.services;

import com.sandisiwe.clinicmanagementsystem.domain.Administrator;
import com.sandisiwe.clinicmanagementsystem.domain.Appointment;
import java.util.List;

/**
 *
 * @author sandisiwe
 */
public interface AppointmentService {
    public List<Appointment> getAppointmentMade();

    public void persist(Administrator administrator);

    public void merge(Appointment appointment);
}
