/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sandisiwe.designpaterns.test.structural;

import com.sandisiwe.designpatterns.structural.decorator.Animal;
import com.sandisiwe.designpatterns.structural.decorator.GrowlDecorator;
import com.sandisiwe.designpatterns.structural.decorator.LegDecorator;
import com.sandisiwe.designpatterns.structural.decorator.LivingAnimal;
import com.sandisiwe.designpatterns.structural.decorator.WingDecorator;
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
public class DecoraterTest {
    
    public DecoraterTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    
    @Test
    public void test() {
        Animal animal = new LivingAnimal();
        Assert.assertEquals(animal.describe(), "I am an animal.");

        animal = new LegDecorator(animal);
        Assert.assertEquals(animal.describe(), "I am an animal. "
                + "I have legs. "
                + "I can dance.");

        animal = new WingDecorator(animal);
        Assert.assertEquals(animal.describe(), "I am an animal. "
                + "I have legs. "
                + "I can dance. "
                + "I have wings. "
                + "I can fly.");

        animal = new GrowlDecorator(animal);
        animal = new GrowlDecorator(animal);
        Assert.assertEquals(animal.describe(), "I am an animal. "
                + "I have legs. "
                + "I can dance. "
                + "I have wings. "
                + "I can fly. "
                + "Grrrrr. "
                + "Grrrrr.");
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
