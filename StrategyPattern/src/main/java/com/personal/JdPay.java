package com.personal;

/**
 * 2019/5/5/0005
 * Create by 刘仙伟
 */
public class JdPay extends Payment {
    @Override
    public String getName() {
        return "JingDong Pay";
    }

    @Override
    protected double queryBalance(String uid) {
        return 500;
    }
}
