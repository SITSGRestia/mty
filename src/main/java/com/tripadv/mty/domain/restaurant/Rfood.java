package com.tripadv.mty.domain.restaurant;

import java.io.Serializable;

/**
 * 餐厅菜系
 */
public class Rfood implements Serializable{

    private Integer rfo_id;
    private String rfo_name;

    public Rfood() {
    }

    public Rfood(Integer rfo_id, String rfo_name) {
        this.rfo_id = rfo_id;
        this.rfo_name = rfo_name;
    }

    public Integer getRfo_id() {
        return rfo_id;
    }

    public void setRfo_id(Integer rfo_id) {
        this.rfo_id = rfo_id;
    }

    public String getRfo_name() {
        return rfo_name;
    }

    public void setRfo_name(String rfo_name) {
        this.rfo_name = rfo_name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rfood rfood = (Rfood) o;

        if (rfo_id != null ? !rfo_id.equals(rfood.rfo_id) : rfood.rfo_id != null) return false;
        return rfo_name != null ? rfo_name.equals(rfood.rfo_name) : rfood.rfo_name == null;
    }

    @Override
    public int hashCode() {
        int result = rfo_id != null ? rfo_id.hashCode() : 0;
        result = 31 * result + (rfo_name != null ? rfo_name.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Rfood{" +
                "rfo_id=" + rfo_id +
                ", rfo_name='" + rfo_name + '\'' +
                '}';
    }
}
