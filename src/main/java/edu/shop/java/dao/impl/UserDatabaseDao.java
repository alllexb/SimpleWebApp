package edu.shop.java.dao.impl;

import edu.shop.java.dao.UserDao;
import edu.shop.java.models.User;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

@Repository("userDatabaseDao")
public class UserDatabaseDao extends HibernateAbstractDao<User> implements UserDao{

    public UserDatabaseDao() {

    }

    @Override
    public User getByUsername(String username) {
        Criteria criteria = getSession().createCriteria(User.class);
        criteria.add(Restrictions.eq("username", username));
        return (User) criteria.uniqueResult();
    }
}
