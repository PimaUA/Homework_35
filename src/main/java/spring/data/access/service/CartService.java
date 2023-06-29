package spring.data.access.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Component;
import spring.data.access.entity.Cart;
import spring.data.access.repository.CartRepository;

@Component
@Scope("prototype")
public class CartService {
    private static final Logger LOGGER = LogManager.getLogger();
    @Autowired
    private CartRepository cartRepository;

    public void addCart(Cart cart) {
        try {
            cartRepository.add(cart);
        } catch (DuplicateKeyException e) {
            LOGGER.info("Such ID already exists: " + e);
        }
    }

    public void deleteCart(int id) {
        try {
            cartRepository.delete(id);
        } catch (EmptyResultDataAccessException e) {
            LOGGER.info("No such product found: " + e);
        }
    }

    public Cart getCartByID(int id) {
        Cart cart = null;
        try {
            cart = cartRepository.getByID(id);
        } catch (EmptyResultDataAccessException e) {
            LOGGER.info("No such product found: " + e);
        }
        return cart;
    }
}
