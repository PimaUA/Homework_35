package spring.data.access.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import spring.data.access.repository.DaoService;
import spring.data.access.entity.Product;

@Component
@Scope("prototype")
public class ProductService implements DaoService {
    @Autowired
    private DaoService daoService;

    public void addProduct(Product product) {

    }

    public void deleteProduct(Product product) {

    }

    public Product getProductByID(int id) {
        return null;
    }
}
