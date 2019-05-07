package com.personal;

/**
 * 2019/5/7/0007
 * Create by 刘仙伟
 */
public class LoginQQForAdapter implements LoginAdapter{

    @Override
    public boolean support(Object adapter) {
        return adapter instanceof LoginQQForAdapter;
    }

    @Override
    public ResultMsg login(String id, Object adapter) {
        return new ResultMsg(1,id,adapter);
    }
}
