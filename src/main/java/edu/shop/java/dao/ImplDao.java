package edu.shop.java.dao;

import edu.shop.java.models.Model;

import java.util.List;

public interface ImplDao<T extends Model> {

    public List<T> getAll();

    public  T getById(Long id);

    public void add( T model);

    public void update(T model);

    public void remove(T model);
}
