package com.example.tripfair;

/**
 * 사용자 계정 정보 모델 클래스
 */
public class UserAccount {
    private String emailId;
    private String password;
    private String idToken; //Firebase Uid

    public UserAccount() {}

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getIdToken() {
        return idToken;
    }

    public void setIdToken(String idToken) {
        this.idToken = idToken;
    }
}
