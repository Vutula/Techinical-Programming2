/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sandisiwe.clinicmanagementsystem.presentation.rest;

import com.sandisiwe.clinicmanagementsystem.domain.Employee;
import com.sandisiwe.clinicmanagementsystem.services.EmployeeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author sandisiwe
 */
@Controller  // Annotation to make this class be detectable by the config as a controller
@RequestMapping(value = "api/employee") // This the url e.g http://localhost:8084/askweb/api/club
public class EmployeeRestController {
    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(value = "create",method = RequestMethod.POST) // This the uri e.g http://localhost:8084/askweb/api/club/create
    @ResponseBody //Converts output or response to JSON String
    public String create(@RequestBody Employee employee) { // @RequestBody for converting incoming JSON call to Object
       employeeService.persist(employee);
        
        System.out.println(" Create the Called ");
        return "Employee Created";
    }
@RequestMapping(value = "update",method = RequestMethod.PUT) //This the uri e.g http://localhost:8084/askweb/api/club/update
    @ResponseBody
    public String update(@RequestBody Employee employee) {
        employeeService.merge(employee);
        System.out.println(" Update Called ");
        return "Employee Update";
    }

    @RequestMapping(value = "id/{id}",method = RequestMethod.GET) //http://localhost:8084/askweb/api/club/1234
    @ResponseBody
    public Employee getEmplyee(@PathVariable Long id) { //@PathVariable used to bind the id value
        
        System.out.println(" ID called ");
        return employeeService.getEmployeeByName(null);
    }

    @RequestMapping(value = "emplyees",method = RequestMethod.GET) // Always Put HTTP Method
    @ResponseBody
    public List<Employee> getEmployee() {
        System.out.println("The EMPLYEES");
        return employeeService.findAll();
    }

    @RequestMapping(value = "name/{name}",method = RequestMethod.GET) //http://localhost:8084/askweb/api/club/football
    @ResponseBody
    public Employee getEmployeeByName(@PathVariable String name) {
        Employee employee = employeeService.getEmployeeByName(name); // Call the Service;
        if(employee!=null){
            return employee;
        }
        return null;
    }

}
