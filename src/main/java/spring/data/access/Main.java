package spring.data.access;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.data.access.entity.Cart;
import spring.data.access.entity.Product;
import spring.data.access.repository.JDBCTemplateCart;
import spring.data.access.repository.JDBCTemplateProduct;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext
                = new AnnotationConfigApplicationContext("spring.data.access");

        JDBCTemplateProduct jdbcTemplateProduct = applicationContext.getBean(JDBCTemplateProduct.class);
        jdbcTemplateProduct.add(new Product(11, "Shake", 25));
        jdbcTemplateProduct.getByID(1);
        jdbcTemplateProduct.delete(11);

        JDBCTemplateCart jdbcTemplateCart = applicationContext.getBean(JDBCTemplateCart.class);
        jdbcTemplateCart.add(new Cart(4, "cart4"));
        jdbcTemplateCart.getByID(1);
        jdbcTemplateCart.delete(4);

        applicationContext.close();
    }
}
