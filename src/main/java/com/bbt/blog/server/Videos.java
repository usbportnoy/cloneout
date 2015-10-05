package com.bbt.blog.server;

import com.bbt.blog.entities.Video;

import javax.ejb.Stateful;
import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * Created by jasonp on 9/23/15.
 */
@Path("/videos")
@Consumes({"application/json"})
@Produces({"application/json"})
@Stateful
public class Videos extends AbstractEntities<Video>{
    public Videos() {
        super(Video.class);
    }
}
