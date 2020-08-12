/**
 * Copyright 2020 Kingland Systems Corporation.All Right Reserved
 */
package com.kingland.firstspringboot.domain;

/**
 * @author KSC
 * create entity
 */
public class User {
        private String cityName;
        private String cityDescription;
        private int Id;
        private int provinceId;

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCityDescription() {
        return cityDescription;
    }

    public void setCityDescription(String cityDescription) {
        this.cityDescription = cityDescription;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }


}


