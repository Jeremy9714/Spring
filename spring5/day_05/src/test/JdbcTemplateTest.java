package test;

import bean.Book;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.BookService;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Chenyang
 * @create 2021-04-10-13:56
 */
public class JdbcTemplateTest {

    @Test
    public void test3() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        List<Object[]> list = new ArrayList<>();

//        Object[] o1 = {"3", "Book_3", "b"};
//        Object[] o2 = {"4", "Book_4", "c"};
//        Object[] o3 = {"5", "Book_5", "d"};

//        Object[] o1 = {"MySql", "s", "3"};
//        Object[] o2 = {"C++", "s", "4"};
//        Object[] o3 = {"Python", "s", "5"};

        Object[] o1 = {"3"};
        Object[] o2 = {"4"};
        Object[] o3 = {"5"};

        list.add(o1);
        list.add(o2);
        list.add(o3);

//        bookService.batchAddBook(list);
//        bookService.batchUpdateBook(list);
        bookService.batchDeleteBook(list);
    }

    @Test
    public void test2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);

//        //通过JdbcTemplate查询特殊值
//        int count = bookService.queryCount();
//        System.out.println("总数为: " + count);

//        //通过JdbcTemplate查询对象
//        Book book = bookService.queryBook("2");
//        System.out.println(book);

        //通过JdbcTemplate查询集合
        List<Book> books = bookService.queryList();
        books.forEach(System.out::println);
    }

    @Test
    public void test1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);

//        //通过JdbcTemplate执行添加操作
//        Book book = new Book();
//        book.setUserId("1");
//        book.setUsername("book_1");
//        book.setUstatus("a");
//        bookService.addBook(book);

//        //通过JdbcTemplate执行修改操作
//        Book book = new Book();
//        book.setUserId("1");
//        book.setUsername("MySql");
//        book.setUstatus("b");
//        bookService.updateBook(book);

//        //通过JdbcTemplate执行删除操作
//        String id = "1";
//        bookService.deleteBook(id);
    }
}
