package com.tripadv.mty.domain.hotel.category;

import java.io.Serializable;

public class HotelStyle implements Serializable {
    private Integer hst_id;
    private String hst_name;

    public HotelStyle() {
    }

    public HotelStyle(Integer hst_id, String hst_name) {
        this.hst_id = hst_id;
        this.hst_name = hst_name;
    }

    public Integer getHst_id() {
        return hst_id;
    }

    public void setHst_id(Integer hst_id) {
        this.hst_id = hst_id;
    }

    public String getHst_name() {
        return hst_name;
    }

    public void setHst_name(String hst_name) {
        this.hst_name = hst_name;
    }

    @Override
    public String toString() {
        return "HotelStyle{" +
                "hst_id=" + hst_id +
                ", hst_name='" + hst_name + '\'' +
                '}';
    }
}
