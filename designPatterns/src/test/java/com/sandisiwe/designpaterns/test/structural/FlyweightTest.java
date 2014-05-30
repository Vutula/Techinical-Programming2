/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sandisiwe.designpaterns.test.structural;

import com.sandisiwe.designpatterns.structural.flyweight.Flyweight;
import com.sandisiwe.designpatterns.structural.flyweight.FlyweightFactory;
import java.util.ArrayList;
import java.util.List;
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
public class FlyweightTest {
    
    public FlyweightTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
     @Test
    public void test() {
        FlyweightFactory flyweightFactory = FlyweightFactory.getInstance();
        List<Integer> results = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            Flyweight flyweightAdder = flyweightFactory.getFlyweight("add");
            results.add(flyweightAdder.doMath(i, i));

            Flyweight flyweightMultiplier = flyweightFactory.getFlyweight("multiply");
            results.add(flyweightMultiplier.doMath(i, i));
        }

        /*Expected output*/
        List<Integer> expected = new ArrayList<>();
        expected.add(0);
        expected.add(0);
        expected.add(2);
        expected.add(1);
        expected.add(4);
        expected.add(4);
        expected.add(6);
        expected.add(9);
        expected.add(8);
        expected.add(16);
        
        for (int i = 0; i < 10; i++) {
            Assert.assertEquals(results.get(i), expected.get(i));
        }
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
