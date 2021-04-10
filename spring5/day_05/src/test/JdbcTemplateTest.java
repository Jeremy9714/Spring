package test;

import bean.Book;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.BookService;

import java.util.List;

/**
 * @author Chenyang
 * @create 2021-04-10-13:56
 */
public class JdbcTemplateTest {

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
