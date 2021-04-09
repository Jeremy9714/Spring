package aopanno;

import org.springframework.stereotype.Component;

/**
 * 被增强类
 *
 * @author Chenyang
 * @create 2021-04-09-20:28
 */
@Component
public class User {
    public void add() {
//        int a = 10 / 0;
        System.out.println("user add");
    }
}
