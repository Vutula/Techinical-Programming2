/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sandisiwe.clinicmanagementsystem.test.Services;

import com.sandisiwe.clinicmanagementsystem.app.conf.ConnectionConfig;
import com.sandisiwe.clinicmanagementsystem.domain.Patient;
import com.sandisiwe.clinicmanagementsystem.domain.Payment;
import com.sandisiwe.clinicmanagementsystem.repository.PatientRepository;
import com.sandisiwe.clinicmanagementsystem.services.TotalPatientService;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author sandisiwe
 */
public class TotalPatientTest {
    
    public static ApplicationContext ctx;
    
    private TotalPatientService service;
    private PatientRepository patientRepository;
    private Long id;
    
    public TotalPatientTest() {
    }
    
    @Test
    public void testPatient(){
        patientRepository = (PatientRepository)ctx.getBean(PatientRepository.class);
        service = ctx.getBean(TotalPatientService.class);
        
        Patient p1 = new Patient.Builder().firstname("Sandisiwe").createInstance();
        Patient p2 = new Patient.Builder().firstname("Siyanda").createInstance();
        Patient p3 = new Patient.Builder().firstname("Pabaloe").createInstance();
        Patient p4 = new Patient.Builder().firstname("Phakama").createInstance();
        Patient p5 = new Patient.Builder().firstname("Nobubele").createInstance();
       
        patientRepository.save(p1);
        patientRepository.save(p2);
        patientRepository.save(p3);
        patientRepository.save(p4);
        patientRepository.save(p5);
        
        Assert.assertEquals(service.getTotalPatient("Sandisiwe").size(), 5);
    }

    @Test(dependsOnMethods = "testPatient")
    private void createPatient() {
        
        patientRepository = ctx.getBean(PatientRepository.class);
        List<Payment> payment = new ArrayList<>();

    }
    
    @BeforeClass
    public static void setUpClass() throws Exception {
    ctx = new AnnotationConfigApplicationContext(ConnectionConfigTest.class);
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
     //patientRepository = ctx.getBean(PatientRepository.class);
     // patientRepository.deleteAll();
}
