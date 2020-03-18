package com.learn.design.strategy;

/**
 * @program: java:Context
 * @description:
 * @author: clark
 * @create: 2020-03-18 13:51
 **/
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public void executeStrategy(String test){
        strategy.test(test);
    }
}
