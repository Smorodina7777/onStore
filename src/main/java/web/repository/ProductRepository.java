package web.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import web.model.Product;
import web.model.User;

import java.util.List;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {
  Product findProductByDescriptionContaining(String description);

  Product findProductByPrice(Integer price);

  List<Product> findAllByNameContaining(String name);
  Product findProductByIdIs(Long id);
  void deleteById(Long id);
}
