/**
 * Copyright 2020 Kingland Systems Corporation.All Right Reserved
 */
package com.kingland.firstspringboot.dao;
/**
 * @author KSC
 * interface
 */
import com.kingland.firstspringboot.domain.User;
import org.apache.ibatis.annotations.Param;

public interface MyFirstDao {
    User findByName(@Param("cityName") String cityName);


}
