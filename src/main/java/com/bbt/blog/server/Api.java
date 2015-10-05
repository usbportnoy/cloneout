package com.bbt.blog.server;

import java.util.Collection;

public interface Api<Model> {
    Collection<Model> get();

    Model get(int id);

    Model post(Model model);

    Model put(Model model);

    Model delete(int id);

}
