/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sandisiwe.designpaterns.test.structural;

import com.sandisiwe.designpatterns.structural.adapter.TemperatureClassReporter;
import com.sandisiwe.designpatterns.structural.adapter.TemperatureInfo;
import com.sandisiwe.designpatterns.structural.adapter.TemperatureObjectReporter;
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
public class AdapterTest {
    
    public AdapterTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    
      @Test
     public void test() {
         /*Class Adapter*/
         TemperatureInfo inf = new TemperatureClassReporter();
         inf.setTemperatureInF(32);
         assertEquals(inf.getTemperatureInC(), 0.0);
         assertEquals(inf.getTemperatureInF(), 32.0);
         inf.setTemperatureInC(0);
         assertEquals(inf.getTemperatureInC(), 0.0);
         assertEquals(inf.getTemperatureInF(), 32.0);
         
         /*Object Adapter*/  
        TemperatureInfo tempInfo = new TemperatureObjectReporter();
        tempInfo.setTemperatureInF(85);
        tempInfo.setTemperatureInC(0);
        assertEquals(tempInfo.getTemperatureInC(), 0.0);
        assertEquals(tempInfo.getTemperatureInF(), 32.0);
        tempInfo.setTemperatureInF(85);
        assertEquals(tempInfo.getTemperatureInC(), 29.444444444444443);
        assertEquals(tempInfo.getTemperatureInF(), 85.0);
         
         
         
     }

    @BeforeClass
    public static void setUpClass() throws Exception {
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
