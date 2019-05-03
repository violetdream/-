package com.personal.com.personal.pattern;

/**
 * 2019/5/3/0003
 * Create by 刘仙伟
 */
public class LazyInnerClassSingleton {

    private LazyInnerClassSingleton(){
        if(LazyHolder.LAZY!=null){
            throw new RuntimeException("不允许创建多个实例");
        }
    };

    public static final LazyInnerClassSingleton getInstance(){
        return LazyHolder.LAZY;
    }
    private static class LazyHolder{
        private static final LazyInnerClassSingleton LAZY= new LazyInnerClassSingleton();
    }
}
