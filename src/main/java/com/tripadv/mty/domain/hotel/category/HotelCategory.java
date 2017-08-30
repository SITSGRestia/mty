package com.tripadv.mty.domain.hotel.category;

public class HotelCategory {
    private Integer hca_id;
    private String hca_name;

    public HotelCategory() {
    }

    public HotelCategory(Integer hca_id, String hca_name) {
        this.hca_id = hca_id;
        this.hca_name = hca_name;
    }

    public Integer getHca_id() {
        return hca_id;
    }

    public void setHca_id(Integer hca_id) {
        this.hca_id = hca_id;
    }

    public String getHca_name() {
        return hca_name;
    }

    public void setHca_name(String hca_name) {
        this.hca_name = hca_name;
    }

    @Override
    public String toString() {
        return "HotelCategory{" +
                "hca_id=" + hca_id +
                ", hca_name='" + hca_name + '\'' +
                '}';
    }
}
