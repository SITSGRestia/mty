package com.tripadv.mty.domain.attraction;
/*
    各个国家的实体类

 */
public class Country {
    private Integer cou_id;
    private Integer con_id;
    private String cou_name;
    private  String cou_pic;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Country country = (Country) o;

        if (cou_id != null ? !cou_id.equals(country.cou_id) : country.cou_id != null) return false;
        if (con_id != null ? !con_id.equals(country.con_id) : country.con_id != null) return false;
        if (cou_name != null ? !cou_name.equals(country.cou_name) : country.cou_name != null) return false;
        return cou_pic != null ? cou_pic.equals(country.cou_pic) : country.cou_pic == null;
    }

    @Override
    public int hashCode() {
        int result = cou_id != null ? cou_id.hashCode() : 0;
        result = 31 * result + (con_id != null ? con_id.hashCode() : 0);
        result = 31 * result + (cou_name != null ? cou_name.hashCode() : 0);
        result = 31 * result + (cou_pic != null ? cou_pic.hashCode() : 0);
        return result;
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
