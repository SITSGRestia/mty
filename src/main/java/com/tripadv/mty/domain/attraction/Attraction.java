package com.tripadv.mty.domain.attraction;

/*
    景点实体类


 */
public class Attraction {
    private Integer att_id;
    private Integer aca_id;
    private Integer cit_id;
    private String att_name;
    private String att_ename;
    private double att_score;
    private String att_detail;
    private  String att_nearbytitle;
    private  String att_nearbycon;
    private String att_tel;
    private String att_httpurl;
    private String att_time;
    private  String att_address;
    private String att_pic;
    private Integer att_reviewcount;
    private Integer att_rank;
    private String att_map;
    private Integer id;

    public Attraction() {
    }

    public Attraction(Integer att_id, Integer aca_id, Integer cit_id, String att_name, String att_ename, double att_score, String att_detail, String att_nearbytitle, String att_nearbycon, String att_tel, String att_httpurl, String att_time, String att_address, String att_pic, Integer att_reviewcount, Integer att_rank, String att_map) {
        this.att_id = att_id;
        this.aca_id = aca_id;
        this.cit_id = cit_id;
        this.att_name = att_name;
        this.att_ename = att_ename;
        this.att_score = att_score;
        this.att_detail = att_detail;
        this.att_nearbytitle = att_nearbytitle;
        this.att_nearbycon = att_nearbycon;
        this.att_tel = att_tel;
        this.att_httpurl = att_httpurl;
        this.att_time = att_time;
        this.att_address = att_address;
        this.att_pic = att_pic;
        this.att_reviewcount = att_reviewcount;
        this.att_rank = att_rank;
        this.att_map = att_map;
    }

    public Integer getAtt_id() {
        return att_id;
    }

    public void setAtt_id(Integer att_id) {
        this.att_id = att_id;
    }

    public Integer getAca_id() {
        return aca_id;
    }

    public void setAca_id(Integer aca_id) {
        this.aca_id = aca_id;
    }

    public Integer getCit_id() {
        return cit_id;
    }

    public void setCit_id(Integer cit_id) {
        this.cit_id = cit_id;
    }

    public String getAtt_name() {
        return att_name;
    }

    public void setAtt_name(String att_name) {
        this.att_name = att_name;
    }

    public String getAtt_ename() {
        return att_ename;
    }

    public void setAtt_ename(String att_ename) {
        this.att_ename = att_ename;
    }

    public double getAtt_score() {
        return att_score;
    }

    public void setAtt_score(double att_score) {
        this.att_score = att_score;
    }

    public String getAtt_detail() {
        return att_detail;
    }

    public void setAtt_detail(String att_detail) {
        this.att_detail = att_detail;
    }

    public String getAtt_nearbytitle() {
        return att_nearbytitle;
    }

    public void setAtt_nearbytitle(String att_nearbytitle) {
        this.att_nearbytitle = att_nearbytitle;
    }

    public String getAtt_nearbycon() {
        return att_nearbycon;
    }

    public void setAtt_nearbycon(String att_nearbycon) {
        this.att_nearbycon = att_nearbycon;
    }

    public String getAtt_tel() {
        return att_tel;
    }

    public void setAtt_tel(String att_tel) {
        this.att_tel = att_tel;
    }

    public String getAtt_httpurl() {
        return att_httpurl;
    }

    public void setAtt_httpurl(String att_httpurl) {
        this.att_httpurl = att_httpurl;
    }

    public String getAtt_time() {
        return att_time;
    }

    public void setAtt_time(String att_time) {
        this.att_time = att_time;
    }

    public String getAtt_address() {
        return att_address;
    }

    public void setAtt_address(String att_address) {
        this.att_address = att_address;
    }

    public String getAtt_pic() {
        return att_pic;
    }

    public void setAtt_pic(String att_pic) {
        this.att_pic = att_pic;
    }

    public Integer getAtt_reviewcount() {
        return att_reviewcount;
    }

    public void setAtt_reviewcount(Integer att_reviewcount) {
        this.att_reviewcount = att_reviewcount;
    }

    public Integer getAtt_rank() {
        return att_rank;
    }

    public void setAtt_rank(Integer att_rank) {
        this.att_rank = att_rank;
    }

    public String getAtt_map() {
        return att_map;
    }

    public void setAtt_map(String att_map) {
        this.att_map = att_map;
    }

    @Override
    public String toString() {
        return "Attraction{" +
                "att_id=" + att_id +
                ", aca_id=" + aca_id +
                ", cit_id=" + cit_id +
                ", att_name='" + att_name + '\'' +
                ", att_ename='" + att_ename + '\'' +
                ", att_score=" + att_score +
                ", att_detail='" + att_detail + '\'' +
                ", att_nearbytitle='" + att_nearbytitle + '\'' +
                ", att_nearbycon='" + att_nearbycon + '\'' +
                ", att_tel='" + att_tel + '\'' +
                ", att_httpurl='" + att_httpurl + '\'' +
                ", att_time='" + att_time + '\'' +
                ", att_address='" + att_address + '\'' +
                ", att_pic='" + att_pic + '\'' +
                ", att_reviewcount=" + att_reviewcount +
                ", att_rank=" + att_rank +
                ", att_map='" + att_map + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Attraction that = (Attraction) o;

        if (Double.compare(that.att_score, att_score) != 0) return false;
        if (att_id != null ? !att_id.equals(that.att_id) : that.att_id != null) return false;
        if (aca_id != null ? !aca_id.equals(that.aca_id) : that.aca_id != null) return false;
        if (cit_id != null ? !cit_id.equals(that.cit_id) : that.cit_id != null) return false;
        if (att_name != null ? !att_name.equals(that.att_name) : that.att_name != null) return false;
        if (att_ename != null ? !att_ename.equals(that.att_ename) : that.att_ename != null) return false;
        if (att_detail != null ? !att_detail.equals(that.att_detail) : that.att_detail != null) return false;
        if (att_nearbytitle != null ? !att_nearbytitle.equals(that.att_nearbytitle) : that.att_nearbytitle != null)
            return false;
        if (att_nearbycon != null ? !att_nearbycon.equals(that.att_nearbycon) : that.att_nearbycon != null)
            return false;
        if (att_tel != null ? !att_tel.equals(that.att_tel) : that.att_tel != null) return false;
        if (att_httpurl != null ? !att_httpurl.equals(that.att_httpurl) : that.att_httpurl != null) return false;
        if (att_time != null ? !att_time.equals(that.att_time) : that.att_time != null) return false;
        if (att_address != null ? !att_address.equals(that.att_address) : that.att_address != null) return false;
        if (att_pic != null ? !att_pic.equals(that.att_pic) : that.att_pic != null) return false;
        if (att_reviewcount != null ? !att_reviewcount.equals(that.att_reviewcount) : that.att_reviewcount != null)
            return false;
        if (att_rank != null ? !att_rank.equals(that.att_rank) : that.att_rank != null) return false;
        return att_map != null ? att_map.equals(that.att_map) : that.att_map == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = att_id != null ? att_id.hashCode() : 0;
        result = 31 * result + (aca_id != null ? aca_id.hashCode() : 0);
        result = 31 * result + (cit_id != null ? cit_id.hashCode() : 0);
        result = 31 * result + (att_name != null ? att_name.hashCode() : 0);
        result = 31 * result + (att_ename != null ? att_ename.hashCode() : 0);
        temp = Double.doubleToLongBits(att_score);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (att_detail != null ? att_detail.hashCode() : 0);
        result = 31 * result + (att_nearbytitle != null ? att_nearbytitle.hashCode() : 0);
        result = 31 * result + (att_nearbycon != null ? att_nearbycon.hashCode() : 0);
        result = 31 * result + (att_tel != null ? att_tel.hashCode() : 0);
        result = 31 * result + (att_httpurl != null ? att_httpurl.hashCode() : 0);
        result = 31 * result + (att_time != null ? att_time.hashCode() : 0);
        result = 31 * result + (att_address != null ? att_address.hashCode() : 0);
        result = 31 * result + (att_pic != null ? att_pic.hashCode() : 0);
        result = 31 * result + (att_reviewcount != null ? att_reviewcount.hashCode() : 0);
        result = 31 * result + (att_rank != null ? att_rank.hashCode() : 0);
        result = 31 * result + (att_map != null ? att_map.hashCode() : 0);
        return result;
    }

    public Integer getId() {
        return id;
    }
}
