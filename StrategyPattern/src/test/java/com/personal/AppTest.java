package com.personal;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
        Order order=new Order(null,System.currentTimeMillis()+"",1324.45);
        System.out.println(order.pay(PayStategy.JD_Pay));

    }
}
