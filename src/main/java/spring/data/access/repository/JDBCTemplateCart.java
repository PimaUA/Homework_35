package spring.data.access.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import spring.data.access.entity.Cart;
import spring.data.access.mapper.CartMapper;

import javax.sql.DataSource;

@Repository
public class JDBCTemplateCart implements ObjectRepository<Cart> {
    private final String SQL_FIND_BY_ID = "select * from carts where id = ?";
    private final String SQL_DELETE = "delete from carts where id = ?";
    private final String SQL_INSERT = "insert into carts(id, name) values(?,?)";

private JdbcTemplate jdbcTemplate;

    @Autowired
    public void init(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public boolean add(Cart cart) {
        return jdbcTemplate.update(SQL_INSERT, cart.getId(), cart.getName()) > 0;
    }

    @Override
    public boolean delete(int id) {
        Cart cart=getByID(id);
        return jdbcTemplate.update(SQL_DELETE, cart.getId()) > 0;
    }

    @Override
    public Cart getByID(int id) {
        return jdbcTemplate.queryForObject(SQL_FIND_BY_ID, new CartMapper(),id);
    }
}
