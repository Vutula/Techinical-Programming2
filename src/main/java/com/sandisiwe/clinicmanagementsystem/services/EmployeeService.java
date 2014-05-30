/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sandisiwe.clinicmanagementsystem.services;

import com.sandisiwe.clinicmanagementsystem.domain.Employee;
import com.sandisiwe.clinicmanagementsystem.services.Impl.Services;
import java.util.List;

/**
 *
 * @author sandisiwe
 */
public interface EmployeeService{
    public List<Employee> getEmployee();
    public Employee getEmployeeByName(String name);

    public List<Employee> findAll();

    public void persist(Employee employee);

    public void merge(Employee employee);
}
