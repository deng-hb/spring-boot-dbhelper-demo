package com.denghb.demo.service;

import com.denghb.demo.domain.User;

import java.util.List;

/**
 * Created by ppd on 2017/8/1.
 */
public interface UserService {

    void create(User user);

    List<User> listAll();

    User queryById(long id);
}
