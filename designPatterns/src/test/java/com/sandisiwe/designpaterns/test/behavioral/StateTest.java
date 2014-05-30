/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sandisiwe.designpaterns.test.behavioral;

import com.sandisiwe.designpatterns.behavioural.state.HappyState;
import com.sandisiwe.designpatterns.behavioural.state.Person;
import com.sandisiwe.designpatterns.behavioural.state.SadState;
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
public class StateTest {
    
    public StateTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
     public void hello() {
             Person person = new Person(new HappyState());
        Assert.assertEquals(person.sayHello(), "Hello, friend!");
        Assert.assertEquals(person.sayGoodbye(), "Bye, friend!");

        person.setEmotionalState(new SadState());
        Assert.assertEquals(person.sayHello(), "Hello. Sniff, sniff.");
        Assert.assertEquals(person.sayGoodbye(), "Bye. Sniff, sniff.");
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
