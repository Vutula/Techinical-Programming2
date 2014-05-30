/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sandisiwe.designpatterns.creational.singleton;

/**
 *
 * @author sandisiwe
 */
public class AnimalFactory {
    private static AnimalFactory animalFactory = null;
    
    public AnimalFactory(){
        
    }
    
    public synchronized static AnimalFactory getInstance(){
        if(animalFactory == null){
            animalFactory = new AnimalFactory();
        }
        return animalFactory;
    }
    
    public Animal getAnimal(String type){
        if (type.equals("Canine")){
            return new Dog();
        }else
        {
            return new Cat();
        }
    }
}

