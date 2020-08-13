/**
 * Copyright 2020 Kingland Systems Corporation.All Right Reserved
 */
package com.kingland.springsecurity.mapper;

import com.kingland.springsecurity.domain.RoleUser;
import com.kingland.springsecurity.domain.User;
import org.springframework.stereotype.Repository;

import java.util.List;
/**
 * @author KSC
 *
 */
@Repository
public interface UserMapper {

    User findByUserName(String username);

    Integer saveUser(User user);

    List<User> findAll();

    Integer addRoleInfo(RoleUser roleUser);


}
