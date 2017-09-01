package com.tripadv.mty.domain.hotel.category;

import java.io.Serializable;

public class HotelsService implements Serializable {
    private Integer hse_id;
    private String hse_name;

    public HotelsService() {
    }

    public HotelsService(Integer hse_id, String hse_name) {
        this.hse_id = hse_id;
        this.hse_name = hse_name;
    }

    public Integer getHse_id() {
        return hse_id;
    }

    public void setHse_id(Integer hse_id) {
        this.hse_id = hse_id;
    }

    public String getHse_name() {
        return hse_name;
    }

    public void setHse_name(String hse_name) {
        this.hse_name = hse_name;
    }

    @Override
    public String toString() {
        return "HotelsService{" +
                "hse_id=" + hse_id +
                ", hse_name='" + hse_name + '\'' +
                '}';
    }
}
