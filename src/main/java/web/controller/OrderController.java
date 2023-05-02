package web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Order;
import web.model.User;
import web.service.OrderServiceEntity;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class OrderController {

    private final OrderServiceEntity orderService;
@GetMapping("/order")
    public ResponseEntity<Order> addOrder(){
        return ResponseEntity.ok(orderService.saveOrder(new Order()));
    }






}