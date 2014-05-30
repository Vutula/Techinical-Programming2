/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sandisiwe.designpaterns.test.behavioral;

import com.sandisiwe.designpatterns.behavioural.memento.DietInfo;
import com.sandisiwe.designpatterns.behavioural.memento.DietInfoCaretaker;
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
public class MementoTest {
    
    public MementoTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
        @Test
     public void mementoTest() {
       DietInfoCaretaker dietInfoCaretaker = new DietInfoCaretaker();

        // originator
        DietInfo dietInfo = new DietInfo("Fred", 1, 100);
        Assert.assertEquals(dietInfo.toString(), "Name:Fred, day number:1, weight:100");

        dietInfo.setDayNumberAndWeight(2, 99);
        Assert.assertEquals(dietInfo.toString(), "Name:Fred, day number:2, weight:99");

        
        dietInfoCaretaker.saveState(dietInfo);

        dietInfo.setDayNumberAndWeight(3, 98);
        Assert.assertEquals(dietInfo.toString(), "Name:Fred, day number:3, weight:98");

        dietInfo.setDayNumberAndWeight(4, 97);
        Assert.assertEquals(dietInfo.toString(), "Name:Fred, day number:4, weight:97");

        dietInfoCaretaker.restoreState(dietInfo);
        Assert.assertEquals(dietInfo.toString(), "Name:Fred, day number:2, weight:99");
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
