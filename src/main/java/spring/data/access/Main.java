package spring.data.access;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.data.access.entity.Cart;
import spring.data.access.entity.Product;
import spring.data.access.service.CartService;
import spring.data.access.service.ProductService;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext
                = new AnnotationConfigApplicationContext("spring.data.access");

        ProductService productService = applicationContext.getBean(ProductService.class);
        productService.addProduct(new Product(11, "Shake", 25));
        productService.getProductByID(11);
        productService.deleteProduct(11);

        CartService cartService = applicationContext.getBean(CartService.class);
        cartService.addCart(new Cart(4, "cart4"));
        cartService.getCartByID(4);
        cartService.deleteCart(4);

        applicationContext.close();
    }
}
