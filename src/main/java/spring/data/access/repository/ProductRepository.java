package spring.data.access.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import spring.data.access.entity.Product;
import spring.data.access.mapper.ProductMapper;

import javax.sql.DataSource;

@Repository
public class ProductRepository implements ObjectRepository<Product> {
    private final String SQL_FIND_BY_ID = "select * from products where id = ?";
    private final String SQL_DELETE = "delete from products where id = ?";
    private final String SQL_INSERT = "insert into products(id, name, price) values(?,?,?)";

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void init(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public void add(Product product) {
        jdbcTemplate.update(SQL_INSERT, product.getId(), product.getName(), product.getPrice());
    }

    @Override
    public void delete(int id) {
        Product product = getByID(id);
        jdbcTemplate.update(SQL_DELETE, product.getId());
    }

    @Override
    public Product getByID(int id) {
        return jdbcTemplate.queryForObject(SQL_FIND_BY_ID, new ProductMapper(), id);
    }
}
