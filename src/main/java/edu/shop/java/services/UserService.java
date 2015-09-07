package edu.shop.java.services;

import edu.shop.java.dao.UserDao;
import edu.shop.java.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("userService")
public class UserService implements UserDetailsService{

    @Autowired
    @Qualifier(value = "userDatabaseDao")
    private UserDao userDao;

    public UserService() {
    }

    @Transactional
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userDao.getByUsername(username);

        System.err.println("Usser: " + username );

        if (user == null) {
            throw new UsernameNotFoundException("User with Username: " + username + " not found!");
        }

        return user;
    }

    @Transactional
    public List<User> getAll(){
        return userDao.getAll();
    }
}
