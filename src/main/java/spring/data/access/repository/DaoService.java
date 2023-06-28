package spring.data.access.repository;

import spring.data.access.entity.Product;

public interface DaoService {

    void addProduct(Product product);

    void deleteProduct(Product product);

    Product getProductByID(int id);
}
