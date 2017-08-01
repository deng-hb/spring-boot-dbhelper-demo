package com.denghb.demo.test;

import com.denghb.demo.domain.User;
import com.denghb.demo.service.UserService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void testCreate() throws Exception {

        User user = new User();
        user.setName("张三3");
        user.setEmail("zhangsan@qq.com");
        userService.create(user);

        Assert.assertEquals(1, userService.listAll().size());
    }


}