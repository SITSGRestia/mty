package com.tripadv.mty.domain.commons;

public class Country {
    private Integer cou_id;
    private Integer con_id;
    private String cou_name;
    private String cou_pic;

    public Country() {
    }

    public Country(Integer cou_id, Integer con_id, String cou_name, String cou_pic) {
        this.cou_id = cou_id;
        this.con_id = con_id;
        this.cou_name = cou_name;
        this.cou_pic = cou_pic;
    }

    public Integer getCou_id() {
        return cou_id;
    }

    public void setCou_id(Integer cou_id) {
        this.cou_id = cou_id;
    }

    public Integer getCon_id() {
        return con_id;
    }

    public void setCon_id(Integer con_id) {
        this.con_id = con_id;
    }

    public String getCou_name() {
        return cou_name;
    }

    public void setCou_name(String cou_name) {
        this.cou_name = cou_name;
    }

    public String getCou_pic() {
        return cou_pic;
    }

    public void setCou_pic(String cou_pic) {
        this.cou_pic = cou_pic;
    }

    @Override
    public String toString() {
        return "Country{" +
                "cou_id=" + cou_id +
                ", con_id=" + con_id +
                ", cou_name='" + cou_name + '\'' +
                ", cou_pic='" + cou_pic + '\'' +
                '}';
    }
}
