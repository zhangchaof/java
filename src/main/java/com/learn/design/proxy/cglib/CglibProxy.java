package com.learn.design.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author clark
 */
public class CglibProxy implements MethodInterceptor {
    /**
     * 代理对象
     */
    private Object target;

    public Object getInstance(Object target) {
        this.target = target;
        //Enhancer是cglib中使用频率很高的一个类，它是一个字节码增强器，可以用来为无接口的类创建代理。
        //它的功能与java自带的Proxy类挺相似的。它会根据某个给定的类创建子类，并且所有非final的方法都带有回调钩子
        Enhancer enhancer = new Enhancer();
        // 设置父类为实例类
        enhancer.setSuperclass(this.target.getClass());
        // 回调方法
        enhancer.setCallback(this);
        // 创建代理对象
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("调用前");
        // 执行方法调用
        Object result = methodProxy.invokeSuper(o, objects);
        System.out.println("调用后");
        return result;
    }
}
