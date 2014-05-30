/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sandisiwe.designpatterns.behavioural.templateMethod;

/**
 *
 * @author sandisiwe
 */
public abstract class Meal {
    public final String doMeal(){
        return prepareIngredient()+" "+
                cook()+" "+
                eat()+" "+
                cleanUp();
    }

    public abstract String prepareIngredient();

    public abstract String cook();

    public String eat() {
        return "Mmm, that's good";
    }

    public abstract String cleanUp();
}

