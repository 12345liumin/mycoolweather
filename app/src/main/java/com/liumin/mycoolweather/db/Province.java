package com.liumin.mycoolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by 刘敏 on 2019/3/12.
 */

public class Province extends DataSupport {
    private int id;
    private String provinceName;
    private int provinceCode;
    public int getId()
    {
        return id;
    }
    public void setId()
    {
        this.id=id;
    }
    public int getProvinceCode()
    {
        return provinceCode;
    }
    public void setProvinceCode()
    {
        this.provinceCode=provinceCode;
    }
    public String getProvinceName()
    {
        return provinceName;
    }
    public void setProvinceName()
    {
        this.provinceName=provinceName;
    }



}
