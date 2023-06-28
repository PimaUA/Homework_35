package spring.data.access.mapper;

import org.springframework.jdbc.core.RowMapper;
import spring.data.access.entity.Product;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductMapper implements RowMapper<Product> {

    @Override
    public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
        return null;
    }
}
