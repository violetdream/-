package com.personal;

import static org.junit.Assert.assertTrue;

import com.personal.com.personal.pattern.HungrySingleton;
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

        System.out.printf(HungrySingleton.getInstance().toString());

    }
}
