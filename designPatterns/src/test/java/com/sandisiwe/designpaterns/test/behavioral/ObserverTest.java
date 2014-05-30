/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sandisiwe.designpaterns.test.behavioral;

import com.sandisiwe.designpatterns.behavioural.observer.WeatherCustomer1;
import com.sandisiwe.designpatterns.behavioural.observer.WeatherCustomer2;
import com.sandisiwe.designpatterns.behavioural.observer.WeatherStation;
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
public class ObserverTest {
    
    public ObserverTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
     public void test() {
         WeatherStation station = new WeatherStation(33);
         WeatherCustomer1 wc1 = new WeatherCustomer1();
         WeatherCustomer2 wc2 = new WeatherCustomer2();
         station.addObserver(wc1);
         station.addObserver(wc2);
         
         station.setTemperature(34);
         Assert.assertEquals(wc1.doUpdate(34), "Weather customer 1 just found out the temperature is:" + 34);
         Assert.assertEquals(wc2.doUpdate(34), "Weather customer 2 just found out the temperature is:" + 34);
         
         station.removeObserver(wc1);
         station.setTemperature(35);
         Assert.assertEquals(wc2.doUpdate(35), "Weather customer 2 just found out the temperature is:" + 35);
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
