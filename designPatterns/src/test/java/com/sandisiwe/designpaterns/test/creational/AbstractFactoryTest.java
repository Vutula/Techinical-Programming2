/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sandisiwe.designpaterns.test.creational;

import com.sandisiwe.designpatterns.creational.abstractfactory.AbstractFactory;
import com.sandisiwe.designpatterns.creational.abstractfactory.Animal;
import com.sandisiwe.designpatterns.creational.abstractfactory.SpeciesFactory;
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
public class AbstractFactoryTest {
    
    public AbstractFactoryTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
     @Test
     public void test() {
         AbstractFactory abstractFactory = new AbstractFactory();
         
         /*Get species from abstract factory*/
         SpeciesFactory mammals = abstractFactory.getSpeciesFactory("Mammal");
         SpeciesFactory reptiles = abstractFactory.getSpeciesFactory("Reptile");
         
         /*Get animals from species factory ie mammal and reptiles*/
         Animal dog = mammals.getAnimal("Dog");
         assertEquals(dog.makeSound(), "Woof");
         
         Animal cat = mammals.getAnimal("Cat");
         assertEquals(cat.makeSound(), "Meow");
         
         Animal snake = reptiles.getAnimal("Snake");
         assertEquals(snake.makeSound(), "Hiss");
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
