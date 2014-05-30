/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sandisiwe.designpaterns.test.behavioral;

import com.sandisiwe.designpatterns.behavioural.interpreter.AndExpression;
import com.sandisiwe.designpatterns.behavioural.interpreter.Expression;
import com.sandisiwe.designpatterns.behavioural.interpreter.OrExpression;
import com.sandisiwe.designpatterns.behavioural.interpreter.TerminalExpression;
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
public class InterpreterTest {
    
    public InterpreterTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void hello() {
        Expression calvin = new TerminalExpression("Calvin");
        Expression harry = new TerminalExpression("Harry");
        Expression isMale = new OrExpression(calvin, harry);

        Expression julie = new TerminalExpression("Jane");
        Expression married = new TerminalExpression("Married");
        Expression isMarriedWoman = new AndExpression(julie, married);

        Assert.assertTrue(isMale.interpret("Harry"));
        Assert.assertTrue(isMarriedWoman.interpret("Married Jane"));

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
