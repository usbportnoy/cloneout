package com.bbt.blog.entities;

import javax.persistence.Entity;

@Entity
public class SecurityKey extends AbstractEntity {
    private String token;

    public String getToken() {
        return token;
    }

    public void setToken(String key) {
        this.token = key;
    }
}
