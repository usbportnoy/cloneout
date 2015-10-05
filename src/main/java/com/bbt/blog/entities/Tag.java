package com.bbt.blog.entities;

import com.bbt.blog.entities.AbstractEntity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Tag extends AbstractEntity {
    @Column(unique=true)
    private String name;

}
