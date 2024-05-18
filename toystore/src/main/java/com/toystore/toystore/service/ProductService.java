package com.toystore.toystore.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.toystore.toystore.entity.ProductDetails;
import com.toystore.toystore.model.ApiResponse;
import com.toystore.toystore.model.ProductVO;
import com.toystore.toystore.repository.ProductRepository;

@Service
public class ProductService {
	
	 @Autowired
	 ProductRepository prodRepo;
	 
	 public List<ProductDetails>  getAllProducts() {
		 return prodRepo.findAll();
	 }

	public ResponseEntity<?> addProduct(ProductVO product, HttpSession session) {
		 ProductDetails newProd = new ProductDetails();
		 newProd.setPname(product.getPname());
		 newProd.setPimage(product.getPimage());
		 newProd.setPdescription(product.getPdescription());
		 newProd.setPrice(product.getPrice());
 		 //newProd.setAddedBy((String) session.getAttribute("userId"));
		 newProd.setAddedBy("Sindhu");
 		 try {
 			prodRepo.save(newProd);
 			return ResponseEntity.status(HttpStatus.CREATED)
                    .body(new ApiResponse(true, "Product added successfully"));
 			//return true;
		} catch (Exception e) {
			 e.printStackTrace();
			 return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                     .body(new ApiResponse(false, "Error adding product"));
			 //return false;
		}
		 
	}
}
