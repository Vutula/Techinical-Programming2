/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sandisiwe.designpaterns.test.creational;

import com.sandisiwe.designpatterns.creational.prototype.Dog;
import com.sandisiwe.designpatterns.creational.prototype.Person;
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
public class PrototypeTest {
    
    public PrototypeTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    
     @Test
     public void test() {
         Person bryan = new Person("Bryan");
         Dog dog = new Dog("Wooof");
         
         Person bryanClone = (Person) bryan.doClone();
         Dog dogClone = (Dog)dog.doClone();
         
         assertEquals(bryan.toString(), bryanClone.toString());
         assertEquals(dog.toString(), dogClone.toString());
         
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
