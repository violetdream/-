package com.personal;

import com.personal.Factory.JavaFactory;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertTrue;

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
    }

    public static void main(String[] args) {
        JavaFactory javacourceFactory=new JavaFactory();
        javacourceFactory.createNote().edit();
        javacourceFactory.createVideo().record();
    }
}
