package com.bbt.blog.entities;

import org.joda.time.DateTime;

import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;
import java.util.List;

@MappedSuperclass
public class Video extends AbstractEntity {
    @OneToMany
    private List<Entry> entry;
    private DateTime created;

    public List<Entry> getEntry() {
        return entry;
    }

    public void setEntry(List<Entry> entry) {
        this.entry = entry;
    }

    public DateTime getCreated() {
        return created;
    }

    public void setCreated(DateTime created) {
        this.created = created;
    }
}
