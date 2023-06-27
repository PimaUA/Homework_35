package spring.data.access.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import spring.data.access.dao.DaoService;
import spring.data.access.models.Product;

@Component
@Scope
public class CartDaoService implements DaoService {
@Autowired
DaoService daoService;


    @Override
    public void addProduct(Product product) {

    }

    @Override
    public void deleteProduct(Product product) {

    }

    @Override
    public Product getProductByID(int id) {
        return null;
    }
}
