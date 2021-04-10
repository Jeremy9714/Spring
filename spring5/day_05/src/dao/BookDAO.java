package dao;

import bean.Book;

import java.util.List;

/**
 * @author Chenyang
 * @create 2021-04-10-13:52
 */
public interface BookDAO {
    void add(Book book);

    void update(Book book);

    void delete(String id);

    int queryCount();

    Book queryBook(String id);

    List<Book> queryList();

    void batchAdd(List<Object[]> batchArgs);

    void batchUpdate(List<Object[]> batchArgs);

    void batchDelete(List<Object[]> batchArgs);
}
