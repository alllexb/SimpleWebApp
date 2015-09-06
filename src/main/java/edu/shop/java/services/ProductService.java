package edu.shop.java.services;

import edu.shop.java.dao.ProductDao;
import edu.shop.java.models.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service(value = "productService")
public class ProductService {

    @Autowired
    @Qualifier("productDatabaseDao")
    private ProductDao productDao;

    public ProductService() {

    }

    @Transactional
    public List<Product> getAll(){
        return productDao.getAll();
    }
}
