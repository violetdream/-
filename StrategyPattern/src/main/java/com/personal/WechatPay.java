package com.personal;

/**
 * 2019/5/5/0005
 * Create by 刘仙伟
 */
public class WechatPay extends Payment {

    @Override
    public String getName() {
        return "Wechat Pay";
    }

    @Override
    protected double queryBalance(String uid) {
        return 300;
    }
}
