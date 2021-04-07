package spring5.bean;

/**
 * @author Chenyang
 * @create 2021-04-07-16:57
 */
public class Book {
    private String name;
    private String author;
    private String address;

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void testBook() {
        System.out.println(name + "::" + author + "::" + address);
    }
}
