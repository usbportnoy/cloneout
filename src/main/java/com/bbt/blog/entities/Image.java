package com.bbt.blog.entities;

import org.joda.time.DateTime;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

/**
 * Created by jasonp on 9/20/15.
 */
@Entity
public class Image  extends MediaItem {
    private String title;
    private String description;
    private DateTime created;
    private String url;

    @OneToMany
    private List<Entry> entires;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public DateTime getCreated() {
        return created;
    }

    public void setCreated(DateTime created) {
        this.created = created;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
