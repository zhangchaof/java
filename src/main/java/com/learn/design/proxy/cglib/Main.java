package com.learn.design.proxy.cglib;

/**
 * @program: java:Main
 * @description:
 * @author: clark
 * @create: 2020-03-18 10:01
 **/
public class Main {
    public static void main(String[] args) {
        // CGLIB 动态代理调用
        CglibProxy proxy = new CglibProxy();
        Panda panda = (Panda) proxy.getInstance(new Panda());
        panda.eat();
    }
}
