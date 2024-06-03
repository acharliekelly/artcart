package me.acharliekelly.artcart.service;

import me.acharliekelly.artcart.model.Product;
import me.acharliekelly.artcart.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class ProductServiceImpl implements ProductService {

  @Autowired
  private ProductRepository productRepository;

  @Override
  public Iterable<Product> getAllProducts() {
    return productRepository.findAll();
  }

  @Override
  public Product getProduct(long id) {
    Product product = productRepository.findById(id).get();
    return product;
  }

  @Override
  public Product save(Product product) {
    return productRepository.save(product);
  }


}
