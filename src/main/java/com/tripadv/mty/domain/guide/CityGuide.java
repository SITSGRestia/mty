package com.tripadv.mty.domain.guide;


import java.io.Serializable;
import java.sql.Date;

class CityGuide implements Serializable{


    private Integer cg_id;
    private Integer cou_id;
    private Integer cit_id;
    private Integer sg_id;
    private String cg_name;
    private String cg_ename;
    private Date cg_updatetime ;
    private String cg_size;
    private String cg_downloadurl;
    private String cg_intro;
    private String cg_author;
    private String cg_authorintro;
    private Integer cg_rank;
    private String cg_pic;

    public CityGuide() {
    }

    public CityGuide(Integer cg_id, Integer cou_id, Integer cit_id, Integer sg_id, String cg_name, String cg_ename, Date cg_updatetime, String cg_size, String cg_downloadurl, String cg_intro, String cg_author, String cg_authorintro, Integer cg_rank, String cg_pic) {
        this.cg_id = cg_id;
        this.cou_id = cou_id;
        this.cit_id = cit_id;
        this.sg_id = sg_id;
        this.cg_name = cg_name;
        this.cg_ename = cg_ename;
        this.cg_updatetime = cg_updatetime;
        this.cg_size = cg_size;
        this.cg_downloadurl = cg_downloadurl;
        this.cg_intro = cg_intro;
        this.cg_author = cg_author;
        this.cg_authorintro = cg_authorintro;
        this.cg_rank = cg_rank;
        this.cg_pic = cg_pic;
    }

    public Integer getCg_id() {
        return cg_id;
    }

    public void setCg_id(Integer cg_id) {
        this.cg_id = cg_id;
    }

    public Integer getCou_id() {
        return cou_id;
    }

    public void setCou_id(Integer cou_id) {
        this.cou_id = cou_id;
    }

    public Integer getCit_id() {
        return cit_id;
    }

    public void setCit_id(Integer cit_id) {
        this.cit_id = cit_id;
    }

    public Integer getSg_id() {
        return sg_id;
    }

    public void setSg_id(Integer sg_id) {
        this.sg_id = sg_id;
    }

    public String getCg_name() {
        return cg_name;
    }

    public void setCg_name(String cg_name) {
        this.cg_name = cg_name;
    }

    public String getCg_ename() {
        return cg_ename;
    }

    public void setCg_ename(String cg_ename) {
        this.cg_ename = cg_ename;
    }

    public Date getCg_updatetime() {
        return cg_updatetime;
    }

    public void setCg_updatetime(Date cg_updatetime) {
        this.cg_updatetime = cg_updatetime;
    }

    public String getCg_size() {
        return cg_size;
    }

    public void setCg_size(String cg_size) {
        this.cg_size = cg_size;
    }

    public String getCg_downloadurl() {
        return cg_downloadurl;
    }

    public void setCg_downloadurl(String cg_downloadurl) {
        this.cg_downloadurl = cg_downloadurl;
    }

    public String getCg_intro() {
        return cg_intro;
    }

    public void setCg_intro(String cg_intro) {
        this.cg_intro = cg_intro;
    }

    public String getCg_author() {
        return cg_author;
    }

    public void setCg_author(String cg_author) {
        this.cg_author = cg_author;
    }

    public String getCg_authorintro() {
        return cg_authorintro;
    }

    public void setCg_authorintro(String cg_authorintro) {
        this.cg_authorintro = cg_authorintro;
    }

    public Integer getCg_rank() {
        return cg_rank;
    }

    public void setCg_rank(Integer cg_rank) {
        this.cg_rank = cg_rank;
    }

    public String getCg_pic() {
        return cg_pic;
    }

    public void setCg_pic(String cg_pic) {
        this.cg_pic = cg_pic;
    }

}
