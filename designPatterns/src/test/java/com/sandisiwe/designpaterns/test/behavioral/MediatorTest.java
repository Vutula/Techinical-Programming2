/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sandisiwe.designpaterns.test.behavioral;

import com.sandisiwe.designpatterns.behavioural.mediator.AmericanSeller;
import com.sandisiwe.designpatterns.behavioural.mediator.Buyer;
import com.sandisiwe.designpatterns.behavioural.mediator.DollarConverter;
import com.sandisiwe.designpatterns.behavioural.mediator.FrenchBuyer;
import com.sandisiwe.designpatterns.behavioural.mediator.Mediator;
import com.sandisiwe.designpatterns.behavioural.mediator.SwedishBuyer;
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
public class MediatorTest {
    
    public MediatorTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
     public void test() {
         Mediator mediator = new Mediator();
         
         Buyer swedish = new SwedishBuyer(mediator);
         Buyer french = new FrenchBuyer(mediator);
         float sellingPriceInDollars = 10.0f;
         AmericanSeller ams = new AmericanSeller(mediator, sellingPriceInDollars);
         DollarConverter dollarConverter = new DollarConverter(mediator);
         
         float swedishBidInKronor = 55.0f;
         while (!swedish.attemptToPurchase(swedishBidInKronor)) {
            swedishBidInKronor += 15.0f;
         }
         Assert.assertEquals(swedishBidInKronor, 85.0f);
         
         
         float frenchBidInEuros = 3.0f;
         while (!french.attemptToPurchase(frenchBidInEuros)) {
            frenchBidInEuros += 1.5f;
         }
         Assert.assertEquals(frenchBidInEuros, 7.5f);
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
