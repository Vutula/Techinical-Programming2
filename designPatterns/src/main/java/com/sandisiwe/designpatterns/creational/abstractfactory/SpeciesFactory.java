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
public interface SpeciesFactory {
    public Animal getAnimal(String type);
}
