package spring5.bean;

/**
 * @author Chenyang
 * @create 2021-04-07-20:50
 */
public class Employee {

    private String name;
    private String gender;
    private Department department;

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Department getDepartment() {
        return department;
    }

    public void testEmp() {
        System.out.println(name + "::" + gender + "::" + department);
    }
}
