package com.example.jfs_jwt.controller.dto;

public class Token {

    final private String accessToken;

    public Token (String accessToken) {
        this.accessToken = accessToken;
    }
    public String getAccessToken() {
        return this.accessToken;
    }
}
