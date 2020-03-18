package com.learn.design.proxy.jdk;

/**
 * @program: demo:Main
 * @description:
 * @author: clark
 * @create: 2020-03-12 09:38
 **/
public class Main {
    public static void main(String[] args) {
        // JDK 动态代理调用
        AnimalProxy proxy = new AnimalProxy();
        Animal dogProxy = (Animal) proxy.getInstance(new Dog());
        dogProxy.eat();
    }
}
