package edu.shop.java.dao.impl;

import edu.shop.java.dao.ProductDao;
import edu.shop.java.models.Product;
import org.springframework.stereotype.Repository;

@Repository("productDatabaseDao")
public class ProductDatabaseDao extends HibernateAbstractDao<Product> implements ProductDao{

    public ProductDatabaseDao() {

    }

}
