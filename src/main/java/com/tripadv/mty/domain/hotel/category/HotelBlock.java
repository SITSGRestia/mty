package com.tripadv.mty.domain.hotel.category;

public class HotelBlock {
    private Integer hbl_id;
    private String hbl_name;

    public HotelBlock() {
    }

    public HotelBlock(Integer hbl_id, String hbl_name) {
        this.hbl_id = hbl_id;
        this.hbl_name = hbl_name;
    }

    public Integer getHbl_id() {
        return hbl_id;
    }

    public void setHbl_id(Integer hbl_id) {
        this.hbl_id = hbl_id;
    }

    public String getHbl_name() {
        return hbl_name;
    }

    public void setHbl_name(String hbl_name) {
        this.hbl_name = hbl_name;
    }

    @Override
    public String toString() {
        return "HotelBlock{" +
                "hbl_id=" + hbl_id +
                ", hbl_name='" + hbl_name + '\'' +
                '}';
    }
}
