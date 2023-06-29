package spring.data.access.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import spring.data.access.repository.JDBCTemplateProduct;
import spring.data.access.entity.Product;

@Component
@Scope("prototype")
public class ProductDao {
    @Autowired
    private JDBCTemplateProduct jdbcTemplateProduct;

    public void addProduct(Product product) {
        jdbcTemplateProduct.add(product);
    }

    public void deleteProduct(int id) {
        jdbcTemplateProduct.delete(id);
    }

    public Product getProductByID(int id) {
        return jdbcTemplateProduct.getByID(id);
    }
}
