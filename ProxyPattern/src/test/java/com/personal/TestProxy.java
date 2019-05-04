package com.personal;

import com.personal.JDKHuangNiu;
import com.personal.Person;
import com.personal.Student;
import com.personal.CglibHuangNiu;
/**
 * 2019/5/4/0004
 * Create by 刘仙伟
 */
public class TestProxy {

    public static void main(String[] args) {
        Person person= (Person) new JDKHuangNiu().getInstance(new Student());
        person.buyTicket();
        Student student= (Student) new CglibHuangNiu().getInstance(Student.class);
        student.buyTicket();
    }
}
