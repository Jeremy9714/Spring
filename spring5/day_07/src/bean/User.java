package bean;

import org.springframework.lang.Nullable;

/**
 * @author Chenyang
 * @create 2021-04-11-15:59
 */
public class User {

    @Nullable //表示被修饰者可以为空
    private String name;

    @Override
    public String toString() {
        return "User{}";
    }
}
