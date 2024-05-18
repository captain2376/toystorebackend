package com.toystore.toystore.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.toystore.toystore.entity.ProductDetails;

public interface ProductRepository extends JpaRepository<ProductDetails, Integer> {

	Optional<ProductDetails> findByPname(String pname);
}
