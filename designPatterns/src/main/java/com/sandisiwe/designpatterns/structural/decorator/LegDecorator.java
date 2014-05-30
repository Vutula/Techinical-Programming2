/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sandisiwe.designpatterns.structural.decorator;

/**
 *
 * @author sandisiwe
 */
public class LegDecorator extends AnimalDecorator{

    public LegDecorator(Animal animal) {
        super(animal);
    }
    
    
    @Override
    public String describe() {
        return animal.describe() + " I have legs." + " " + dance();
    }
    public String dance(){
        return("I can dance.");
    }
}

