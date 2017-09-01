package com.tripadv.mty.domain.attraction;

/*
    各个区的实体类

 */
public class Province {
    private Integer pro_id;
    private Integer cou_id;
    private String pro_name;
    private String pro_detail;
    private String pro_pic;

    public Province() {
    }

    public Province(Integer pro_id, Integer cou_id, String pro_name, String pro_detail, String pro_pic) {
        this.pro_id = pro_id;
        this.cou_id = cou_id;
        this.pro_name = pro_name;
        this.pro_detail = pro_detail;
        this.pro_pic = pro_pic;
    }

    public Integer getPro_id() {
        return pro_id;
    }

    public void setPro_id(Integer pro_id) {
        this.pro_id = pro_id;
    }

    public Integer getCou_id() {
        return cou_id;
    }

    public void setCou_id(Integer cou_id) {
        this.cou_id = cou_id;
    }

    public String getPro_name() {
        return pro_name;
    }

    public void setPro_name(String pro_name) {
        this.pro_name = pro_name;
    }

    public String getPro_detail() {
        return pro_detail;
    }

    public void setPro_detail(String pro_detail) {
        this.pro_detail = pro_detail;
    }

    public String getPro_pic() {
        return pro_pic;
    }

    public void setPro_pic(String pro_pic) {
        this.pro_pic = pro_pic;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Province province = (Province) o;

        if (pro_id != null ? !pro_id.equals(province.pro_id) : province.pro_id != null) return false;
        if (cou_id != null ? !cou_id.equals(province.cou_id) : province.cou_id != null) return false;
        if (pro_name != null ? !pro_name.equals(province.pro_name) : province.pro_name != null) return false;
        if (pro_detail != null ? !pro_detail.equals(province.pro_detail) : province.pro_detail != null) return false;
        return pro_pic != null ? pro_pic.equals(province.pro_pic) : province.pro_pic == null;
    }

    @Override
    public int hashCode() {
        int result = pro_id != null ? pro_id.hashCode() : 0;
        result = 31 * result + (cou_id != null ? cou_id.hashCode() : 0);
        result = 31 * result + (pro_name != null ? pro_name.hashCode() : 0);
        result = 31 * result + (pro_detail != null ? pro_detail.hashCode() : 0);
        result = 31 * result + (pro_pic != null ? pro_pic.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Province{" +
                "pro_id=" + pro_id +
                ", cou_id=" + cou_id +
                ", pro_name='" + pro_name + '\'' +
                ", pro_detail='" + pro_detail + '\'' +
                ", pro_pic='" + pro_pic + '\'' +
                '}';
    }
}
