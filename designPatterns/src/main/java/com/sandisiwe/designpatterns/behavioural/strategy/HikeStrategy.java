/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sandisiwe.designpatterns.behavioural.strategy;

/**
 *
 * @author sandisiwe
 */
public class HikeStrategy implements Strategy{

    @Override
    public boolean checkTemperature(int temperatureInF) {
        return (temperatureInF >= 50)&&(temperatureInF <= 90);
    }
    
}

