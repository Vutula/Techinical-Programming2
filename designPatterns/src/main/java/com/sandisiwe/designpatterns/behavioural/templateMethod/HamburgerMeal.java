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
public class HamburgerMeal extends Meal{

    @Override
    public String prepareIngredient() {
        return("Getting burgers, buns, and french fries");
    }

    @Override
    public String cook() {
        return("Cooking burgers on grill and fries in oven");
    }

    @Override
    public String cleanUp() {
        return("Throwing away paper plates");
    }
    
}

