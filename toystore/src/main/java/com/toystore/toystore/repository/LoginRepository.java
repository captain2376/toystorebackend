package com.toystore.toystore.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.toystore.toystore.entity.UserDetails;
 
public interface LoginRepository extends JpaRepository<UserDetails, Integer> {

    Optional<UserDetails> findByUsername(String name);
    
}
