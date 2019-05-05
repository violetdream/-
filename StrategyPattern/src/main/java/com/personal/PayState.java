package com.personal;

/**
 * 2019/5/5/0005
 * Create by 刘仙伟
 */
public class PayState {
    private int code;
    private Object data;
    private String msg;

    public PayState(int code, Object data, String msg) {
        this.code = code;
        this.data = data;
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "PayState{" +
                "code=" + code +
                ", data=" + data +
                ", msg='" + msg + '\'' +
                '}';
    }
}
