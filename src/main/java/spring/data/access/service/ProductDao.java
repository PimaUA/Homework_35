package spring.data.access.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
import spring.data.access.repository.Dao;
import spring.data.access.entity.Product;

@Repository
@Scope("prototype")
public class ProductDao implements Dao {
    @Autowired
    private Dao daoService;

    public void addProduct(Product product) {

    }

    public void deleteProduct(Product product) {

    }

    public Product getProductByID(int id) {
        return null;
    }
}
