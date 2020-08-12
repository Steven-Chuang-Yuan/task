/**
 * Copyright 2020 Kingland Systems Corporation.All Right Reserved
 */
package com.kingland.firstspringboot;

import com.kingland.firstspringboot.dao.MyFirstDao;
import com.kingland.firstspringboot.domain.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author KSC
 * test postgres connect
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class DatabaseConnectTest {
    @Autowired
    private MyFirstDao myFirstDao;
    @Test
    public void testDao(){
        User testUser=myFirstDao.findByName("shenyang");
        Assert.assertEquals(testUser.getProvinceId(),1);
    }
}

