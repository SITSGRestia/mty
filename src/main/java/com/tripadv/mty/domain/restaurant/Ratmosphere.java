package com.tripadv.mty.domain.restaurant;

import java.io.Serializable;

/**
 * 餐厅氛围实体类
 */
public class Ratmosphere implements Serializable{

    private Integer rat_id;
    private String rat_name;

    public Ratmosphere() {
    }

    public Ratmosphere(Integer rat_id, String rat_name) {
        this.rat_id = rat_id;
        this.rat_name = rat_name;
    }

    public Integer getRat_id() {
        return rat_id;
    }

    public void setRat_id(Integer rat_id) {
        this.rat_id = rat_id;
    }

    public String getRat_name() {
        return rat_name;
    }

    public void setRat_name(String rat_name) {
        this.rat_name = rat_name;
    }

    @Override
    public String toString() {
        return "Ratmosphere{" +
                "rat_id=" + rat_id +
                ", rat_name='" + rat_name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ratmosphere that = (Ratmosphere) o;

        if (rat_id != null ? !rat_id.equals(that.rat_id) : that.rat_id != null) return false;
        return rat_name != null ? rat_name.equals(that.rat_name) : that.rat_name == null;
    }

    @Override
    public int hashCode() {
        int result = rat_id != null ? rat_id.hashCode() : 0;
        result = 31 * result + (rat_name != null ? rat_name.hashCode() : 0);
        return result;
    }


}
