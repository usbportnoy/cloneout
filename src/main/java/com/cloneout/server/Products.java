package com.cloneout.server;

import com.bbt.blog.entities.Tag;
import com.bbt.blog.server.AbstractEntities;
import com.cloneout.entities.Product;

import javax.ejb.Stateful;
import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/products")
@Consumes({"application/json"})
@Produces({"application/json"})
@Stateful
public class Products extends AbstractEntities<Product> {
    public Products() {
        super(Product.class);
    }
}