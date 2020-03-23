package com.learn.design.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class AnimalProxy implements InvocationHandler {
    /**
     * 代理对象
     */

    private Object target;

    public Object getInstance(Object target) {
        this.target = target;
        // 取得代理对象
        //loader: 一个ClassLoader对象，定义了由哪个ClassLoader对象来对生成的代理对象进行加载
        //interfaces:一个Interface对象的数组，表示的是我将要给我需要代理的对象提供一组什么接口，如果我提供了一组接口给它，那么这个代理对象就宣称实现了该接口(多态)，这样我就能调用这组接口中的方法了
        //h:一个InvocationHandler对象，表示的是当我这个动态代理对象在调用方法的时候，会关联到哪一个InvocationHandler对象上
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    /**
     *
     * proxy:　 - 指代我们所代理的那个真实对象
     * method:　- 指代的是我们所要调用真实对象的某个方法的Method对象
     * args:　　- 指代的是调用真实对象某个方法时接受的参数
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("调用前");
        // 方法调用
        Object result = method.invoke(target, args);
        System.out.println("调用后");
        return result;
    }
}


