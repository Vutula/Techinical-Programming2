/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sandisiwe.designpaterns.test.behavioral;

import com.sandisiwe.designpatterns.behavioural.templateMethod.CheeseBurgerMeal;
import com.sandisiwe.designpatterns.behavioural.templateMethod.HamburgerMeal;
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
public class TemplateMethodTest {
    
    public TemplateMethodTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void test() {
         HamburgerMeal ham = new HamburgerMeal();
         assertEquals(ham.doMeal(), "Getting burgers, buns, and french fries" +" "+
                "Cooking burgers on grill and fries in oven" +" "+
                "Mmm, that's good" +" "+
                "Throwing away paper plates"
                 );
         
         CheeseBurgerMeal cheese = new CheeseBurgerMeal();
         assertEquals(cheese.doMeal(), "Getting ground beef and Cheese" +" "+
                "Cooking ground beef in pan" +" "+
                "The Cheese Burgers are tasty" +" "+
                "Doing the dishes"
                 );
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
