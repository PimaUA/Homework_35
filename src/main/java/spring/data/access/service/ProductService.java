package spring.data.access.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Component;
import spring.data.access.repository.ProductRepository;
import spring.data.access.entity.Product;

@Component
@Scope("prototype")
public class ProductService {
    private static final Logger LOGGER = LogManager.getLogger();
    @Autowired
    private ProductRepository productRepository;

    public void addProduct(Product product) {
        try {
            productRepository.add(product);
        } catch (DuplicateKeyException e) {
            LOGGER.info("Such ID already exists: " + e);
        }
    }

    public void deleteProduct(int id) {
        try {
            productRepository.delete(id);
        } catch (EmptyResultDataAccessException e) {
            LOGGER.info("No such product found: " + e);
        }
    }

    public Product getProductByID(int id) {
        Product product = null;
        try {
            product = productRepository.getByID(id);
        } catch (EmptyResultDataAccessException e) {
            LOGGER.info("No such product found: " + e);
        }
        return product;
    }
}
