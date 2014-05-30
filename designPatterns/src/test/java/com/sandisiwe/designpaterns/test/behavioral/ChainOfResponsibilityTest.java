/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sandisiwe.designpaterns.test.behavioral;

import com.sandisiwe.designpatterns.behavioural.chainOfResponsibility.EarthHandler;
import com.sandisiwe.designpatterns.behavioural.chainOfResponsibility.MercuryHandler;
import com.sandisiwe.designpatterns.behavioural.chainOfResponsibility.PlanetEnum;
import com.sandisiwe.designpatterns.behavioural.chainOfResponsibility.PlanetHandler;
import com.sandisiwe.designpatterns.behavioural.chainOfResponsibility.VenusHandler;
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
public class ChainOfResponsibilityTest {

    public ChainOfResponsibilityTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void test() {
        PlanetHandler mercuryHandler = new MercuryHandler();
        PlanetHandler venusHandler = new VenusHandler();
        PlanetHandler earthHandler = new EarthHandler();

        mercuryHandler.setSuccessor(venusHandler);
        venusHandler.setSuccessor(earthHandler);

        assertEquals(mercuryHandler.handleRequest(PlanetEnum.EARTH), "earth");
        assertEquals(mercuryHandler.handleRequest(PlanetEnum.MERCURY), "mercury");
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
