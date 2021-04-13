package org.jeremy;

import org.junit.Test;
import org.junit.Assert;

/**
 * @author Chenyang
 * @create 2021-04-13-11:28
 */
public class TestHelloMaven {

    @Test
    public void testAddNumber1() {
        System.out.println("testAddNumber1");
        HelloMaven helloMaven = new HelloMaven();
        int res = helloMaven.addNumber(10, 20);
        Assert.assertEquals(30, res);
    }

    @Test
    public void testAddNumber2() {
        System.out.println("testAddNumber2");
        HelloMaven helloMaven = new HelloMaven();
        int res = helloMaven.addNumber(20, 30);
        Assert.assertEquals(50, res);
    }
}
