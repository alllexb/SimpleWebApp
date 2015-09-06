package edu.shop.java.dao;

import edu.shop.java.models.User;

public interface UserDao extends ImplDao<User> {

    User getByUsername(String username);

}
