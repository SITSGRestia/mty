package com.tripadv.mty.domain.restaurant;

import java.io.Serializable;

/**
 * 餐厅类型
 */
public class Rcategory implements Serializable{

    private Integer rca_id;
    private String rca_name;

    public Rcategory() {
    }

    public Rcategory(Integer rca_id, String rca_name) {
        this.rca_id = rca_id;
        this.rca_name = rca_name;
    }

    public Integer getRca_id() {
        return rca_id;
    }

    public void setRca_id(Integer rca_id) {
        this.rca_id = rca_id;
    }

    public String getRca_name() {
        return rca_name;
    }

    public void setRca_name(String rca_name) {
        this.rca_name = rca_name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rcategory rcategory = (Rcategory) o;

        if (rca_id != null ? !rca_id.equals(rcategory.rca_id) : rcategory.rca_id != null) return false;
        return rca_name != null ? rca_name.equals(rcategory.rca_name) : rcategory.rca_name == null;
    }

    @Override
    public int hashCode() {
        int result = rca_id != null ? rca_id.hashCode() : 0;
        result = 31 * result + (rca_name != null ? rca_name.hashCode() : 0);
        return result;


    }

    @Override
    public String toString() {
        return "Rcategory{" +
                "rca_id=" + rca_id +
                ", rca_name='" + rca_name + '\'' +
                '}';
    }
}
