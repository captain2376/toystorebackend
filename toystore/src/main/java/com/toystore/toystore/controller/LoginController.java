package com.toystore.toystore.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.toystore.toystore.model.User;
import com.toystore.toystore.service.LoginService;

//@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class LoginController {

    @Autowired
    LoginService loginService;

    
    @PostMapping("/validate-user")
    public ResponseEntity<Boolean> validateUser(@RequestBody User user, HttpSession session) {
        System.out.println(user);
        return loginService.validateUser(user, session);
    }

   /*  @PostMapping("/validateUser")
    public ResponseEntity<String> validateUser(@RequestBody User user, HttpSession session) {
        String message = "";
        boolean result = false;
        String username = user.getUsername();
        String password = user.getPassword();
        if (username.isEmpty() || username == null || password.isEmpty() || password == null) {
            message = "Please Enter Username and Password";
            return ResponseEntity.badRequest().body(message);
        }
        try {
            if (!username.isEmpty() && !password.isEmpty()) {
                result = loginService.validateUser(user, session);
                if (!result) {
                    message = "Invalid login Credentials";
                    return ResponseEntity.badRequest().body(message);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            message = "An error occurred during validation";
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(message);
        }

        return ResponseEntity.ok().body("Success");
    }*/
}
