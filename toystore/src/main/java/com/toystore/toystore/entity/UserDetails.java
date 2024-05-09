package com.toystore.toystore.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "sj_user_details")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDetails {
    
    @Id
    private Integer userId;
    private String username;
    private String password;
    private String fullName;
    private String email;
    private Boolean isActive;
    private String address;
    private Date birthdate;
    private String phoneNumber;
    //private Integer role;
    
}
