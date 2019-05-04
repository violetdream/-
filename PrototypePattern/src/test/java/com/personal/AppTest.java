package com.personal;

import static org.junit.Assert.assertTrue;

import com.personal.com.personal.pattern.ConcretePrototypeA;
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
        ConcretePrototypeA concretePrototypeA=new ConcretePrototypeA();
        concretePrototypeA.setAge(15);

        ConcretePrototypeA concretePrototypeB= (ConcretePrototypeA) concretePrototypeA.clone();

        System.out.println(""+(concretePrototypeA==concretePrototypeB));
        System.out.println(""+concretePrototypeA.getAge()+" "+concretePrototypeB.getAge());
    }
}
