package edu.shop.java.dao.impl;


import edu.shop.java.dao.ProductDao;
import edu.shop.java.models.Product;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("productFileDao")
public class ProductFileDao extends FileAbstractDao<Product> implements ProductDao{

    public ProductFileDao() {

    }

    @Override
    public List<Product> getAll() {
        return null;
    }

    @Override
    public Product getById(Long id) {
        return null;
    }

    @Override
    public String getDatasourceName() {
        return null;
    }
}
