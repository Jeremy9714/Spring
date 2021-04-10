package dao;

import bean.Book;
import com.sun.rowset.internal.Row;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Chenyang
 * @create 2021-04-10-13:53
 */
@Repository
public class BookDAOImpl implements BookDAO {

    //注入JdbcTemplate对象
    @Resource(name = "jdbcTemplate")
    private JdbcTemplate jdbcTemplate;

    //添加的方法
    @Override
    public void add(Book book) {
        String sql = "insert into t_book values(?,?,?)";
        Object[] args = new Object[]{book.getUserId(), book.getUsername(), book.getUstatus()};
        int add = jdbcTemplate.update(sql, args);
        System.out.println("影响行数为: " + add);
    }

    //修改的方法
    @Override
    public void update(Book book) {
        String sql = "update t_book set username = ?, ustatus = ? where user_id=?";
        Object[] args = new Object[]{book.getUsername(), book.getUstatus(), book.getUserId()};
        int update = jdbcTemplate.update(sql, args);
        System.out.println("影响的行数为: " + update);
    }


    //删除的方法
    @Override
    public void delete(String id) {
        String sql = "delete from t_book where user_id = ?";
        int delete = jdbcTemplate.update(sql, id);
        System.out.println("影响的行数为: " + delete);
    }

    //查询特殊值
    @Override
    public int queryCount() {
        String sql = "select count(*) from t_book";
        return jdbcTemplate.queryForObject(sql, Integer.class);
    }

    @Override
    public Book queryBook(String id) {
        String sql = "select user_id userId, username, ustatus from t_book where user_id = ?";
        return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Book>(Book.class), id);
    }

    @Override
    public List<Book> queryList() {
        String sql = "select * from t_book";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<Book>(Book.class));
    }


}
