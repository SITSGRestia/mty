package com.tripadv.mty.domain.restaurant;

import java.io.Serializable;

/**
 * 餐厅价格
 */
public class Rprice implements Serializable {

    private Integer rpr_id;
    private String rpr_name;

    public Rprice() {
    }

    public Rprice(Integer rpr_id, String rpr_name) {
        this.rpr_id = rpr_id;
        this.rpr_name = rpr_name;
    }

    public Integer getRpr_id() {
        return rpr_id;
    }

    public void setRpr_id(Integer rpr_id) {
        this.rpr_id = rpr_id;
    }

    public String getRpr_name() {
        return rpr_name;
    }

    public void setRpr_name(String rpr_name) {
        this.rpr_name = rpr_name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rprice rprice = (Rprice) o;

        if (rpr_id != null ? !rpr_id.equals(rprice.rpr_id) : rprice.rpr_id != null) return false;
        return rpr_name != null ? rpr_name.equals(rprice.rpr_name) : rprice.rpr_name == null;
    }

    @Override
    public int hashCode() {
        int result = rpr_id != null ? rpr_id.hashCode() : 0;
        result = 31 * result + (rpr_name != null ? rpr_name.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Rprice{" +
                "rpr_id=" + rpr_id +
                ", rpr_name='" + rpr_name + '\'' +
                '}';
    }
}
