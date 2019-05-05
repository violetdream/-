package com.personal;

import java.util.HashMap;
import java.util.Map;

/**
 * 2019/5/5/0005
 * Create by 刘仙伟
 */
public class PayStategy {
    public static final String ALI_Pay="AliPay";
    public static final String JD_Pay="JdPay";
    public static final String Union_Pay="UnionPay";
    public static final String WECHAT_Pay="WechatPay";
    public static final String DEFAULT_Pay=ALI_Pay;

    private static Map<String,Payment> payStrategy=new HashMap<String,Payment>();

    static{
        payStrategy.put(ALI_Pay,new AliPay());
        payStrategy.put(WECHAT_Pay,new WechatPay());
        payStrategy.put(Union_Pay,new UnionPay());
        payStrategy.put(JD_Pay,new JdPay());
    }

    public static Payment get(String paykey){
        if(!payStrategy.containsKey(paykey)){
            return payStrategy.get(DEFAULT_Pay);
        }
        return payStrategy.get(paykey);
    }
}
