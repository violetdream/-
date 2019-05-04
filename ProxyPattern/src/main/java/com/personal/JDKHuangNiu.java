package com.personal;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 2019/5/4/0004
 * Create by 刘仙伟
 */
public class JDKHuangNiu implements InvocationHandler {

    private Object target;

    public Object getInstance(Object target){
        this.target=target;
        Class<?> clazz=target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }


    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        dobefore();
        Object obejct=method.invoke(this.target,args);
        doafter();
        return obejct;
    }

    private void doafter() {
        System.out.println("after...");
    }

    private void dobefore() {
        System.out.println("before...");
    }
}
