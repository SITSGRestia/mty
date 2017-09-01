package com.tripadv.mty.domain.attraction;
/*
    各个城市的实体类

 */
public class City {
    private Integer cit_id;
    private Integer pro_id;
    private String cit_name;
    private String cit_detail;
    private String cit_rank;
    private String cit_pic;

    public City() {
    }

    public City(Integer cit_id, Integer pro_id, String cit_name, String cit_detail, String cit_rank, String cit_pic) {
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

    public String getCit_rank() {
        return cit_rank;
    }

    public void setCit_rank(String cit_rank) {
        this.cit_rank = cit_rank;
    }

    public String getCit_pic() {
        return cit_pic;
    }

    public void setCit_pic(String cit_pic) {
        this.cit_pic = cit_pic;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        City city = (City) o;

        if (cit_id != null ? !cit_id.equals(city.cit_id) : city.cit_id != null) return false;
        if (pro_id != null ? !pro_id.equals(city.pro_id) : city.pro_id != null) return false;
        if (cit_name != null ? !cit_name.equals(city.cit_name) : city.cit_name != null) return false;
        if (cit_detail != null ? !cit_detail.equals(city.cit_detail) : city.cit_detail != null) return false;
        if (cit_rank != null ? !cit_rank.equals(city.cit_rank) : city.cit_rank != null) return false;
        return cit_pic != null ? cit_pic.equals(city.cit_pic) : city.cit_pic == null;
    }

    @Override
    public int hashCode() {
        int result = cit_id != null ? cit_id.hashCode() : 0;
        result = 31 * result + (pro_id != null ? pro_id.hashCode() : 0);
        result = 31 * result + (cit_name != null ? cit_name.hashCode() : 0);
        result = 31 * result + (cit_detail != null ? cit_detail.hashCode() : 0);
        result = 31 * result + (cit_rank != null ? cit_rank.hashCode() : 0);
        result = 31 * result + (cit_pic != null ? cit_pic.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "City{" +
                "cit_id=" + cit_id +
                ", pro_id=" + pro_id +
                ", cit_name='" + cit_name + '\'' +
                ", cit_detail='" + cit_detail + '\'' +
                ", cit_rank='" + cit_rank + '\'' +
                ", cit_pic='" + cit_pic + '\'' +
                '}';
    }
}
