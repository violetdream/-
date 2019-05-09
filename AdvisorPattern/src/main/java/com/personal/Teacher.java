package com.personal;

import com.google.common.eventbus.Subscribe;

import java.util.Observable;
import java.util.Observer;

/**
 * 2019/5/9/0009
 * Create by 刘仙伟
 */
public class Teacher implements Observer {

    private String name;
    public Teacher(String name){
        this.name=name;
    }

    @Override
    public void update(Observable o, Object arg) {
        GPer gper= (GPer) o;
        Question question= (Question) arg;
        System.out.println("===================================");
        System.out.println(name+" 老师，您好！！\n"+
                "您收到了一个来自 “"+gper.getName()+" ”的提问，希望您解答，問題內容如下：\n"+
                question.getContent()+" \n"+
                "提問者： "+question.getUserName()
                );
    }

    @Subscribe
    public void update(Object arg) {
        Question question= (Question) arg;
        System.out.println("===================================");
        System.out.println(name+" 老师，您好！！\n"+
                "您收到了一个来自 “"+question.getChannelId()+" ”的提问，希望您解答，問題內容如下：\n"+
                question.getContent()+" \n"+
                "提問者： "+question.getUserName()
        );
    }
}
