/**
 * Copyright 2020 Kingland Systems Corporation.All Right Reserved
 */
package com.kingland.springsecurity.domain;
/**
 * @author KSC
 *
 */
public class RoleUser {

    private String roleId;
    private String userId;

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
