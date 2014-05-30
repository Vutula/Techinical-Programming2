/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sandisiwe.designpatterns.behavioural.observer;

/**
 *
 * @author sandisiwe
 */
public class WeatherCustomer1 implements WeatherObserver{

    @Override
    public String doUpdate(int temperature) {
        return "Weather customer 1 just found out the temperature is:" + temperature;
    }
    
}
