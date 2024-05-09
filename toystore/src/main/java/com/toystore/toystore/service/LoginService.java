package com.toystore.toystore.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.toystore.toystore.entity.UserDetails;
import com.toystore.toystore.model.User;
import com.toystore.toystore.repository.LoginRepository;

import jakarta.servlet.http.HttpSession;

@Service
public class LoginService {

    @Autowired
    LoginRepository repo;

    public ResponseEntity<Boolean> validateUser(User user, HttpSession session) {
        UserDetails userDetails = null;
        Optional<UserDetails> userInfo = repo.findByUsername(user.getUsername());
        if (!userInfo.isPresent()) {
            return ResponseEntity.ok(false);
        }
        userDetails = userInfo.get();
        if (!user.getPassword().equals(userDetails.getPassword())) {
            System.out.println("--Enter Valid Details--");
            return ResponseEntity.ok(false);
        }
        session.setAttribute("userId", userDetails.getUserId());
        session.setAttribute("userName", userDetails.getUsername());
       // session.setAttribute("roleId", userDetails.getRole());

        System.out.println(userDetails);
        return ResponseEntity.ok(true);
    }
    /*
     * @PostMapping("/validate-user")
     * public ResponseEntity<Boolean> validateUser(@RequestBody User user,
     * HttpSession session) {
     * UserDetails userDetails = null;
     * Optional<UserDetails> userInfo = repo.findByUsername(user.getUsername());
     * if (!userInfo.isPresent()) {
     * return ResponseEntity.ok(false);
     * }
     * userDetails = userInfo.get();
     * if (!user.getPassword().equals(userDetails.getPassword())) {
     * System.out.println("--Enter Valid Details--");
     * return ResponseEntity.ok(false);
     * }
     * session.setAttribute("userId", userDetails.getUserId());
     * session.setAttribute("userName", userDetails.getUsername());
     * session.setAttribute("roleId", userDetails.getRole());
     * 
     * System.out.println(userDetails);
     * return ResponseEntity.ok(true);
     * }
     */
}
