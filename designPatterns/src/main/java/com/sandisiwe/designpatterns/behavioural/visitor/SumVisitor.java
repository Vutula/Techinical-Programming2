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
public class SumVisitor implements NumberVisitor{

    @Override
    public int visit(TwoElement twoElement) {
        return twoElement.a + twoElement.b;
        
    }

    @Override
    public int visit(ThreeElement threeElement) {
        return threeElement.a + threeElement.b + threeElement.c;
    }

    @Override
    public void visit(List<NumberElement> elementList) {
        for (NumberElement numberElement : elementList) {
            numberElement.accept(this);
        }
    }
    
}

