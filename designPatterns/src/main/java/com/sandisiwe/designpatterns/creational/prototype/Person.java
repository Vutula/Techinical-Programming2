/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sandisiwe.designpatterns.creational.prototype;

/**
 *
 * @author sandisiwe
 */
public class Person implements Prototype{

    private String name;

    public Person(String name) {
        this.name = name;
    }
    
    @Override
    public Prototype doClone() {
        return new Person(name);
    }

    @Override
    public String toString() {
        return "This person is named " + name;
    }
    
    
    
}
