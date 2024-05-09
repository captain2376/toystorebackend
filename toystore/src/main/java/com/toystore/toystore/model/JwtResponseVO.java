package com.toystore.toystore.model;

import java.math.BigInteger;

public class JwtResponseVO {

    private String token;

    private String userName;

    private Integer role;

    private String hospitalName;

    private BigInteger hospCode;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    public BigInteger getHospCode() {
        return hospCode;
    }

    public void setHospCode(BigInteger hospCode) {
        this.hospCode = hospCode;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    @Override
    public String toString() {
        return "JwtResponseVO [token=" + token + ", userName=" + userName + ", role=" + role + ", hospitalName="
                + hospitalName + "]";
    }

}
