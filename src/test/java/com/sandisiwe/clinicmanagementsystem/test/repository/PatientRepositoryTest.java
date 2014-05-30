/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sandisiwe.clinicmanagementsystem.test.repository;

import com.sandisiwe.clinicmanagementsystem.domain.Patient;
import com.sandisiwe.clinicmanagementsystem.repository.PatientRepository;
import com.sandisiwe.clinicmanagementsystem.test.Services.ConnectionConfigTest;
import org.junit.Assert;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
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
public class PatientRepositoryTest {
    
    private static ApplicationContext ctx;
    private PatientRepository repo;
    private Long id;
    private Patient patient;
    
    public PatientRepositoryTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void testCreate(){
        
        repo = ctx.getBean(PatientRepository.class);
        patient = new Patient.Builder().firstname("Sandisiwe")
                .lastname("Vutula")
                .createInstance();
        
        repo.save(patient);
        id = patient.getId();
        Assert.assertNotNull(id);
    }
    
    @Test (dependsOnMethods = "testCreate")
    public void testRead() {
        repo = ctx.getBean(PatientRepository.class);
        org.testng.Assert.assertEquals(repo.findOne(id).getFirstName(), "Sandisiwe");
    } 
    
    @Test (dependsOnMethods = "testRead")
    public void testUpdate() {
       
    }
    
    @Test (dependsOnMethods = "testUpdate")
    public void testDelete() {        
         
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
}
