package com.learn.design.proxy.jdk;

public class Cat implements Animal {
    @Override
    public void eat() {
        System.out.println("The cat is eating");
    }
}
