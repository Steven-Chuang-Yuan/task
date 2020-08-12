/**
 * Copyright 2020 Kingland Systems Corporation.All Right Reserved
 */
package com.kingland.firstspringboot.controller;

import com.kingland.firstspringboot.domain.User;
import com.kingland.firstspringboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
/**
 * @author KSC
 * url  path
 */
@RestController
public class MyFirstController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/api/user", method = RequestMethod.GET)
    public User findOneUser(@RequestParam(value = "cityName", required = true) String cityName) {
        return userService.findUserByName(cityName);
    }
}
