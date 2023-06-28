package spring.data.access.mapper;

import org.springframework.jdbc.core.RowMapper;
import spring.data.access.entity.Cart;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CartMapper implements RowMapper<Cart> {

    @Override
    public Cart mapRow(ResultSet rs, int rowNum) throws SQLException {
        return null;
    }
}
