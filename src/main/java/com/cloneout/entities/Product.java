package com.cloneout.entities;

import com.bbt.blog.entities.AbstractEntity;
import com.bbt.blog.entities.Image;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;

/**
 * Created by jasonp on 9/23/15.
 */
@Entity
public class Product extends AbstractEntity{
    @ManyToOne
    private Manufacturer manufacturer;
    private String url;
    private float price;

    @OneToMany
    private List<Product> clones;

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public List<Product> getClones() {
        return clones;
    }

    public void setClones(List<Product> clones) {
        this.clones = clones;
    }
}
