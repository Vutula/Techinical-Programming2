/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sandisiwe.designpatterns.structural.bridge;

/**
 *
 * @author sandisiwe
 */
public class SmallCar extends Vehicle{

    public SmallCar(Engine engine) {
        this.weightInKilos = 600;
        this.engine = engine;
    }
    
    @Override
    public String drive() {
        int horsepower = engine.go();
        return"The small car is driving " + engine + " " + reportOnSpeed(horsepower);
    }
}

