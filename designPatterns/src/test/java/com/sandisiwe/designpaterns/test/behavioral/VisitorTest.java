/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sandisiwe.designpaterns.test.behavioral;

import com.sandisiwe.designpatterns.behavioural.visitor.NumberElement;
import com.sandisiwe.designpatterns.behavioural.visitor.NumberVisitor;
import com.sandisiwe.designpatterns.behavioural.visitor.SumVisitor;
import com.sandisiwe.designpatterns.behavioural.visitor.ThreeElement;
import com.sandisiwe.designpatterns.behavioural.visitor.TotalSumVisitor;
import com.sandisiwe.designpatterns.behavioural.visitor.TwoElement;
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
public class VisitorTest {

    public VisitorTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void vstorTest() {
        TwoElement two1 = new TwoElement(3, 3);
        TwoElement two2 = new TwoElement(2, 7);
        ThreeElement three1 = new ThreeElement(3, 4, 5);

        List<NumberElement> numberElements = new ArrayList<>();
        numberElements.add(two1);
        numberElements.add(two2);
        numberElements.add(three1);

        NumberVisitor sumVisitor = new SumVisitor();
        sumVisitor.visit(numberElements);

        TotalSumVisitor totalSumVisitor = new TotalSumVisitor();
        totalSumVisitor.visit(numberElements);
        Assert.assertEquals(totalSumVisitor.getTotalSum(), 27);
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
