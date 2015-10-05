package com.bbt.blog.server;

import com.bbt.blog.entities.Tag;

import javax.ejb.Stateful;
import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/tags")
@Consumes({"application/json"})
@Produces({"application/json"})
@Stateful
public class Tags extends AbstractEntities<Tag> {
    public Tags() {
        super(Tag.class);
    }
}