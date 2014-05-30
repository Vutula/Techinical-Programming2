/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sandisiwe.clinicmanagementsystem.services;

import com.sandisiwe.clinicmanagementsystem.domain.Administrator;
import java.util.List;

/**
 *
 * @author sandisiwe
 */
public interface AdminLoginService {
    
    public List<Administrator> getAuthentication();

    public void persist(Administrator administrator);

    public void merge(Administrator employee);
}
