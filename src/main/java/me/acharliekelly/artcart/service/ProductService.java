package me.acharliekelly.artcart.service;

import java.util.Iterable;

import me.acharliekelly.artcart.model.Product;

public interface ProductService {
  
  public Iterable<Product> getAllProducts();
  
  public Product getProduct(long id);

  public Product save(Product product);
}
