/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sandisiwe.designpatterns.creational.abstractfactory;

/**
 *
 * @author sandisiwe
 */
public class MammalFactory implements SpeciesFactory{

    @Override
    public Animal getAnimal(String type){
        if ("Dog".equals(type)){
            return new Dog();
        }else
        {
            return new Cat();
        }
    }
}
