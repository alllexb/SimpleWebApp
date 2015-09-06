package edu.shop.java.dao.impl;

import edu.shop.java.dao.OrderDAO;
import edu.shop.java.models.Order;
import org.springframework.stereotype.Repository;

@Repository("orderDatabaseDao")
public class OrderDatabaseDao extends HibernateAbstractDao<Order> implements OrderDAO{

    public OrderDatabaseDao() {

    }

}
