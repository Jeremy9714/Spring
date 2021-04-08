package autowire;

/**
 * @author Chenyang
 * @create 2021-04-08-16:34
 */
public class Employee {

    private Department department;

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "department=" + department +
                '}';
    }
}
