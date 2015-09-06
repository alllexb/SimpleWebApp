package edu.shop.java.dao.impl;

import edu.shop.java.dao.UserDao;
import edu.shop.java.models.User;
import org.springframework.stereotype.Repository;

@Repository("userDatabaseDao")
public class UserDatabaseDao extends HibernateAbstractDao<User> implements UserDao{

    public UserDatabaseDao() {

    }

}
