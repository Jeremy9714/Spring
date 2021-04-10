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

    //添加记录
    public void addBook(Book book) {
        bookDAO.add(book);
    }

    //修改记录
    public void updateBook(Book book) {
        bookDAO.update(book);
    }

    //删除记录
    public void deleteBook(String id) {
        bookDAO.delete(id);
    }

    //查询特殊值
    public int queryCount() {
        return bookDAO.queryCount();
    }

    //查询对象
    public Book queryBook(String id){
        return bookDAO.queryBook(id);
    }

    //查询集合
    public List<Book> queryList(){
        return bookDAO.queryList();
    }

    //批量添加
    public void batchAddBook(List<Object[]> batchArgs){
        bookDAO.batchAdd(batchArgs);
    }

    //批量修改
    public void batchUpdateBook(List<Object[]> batchArgs){
        bookDAO.batchUpdate(batchArgs);
    }

    //批量删除
    public void batchDeleteBook(List<Object[]> batchArgs){
        bookDAO.batchDelete(batchArgs);
    }
}
