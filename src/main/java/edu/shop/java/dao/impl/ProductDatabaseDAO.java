package edu.shop.java.dao.impl;

import edu.shop.java.dao.ProductDao;
import edu.shop.java.models.Product;
import org.springframework.stereotype.Repository;

@Repository("productDatabaseDAO")
public class ProductDatabaseDAO extends HibernateAbstractDao<Product> implements ProductDao{

    public ProductDatabaseDAO() {

    }

}
