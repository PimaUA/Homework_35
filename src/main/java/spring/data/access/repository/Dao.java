package spring.data.access.repository;

import spring.data.access.entity.Product;

public interface Dao {

    void addProduct(Product product);

    void deleteProduct(int id);

    Product getProductByID(int id);
}
