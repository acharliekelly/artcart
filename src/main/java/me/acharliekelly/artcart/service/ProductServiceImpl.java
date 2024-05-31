package me.acharliekelly.artcart.service;

import java.util.Iterable;

import me.acharliekelly.artcart.model.Product;
import me.acharliekelly.artcart.repository.*;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {

  private ProductRepository productRepository;

  @Override
  public Iterable<Product> getAllProducts() {
    return productRepository.findAll();
  }

  
}
