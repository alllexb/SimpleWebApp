package edu.shop.java.dao.impl;

import edu.shop.java.dao.ProductCategoryDao;
import edu.shop.java.models.ProductCategory;
import org.springframework.stereotype.Repository;

@Repository("productCategoryDatabaseDAO")
public class ProductCategoryDatabaseDAO extends HibernateAbstractDao<ProductCategory> implements ProductCategoryDao{

    public ProductCategoryDatabaseDAO() {

    }

}
