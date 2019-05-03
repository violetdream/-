package com.personal.com.personal.pattern;

/**
 * 2019/5/3/0003
 * Create by 刘仙伟
 */
public class HungrySingleton {
        private static final HungrySingleton hungrySingleton=new HungrySingleton();

        private HungrySingleton(){

        }

        public static HungrySingleton getInstance(){
            return hungrySingleton;
        }

}
