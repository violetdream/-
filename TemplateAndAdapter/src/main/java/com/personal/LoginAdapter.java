package com.personal;

/**
 * 2019/5/7/0007
 * Create by 刘仙伟
 */
public interface LoginAdapter {
    boolean support(Object adapter);

    ResultMsg login(String id,Object adapter);
}
