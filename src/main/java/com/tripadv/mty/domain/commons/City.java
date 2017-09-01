package com.tripadv.mty.domain.commons;

import java.io.Serializable;

public class City implements Serializable {
    private Integer cit_id;
    private Integer pro_id;
    private String cit_name;
    private String cit_detail;
    private Integer cit_rank;
    private String cit_pic;

    public City() {
    }

    public City(Integer cit_id, Integer pro_id, String cit_name, String cit_detail, Integer cit_rank, String cit_pic) {
        this.cit_id = cit_id;
        this.pro_id = pro_id;
        this.cit_name = cit_name;
        this.cit_detail = cit_detail;
        this.cit_rank = cit_rank;
        this.cit_pic = cit_pic;
    }

    public Integer getCit_id() {
        return cit_id;
    }

    public void setCit_id(Integer cit_id) {
        this.cit_id = cit_id;
    }

    public Integer getPro_id() {
        return pro_id;
    }

    public void setPro_id(Integer pro_id) {
        this.pro_id = pro_id;
    }

    public String getCit_name() {
        return cit_name;
    }

    public void setCit_name(String cit_name) {
        this.cit_name = cit_name;
    }

    public String getCit_detail() {
        return cit_detail;
    }

    public void setCit_detail(String cit_detail) {
        this.cit_detail = cit_detail;
    }

    public Integer getCit_rank() {
        return cit_rank;
    }

    public void setCit_rank(Integer cit_rank) {
        this.cit_rank = cit_rank;
    }

    public String getCit_pic() {
        return cit_pic;
    }

    public void setCit_pic(String cit_pic) {
        this.cit_pic = cit_pic;
    }

    @Override
    public String toString() {
        return "City{" +
                "cit_id=" + cit_id +
                ", pro_id=" + pro_id +
                ", cit_name='" + cit_name + '\'' +
                ", cit_detail='" + cit_detail + '\'' +
                ", cit_rank=" + cit_rank +
                ", cit_pic='" + cit_pic + '\'' +
                '}';
    }
}
