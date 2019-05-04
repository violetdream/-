package com.personal;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import java.lang.reflect.Method;

/**
 * 2019/5/4/0004
 * Create by 刘仙伟
 */
public class CglibHuangNiu implements MethodInterceptor {

    public Object getInstance(Class<?> clazz){
        Enhancer enhancer=new Enhancer();
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);

        return enhancer.create();
    }

    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        dobefore();
        Object object=proxy.invokeSuper(obj,args);
        doafter();
        return object;
    }
    private void doafter() {
        System.out.println("after...");
    }

    private void dobefore() {
        System.out.println("before...");
    }
}
