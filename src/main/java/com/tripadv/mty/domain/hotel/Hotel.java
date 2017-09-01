package com.tripadv.mty.domain.hotel;

import com.tripadv.mty.domain.commons.City;
import com.tripadv.mty.domain.hotel.category.HotelBrand;
import com.tripadv.mty.domain.hotel.category.HotelCategory;
import com.tripadv.mty.domain.hotel.category.HotelStyle;
import com.tripadv.mty.domain.hotel.category.HotelsService;

import java.io.Serializable;
import java.util.List;

public class Hotel implements Serializable{
    private Integer hot_id;
    private Integer cit_id;
    private Integer hbl_id;
    private Integer hca_id;
    private Integer hst_id;
    private Integer hbr_id;
    private String hot_name;
    private String hot_ename;
    private Double hot_avgprice;
    private Double hot_score;
    private String hot_detail;
    private String hot_nearbytitle;
    private String hot_nearbycon;
    private Integer hot_room;
    private Integer hot_star;
    private Integer hot_rank;
    private String hot_address;
    private String hot_book;
    private Integer hot_roomcount;
    private String hot_pic;
    private Integer hot_reviewcount;
    private String hot_map;
    private String hot_url1;
    private String hot_url2;
    private String hot_url3;
    private String hot_url4;
    private List<HotelsService> hotelsServiceList;
    private HotelBrand brand;
    private HotelCategory category;
    private HotelStyle style;
    private City city;


    public Hotel() {
    }

    public Hotel(Integer hot_id, Integer cit_id, Integer hbl_id, Integer hca_id, Integer hst_id, Integer hbr_id, String hot_name, String hot_ename, Double hot_avgprice, Double hot_score, String hot_detail, String hot_nearbytitle, String hot_nearbycon, Integer hot_room, Integer hot_star, Integer hot_rank, String hot_address, String hot_book, Integer hot_roomcount, String hot_pic, Integer hot_reviewcount, String hot_map, String hot_url1, String hot_url2, String hot_url3, String hot_url4, List<HotelsService> hotelsServiceList, HotelBrand brand, HotelCategory category, HotelStyle style, City city) {
        this.hot_id = hot_id;
        this.cit_id = cit_id;
        this.hbl_id = hbl_id;
        this.hca_id = hca_id;
        this.hst_id = hst_id;
        this.hbr_id = hbr_id;
        this.hot_name = hot_name;
        this.hot_ename = hot_ename;
        this.hot_avgprice = hot_avgprice;
        this.hot_score = hot_score;
        this.hot_detail = hot_detail;
        this.hot_nearbytitle = hot_nearbytitle;
        this.hot_nearbycon = hot_nearbycon;
        this.hot_room = hot_room;
        this.hot_star = hot_star;
        this.hot_rank = hot_rank;
        this.hot_address = hot_address;
        this.hot_book = hot_book;
        this.hot_roomcount = hot_roomcount;
        this.hot_pic = hot_pic;
        this.hot_reviewcount = hot_reviewcount;
        this.hot_map = hot_map;
        this.hot_url1 = hot_url1;
        this.hot_url2 = hot_url2;
        this.hot_url3 = hot_url3;
        this.hot_url4 = hot_url4;
        this.hotelsServiceList = hotelsServiceList;
        this.brand = brand;
        this.category = category;
        this.style = style;
        this.city = city;
    }

    public List<HotelsService> getHotelsServiceList() {
        return hotelsServiceList;
    }

    public void setHotelsServiceList(List<HotelsService> hotelsServiceList) {
        this.hotelsServiceList = hotelsServiceList;
    }

    public Integer getHot_id() {
        return hot_id;
    }

    public void setHot_id(Integer hot_id) {
        this.hot_id = hot_id;
    }

    public Integer getCit_id() {
        return cit_id;
    }

    public void setCit_id(Integer cit_id) {
        this.cit_id = cit_id;
    }

    public Integer getHbl_id() {
        return hbl_id;
    }

    public void setHbl_id(Integer hbl_id) {
        this.hbl_id = hbl_id;
    }

    public Integer getHca_id() {
        return hca_id;
    }

    public void setHca_id(Integer hca_id) {
        this.hca_id = hca_id;
    }

    public Integer getHst_id() {
        return hst_id;
    }

    public void setHst_id(Integer hst_id) {
        this.hst_id = hst_id;
    }

    public Integer getHbr_id() {
        return hbr_id;
    }

    public void setHbr_id(Integer hbr_id) {
        this.hbr_id = hbr_id;
    }

    public String getHot_name() {
        return hot_name;
    }

    public void setHot_name(String hot_name) {
        this.hot_name = hot_name;
    }

    public String getHot_ename() {
        return hot_ename;
    }

    public void setHot_ename(String hot_ename) {
        this.hot_ename = hot_ename;
    }

    public Double getHot_avgprice() {
        return hot_avgprice;
    }

    public void setHot_avgprice(Double hot_avgprice) {
        this.hot_avgprice = hot_avgprice;
    }

    public Double getHot_score() {
        return hot_score;
    }

    public void setHot_score(Double hot_score) {
        this.hot_score = hot_score;
    }

    public String getHot_detail() {
        return hot_detail;
    }

    public void setHot_detail(String hot_detail) {
        this.hot_detail = hot_detail;
    }

    public String getHot_nearbytitle() {
        return hot_nearbytitle;
    }

    public void setHot_nearbytitle(String hot_nearbytitle) {
        this.hot_nearbytitle = hot_nearbytitle;
    }

    public String getHot_nearbycon() {
        return hot_nearbycon;
    }

    public void setHot_nearbycon(String hot_nearbycon) {
        this.hot_nearbycon = hot_nearbycon;
    }

    public Integer getHot_room() {
        return hot_room;
    }

    public void setHot_room(Integer hot_room) {
        this.hot_room = hot_room;
    }

    public Integer getHot_star() {
        return hot_star;
    }

    public void setHot_star(Integer hot_star) {
        this.hot_star = hot_star;
    }

    public Integer getHot_rank() {
        return hot_rank;
    }

    public void setHot_rank(Integer hot_rank) {
        this.hot_rank = hot_rank;
    }

    public String getHot_address() {
        return hot_address;
    }

    public void setHot_address(String hot_address) {
        this.hot_address = hot_address;
    }

    public String getHot_book() {
        return hot_book;
    }

    public void setHot_book(String hot_book) {
        this.hot_book = hot_book;
    }

    public Integer getHot_roomcount() {
        return hot_roomcount;
    }

    public void setHot_roomcount(Integer hot_roomcount) {
        this.hot_roomcount = hot_roomcount;
    }

    public String getHot_pic() {
        return hot_pic;
    }

    public void setHot_pic(String hot_pic) {
        this.hot_pic = hot_pic;
    }

    public Integer getHot_reviewcount() {
        return hot_reviewcount;
    }

    public void setHot_reviewcount(Integer hot_reviewcount) {
        this.hot_reviewcount = hot_reviewcount;
    }

    public String getHot_map() {
        return hot_map;
    }

    public void setHot_map(String hot_map) {
        this.hot_map = hot_map;
    }

    public String getHot_url1() {
        return hot_url1;
    }

    public void setHot_url1(String hot_url1) {
        this.hot_url1 = hot_url1;
    }

    public String getHot_url2() {
        return hot_url2;
    }

    public void setHot_url2(String hot_url2) {
        this.hot_url2 = hot_url2;
    }

    public String getHot_url3() {
        return hot_url3;
    }

    public void setHot_url3(String hot_url3) {
        this.hot_url3 = hot_url3;
    }

    public String getHot_url4() {
        return hot_url4;
    }

    public void setHot_url4(String hot_url4) {
        this.hot_url4 = hot_url4;
    }

    public HotelBrand getBrand() {
        return brand;
    }

    public void setBrand(HotelBrand brand) {
        this.brand = brand;
    }

    public HotelCategory getCategory() {
        return category;
    }

    public void setCategory(HotelCategory category) {
        this.category = category;
    }

    public HotelStyle getStyle() {
        return style;
    }

    public void setStyle(HotelStyle style) {
        this.style = style;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "hot_id=" + hot_id +
                ", cit_id=" + cit_id +
                ", hbl_id=" + hbl_id +
                ", hca_id=" + hca_id +
                ", hst_id=" + hst_id +
                ", hbr_id=" + hbr_id +
                ", hot_name='" + hot_name + '\'' +
                ", hot_ename='" + hot_ename + '\'' +
                ", hot_avgprice=" + hot_avgprice +
                ", hot_score=" + hot_score +
                ", hot_detail='" + hot_detail + '\'' +
                ", hot_nearbytitle='" + hot_nearbytitle + '\'' +
                ", hot_nearbycon='" + hot_nearbycon + '\'' +
                ", hot_room=" + hot_room +
                ", hot_star=" + hot_star +
                ", hot_rank=" + hot_rank +
                ", hot_address='" + hot_address + '\'' +
                ", hot_book='" + hot_book + '\'' +
                ", hot_roomcount=" + hot_roomcount +
                ", hot_pic='" + hot_pic + '\'' +
                ", hot_reviewcount=" + hot_reviewcount +
                ", hot_map='" + hot_map + '\'' +
                ", hot_url1='" + hot_url1 + '\'' +
                ", hot_url2='" + hot_url2 + '\'' +
                ", hot_url3='" + hot_url3 + '\'' +
                ", hot_url4='" + hot_url4 + '\'' +
                ", hotelsServiceList=" + hotelsServiceList +
                ", brand=" + brand +
                ", category=" + category +
                ", style=" + style +
                ", city=" + city +
                '}';
    }
}
