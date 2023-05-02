package web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Order;
import web.model.Product;
import web.model.User;
import web.service.ProductServiceEntity;
import web.service.UserServiceEntity;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class ProductController {

    private final ProductServiceEntity productService;

    @PostMapping(value = "/product")
    public ResponseEntity<Product> addProduct(){
        return ResponseEntity.ok(productService.saveProduct(new Product()));
    }
    @GetMapping(value = "/product")
    public ResponseEntity<String> getProductList() {
        List<Product> products = productService.listAll();
        return ResponseEntity.ok(products.toString());
}}