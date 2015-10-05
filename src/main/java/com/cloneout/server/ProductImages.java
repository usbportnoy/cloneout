package com.cloneout.server;

import com.bbt.blog.entities.Video;
import com.bbt.blog.server.AbstractEntities;
import com.cloneout.entities.ProductImage;

import javax.ejb.Stateful;
import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * Created by jasonp on 9/23/15.
 */
@Path("/productimages")
@Consumes({"application/json"})
@Produces({"application/json"})
@Stateful
public class ProductImages extends AbstractEntities<ProductImage>{
    public ProductImages() {
        super(ProductImage.class);
    }
}
