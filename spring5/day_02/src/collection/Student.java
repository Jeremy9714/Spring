package collection;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author Chenyang
 * @create 2021-04-08-11:10
 */
public class Student {

    private String[] arrays;
    private List<String> list;
    private Set<String> set;
    private Map<String, String> map;

    private List<Course> course;

    public void setCourse(List<Course> course) {
        this.course = course;
    }

    public void setArrays(String[] arrays) {
        this.arrays = arrays;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public void print() {
        System.out.println(Arrays.toString(arrays));
        System.out.println(list);
        System.out.println(set);
        System.out.println(map);
        System.out.println(course);
    }
}
