package com.personal;

/**
 * 2019/5/5/0005
 * Create by 刘仙伟
 */
public class Order {
    private String uid;
    private String orderId;
    private double amount;

    public Order(String uid,String orderId,double amount){
        this.uid=uid;
        this.orderId=orderId;
        this.amount=amount;
    }
    public PayState pay(){
        return pay(PayStategy.DEFAULT_Pay);
    }

    public PayState pay(String payKey) {
        Payment payment=PayStategy.get(payKey);
        System.out.println(" Welcome to use :  " + payment.getName());
        System.out.println(" the Amount for this order: " + amount+" ,开始扣款 ...");
        return payment.pay(uid,amount);
    }
}
