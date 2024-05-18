package com.toystore.toystore.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class LoginRequestVO {

    @NotBlank(message = "Username cannot be blank")
    private String userName;

    @NotBlank(message = "Password cannot be blank")
    @Size(min = 8, message = "Password must be at least 8 characters long")
    private String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "LoginRequestVO [userName=" + userName + ", password=" + password + "]";
    }
}
