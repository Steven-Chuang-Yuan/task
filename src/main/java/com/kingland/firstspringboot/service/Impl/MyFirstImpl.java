/**
 * Copyright 2020 Kingland Systems Corporation.All Right Reserved
 */
package com.kingland.firstspringboot.service.Impl;

import com.kingland.firstspringboot.dao.MyFirstDao;
import com.kingland.firstspringboot.domain.User;
import com.kingland.firstspringboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * @author KSC
 *
 */
@Service
public class MyFirstImpl implements UserService {

    @Autowired
    private MyFirstDao myFirstDao;

    public User findUserByName(String cityName) {
        return myFirstDao.findByName(cityName);
    }
}
