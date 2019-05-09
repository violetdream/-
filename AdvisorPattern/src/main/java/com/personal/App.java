package com.personal;

import com.google.common.eventbus.EventBus;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        GPer gper=GPer.getInstance();
        Teacher teacher=new Teacher("Liu");
        Teacher teacher1=new Teacher("Hu");

        gper.addObserver(teacher);
        gper.addObserver(teacher1);

        Question question=new Question();
        question.setUserName("小明");
        question.setContent("您请教一下同事代码的写法，大体上是controller层统一调用service方法？");
        question.setChannelId(" 騰訊公開課 ");

        gper.publicQuestion(question);

        //TODO 利用Guava API实现GPer社区提问通知
        EventBus eventBus=new EventBus();
        eventBus.register(teacher);
        eventBus.register(teacher1);
        eventBus.post(question);
    }
}
