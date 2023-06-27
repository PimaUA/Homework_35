package spring.data.access.dao;

import spring.data.access.models.Product;

public interface DaoService {

    void addProduct(Product product);

    void deleteProduct(Product product);

    Product getProductByID(int id);
}
