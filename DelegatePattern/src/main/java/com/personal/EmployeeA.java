package com.personal;

/**
 * 2019/5/5/0005
 * Create by 刘仙伟
 */
public class EmployeeA implements IEmployee{

    @Override
    public void doing(String command) {
        System.out.println("command = [" + command + "]");
    }
}
