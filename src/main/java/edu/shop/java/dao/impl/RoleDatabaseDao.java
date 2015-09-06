package edu.shop.java.dao.impl;

import edu.shop.java.dao.RoleDao;
import edu.shop.java.models.Role;
import org.springframework.stereotype.Repository;

@Repository("roleDatabaseDao")
public class RoleDatabaseDao extends HibernateAbstractDao<Role> implements RoleDao{

    public RoleDatabaseDao() {

    }

}
