package collection;

import java.util.List;

/**
 * @author Chenyang
 * @create 2021-04-08-11:29
 */
public class Book {

    private List<String> list;

    public void setList(List<String> list) {
        this.list = list;
    }

    public void print() {
        System.out.println(list);
    }
}
