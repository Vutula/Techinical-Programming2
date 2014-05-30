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
public abstract class AnimalDecorator implements Animal{
    Animal animal;

    public AnimalDecorator(Animal animal) {
        this.animal = animal;
    }
    
}

