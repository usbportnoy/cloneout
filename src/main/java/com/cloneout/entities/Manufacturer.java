package com.cloneout.entities;


import com.bbt.blog.entities.AbstractEntity;

import javax.persistence.Entity;

/**
 * Created by jasonp on 9/23/15.
 */
@Entity
public class Manufacturer extends AbstractEntity{
    private String name;
    private String country;
    private String url;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
