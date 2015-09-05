package edu.shop.java.models;

import java.io.Serializable;

public class Model implements Serializable {

    private static final long serialVersionUID = -4292305740271731375L;

    private Long id;

    public Model() {
    }

    public Model(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
