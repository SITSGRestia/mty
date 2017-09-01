package com.tripadv.mty.domain.hotel.category;

import java.io.Serializable;

public class HotelBrand implements Serializable {
    private Integer hbr_id;
    private String hbr_name;

    public HotelBrand() {
    }

    public HotelBrand(Integer hbr_id, String hbr_name) {
        this.hbr_id = hbr_id;
        this.hbr_name = hbr_name;
    }

    public Integer getHbr_id() {
        return hbr_id;
    }

    public void setHbr_id(Integer hbr_id) {
        this.hbr_id = hbr_id;
    }

    public String getHbr_name() {
        return hbr_name;
    }

    public void setHbr_name(String hbr_name) {
        this.hbr_name = hbr_name;
    }

    @Override
    public String toString() {
        return "HotelBrand{" +
                "hbr_id=" + hbr_id +
                ", hbr_name='" + hbr_name + '\'' +
                '}';
    }
}
