/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sandisiwe.clinicmanagementsystem.presentation.rest;

import com.sandisiwe.clinicmanagementsystem.domain.Doctor;
import com.sandisiwe.clinicmanagementsystem.services.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author sandisiwe
 */
@Controller  // Annotation to make this class be detectable by the config as a controller
@RequestMapping(value = "api/doctor")
public class DoctorRestController {
    
    @Autowired
    private DoctorService doctorService;
    
     @RequestMapping(value = "create",method = RequestMethod.POST) // This the uri e.g http://localhost:8084/askweb/api/club/create
    @ResponseBody //Converts output or response to JSON String
    public String create(@RequestBody Doctor doctor) { // @RequestBody for converting incoming JSON call to Object
      //  doctorService.persist(Employee);
        
        System.out.println(" Create the Called ");
        return "Doctor Created";
    }
    
    @RequestMapping(value = "update",method = RequestMethod.PUT) //This the uri e.g http://localhost:8084/askweb/api/club/update
    @ResponseBody
    public String update(@RequestBody Doctor employee) {
        //doctorService.merge(Employee);
        System.out.println(" Update Called ");
        return "Doctor Update";
    }
    
}
