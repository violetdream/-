package com.personal;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import javax.sql.DataSource;

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

        PasswordForThirdAdapter passwordForThirdAdapter=new PasswordForThirdAdapter();
        System.out.println(passwordForThirdAdapter.processLogin("QQ",LoginQQForAdapter.class));
        System.out.println(passwordForThirdAdapter.processLogin("Sina",LoginSinaForAdapter.class));

        UserDao userDao=new UserDao(null);
        userDao.selectAll();
    }
}
