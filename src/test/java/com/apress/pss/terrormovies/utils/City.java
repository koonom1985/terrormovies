package com.apress.pss.terrormovies.utils;

import java.util.List;

/**
 * Created by john on 14-7-31.
 */
public class City {
    private String city_name;
    private List<District> districts;

    public String getCity_name() {
        return city_name;
    }

    public void setCity_name(String city_name) {
        this.city_name = city_name;
    }

    public List<District> getDistricts() {
        return districts;
    }

    public void setDistricts(List<District> districts) {
        this.districts = districts;
    }
}
