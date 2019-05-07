package com.personal;

/**
 * 2019/5/7/0007
 * Create by 刘仙伟
 */
public class PasswordForThirdAdapter {
    public ResultMsg processLogin(String key,Class<? extends LoginAdapter> clazz){
        try {
            LoginAdapter adapter=clazz.newInstance();
            if(adapter.support(adapter)){
                return  adapter.login(key,adapter);
            }
            return  null;

        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return  null;
    }
}
