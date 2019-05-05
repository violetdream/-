package com.personal;

import java.util.HashMap;
import java.util.Map;

/**
 * 2019/5/5/0005
 * Create by 刘仙伟
 */
public class Leader implements IEmployee{
    private Map<String,IEmployee> targets=new HashMap<String,IEmployee>();

    public Leader(){
        targets.put("encrypt",new EmployeeA());
        targets.put("login",new EmployeeB());
    }

    @Override
    public void doing(String command) {
        targets.get(command).doing(command);
    }
}
