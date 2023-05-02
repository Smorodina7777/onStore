package web.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.model.Order;
import web.model.User;
import web.repository.OrderRepository;
import web.repository.UserRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class OrderServiceEntity {
  private final OrderRepository orderRepo;

  public Order saveOrder(Order order) {
    return orderRepo.save(order);
  }
}
