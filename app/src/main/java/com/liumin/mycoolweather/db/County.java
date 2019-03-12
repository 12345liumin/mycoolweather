package com.liumin.mycoolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by 刘敏 on 2019/3/12.
 */

public class County extends DataSupport {
    private int id;
    private String countyNmae;
    private String weatherId;
    private int cityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyNmae() {
        return countyNmae;
    }

    public void setCountyNmae(String countyNmae) {
        this.countyNmae = countyNmae;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
