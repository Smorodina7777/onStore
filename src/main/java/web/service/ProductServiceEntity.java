package web.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.model.Product;
import web.model.User;
import web.repository.ProductRepository;
import web.repository.UserRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class ProductServiceEntity {
  private final ProductRepository productRepo;

  public Product saveProduct(Product product) {
    return productRepo.save(product);
  }
  public List<Product> listAll() {
    return (List<Product>) productRepo.findAll();
  }
}
