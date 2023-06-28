package spring.data.access.mapper;

import org.springframework.jdbc.core.RowMapper;
import spring.data.access.entity.Cart;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CartMapper implements RowMapper<Cart> {

    @Override
    public Cart mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        Cart cart = new Cart();
        cart.setId(resultSet.getInt("id"));
        cart.setName(resultSet.getString("name"));
        return cart;
    }
}
