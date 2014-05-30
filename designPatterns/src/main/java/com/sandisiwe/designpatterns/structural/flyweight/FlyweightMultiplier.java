/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sandisiwe.designpatterns.structural.flyweight;

/**
 *
 * @author sandisiwe
 */
public class FlyweightMultiplier implements Flyweight{
    String operation;

    public FlyweightMultiplier() {
        operation = "multiplying";
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
    @Override
    public int doMath(int a, int b) {
        return a * b;
    }
}
