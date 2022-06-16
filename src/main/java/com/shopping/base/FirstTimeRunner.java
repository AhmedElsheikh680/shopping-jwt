package com.shopping.base;

import com.shopping.model.Order;
import com.shopping.model.Product;
import com.shopping.security.AppUser;
import com.shopping.security.UserService;
import com.shopping.service.OrderService;
import com.shopping.service.ProductService;
import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class FirstTimeRunner implements CommandLineRunner {

    private final Log log = LogFactory.getLog(FirstTimeRunner.class);

    @Autowired
    private ProductService productService;

    @Autowired
    private OrderService orderService;

    @Autowired
    private UserService userService;

    @Override
    public void run(String... args) throws Exception {
        log.info("When Project Run...");
        productService.addProduct(new Product(1L, "Product 1", 1200.1));
        productService.addProduct(new Product(2L, "Product 2", 1300.1));
        productService.addProduct(new Product(3L, "Product 3", 1400.1));
        productService.addProduct(new Product(4L, "Product 4", 1500.1));
        log.info("Product Saved Successfully!!");

        orderService.addOrder(new Order(1L, "Order 1", new Date(), 10L));
        orderService.addOrder(new Order(2L, "Order 2", new Date(), 20L));
        orderService.addOrder(new Order(3L, "Order 3", new Date(), 30L));
        orderService.addOrder(new Order(4L, "Order 4", new Date(), 40L));
        log.info("Order Saved Successfully!!");

        userService.addUser(new AppUser("admin" , "admin" , true , "ADMIN_ROLE,USER_ROLE"));
        userService.addUser(new AppUser("user" , "user" , true , "USER_ROLE"));












    }


























}
