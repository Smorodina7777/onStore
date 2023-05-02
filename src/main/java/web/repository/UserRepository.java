package web.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import web.model.Order;
import web.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
  User findUserByEmail(String email);

  User findUserByEmailAndPassword(String email, String password);

  List<User> findAllByNameContaining(String name);
  List<Order> findAllById(Long id);
}
