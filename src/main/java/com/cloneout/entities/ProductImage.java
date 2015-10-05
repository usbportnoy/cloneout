package com.cloneout.entities;

import com.bbt.blog.entities.Image;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

/**
 * Created by jasonp on 9/23/15.
 */
@Entity
public class ProductImage extends Image {
    @ManyToOne
    private Product product;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
