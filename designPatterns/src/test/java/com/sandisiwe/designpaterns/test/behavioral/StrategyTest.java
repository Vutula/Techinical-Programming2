/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sandisiwe.designpaterns.test.behavioral;

import com.sandisiwe.designpatterns.behavioural.strategy.Context;
import com.sandisiwe.designpatterns.behavioural.strategy.HikeStrategy;
import com.sandisiwe.designpatterns.behavioural.strategy.SkiStrategy;
import com.sandisiwe.designpatterns.behavioural.strategy.Strategy;
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
public class StrategyTest {

    public StrategyTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void hello() {
        int temperatureInF = 60;

        /*SKIING*/
        Strategy skiStrategy = new SkiStrategy();
        Context context = new Context(temperatureInF, skiStrategy);
        Assert.assertFalse(context.getResult());

        /*HIKING*/
        Strategy hikeStrategy = new HikeStrategy();
        context.setStrategy(hikeStrategy);
        Assert.assertTrue(context.getResult());

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

