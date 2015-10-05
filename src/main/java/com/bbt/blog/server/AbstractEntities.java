package com.bbt.blog.server;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.*;
import java.util.Collection;

/**
 * Created by jasonp on 9/15/15.
 */
public class AbstractEntities<Model> implements Api<Model> {
    @PersistenceContext
    private EntityManager entityManager;

    private Class<Model> type;

    public AbstractEntities(Class<Model> type) {
        this.type = type;
    }

    @GET
    public Collection<Model> get() {
        return entityManager.createQuery(String.format("from %s", type.getSimpleName())).getResultList();
    }

    @GET
    @Path("/{id}")
    public Model get(@PathParam("id") int id) {
        return entityManager.find(type, id);
    }

    @POST
    @Path("/")
    public Model post(Model model) {
        entityManager.persist(model);
        return model;
    }

    @PUT
    @Path("/")
    public Model put(Model model) {
        return entityManager.merge(model);
    }

    @DELETE
    @Path("/{id}")
    public Model delete(@PathParam("id") int id) {
        Model model = entityManager.find(type, id);
        entityManager.remove(model);
        return model;
    }
}
