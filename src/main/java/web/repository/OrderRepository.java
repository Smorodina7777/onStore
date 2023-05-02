package web.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import web.model.Order;
import web.model.User;

import java.util.List;

@Repository
public interface OrderRepository extends CrudRepository<Order, Long> {


  List<Order> findAllByUser_id(Long user_id);
  List<Order> findAllById(Long id);
  Order findOrderByIdIs(Long id);
  void deleteById(Long id);
}
