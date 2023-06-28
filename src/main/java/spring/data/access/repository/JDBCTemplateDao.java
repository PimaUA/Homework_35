package spring.data.access.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import spring.data.access.entity.Product;

import javax.sql.DataSource;

@Repository
public class JDBCTemplateDao implements Dao {
    private final String SQL_FIND_BY_ID = "select * from people where id = ?";
    private final String SQL_DELETE = "delete from people where id = ?";
    private final String SQL_INSERT = "insert into people(id, first_name, last_name, age) values(?,?,?,?)";

private JdbcTemplate jdbcTemplate;

    @Autowired
    public void init(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public void addProduct(Product product) {
        return jdbcTemplate.update(SQL_INSERT_PERSON, person.getId(), person.getFirstName(), person.getLastName(),
                person.getAge()) > 0;
    }

    @Override
    public void deleteProduct(int id) {
        return jdbcTemplate.update(SQL_DELETE_PERSON, person.getId()) > 0;
    }

    @Override
    public Product getProductByID(int id) {
        return jdbcTemplate.queryForObject(SQL_FIND_PERSON, new Object[] { id }, new PersonMapper());
    }
}
