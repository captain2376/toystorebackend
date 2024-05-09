package com.toystore.toystore.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Integer userId;
    private String username;
    private String password;
    private String fullName;
    private String email;
    private Boolean isActive;
    private String address;
    private Date birthdate;
    private String phoneNumber;
}
