package com.learn.design.proxy.jdk;

public class Dog implements Animal {
    @Override
    public void eat() {
        System.out.println("The dog is eating");
    }
}
