package spring5.bean;

/**
 * @author Chenyang
 * @create 2021-04-07-17:20
 */
public class Order {

    private String name;
    private String address;

    public Order(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void testOrder() {
        System.out.println(name + "::" + address);
    }
}
