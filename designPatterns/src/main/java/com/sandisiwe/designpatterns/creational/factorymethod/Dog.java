/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sandisiwe.designpatterns.creational.factorymethod;

/**
 *
 * @author sandisiwe
 */
public class Dog implements Animal{

    @Override
    public String makeSound() {
        return ("Woof");
    }
    
}