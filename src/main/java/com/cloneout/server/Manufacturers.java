package com.cloneout.server;

import com.bbt.blog.entities.Image;
import com.bbt.blog.server.AbstractEntities;
import com.cloneout.entities.Manufacturer;

import javax.ejb.Stateful;
import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * Created by jasonp on 9/23/15.
 */
@Path("/manufacturers")
@Consumes({"application/json"})
@Produces({"application/json"})
@Stateful
public class Manufacturers extends AbstractEntities<Manufacturer> {
    public Manufacturers() {
        super(Manufacturer.class);
    }
}
