package com.tripadv.mty.domain.restaurant;

import java.io.Serializable;

/**
 * 餐厅实体类
 */
public class Restaurant implements Serializable{

    private Integer res_id; //餐厅id
    private String res_name;
    private String res_ename;
    private Double res_avgprice;
    private Double res_score;
    private Double res_servicescore;
    private Double res_cheapscore;
    private Double res_phescore;
    private Double res_foodscore;
    private Integer res_status;
    private String res_openday;
    private String res_openmorning;
    private String res_openafternoon;
    private String res_refprice;
    private String res_opentime;
    private String res_email;
    private String res_rank;
    private String res_address;
    private String res_pic;
    private String res_reviewcount;
    private String res_map;
    private Integer rca_id;
    private Integer rfo_id;
    private Integer rho_id;
    private Integer rme_id;
    private Integer rpr_id;
    private Integer rne_id;
    private Integer rfe_id;
    private Integer rat_id;

    public Restaurant() {}

    public Restaurant(Integer res_id, String res_name, String res_ename, Double res_avgprice, Double res_score, Double res_servicescore, Double res_cheapscore, Double res_phescore, Double res_foodscore, Integer res_status, String res_openday, String res_openmorning, String res_openafternoon, String res_refprice, String res_opentime, String res_email, String res_rank, String res_address, String res_pic, String res_reviewcount, String res_map, Integer rca_id, Integer rfo_id, Integer rho_id, Integer rme_id, Integer rpr_id, Integer rne_id, Integer rfe_id, Integer rat_id) {
        this.res_id = res_id;
        this.res_name = res_name;
        this.res_ename = res_ename;
        this.res_avgprice = res_avgprice;
        this.res_score = res_score;
        this.res_servicescore = res_servicescore;
        this.res_cheapscore = res_cheapscore;
        this.res_phescore = res_phescore;
        this.res_foodscore = res_foodscore;
        this.res_status = res_status;
        this.res_openday = res_openday;
        this.res_openmorning = res_openmorning;
        this.res_openafternoon = res_openafternoon;
        this.res_refprice = res_refprice;
        this.res_opentime = res_opentime;
        this.res_email = res_email;
        this.res_rank = res_rank;
        this.res_address = res_address;
        this.res_pic = res_pic;
        this.res_reviewcount = res_reviewcount;
        this.res_map = res_map;
        this.rca_id = rca_id;
        this.rfo_id = rfo_id;
        this.rho_id = rho_id;
        this.rme_id = rme_id;
        this.rpr_id = rpr_id;
        this.rne_id = rne_id;
        this.rfe_id = rfe_id;
        this.rat_id = rat_id;
    }

    public Integer getRes_id() {
        return res_id;
    }

    public void setRes_id(Integer res_id) {
        this.res_id = res_id;
    }

    public String getRes_name() {
        return res_name;
    }

    public void setRes_name(String res_name) {
        this.res_name = res_name;
    }

    public String getRes_ename() {
        return res_ename;
    }

    public void setRes_ename(String res_ename) {
        this.res_ename = res_ename;
    }

    public Double getRes_avgprice() {
        return res_avgprice;
    }

    public void setRes_avgprice(Double res_avgprice) {
        this.res_avgprice = res_avgprice;
    }

    public Double getRes_score() {
        return res_score;
    }

    public void setRes_score(Double res_score) {
        this.res_score = res_score;
    }

    public Double getRes_servicescore() {
        return res_servicescore;
    }

    public void setRes_servicescore(Double res_servicescore) {
        this.res_servicescore = res_servicescore;
    }

    public Double getRes_cheapscore() {
        return res_cheapscore;
    }

    public void setRes_cheapscore(Double res_cheapscore) {
        this.res_cheapscore = res_cheapscore;
    }

    public Double getRes_phescore() {
        return res_phescore;
    }

    public void setRes_phescore(Double res_phescore) {
        this.res_phescore = res_phescore;
    }

    public Double getRes_foodscore() {
        return res_foodscore;
    }

    public void setRes_foodscore(Double res_foodscore) {
        this.res_foodscore = res_foodscore;
    }

    public Integer getRes_status() {
        return res_status;
    }

    public void setRes_status(Integer res_status) {
        this.res_status = res_status;
    }

    public String getRes_openday() {
        return res_openday;
    }

    public void setRes_openday(String res_openday) {
        this.res_openday = res_openday;
    }

    public String getRes_openmorning() {
        return res_openmorning;
    }

    public void setRes_openmorning(String res_openmorning) {
        this.res_openmorning = res_openmorning;
    }

    public String getRes_openafternoon() {
        return res_openafternoon;
    }

    public void setRes_openafternoon(String res_openafternoon) {
        this.res_openafternoon = res_openafternoon;
    }

    public String getRes_refprice() {
        return res_refprice;
    }

    public void setRes_refprice(String res_refprice) {
        this.res_refprice = res_refprice;
    }

    public String getRes_opentime() {
        return res_opentime;
    }

    public void setRes_opentime(String res_opentime) {
        this.res_opentime = res_opentime;
    }

    public String getRes_email() {
        return res_email;
    }

    public void setRes_email(String res_email) {
        this.res_email = res_email;
    }

    public String getRes_rank() {
        return res_rank;
    }

    public void setRes_rank(String res_rank) {
        this.res_rank = res_rank;
    }

    public String getRes_address() {
        return res_address;
    }

    public void setRes_address(String res_address) {
        this.res_address = res_address;
    }

    public String getRes_pic() {
        return res_pic;
    }

    public void setRes_pic(String res_pic) {
        this.res_pic = res_pic;
    }

    public String getRes_reviewcount() {
        return res_reviewcount;
    }

    public void setRes_reviewcount(String res_reviewcount) {
        this.res_reviewcount = res_reviewcount;
    }

    public String getRes_map() {
        return res_map;
    }

    public void setRes_map(String res_map) {
        this.res_map = res_map;
    }

    public Integer getRca_id() {
        return rca_id;
    }

    public void setRca_id(Integer rca_id) {
        this.rca_id = rca_id;
    }

    public Integer getRfo_id() {
        return rfo_id;
    }

    public void setRfo_id(Integer rfo_id) {
        this.rfo_id = rfo_id;
    }

    public Integer getRho_id() {
        return rho_id;
    }

    public void setRho_id(Integer rho_id) {
        this.rho_id = rho_id;
    }

    public Integer getRme_id() {
        return rme_id;
    }

    public void setRme_id(Integer rme_id) {
        this.rme_id = rme_id;
    }

    public Integer getRpr_id() {
        return rpr_id;
    }

    public void setRpr_id(Integer rpr_id) {
        this.rpr_id = rpr_id;
    }

    public Integer getRne_id() {
        return rne_id;
    }

    public void setRne_id(Integer rne_id) {
        this.rne_id = rne_id;
    }

    public Integer getRfe_id() {
        return rfe_id;
    }

    public void setRfe_id(Integer rfe_id) {
        this.rfe_id = rfe_id;
    }

    public Integer getRat_id() {
        return rat_id;
    }

    public void setRat_id(Integer rat_id) {
        this.rat_id = rat_id;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "res_id=" + res_id +
                ", res_name='" + res_name + '\'' +
                ", res_ename='" + res_ename + '\'' +
                ", res_avgprice=" + res_avgprice +
                ", res_score=" + res_score +
                ", res_servicescore=" + res_servicescore +
                ", res_cheapscore=" + res_cheapscore +
                ", res_phescore=" + res_phescore +
                ", res_foodscore=" + res_foodscore +
                ", res_status=" + res_status +
                ", res_openday='" + res_openday + '\'' +
                ", res_openmorning='" + res_openmorning + '\'' +
                ", res_openafternoon='" + res_openafternoon + '\'' +
                ", res_refprice='" + res_refprice + '\'' +
                ", res_opentime='" + res_opentime + '\'' +
                ", res_email='" + res_email + '\'' +
                ", res_rank='" + res_rank + '\'' +
                ", res_address='" + res_address + '\'' +
                ", res_pic='" + res_pic + '\'' +
                ", res_reviewcount='" + res_reviewcount + '\'' +
                ", res_map='" + res_map + '\'' +
                ", rca_id=" + rca_id +
                ", rfo_id=" + rfo_id +
                ", rho_id=" + rho_id +
                ", rme_id=" + rme_id +
                ", rpr_id=" + rpr_id +
                ", rne_id=" + rne_id +
                ", rfe_id=" + rfe_id +
                ", rat_id=" + rat_id +
                '}';
    }
}
