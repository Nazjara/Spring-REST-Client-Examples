package com.nazjara.service;

import com.nazjara.model.UserData;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceImplTest {

    @Autowired
    UserService userService;

    @Test
    public void testGetUsers() throws Exception {
        UserData userData = userService.getUsers(1);

        assertEquals(1, userData.getData().size());
    }
}