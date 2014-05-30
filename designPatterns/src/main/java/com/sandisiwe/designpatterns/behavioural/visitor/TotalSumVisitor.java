/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sandisiwe.designpatterns.behavioural.visitor;

import java.util.List;

/**
 *
 * @author sandisiwe
 */
public class TotalSumVisitor implements NumberVisitor{
    int totalSum = 0;
    @Override
    public int visit(TwoElement twoElement) {
        int sum = twoElement.a + twoElement.b;
        totalSum += sum;
        return sum;
    }

    @Override
    public int visit(ThreeElement threeElement) {
        int sum = threeElement.a + threeElement.b + threeElement.c;
        totalSum += sum;
        return sum;
    }

    @Override
    public void visit(List<NumberElement> elementList) {
        for (NumberElement numberElement : elementList) {
            numberElement.accept(this);
        }
    }

    public int getTotalSum() {
        return totalSum;
    }
    
    
}

