package com.personal.com.personal.pattern;

/**
 * 2019/5/3/0003
 * Create by 刘仙伟
 */
public class LazySingleton {

    private LazySingleton(){}

    private static LazySingleton lazy=null;

    public  static LazySingleton getInstance(){
        if(lazy==null){
            synchronized(LazySingleton.class){
                if(lazy==null){
                    lazy=new LazySingleton();
                }
            }
        }
        return lazy;
    }
}
