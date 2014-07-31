package com.apress.pss.terrormovies.utils;

import java.util.List;

/**
 * Created by john on 14-7-31.
 */
public class District {
    private String district_name;
    private List<String> neighborhoods;

    public String getDistrict_name() {
        return district_name;
    }

    public void setDistrict_name(String district_name) {
        this.district_name = district_name;
    }

    public List<String> getNeighborhoods() {
        return neighborhoods;
    }

    public void setNeighborhoods(List<String> neighborhoods) {
        this.neighborhoods = neighborhoods;
    }
}
