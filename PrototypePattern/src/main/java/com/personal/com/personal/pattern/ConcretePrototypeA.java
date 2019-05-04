package com.personal.com.personal.pattern;

import java.io.*;
import java.util.List;

/**
 * 2019/5/4/0004
 * Create by 刘仙伟
 */
public class ConcretePrototypeA implements Prototype,Serializable,Cloneable{

    private int age;
    private String name;
    private List hobbies;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List getHobbies() {
        return hobbies;
    }

    public void setHobbies(List hobbies) {
        this.hobbies = hobbies;
    }

    @Override
    public Object clone() {
       
        return  this.deepClone();
    }

    private Object deepClone() {
        try {
            ByteArrayOutputStream bos=new ByteArrayOutputStream();
            ObjectOutputStream oos=new ObjectOutputStream(bos);
            oos.writeObject(this);

            ByteArrayInputStream bis=new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois=new ObjectInputStream(bis);

            ConcretePrototypeA copy= (ConcretePrototypeA) ois.readObject();
            copy.age=19;
            return copy;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }
}
