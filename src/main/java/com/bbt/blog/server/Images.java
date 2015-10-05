package com.bbt.blog.server;

import com.bbt.blog.entities.Image;

import javax.ejb.Stateful;
import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * Created by jasonp on 9/23/15.
 */
@Path("/images")
@Consumes({"application/json"})
@Produces({"application/json"})
@Stateful
public class Images extends AbstractEntities<Image> {
    public Images() {
        super(Image.class);
    }
}
