package me.acharliekelly.artcart.service;



import me.acharliekelly.artcart.model.Product;

public interface ProductService {
  
  Iterable<Product> getAllProducts();
  
  Product getProduct(long id);

  Product save(Product product);
}
