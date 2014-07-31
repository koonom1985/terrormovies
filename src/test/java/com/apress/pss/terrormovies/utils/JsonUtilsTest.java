package com.apress.pss.terrormovies.utils;

import com.google.gson.Gson;
import org.apache.commons.io.FileUtils;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.io.File;
import java.net.URI;

/**
 * Created by john on 14-7-31.
 */
public class JsonUtilsTest {

    private FileUtils fileUtils;
    private String jsonStr;

    @Before
    public void setUp() throws Exception{
        fileUtils = new FileUtils();
        URI uri = Thread.currentThread().getContextClassLoader().
                getResource("test.json").toURI();
        File jsonFile = new File(uri);
        jsonStr = fileUtils.readFileToString(jsonFile);
    }

    @Ignore
    public void testTransformJsonTextToList() throws Exception {

        JSONParser parser = new JSONParser();

        jsonStr.replaceAll("'","\"");

        Object obj = parser.parse(jsonStr);
        JSONObject jsonObject = (JSONObject) obj;
        String status = (String) jsonObject.get("status");

        System.out.println(status);

        JSONArray cities = (JSONArray) jsonObject.get("cities");

        for (int index = 0;cities.size()>index;index++) {
            JSONObject city = (JSONObject) cities.get(index);
            System.out.println("city_name:"+city.get("city_name"));
            JSONArray districts = (JSONArray) city.get("districts");
            for (int dindex = 0;districts.size()>dindex;dindex++) {
                JSONObject district = (JSONObject) districts.get(dindex);
                System.out.println(" - >district_name:"+district.get("district_name"));
                JSONArray neighborhoods = (JSONArray) district.get("neighborhoods");
                System.out.println(" - >neighborhoods:"+neighborhoods);
            }
        }
    }

    @Ignore
    public void testTransformJsonToBean() throws Exception {
        Data data = new Gson().fromJson(jsonStr, Data.class);
        System.out.println("status:"+data.getStatus());

        for (City city : data.getCities()) {
            System.out.println("city_name:"+city.getCity_name());
            for (District district : city.getDistricts()) {
                System.out.println(" - > district_name:"+district.getDistrict_name());
                for (String neighborhood : district.getNeighborhoods()) {
                    System.out.println("  - > neighborhood:" + neighborhood);
                }
            }
        }
    }

}
