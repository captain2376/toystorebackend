package com.toystore.toystore.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.toystore.toystore.entity.ProductDetails;
import com.toystore.toystore.model.ProductVO;
import com.toystore.toystore.model.User;
import com.toystore.toystore.service.ProductService;

//@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class ProductController {
	@Autowired
	ProductService prodService;

	@GetMapping("/viewproducts")
	public ResponseEntity<List<ProductDetails>> getAllProductDetails() {
		List<ProductDetails> products = prodService.getAllProducts();
		return new ResponseEntity<>(products, HttpStatus.OK);
	}
	@PostMapping("/addproduct")
    public ResponseEntity<?> validateUser(@RequestBody ProductVO product, HttpSession session) {
        System.out.println(product);
        return prodService.addProduct(product, session);
    }
}
