/**
 * Copyright 2020 Kingland Systems Corporation.All Right Reserved
 */
package com.kingland.firstspringboot.service;
import com.kingland.firstspringboot.domain.User;
/**
 * @author KSC
 *
 */
public interface UserService {
    User findUserByName(String cityName);
}
