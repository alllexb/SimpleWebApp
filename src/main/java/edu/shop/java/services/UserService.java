package edu.shop.java.services;

import edu.shop.java.dao.UserDao;
import edu.shop.java.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class UserService {

    @Autowired
    @Qualifier(value = "userFileDao")
    private UserDao userDao;

    public UserService() {
    }

    @Transactional
    public List<User> getAll(){
        return userDao.getAll();
    }
}
