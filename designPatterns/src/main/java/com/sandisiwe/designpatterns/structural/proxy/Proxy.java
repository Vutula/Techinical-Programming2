/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sandisiwe.designpatterns.structural.proxy;

/**
 *
 * @author sandisiwe
 */
public class Proxy {

    SlowThing slowThing;

    public Proxy() {

    }

    public String sayHello() {
        if (slowThing == null) {
            slowThing = new SlowThing();
        }
        return slowThing.sayHello();
    }

}
