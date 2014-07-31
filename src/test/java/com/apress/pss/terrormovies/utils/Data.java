package com.apress.pss.terrormovies.utils;

import java.util.List;

/**
 * Created by john on 14-7-31.
 */
public class Data {
    private String status;
    private List<City> cities;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<City> getCities() {
        return cities;
    }

    public void setCities(List<City> cities) {
        this.cities = cities;
    }
}
