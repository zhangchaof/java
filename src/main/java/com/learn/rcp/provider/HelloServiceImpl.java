package com.learn.rcp.provider;

/**
 * @program: java:HelloServiceImpl
 * @description:
 * @author: clark
 * @create: 2020-03-20 10:28
 **/
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHi(String name) {
        return "Hi, " + name;
    }
}
