package com.tripadv.mty.domain.restaurant;

import java.io.Serializable;

/**
 * 餐时
 */
public class Rmealtime implements Serializable {

    private Integer rme_id;
    private String rme_name;

    public Rmealtime() {
    }

    public Rmealtime(Integer rme_id, String rme_name) {
        this.rme_id = rme_id;
        this.rme_name = rme_name;
    }

    public Integer getRme_id() {
        return rme_id;
    }

    public void setRme_id(Integer rme_id) {
        this.rme_id = rme_id;
    }

    public String getRme_name() {
        return rme_name;
    }

    public void setRme_name(String rme_name) {
        this.rme_name = rme_name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rmealtime rmealtime = (Rmealtime) o;

        if (rme_id != null ? !rme_id.equals(rmealtime.rme_id) : rmealtime.rme_id != null) return false;
        return rme_name != null ? rme_name.equals(rmealtime.rme_name) : rmealtime.rme_name == null;
    }

    @Override
    public int hashCode() {
        int result = rme_id != null ? rme_id.hashCode() : 0;
        result = 31 * result + (rme_name != null ? rme_name.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Rmealtime{" +
                "rme_id=" + rme_id +
                ", rme_name='" + rme_name + '\'' +
                '}';
    }
}
