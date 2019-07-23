package com.gld.ncs.controller;

import com.gld.ncs.dao.UserDao;
import com.gld.ncs.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class UserController {

    @Autowired
    private UserDao userDao;

    @RequestMapping(value="/users", method = RequestMethod.GET)
    List<User> getUsers()  {
        return userDao.selectUsers();
    }

    @RequestMapping(value="/users", method = RequestMethod.DELETE)
    void deleteById(int id)  {
        userDao.deleteById(id);
    }
}
