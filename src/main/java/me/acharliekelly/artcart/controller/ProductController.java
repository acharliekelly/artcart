package me.acharliekelly.artcart.controller;

import me.acharliekelly.artcart.model.Product;
import me.acharliekelly.artcart.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping(value = { "", "/" })
    public Iterable<Product> getProducts() {
        return productService.getAllProducts();
    }

}
