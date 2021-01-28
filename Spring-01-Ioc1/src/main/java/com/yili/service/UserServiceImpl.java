package com.yili.service;

import com.yili.dao.UserDao;
import com.yili.dao.UserDaoImpl;

public class UserServiceImpl implements UserService{
    private UserDao userDao;

    public UserServiceImpl(UserDao userDao){
        this.userDao = userDao;
        System.out.println("构造方法调用"+userDao);
    }

    @Override
    public void getUser() {
        userDao.getUser();
    }
}
