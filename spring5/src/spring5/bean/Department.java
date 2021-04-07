package spring5.bean;

/**
 * @author Chenyang
 * @create 2021-04-07-20:50
 */
public class Department {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                '}';
    }
}
