package service;

import bean.Book;
import dao.BookDAO;
import dao.BookDAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Chenyang
 * @create 2021-04-10-13:53
 */
@Service
public class BookService {

    //注入dao
    @Autowired
    private BookDAO bookDAO;

    public void addBook(Book book) {
        bookDAO.add(book);
    }

    public void updateBook(Book book) {
        bookDAO.update(book);
    }

    public void deleteBook(String id) {
        bookDAO.delete(id);
    }

    public int queryCount() {
        return bookDAO.queryCount();
    }

    public Book queryBook(String id){
        return bookDAO.queryBook(id);
    }

    public List<Book> queryList(){
        return bookDAO.queryList();
    }
}
