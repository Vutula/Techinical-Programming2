/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sandisiwe.designpaterns.test.structural;

import com.sandisiwe.designpatterns.structural.bridge.BigBus;
import com.sandisiwe.designpatterns.structural.bridge.BigEngine;
import com.sandisiwe.designpatterns.structural.bridge.SmallCar;
import com.sandisiwe.designpatterns.structural.bridge.SmallEngine;
import com.sandisiwe.designpatterns.structural.bridge.Vehicle;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author sandisiwe
 */
public class BridgeTest {
    
    public BridgeTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void test() {
        Vehicle vehicle = new BigBus(new SmallEngine());
        Assert.assertEquals(vehicle.drive(), "The big bus is driving "
                + "The small engine is running "
                + "The vehicle is going at a slow speed.");
        
        /*Change the engine to small - slow speed*/
        vehicle.setEngine(new BigEngine());
        Assert.assertEquals(vehicle.drive(), "The big bus is driving "
                + "The big engine is running "
                + "The vehicle is going at a slow speed.");

        
        vehicle = new SmallCar(new SmallEngine());
        Assert.assertEquals(vehicle.drive(), "The small car is driving "
                + "The small engine is running "
                + "The vehicle is going at a average speed.");
        
        /*Change the engine to big - fast speed*/
        vehicle.setEngine(new BigEngine());
        Assert.assertEquals(vehicle.drive(), "The small car is driving "
                + "The big engine is running "
                + "The vehicle is going at a fast speed.");
        
        
        vehicle = new SmallCar(new BigEngine());
        Assert.assertEquals(vehicle.drive(), "The small car is driving "
                + "The big engine is running "
                + "The vehicle is going at a fast speed.");
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
