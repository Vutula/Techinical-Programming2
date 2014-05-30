/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sandisiwe.clinicmanagementsystem.test.repository;

import com.sandisiwe.clinicmanagementsystem.app.conf.ConnectionConfig;
import com.sandisiwe.clinicmanagementsystem.domain.Bill;
import com.sandisiwe.clinicmanagementsystem.repository.BillRepository;
import com.sandisiwe.clinicmanagementsystem.test.Services.ConnectionConfigTest;
import java.math.BigDecimal;
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
public class BillRepositoryTest {
    
     public static ApplicationContext ctx;
    private Long id;
    private Bill bill;
    private BillRepository repo;
    
    public BillRepositoryTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
   @Test
    public void createBill(){
        repo = ctx.getBean(BillRepository.class);
         bill = new Bill.Builder("24/04/2014")
                .amountInsured(200.00)
                .billStatus("The bill needs to be paid")
                .build();
        repo.save(bill);
        id = bill.getId();
        Assert.assertNotNull(bill);   
                
    }
    
    @Test(dependsOnMethods = "createBill")
     public void readBill(){
         repo = ctx.getBean(BillRepository.class);
         bill = repo.findOne(id);
         Assert.assertEquals(bill.getDateSent(), "24/04/2014");
         
     }
    
    @Test(dependsOnMethods = "readBill")
     private void updateBill(){
         repo = ctx.getBean(BillRepository.class);
          bill = repo.findOne(id);
         Bill updatedBill = new Bill.Builder("25/04/2014")
                 .amountInsured(250.00)
                 .billStatus("Bill is paid.")
                 .build();
        
         repo.save(updatedBill);
         
         Bill newBill = repo.findOne(id);
         Assert.assertEquals(newBill.getDateSent(), "25/04/2014");   
         
     }
     
     @Test(dependsOnMethods = "updateBill")
     private void deleteBill(){
         repo = ctx.getBean(BillRepository.class);
         Bill bil = repo.findOne(id);
         repo.delete(bil);
         
         Bill deletedBill = repo.findOne(id);
         
         Assert.assertNull(deletedBill);
                 
     }  
     
     @BeforeClass
    public static void setUpClass() throws Exception {
        ctx= new AnnotationConfigApplicationContext(ConnectionConfigTest.class);
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
