package spring.data.access.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import spring.data.access.dao.DaoService;
import spring.data.access.models.Product;

@Component
@Scope("prototype")
public class CartService {
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
