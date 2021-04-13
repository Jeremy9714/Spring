package org.jeremy;

/**
 * @author Chenyang
 * @create 2021-04-13-11:23
 */
public class HelloMaven {

    public int addNumber(int a, int b){
        return a + b;
    }

    public static void main(String[] args) {
        HelloMaven helloMaven = new HelloMaven();
        System.out.println(helloMaven.addNumber(1, 2));
    }
}
