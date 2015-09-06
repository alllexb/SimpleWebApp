package edu.shop.java.dao.impl;

import edu.shop.java.dao.RoleDao;
import edu.shop.java.models.Role;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("roleFileDao")
public class RoleFileDao extends FileAbstractDao<Role> implements RoleDao{

    public RoleFileDao() {

    }

    @Override
    public List<Role> getAll() {
        return null;
    }

    @Override
    public Role getById(Long id) {
        return null;
    }

    @Override
    public String getDatasourceName() {
        return null;
    }
}
