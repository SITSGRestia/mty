package com.tripadv.mty.domain.restaurant;

import java.io.Serializable;

/**
 * 餐厅特点实体类
 */
public class Rfeature implements Serializable{

    private Integer rfe_id;
    private String rfe_name;

    public Rfeature() {
    }

    public Rfeature(Integer rfe_id, String rfe_name) {
        this.rfe_id = rfe_id;
        this.rfe_name = rfe_name;
    }

    public Integer getRfe_id() {
        return rfe_id;
    }

    public void setRfe_id(Integer rfe_id) {
        this.rfe_id = rfe_id;
    }

    public String getRfe_name() {
        return rfe_name;
    }

    public void setRfe_name(String rfe_name) {
        this.rfe_name = rfe_name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rfeature rfeature = (Rfeature) o;

        if (rfe_id != null ? !rfe_id.equals(rfeature.rfe_id) : rfeature.rfe_id != null) return false;
        return rfe_name != null ? rfe_name.equals(rfeature.rfe_name) : rfeature.rfe_name == null;
    }

    @Override
    public int hashCode() {
        int result = rfe_id != null ? rfe_id.hashCode() : 0;
        result = 31 * result + (rfe_name != null ? rfe_name.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Rfeature{" +
                "rfe_id=" + rfe_id +
                ", rfe_name='" + rfe_name + '\'' +
                '}';
    }
}
