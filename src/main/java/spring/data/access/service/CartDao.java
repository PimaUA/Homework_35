package spring.data.access.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import spring.data.access.entity.Cart;
import spring.data.access.repository.JDBCTemplateCart;

@Component
@Scope("prototype")
public class CartDao {
    @Autowired
    private JDBCTemplateCart jdbcTemplateCart;

    public void addProduct(Cart cart) {
        jdbcTemplateCart.add(cart);
    }

    public void deleteProduct(int id) {
        jdbcTemplateCart.delete(id);
    }

    public Cart getCartByID(int id) {
        return jdbcTemplateCart.getByID(id);
    }
}
