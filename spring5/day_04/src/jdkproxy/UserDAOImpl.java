package jdkproxy;

/**
 * @author Chenyang
 * @create 2021-04-09-18:29
 */
public class UserDAOImpl implements UserDAO {

    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public String update(String str) {
        return str;
    }
}
