package com.denghb.demo.service.impl;

import com.denghb.dbhelper.DbHelper;
import com.denghb.demo.domain.User;
import com.denghb.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by denghb on 2017/8/1.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private DbHelper db;

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    @Override
    public void create(User user) {
        boolean res = db.insert(user);
        if (!res) {
            throw new RuntimeException("创建失败");
        }
    }

    @Override
    public List<User> listAll() {
        return db.list("select * from user", User.class);
    }

    @Override
    public User queryById(long id) {
        return db.queryById(User.class, id);
    }
}
